package highlevelcodes;

import java.util.*;
import java.util.stream.Collectors;

public class Best_Travel {
    //5kyu
    public static void main(String[] args) {
        int t = 230, k= 3;
        Integer i;
        LinkedList<Integer> ls1 = new LinkedList<>();
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        ts= (TreeSet<Integer>)ts.descendingSet();
        boolean b;
        TreeSet<Integer> allv= new TreeSet<>();
        Iterator<Integer> it = ts.iterator();
        if(k<ts.size()){
            //return null
        }
        while (ls1.size() < k && it.hasNext()) {
            ls1.add(it.next());
        }
        do {
           Optional<Integer> ic = ls1.stream().reduce((a, b2) -> a + b2);
           i=ic.get();
           allv.add(i);
            System.out.println(i);
            b = ic.get() <= t;
//            System.out.println(b);
//           if (ls1.size()==k){ continue;}
            if(!b) {
                int ln=ls1.size();
                ls1.remove(ln-1);
                if(it.hasNext()){
                    int x=it.next();
                    ls1.add(x);
                }else{
                    ls1.clear();
                    System.out.println(ts.pollFirst());
                    System.out.println(ts);
                    it=ts.iterator();
                    while(it.hasNext() && ls1.size()!=k ){
                        ls1.add(it.next());
                    }
                }
                System.out.println(ls1);
            }else {
                break;
            }

        }while(ts.size()>=k);
//       System.out.println(i);
        System.out.println(allv);

    }


}
