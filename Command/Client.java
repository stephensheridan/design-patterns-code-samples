import java.awt.*;
import java.awt.event.*;

//In this version, the Command objects are external classes
//and we pass them copies of the Frame instance
//in their constructor
public class Client extends Frame implements ActionListener{
   private Menu mnuFile;
   private fileOpenCommand mnuOpen;
   private fileExitCommand mnuExit;
   private btnRedCommand btnRed;
   private Panel p;
   private Frame fr;

   public Client(){
      super("Frame with external commands");
      // Create the menu
      MenuBar mbar = new MenuBar();
      setMenuBar(mbar);
      mnuFile = new Menu("File", true);
      mbar.add(mnuFile);

      // Create the command menu items
      mnuOpen = new fileOpenCommand("Open...", this);
      mnuFile.add(mnuOpen);
      mnuExit = new fileExitCommand("Exit");
      mnuFile.add(mnuExit);
      // Add actionListeners
      mnuOpen.addActionListener(this);
      mnuExit.addActionListener(this);
      // Create a panel for the button
      p = new Panel();
      add(p);
      // Create the command button
      btnRed = new btnRedCommand("Red", p);
      // Add it to the panel
      p.add(btnRed);
      // Add actionListeners
      btnRed.addActionListener(this);

      // Setup the window
      setBounds(100,100,200,100);
      setVisible(true);
   }

   public void actionPerformed(ActionEvent e){
      Command obj = (Command)e.getSource();
      obj.Execute();
   }

   static public void main(String argv[]){
      new Client();
   }
}

class btnRedCommand extends Button implements Command{
   private Panel p;
   public btnRedCommand(String caption, Panel pnl){
      super(caption);
      p = pnl;
   }
   public void Execute(){
      p.setBackground(Color.red);
   }
}

class fileOpenCommand extends MenuItem implements Command{
   private Frame fr;
   public fileOpenCommand(String caption, Frame frm){
      super(caption);
      fr = frm;
   }
   public void Execute(){
      FileDialog fDlg=new FileDialog(fr,"Open file");
      fDlg.show();
   }
}

class fileExitCommand extends MenuItem implements Command{
   public fileExitCommand(String caption){
      super(caption);
   }
   public void Execute(){
      System.exit(0);
   }
}



