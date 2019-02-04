import java.io.*;
import java.util.*;


public class CharList extends NumberList
{
    int size;

    CharList(String list)
    {
        size = 0;

        StringTokenizer token = new StringTokenizer(list);

        size = token.countTokens();

        // Allocate some space for the array
        char_list = new char[size];

        // Store each list item an the appropriate array
        for(int i = 0; i < size; i++)
        {
            char_list[i] = token.nextToken().charAt(0);
        }
    }

    public Number sum()
    {
        int n = 0;

        for(int i = 0; i < size; i++)
        {
           n = n + char_list[i];
        }
        return new Integer(n);
    }

    public void display()
    {
        System.out.println("Char List");

        for(int i = 0; i < size; i++)
            System.out.println("[" + i + "] = " + char_list[i]);
    }
}
