
class Book extends Item{
    private String title;
    private Barcode barCode;
    public Book(String title, Barcode barCode){
        this.title = title;
        this.barCode = barCode;
        System.out.println("Book Constructor.");
    }
    public Item makeClone(){
        // Make a Book ref
        Book bookObject = null;
        try{
            // Use the book ref with the call to clone
            bookObject = (Book)super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        // Return either a cloned book or null
        return bookObject;
    }
    public void setTitle(String title){this.title = title;}
    public String toString(){
        return "Title = " + title + " Barcode = " + barCode.getBarcode();
    }
    public void setBarcode(String bCode){barCode.setBarcode(bCode);}
}







