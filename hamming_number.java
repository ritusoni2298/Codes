package highlevelcodes;

import java.util.ArrayList;

public class hamming_number {
    public static void main(String[] args) {

        int n1 = 50;
        ArrayList<Long> al = new ArrayList<>();
        al.add(0L);
        al.add(1L);
        if(n1==1){
//            return 1L;
        }
        long count=1;
        for(long i = 2; count<=n1;i++){
            long c = i;
//            System.out.println(i);
           while( c%2==0 || c%3 ==0 || c%5==0){
                if (c%2 ==0)
                    c/=2;
//                System.out.println(c);
               if (c%3 ==0)
                c/=3;
//                System.out.println(c);
               if (c%5 ==0)
                c/=5;
//                System.out.println(c);
                if(c==1){
//                    System.out.println(i+"  hhsvd");
                    break;
                }
//                System.out.println(i+" kh");
            }
            if(c==1){
                count=count+1;
                if(count == n1){
                    System.out.println(i);
                }
//                System.out.println("jsbcdv");
            }
        }
//        for (Long ib:
//             al) {
//            System.out.println(ib+ "index = "+al.indexOf(ib));
//        }
//        long h = al.get(al.size()-1);
//        System.out.println(h);


    }
}
