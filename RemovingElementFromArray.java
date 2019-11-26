package highlevelcodes;

import java.util.stream.IntStream;

public class RemovingElementFromArray {
    public static void main(String[] args) {
        int[][] arr= {{1,5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}};
        int index=2;
//        int[][] finalArr = arr;

        int[][] result = new int[arr.length - 1][];


        for(int i =index; i<arr.length-1;i++){
            arr[i]=arr[i+1];
            System.out.println(arr[i][0]);
        }


//        for (int[] a:
//             arr) {
//            int[] finalArr = a;
//            a =  IntStream.range(0, arr.length)
//                    .filter(i -> i != index)
//                    .map(i -> finalArr[i])
//                    .toArray();
//        }

        for (int[] x:
             result) {
            for (int c:
                 x) {
                System.out.println(x);

            }
            }
    }
}
