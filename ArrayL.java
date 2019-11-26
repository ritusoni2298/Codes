package highlevelcodes;
/*Word List : "OWNERSHIP", "AGILITY", "DILIGENCE", "ASSESSMENT", "INNOVATION", "CREATIVITY", "TECHNICALITY"
Target Word : "WALMART"

1. Write a Utility that should return true if target word(in this example WALMART) can be formed using the given list of words else return false. Each word in the list can be used ONLY once.

2. [Bonus] Utility should return all possible combinations that form target word.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayL {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(Arrays.asList("OWNERSHIP", "AGILITY", "DILIGENCE", "ASSESSMENT", "INNOVATION", "CREATIVITY", "TECHNICALITY","DEVOTION"));
        String st = "AMWLATR";
        List<String> lc = new ArrayList<>(ls);

        ls.forEach(System.out::println);
        List<String> lx = new ArrayList<>();
        char[] ch = st.toCharArray();
        int i;
        int length= ls.size();
        l1 : for( i= 0;i<length;i++){
            String s1 = String.valueOf(ch[i]);
            System.out.println(s1);
            for (String s:
                ls) {
                    if(s.contains(s1)){
                        System.out.println(s +"   "+s1);
                        lc.remove(s);
                        lx.add(s1);
                        System.out.println(lc);
                        break;
                    }else if(ls.indexOf(s) == ls.size() -1 ){
                        break l1;
                    }else{
                        continue;
                    }
            }
            ls=lc;
            System.out.println(lc);
            System.out.println(ls);
        }
        System.out.println(lx);
        boolean b ;
        if(lx.size()==st.length()){
            b= true;
        }else{
            b= false;
        }
        System.out.println(b);


    }
}
