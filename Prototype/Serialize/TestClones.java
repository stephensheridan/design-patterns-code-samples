public class TestClones{
    public static void main(String args[]){
        // Create out factory object
        CloneFactory itemMaker = new CloneFactory();

        // Create the original book object
        Book javaProg = new Book("Java Programming Semester 1", new Barcode("123456789"));

        // Create the cloned book object
        Book clonedBook = (Book)itemMaker.getClone(javaProg);

        // Print out the contents of the original and cloned book object
        System.out.println("ORIGINAL: " + javaProg);
        System.out.println("CLONE: " + clonedBook);

        // Make sure they are different objects by checking the hashcodes
        System.out.println("ORIGINAL HASHCODE: " + System.identityHashCode(javaProg));
        System.out.println("CLONE HASHCODE: " + System.identityHashCode(clonedBook));

        // Change the title and Barcode of the cloned book
        clonedBook.setTitle("Python Programming");
        clonedBook.setBarcode("987654321");

        // Let's see what has changed
        System.out.println("After changing title and Barcode in cloned book. NOTE: ** DEEP COPY **");
        System.out.println("ORIGINAL: " + javaProg);
        System.out.println("CLONE: " + clonedBook);

        Book seconedClone = (Book)clonedBook.deepClone();

        System.out.println("After changing title and Barcode in second cloned book");
        seconedClone.setTitle("C# Programming");
        seconedClone.setBarcode("000000000");

        System.out.println("ORIGINAL: " + javaProg);
        System.out.println("CLONE: " + clonedBook);
        System.out.println("SECOND CLONE: " + seconedClone);

        System.out.println("ORIGINAL HASHCODE: " + System.identityHashCode(javaProg));
        System.out.println("CLONE HASHCODE: " + System.identityHashCode(clonedBook));
        System.out.println("SECOND CLONE HASHCODE: " + System.identityHashCode(seconedClone));


    }
}
