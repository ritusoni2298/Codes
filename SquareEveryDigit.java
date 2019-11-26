package highlevelcodes;
//import java.Math;

public class SquareEveryDigit {
    public static void main(String[] args) {
        int i =32120;
        String s="";
        int rem=0,sqr=0, n =i,count=0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);

        while(i>0){
            rem =  (i - (i % (int)Math.pow(10,count-1)))/(int)Math.pow(10,count-1);
            sqr = rem*rem;
            s+=sqr;
            i = i % (int)Math.pow(10,count-1);
            count--;
        }
        while(count!=0){
            s+="0";
            count--;
        }
        System.out.println(count);
        System.out.println(Integer.parseInt(s));
    }
}
