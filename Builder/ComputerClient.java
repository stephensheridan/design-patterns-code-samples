public class ComputerClient {

    public static void main(String[] args) {

        System.out.println("Computers built using the Builder pattern directly.");
        Computer comp = new Computer.Builder("2GB", "2TB", "Intel i7").build();
        comp.display();
        Computer comp1 = new Computer.Builder("2GB", "2TB", "Intel i7").setGraphicsCardEnabled(true).build();
        comp1.display();

        System.out.println("Computers built using the Builder Director class.");
        Computer comp3 = ComputerBuilderDirector.getBasicComputer();
        comp3.display();
        Computer comp4 = ComputerBuilderDirector.getGraphicsCardEnabledComputer();
        comp4.display();


    }

}
