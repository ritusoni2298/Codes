package highlevelcodes;

import java.util.Arrays;
import java.util.Comparator;
//done working fine
public class Meeting_list {
    public static void main(String[] args) {
        String st = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

        String st1[] = st.split(";");
        String st2[][] = new String[st1.length][2];
        String s = "", k = "";
        for (int i = 0; i < st1.length; i++) {
            st2[i] = st1[i].split(":");
            for (int j = 0; j < 2; j++) {
//               System.out.println(x);
                if (j == 0) {
                    s = st2[i][j + 1].toUpperCase();
                    continue;
                } else {
                    k = st2[i][j - 1].toUpperCase();
                }
                st2[i][j - 1] = s;
                st2[i][j] = k;
            }
        }
        Arrays.sort(st2, new Comparator<String[]>() {

            public int compare(String[] o1, String[] o2) {
                int i = o1[0].compareTo(o2[0]);
                 if (i==0){
                    int j = o1[1].compareTo(o2[1]);
                    return j;
                }else{
                    return i;
                }
            }
        });

        for (String[] i1 :
                st2) {
            for (String x :
                    i1) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        String b="";
        for (int g = 0;g<st2.length;g++) {
            String b1=String.join(":",st2[g]);
            st1[g]=b1;
        }
        b=String.join(";",st1);

//
//        System.out.println("---------------------------------------------");
//        String[] vx;
//        for (int i = 0; i < st1.length-1; i++) {
//            for(int j=0;j<2;j++){
//                int o =st2[i][j].compareTo(st2[i+1][j]);
////                System.out.println(st2[i][j] +"  "+st2[i+1][j]);
//                if(o==0){
//                     int f = st2[i][j+1].compareTo(st2[i+1][j+1]);
//                     if(f>0){
//                         vx=st2[i+1];
//                         st2[i+1]=st2[i];
//                         st2[i]=vx;
//                         System.out.println(st2[i][j] +"  7777"+st2[i+1][j]);
//                     }
//                    for (String[] i1 :
//                            st2) {
//                        for (String x :
//                                i1) {
//                            System.out.print(x + " ");
//                        }
//                        System.out.println();}
//                }else if(o>0){
//                    //swap
//                    vx=st2[i+1];
//                    st2[i+1]=st2[i];
//                    st2[i]=vx;
//                    System.out.println(st2[i][j] +" 5555"+st2[i+1][j]);
//                }
//                System.out.println(o);
//            }
//        }
////        Arrays.sort(st2, new ColumnComparator(0, SortingOrder.ASCENDING));
////        Arrays.sort(st2, Comparator.comparing(arr -> arr[1]));
//
//        for (String[] i :
//                st2) {
//            for (String x :
//                    i) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//
//        }

    }
}



//        ArrayList<String> al = new ArrayList<>();
//        al.addAll(Arrays.asList(st.split(";")));
//        System.out.println(al);
//        String[] st1=st.split(";");
//        ArrayList<ArrayList<String>> nv = new ArrayList<ArrayList<String>>();
//        for ( String s :
//          al   ) {
//            ArrayList<String> ar = new ArrayList<>();
//            ar.addAll(Arrays.asList(s.split(":")));
//
//            nv.add(ar);
//
//    }


//
//        System.out.println(al);
//        System.out.println(nv);
//        nv.add(Arrays.asList(st.split(";"))



