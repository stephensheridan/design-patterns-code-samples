import java.lang.instrument.Instrumentation;
import java.awt.*;

public class ObjectSizeFetcher{
  private static Instrumentation instrumentation;
  public static void premain(String args, Instrumentation inst){
    instrumentation = inst;
   }
  public static long getObjectSize(Object o) {
    return instrumentation.getObjectSize(o);
  }
  public static void main(String[] args){
        System.out.println(getObjectSize(new Folder(Color.yellow)));
  }
}
