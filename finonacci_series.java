package highlevelcodes;

import java.math.BigInteger;

public class finonacci_series {
    public static void main(String[] args) {

        BigInteger i = new BigInteger("7");
        long i1=i.longValue();
        BigInteger i3 = BigInteger.valueOf(i1);
        BigInteger i2=new BigInteger("1");
        BigInteger ih=new BigInteger("1");
        BigInteger[] x = new BigInteger[(int)i1+1];
        x[0]=x[1]=i2;
        long one=1;
        long two=1;
        long temp=2;
//        BigInteger one=new BigInteger("1");
//        BigInteger temp=new BigInteger("2");
//        BigInteger two=new BigInteger("1");
        long co=2;
        BigInteger sum=new BigInteger("0");

//        long two=1, co= 2;
        while(!(i2.compareTo(i3)==0)){
            sum=sum.add(new BigInteger(BigInteger.valueOf(temp).toString()));
            System.out.println(sum+"sum");
            temp = two+one;
//            x[(int)co]=temp;

            System.out.println("temp"+temp);
            one=two;
            two=temp;
            co++;
            i2=i2.add(ih);
        }
        sum=sum.add(new BigInteger(BigInteger.valueOf(temp).toString()));

        System.out.println(sum.multiply(new BigInteger("4")).toString());




    }
}
