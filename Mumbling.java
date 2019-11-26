package highlevelcodes;

import java.util.ArrayList;

public class Mumbling {
    public static void main(String[] args) {

        int[][] x = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i =0;i<x.length;i++){
            int j =0;
            while(j!=x[i].length){
                al.add(x[i][j]);
                j++;
            }
            while(i!=x.length){
                al.add(x[i][j]);
                i++;
            }
            while(j!=0){
                al.add(x[i][j]);
                j--;
            }
//            while()


//            for(int j=0;j<x[i].length;j++){
//                al.add(x[i][j]);
//                if(j==x[i].length-1){
//                    while(i!=x.length-1){
//                        al.add(x[i][j]);
//                        i++;
//                    }
//                }
//            }
        }
        int i=0,j=0;
    }
}
