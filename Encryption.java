package highlevelcodes;

import java.util.Arrays;
import java.util.List;

public class Encryption {
    public static void main(String[] args) {
        String text="Simple text";
        String[] st = text.split("");
        String i1="";
        String i2="";
        for(int i=0;i<st.length;i++){
            if(i%2!=0)
                i1=i1+st[i];
            else
                i2=i2+st[i];
            System.out.println(i1 +"   "+i2);

        }
        List<String> ls = Arrays.asList(i2,i1);
        System.out.println(String.join("", ls));
    }
}
