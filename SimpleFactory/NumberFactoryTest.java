import java.io.*;

public class NumberFactoryTest
{
	public static void main(String[] args)
	{
		String intStr = new String("1 2 3 4 5 6 7 8 9 10");
		String doubleStr = new String("1.1 2.2 3.3 4.4 5.5 6.6 7.7 8.8 9.9 10.1");

		NumberFactory nfactory = new NumberFactory();

		nfactory.getNumberList(intStr).display();

		System.out.println("");

		NumberList doubleList = nfactory.getNumberList(doubleStr);
		doubleList.display();

		System.out.println("");
		System.out.println("Sum of doubleList : " + doubleList.sum());

	}
}