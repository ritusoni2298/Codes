package highlevelcodes;

public class Valid_Parenthesis {
    public static void main(String[] args) {
        String st="(())((()())())";
        String[] st1 = st.split("");
        int res=0;
        for(int i =0;i<st1.length;i++){
            char ch = st1[i].charAt(0);
            switch(ch){
                case '(':
                    res++;
                    break;
                case ')':
                    res--;
                    break;
            }

        }
        System.out.println(res==0);

    }
}
