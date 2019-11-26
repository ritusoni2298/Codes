package highlevelcodes;

public class theOutlier {
    public static void main(String[] args) {
        int[] e1 = {2,6,8,-10,3};
        int[] e2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};

        int count = 0,even=0,odd=0;
        int i=0;
        while(even!=2 && odd!=2){
            if (e1[i]%2==0){
                System.out.println("one");
                even++;
            }else{
                odd++;
            }
            i++;
        }
//
//        for( i = 0;i<exampleTest3.length;i++){
//                    if (exampleTest3[i]%2==0){
//                           even++;
//                    }else{
//                        odd++;
//                    }
//                    if(even>3 && odd > 3){
//                        break;
//                    }
//        }
        System.out.println(even+" "+ odd);
            for(int i1: e1) {
                if(even>=2) {
                    if (i1 % 2 != 0) {
                        System.out.println(i1 + " ");
                        break;
                    }
                }else{
                    if (i1 % 2 == 0) {
                        System.out.println(i1 + " ");
                        break;
                    }

                }
            }




    }

}
