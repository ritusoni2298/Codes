package highlevelcodes;

public class AreTheySame {
    public static void main(String[] args) {
        int a[] = {121, 144, 19, 161, 19, 144, 19, 11};
        int b[] = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

//        a = [121, 144, 19, 161, 19, 144, 19, 11]
//        b = [132, 14641, 20736, 361, 25921, 361, 20736, 361
        double x;
            int count=0;
            boolean b1= true;
            double c;
        h1: for(int i=0;i<b.length;i++){
            c=Math.sqrt(b[i]);
            System.out.println(c);
            for(int i1 : a){
                if(c == i1) {
                    count++;
                    System.out.println(count+" count"+c+" "+ i1);
                    break;
                }else if(i1 == a[a.length-1]){
                    b1=false;
                    break h1;
                }
            }
            System.out.println();
            if(count==1){
                count=0;
                continue;
            }else {
                b1 = false;
                break h1;
            }
        }
        System.out.println(b1);

    }
}
