import java.io.*;
import java.util.*;


public class IntList extends NumberList
{
	int size;

	IntList(String list)
	{
		size = 0;

		StringTokenizer token = new StringTokenizer(list);

		size = token.countTokens();

		// Allocate some space for the array
		int_list = new int[size];

		// Store each list item an the appropriate array
		for(int i = 0; i < size; i++)
		{
			int_list[i] = Integer.parseInt(token.nextToken());
		}
	}

	public Number sum()
	{
		int n = 0;

		for(int i = 0; i < size; i++)
		{
		   n = n + int_list[i];
		}
		return new Integer(n);
	}

	public void display()
	{
		System.out.println("Integer List");
		for(int i = 0; i < size; i++)
			System.out.println("[" + i + "] = " + int_list[i]);
	}
}
