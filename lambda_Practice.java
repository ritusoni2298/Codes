package highlevelcodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntUnaryOperator;

interface Foo2{
    public int bar(boolean baz);
    }


public class lambda_Practice {

    public IntUnaryOperator makeAdder(int amt){
        return (x)-> (x+amt);
    }

    public static void main(String[] args) {

//        List<String> st = Arrays.asList("hello","one","two");
//        Collections.sort(
//                st,
//                ()
//        );
        List<Integer> integers = Arrays.asList(1,2,3,4);
        integers.stream().map(x ->x+1).forEach(System.out::println);




    }
}
