package highlevelcodes;

public class DiamondPattern {
    public static void main(String[] args) {
        int k =5;
        String s ="";
        for(int i = k;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=k;j>i;j--){
                System.out.print("*");
            }
            System.out.println("_");
        }
        for(int i =k;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("&");
            }
            for(int j=k;j>i;j--){
                System.out.print("*");
            }
            System.out.println("_");
        }

        for(int i =k;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=k;j>i;j--){
                System.out.print("&");
            }
            System.out.println("_");
        }

//        for(int i =0;i<k;i++){
//            for(int j=k;j>i;j--){
//                System.out.print("_");
//            }
//            System.out.println("*");
//        }
    }
}
