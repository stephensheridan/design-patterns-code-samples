class Book extends Item{
    private String title;
    private Barcode barCode;
    public Book(String title, Barcode barCode){
        this.title = title;
        this.barCode = barCode;
        System.out.println("Book Constructor.");
    }
    // Deep copy version of makeClone
    public Item makeClone(){
        Book bookObject = null;
        try{
            // First create the shallow copy of Book
            bookObject = (Book)super.clone();
            // Now set the Barcode ref to a new Barcode clone
            bookObject.barCode = (Barcode)barCode.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return bookObject;
    }
    public void setTitle(String title){this.title = title;}
    public String toString(){
        return "Title = " + title + " Barcode = " + barCode.getBarcode();
    }
    public void setBarcode(String bCode){barCode.setBarcode(bCode);}
}
