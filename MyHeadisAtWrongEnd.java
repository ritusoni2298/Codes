package highlevelcodes;

public class MyHeadisAtWrongEnd {
    public static void main(String[] args) {
        String[] st ={"h","b","t"};
//        for(int i=0;i<st.length;i++){
            String st1=st[st.length-1];
           String st2=st[0];
           st[0]=st1;
           st[st.length-1]=st2;
//        }
    }
}
