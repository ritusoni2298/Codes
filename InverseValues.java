package highlevelcodes;

public class InverseValues {
    public static void main(String args[]){
        int[] ar ={1,2,3,-4,-5};

        for(int i=0;i<ar.length;i++){
            ar[i]=-ar[i];
        }

        for(int j:ar){
            System.out.println(j);
        }
    }
}
