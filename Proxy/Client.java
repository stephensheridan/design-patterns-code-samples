

public class Client{
    private static ProxyInternet internet;

    public static void main (String[] args){
        internet = new ProxyInternet();
        try{
            internet.connectTo("tudublin.ie");
            internet.connectTo("abc.com");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}




