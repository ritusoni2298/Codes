package highlevelcodes;

public class Century {
    public static void main(String[] args) {
        int ls= 20;
        int st = ls%100,d = ls/100;
        if(st>0){
            d=d+1;
        }
        System.out.println(st+" "+d);
    }
}
