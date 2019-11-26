package highlevelcodes;

public class MissingLetter {
    public static void main(String[] args) {
        char[] array = {'a','b','d','e'};
        char c = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] == c ){
                c++;
                continue;
            }else{
                break;
            }
        }
        System.out.println(c);
    }
}
