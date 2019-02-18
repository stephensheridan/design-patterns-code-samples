import java.io.*;
import java.util.*;

class Registry{
    // This will be the one and only WindowManager instance
    private static Registry reg;
    private static ArrayList singletonContainer;
    private Registry(){
        // Private constructor that does nothing
        singletonContainer = new ArrayList(10);
    }
    // Public synchronized method which will return a
    // WindowManager
    public static synchronized Registry getReg(){
        // If true then we need to create an instance of
        // WindowManager
        if (reg == null)
            reg = new Registry();
        return reg;
    }
    public static synchronized Object getManager(String managerType){
        if (managerType == "Window")
            return WindowManager.getManager();
        else if (managerType == "Print")
            return PrintManager.getManager();
        else if (managerType == "Log")
            return LogManager.getManager();
        else if (managerType == "Message")
            return MessageManager.getManager();
        else
            return null;
    }
    // Test method so we can ensure that our
    // object works
    public void print(){
        System.out.println("I'm the Registry.");
    }
}
