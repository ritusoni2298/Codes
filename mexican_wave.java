package highlevelcodes;

import java.util.ArrayList;

public class mexican_wave {
    public static void main(String[] args) {
        //done
        //working fine
        String str="hello world";
        String st="";
        ArrayList<String> sr = new ArrayList<>();
        for(int i=0;i<str.length();i++) {
            char ch = (char) (str.charAt(i) - 32);
            if(str.charAt(i)==' ') {
                continue;
            }else{
                st = str.substring(0, i)
                        + ch
                        + str.substring(i + 1);
                sr.add(st);
//                System.out.println(st[i]);
            }
        }
        Object sto[] = sr.toArray();
        System.out.println(sto[1]);

        for (String st1:
             sr) {
            System.out.println(st1);
        }
    }
}
