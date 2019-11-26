package highlevelcodes;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {

        boolean flagup = false;
        boolean flaglo = true;
        boolean flagdigit = false;
        String su="";


        if(flagup){
            for(char i = 65; i<91;i++){
                su+=i;
            }
        }
        if(flaglo){
            for(char i = 97; i<123;i++){
                su+=i;
            }
        }
        if(flagdigit){
            for(char i = 48;i<58;i++){
                su+=i;
            }
        }

        Random rand = new Random();
        int length =8;
        char[] password = new char[length];
         for(int i = 0;i<length;i++){
             int j =rand.nextInt(su.length());
             String s= String.valueOf(password);
             String sb = String.valueOf(j);
             if(! (s.contains(sb))) {
                 System.out.println(sb + "  "+String.valueOf(password));
                 password[i] = su.charAt(j);
                 sb="";
             }
         }
         String st= String.valueOf(password);
         System.out.println(password);




    }

}
