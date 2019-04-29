import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainWindow extends JFrame implements ActionListener
{
    private JButton addBtn;
    private JButton deleteBtn;
	private JTextField text;
    private JList list;
	private ListData listData;

	public MainWindow()	{
		super("Main Window");

		addBtn = new JButton("Add");
		addBtn.addActionListener(this);
		deleteBtn = new JButton("Delete");
		deleteBtn.addActionListener(this);

		text = new JTextField();
		listData = new ListData();
		list = new JList(listData);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.NORTH, text);
		c.add(BorderLayout.CENTER, list);
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout());
		btnPanel.add(addBtn);
		btnPanel.add(deleteBtn);
		c.add(BorderLayout.SOUTH, btnPanel);

		setSize(200,200);
		show();
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == addBtn){
			System.out.println("Adding");
			listData.addElement(text.getText());
			text.setText("");
		}
		else if (e.getSource() == deleteBtn){
			System.out.println("Deleting " + list.getSelectedValue());
			listData.removeElement(list.getSelectedValue().toString());
		}
	}

	public static void main(String[] args){
		MainWindow mainframe = new MainWindow();
	}
}
