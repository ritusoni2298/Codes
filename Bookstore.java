package highlevelcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
//done
//working fine

public class Bookstore {
    public static void main(String[] args) {
        String[] st = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        List<String> ls = new ArrayList<>();
        ls.addAll(Arrays.asList(st));
        String[] m = {"A", "B", "C", "W"};
        LinkedHashMap<Character, Integer> ls2 = new LinkedHashMap<>();
        for(String s:st){
            String[] h = s.split(" ");
            char com = h[0].charAt(0);
            for (String m1:
                 m) {
                if(com == m1.charAt(0)){
                        Integer x=ls2.put(com,Integer.parseInt(h[1]));
                        if(x!=null){
                            Integer c = x+Integer.parseInt(h[1]);
                            ls2.put(com,c);
                            ls2.forEach((k,v)->{System.out.println(k+" "+v);});
                        }
                    }
                }
            }
            for(String m1:m){
                if(!ls2.containsKey(m1.charAt(0))){
                    ls2.put(m1.charAt(0),0);
                }
            }
        ls2.forEach((k,v)->{System.out.println(k+" "+v);});

        }

        //L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}


    }

