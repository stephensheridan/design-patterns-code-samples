import java.io.*;
import java.util.*;

class Client{
	private Vector data;
	private Filter filter;

	public Client(){
		data = new Vector();
		data.addElement("Alan"); data.addElement("Joanne");
		data.addElement("John"); data.addElement("Martin");
	}
	public void filterNames(){
		filter = new Filter(data.elements(), "J");
		while(filter.hasMoreElements()){
			String s = (String)filter.nextElement();
			System.out.println(s);
		}
	}
	public static void main(String[] args){
		Client app = new Client();
		app.filterNames();
	}
}
