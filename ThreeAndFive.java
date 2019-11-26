package highlevelcodes;

import java.util.ArrayList;

public class ThreeAndFive {
    public static void main(String[] args) {
        int j=20;
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i =3;i<=j;i++){
            if(i%3==0 || i%5==0){
                ar.add(i);
            }
        }
        int sum=0;
        for (Integer i :
             ar) {
           sum+=i.intValue();
        }
        System.out.println(sum);
    }
}
