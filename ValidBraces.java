package highlevelcodes;

import java.awt.datatransfer.StringSelection;
import java.util.*;

public class ValidBraces {
    public static void main(String[] args) {
            List<StringBuilder> list = new ArrayList<>();

            Scanner input=new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int intSize=input.nextInt();

            String[] arr = new String[intSize];
            System.out.println("Please enter array elements");
        StringBuilder st=new StringBuilder();
            for (int i = 0; i < arr.length; i++)
            {
                String userInput = input.next();
                arr[i] = userInput;
                char[] charArray = arr[i].toCharArray();


                for (char c: charArray)
                    st.append(c);
            }
            list.add(st.reverse());
            System.out.println("The String array input from user is : ");
            System.out.println(Arrays.toString(arr));
//            Collections.reverse(list);
            ListIterator li = list.listIterator();
            while (li.hasNext())
                System.out.print(li.next()+" ");

        }

    }

