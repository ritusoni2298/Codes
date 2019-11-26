package highlevelcodes;

public class ReverseString {
    public static void main(String[] args) {
        String st= "The quick brown fox jumps over the lazy dog.";
        String s="";
        String sv="";
        char[] ch= st.toCharArray();
        for(int i=st.length()-1;i>=0;i--) {
            if(ch[i]!=' ') {
                sv += ch[i];
                if(i==0){
                    s+=sv;
                }
                continue;
            }else if(ch[i]==' '){
                    s+=sv;
                    s+=ch[i];
                    sv="";
            }
        }
        s=String.valueOf(s);
        System.out.println(s);
    }
}
