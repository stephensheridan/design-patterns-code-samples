import java.io.*;
import java.util.*;


public class DoubleList extends NumberList
{
	int size;

	DoubleList(String list)
	{
		size = 0;

		StringTokenizer token = new StringTokenizer(list);

		size = token.countTokens();

		// Allocate some space for the array
		double_list = new double[size];

		// Store each list item an the appropriate array
		for(int i = 0; i < size; i++)
		{
			double_list[i] = Double.parseDouble(token.nextToken());
		}
	}

	public Number sum()
	{
		double n = 0;

		for(int i = 0; i < size; i++)
		{
		   n = n + double_list[i];
		}

		return new Double(n);
	}

	public void display()
	{

		System.out.println("Double List");
		for(int i = 0; i < size; i++)
			System.out.println("[" + i + "] = " + double_list[i]);

	}
}
