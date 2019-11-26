package highlevelcodes;

import javax.swing.text.html.HTMLDocument;
import java.util.LinkedHashMap;
import java.util.*;

public class Most_Digit {
    public static void main(String[] args) {
        int[] x={900,400,23,3};
        int count=0;
        LinkedHashMap<Integer,Integer> lh = new LinkedHashMap<>();
        for(int c :x){
            int h=c;
            while(c!=0){
                count++;
                c=c/10;
            }
            lh.put(h,count);
            count=0;
        }

        Integer t=0;
        Iterator hmIterator = lh.entrySet().iterator();
        Integer mx=Collections.max(lh.values());
        while(hmIterator.hasNext()){
           Map.Entry m = (Map.Entry) hmIterator.next();
           if(m.getValue() ==mx){
               t=(Integer) m.getKey();
               break;
           }
        }

    System.out.println(lh);
        System.out.println(t);
    }

}
