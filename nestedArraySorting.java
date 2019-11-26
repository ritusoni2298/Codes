package highlevelcodes;

public class nestedArraySorting {

    public static void main(String[] args) {

        String Name[][]={{"prakash","kumar"},{"raj","kappor"},{"vinod","bhart"}};

        String str[]=new String[2];


        for(int j=0; j<Name.length;j++)
        {
            for (int i=0 ; i<2; i++)
            {
                str[i]=Name[j][i];
            }
            for(int i=0;i<str.length;i++)
            {
                for(int k=i+1;k<str.length;k++)
                {
                    if(str[i].compareTo(str[k])>0)
                    {
                        String temp= str[i];
                        str[i]=str[k];
                        str[k]=temp;
                    }

                }
                System.out.print(str[i]+ " ");
            }
            System.out.println();
        }



    }
}

