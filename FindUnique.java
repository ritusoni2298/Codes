package highlevelcodes;

public class FindUnique {
    public static void main(String[] args) {
        double a[] = {0,1,0};
        double b[] = {2,2,2,2,2,1};
        int count = 0;
        double ds=0;
        for (int i=0;i<b.length;i++){
            if(b[i]==b[i+1]){
                count++;
                continue;
            }else{
                if(count==0){
                    ds= b[i+1]==b[i+2] ? b[i]:b[i+1];
                    break;
                }else{
                    ds=b[i+1];
                    break;
                }
            }
        }
        System.out.println(ds);

    }
}
