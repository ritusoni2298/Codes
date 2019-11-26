package highlevelcodes;
//done
//working fine
import java.util.ArrayList;

public class xbonacci {
    public static void main(String[] args) {
        double[] x = new double []{1,0,0,0,0,0,1};
        int n = 10;
        ArrayList<Double> al = new ArrayList<>();
        for (double d:
            x ) {
            al.add(d);
        }
        int len = x.length;
        for(int i =0; i<n-len;i++) {
            ArrayList<Double> dl = new ArrayList<>();
            dl.addAll(al.subList(i,al.size()));
            System.out.println(dl);
            double dv = dl.stream().reduce((x1, y) -> x1 + y).get();
            al.add(dv);
        }
        System.out.println(al.subList(0,n));
//        Object[] ob = al.toArray();
        Double[] array= al.toArray(new Double[al.size()]);
        double[] dv = new double[al.size()];
        int i=0;
        for (Double d1:
             array) {
            dv[i]=d1.doubleValue();
            i++;
        }
        for (double dc:
             dv) {
            System.out.println(dc);
        }


//        = new double[al.size()];
//        Double[] dx = al.toArray(new Double[]);

//         System.out.println(dv);






    }
}
