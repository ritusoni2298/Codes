package highlevelcodes;

class ab implements Runnable{
    private Thread t;
    private String thdname;
    ab(String th){
        thdname=th;
    }
    public void run(){
        while(true){
            System.out.println(thdname);
        }
    }
    public void start(){
        if(t ==null){
            t =new Thread(this, thdname);
            t.start();
        }
    }


}

public class WordReverse
{

    public static void main(String[] args) {
        ab a = new ab("a");
        ab b = new ab("b");
        b.start();
        a.start();
    }
}

