package highlevelcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}} //13
//{{-245, -218}, {-194, -179}, {-155, -119}}
//{{-7, 8}, {-2, 10}, {5, 15}, {2000, 3150}, {-5400, -5338}} //1234
//empty
//{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}} //19

// {{-9984, 5399}, {-9950, -4282}, {-9749, -1091}, {-9566, 4210}, {-8648, 7908}, {-8421, -3264}, {-8358, 8823}, {-8272, -7594}, {-8219, -687}, {-7579, 2870}, {-7428, -1162}, {-6633, -4286}, {-5120, 5635}, {-4462, 5669}, {-4292, 5804}, {-3854, -2975}, {-3776, -1227}, {-3075, 495}, {-1875, 4801}, {-789, 6560}, {86, 9559}, {4409, 8230}, {5001, 7023}, {5493, 6621}, {6823, 8039}, {8421, 9357}}; //(1,5)(1,6)
//
public class Sum_of_Intervals {
    public static void main(String[] args) {
        int[][] ls = {{-7, 8}, {-2, 10}, {5, 15}, {2000, 3150}, {-5400, -5338}};
        if(ls !=null) {
            //            @Override
            Arrays.sort(ls, new Comparator<int[]>() {
                public int compare(final int[] x, final int[] y) {
                    if (x[0] > y[0]) {
                        return 1;
                    }else if(x[0]==y[0]){
                        if(x[1]>y[1])
                            return 1;
                        else
                            return -1;
                    }
                    else
                     {
                        return -1;
                    }
                }
            });

            for (int[] c:
             ls) {
            for (int v:
                 c) {
                System.out.print(v+ " ");
            }
            System.out.println(" ");
        }
            ArrayList<Integer> al = new ArrayList<>();
            int range = 0, j = ls.length;
            for (int i = 0; i < ls.length; i = j) {
                j = i;
//            System.out.println(j == ls.length);
                if (j == ls.length - 1) {
                    range = ls[j][1] - ls[j][0];
                    al.add(range);
                    System.out.println("one");
                    break;
                }
                System.out.println("h");
                if(ls[j][0]==ls[j+1][0]){
                    j++;
                    continue;
                }
                int g=0,go=0;
                int h=j;
                i2:
                while (ls[h][1] >= ls[j + 1][0]) {
                    g=ls[h][1];
                    if(g>ls[j+1][0] && g>ls[j+1][1]){
                        j++;
//                        continue ;
                    }else{
                        g=ls[j+1][1];
                        j++;
                        h=j;
                    }
//                    j++;
                    if (j == ls.length - 1) {
//                    range=ls[j][1]-ls[j][0];
//                    al.add(range);
                        System.out.println("two");
                        break;
                    }
                    System.out.println(j);
                    continue i2;
                }

                if (i == j) {
                    if (ls[i][1] == ls[i][0]) {
                        range = 0;
                    } else {
                        range = ls[i][1] - ls[i][0];
                    }
                    al.add(range);
                    System.out.println(range + "x");
                } else {
                    range = g - ls[i][0];
//                    if(g==1){
//                        j++;
//                    }
                    al.add(range);
                    System.out.println(range + "y");
                }
                j++;

            }
//
            al.stream().forEach(System.out::println);
            int b = al.stream().reduce((x1, y1) -> (x1 + y1)).get();
            System.out.println(b+"x1");
        }else{
            System.out.println(0);
        }
//        for (int[] c:
//             ls) {
//            for (int v:
//                 c) {
//                System.out.println(v);
//            }
//
//        }

    }
}
