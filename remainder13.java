package highlevelcodes;

public class remainder13 {
    public static long mn(long n1){
        long n=n1;
        long temp,sum=0;
        long t[] = {1,10,9,12,3,4};
        for(int i =0;n>0;i++) {
            if(i==t.length) {
                i=0;
            }
            temp = n % 10;
            sum += temp * t[i];
            n = n / 10;
            }

        while(sum>100){
           sum= mn(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        long n=1234567;
//        long n1=n;
//        long temp,sum=0;
//        long t[] = {1,10,9,12,3,4};
//        for(int i =0;n!=0;i++) {
//            if(i==t.length) {
//                i=0;
//            }
//                temp = n % 10;
//                sum += temp * t[i];
//                n = n / 10;
//
//        }
//        System.out.println(sum);
        long h=mn(n);
        System.out.println(h);
    }
}
