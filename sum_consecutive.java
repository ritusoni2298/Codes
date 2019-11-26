package highlevelcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//incomplete
public class sum_consecutive {
    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(1,4,4,4,0,4,3,3,1);
        LinkedList<Integer> l =new LinkedList<>();
        l.addAll(i);
        ArrayList<Integer> al=new ArrayList<>();
        for(int j=0;j<l.size();j++){
            if(l.get(j)==l.get(j+1)){
                int x= l.get(j)+l.get(j+1);
                l.remove(j);
                l.remove(j+1);
            }

        }


    }
}
