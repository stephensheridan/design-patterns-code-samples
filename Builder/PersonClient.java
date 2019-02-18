public class PersonClient{
    public static void main(String args[]){

        // Create the person using the builder pattern
        Person person = new Person.Builder("Paul", "Smyth")
            .setAge(5)
            .setHeight(6)
            .setAge(19)
            .build();

        // Display the persons details
        person.display();
    }
}
