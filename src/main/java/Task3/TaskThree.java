package Task3;

import java.util.*;
import java.io.*;
public class TaskThree
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream file = new FileInputStream("words.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        while(scanner.hasNext())
        {
            String nextWord = scanner.next();
            if(words.contains(nextWord))
            {
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index) + 1);
            }
            else
            {
                words.add(nextWord);
                count.add(1);
            }

        }
        scanner.close();
        file.close();
        for(int i = 0; i < words.size(); i++)
        {
            System.out.print(words.get(i) + " " + count.get(i) + "\n");
        }

    }
}