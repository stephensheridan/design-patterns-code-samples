public class RegistryTest{
    public static void main(String args[]){
        Registry reg = Registry.getReg();

        // Get a Window Manager
        WindowManager wm = (WindowManager)Registry.getManager("Window");
        wm.print();

        // Get a Window Manager
        LogManager lm = (LogManager)Registry.getManager("Log");
        lm.print();

        // Get a Window Manager
        PrintManager pm = (PrintManager)Registry.getManager("Print");
        pm.print();

        // Get a Window Manager
        MessageManager mm = (MessageManager)Registry.getManager("Message");
        mm.print();
    }
}
