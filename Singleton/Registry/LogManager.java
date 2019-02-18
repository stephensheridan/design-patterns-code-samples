import java.io.*;

class LogManager
{
	// This will be the one and only WindowManager instance
	private static LogManager lmanager;
	private LogManager(){
		// Private constructor that does nothing
	}
	// Public synchronized method which will return a
	// WindowManager
	public static synchronized LogManager getManager(){
		// If true then we need to create an instance of
		// WindowManager
		if (lmanager == null)
			lmanager = new LogManager();
		return lmanager;
	}
	// Test method so we can ensure that our
	// object works
	public void print(){
		System.out.println("I'm a Log Manager.");
	}
}

















