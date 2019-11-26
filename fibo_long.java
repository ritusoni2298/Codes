package highlevelcodes;

public class fibo_long {
    public static void main(String[] args) {
        Integer n=7;
        long i1=n.longValue();
        long[] x = new long[(int)i1+1];
        long i2=1,i3=i1;
        x[0]=x[1]=1;
        long one=1, temp=0;
        long two=1, co= 2;
        while(i2!=i3){
            temp = two+one;
            x[(int)co]=temp;
//            System.out.println(temp);
            one=two;
            two=temp;
            co++;
            i2++;
        }
        long sum=0;
        for (long h:
                x) {
            sum+=h;
            System.out.println(sum);
        }
        one = sum*4;
        System.out.println(one);
//        return BigInteger.valueOf(one);
    }
}
