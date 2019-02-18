import java.io.*;

class MessageManager
{
	// This will be the one and only WindowManager instance
	private static MessageManager mmanager;
	private MessageManager(){
		// Private constructor that does nothing
	}
	// Public synchronized method which will return a
	// WindowManager
	public static synchronized MessageManager getManager(){
		// If true then we need to create an instance of
		// WindowManager
		if (mmanager == null)
			mmanager = new MessageManager();
		return mmanager;
	}
	// Test method so we can ensure that our
	// object works
	public void print(){
		System.out.println("I'm a Message Manager.");
	}
}

















