package highlevelcodes;

public class Histrogram {
    public static void main(String[] args) {
        int[] it = new int[]{6,5,4,3,0,1};
        int h= 6;
        String s="";
        for(int i=0;i<it.length;i++){
            s=h+" |";
            Print(it[i],"#");
            if(it[i]!=0)
            System.out.println(" "+it[i]);
            else
                System.out.println();
            h--;
        }

    }

    public  static void Print(int n, String str)
    {
        if (n <= 0)
            return;
        System.out.print(str);
        Print(--n, str);
    }
}
