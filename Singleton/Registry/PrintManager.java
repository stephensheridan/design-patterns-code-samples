import java.io.*;

class PrintManager
{
	// This will be the one and only WindowManager instance
	private static PrintManager pmanager;
	private PrintManager(){
		// Private constructor that does nothing
	}
	// Public synchronized method which will return a
	// WindowManager
	public static synchronized PrintManager getManager(){
		// If true then we need to create an instance of
		// WindowManager
		if (pmanager == null)
			pmanager = new PrintManager();
		return pmanager;
	}
	// Test method so we can ensure that our
	// object works
	public void print(){
		System.out.println("I'm a Print Manager.");
	}
}

















