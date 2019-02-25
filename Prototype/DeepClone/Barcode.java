

public class Barcode implements Cloneable{
    private String code;
    Barcode(String code){this.code = code;}
    public String getBarcode(){return code;}
    public void setBarcode(String code){this.code = code;}
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
