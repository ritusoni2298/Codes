package highlevelcodes;

import java.util.ArrayList;
import java.util.LinkedList;
public class Arithmetic_equation {
    public static void main(String[] args) {
        int a = 1;
        String s = "2a+3a-4a+5a-2a";
        String[] st = s.split("");
        LinkedList<Integer> st1 = new LinkedList<>();
        for(int i =0; i<st.length;i++){
            if (st[i].equals("a")){
                st[i]="2";
                int h = Integer.parseInt(st[i-1]);
                int j = Integer.parseInt(st[i]);
                st1.add(h*j);
            }
        }
        System.out.println(st1);
        LinkedList<Integer> al = new LinkedList<>();
        int x,y;
        x=st1.pop();
        int result=x;
        for(int i=0;i<st.length;i++){
            char h=0;
            h=st[i].charAt(0);
            switch(h){
                case '+':
                    y=st1.pop();
                    result+=y;
                    break;
                case '-':
                    y=st1.pop();
                    result-=y;
                    break;
            }
        }
        System.out.println(result);
    }
}
