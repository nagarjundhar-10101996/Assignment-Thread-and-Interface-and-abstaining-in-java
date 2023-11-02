/**
 * lets Assume A4 extend A1 extend Thread is extendent by one Thread to Simentaniously 
 */
class A1 extends Thread {
    private int odd;
    

    public A1(int i) {
        this.odd = i;
    }


    public void run()
    {
         System.out.print(odd%2 == 0?odd+" ":"");
         
    }
    
}

class A4 extends Thread {

    
    private int even; 
    public A4(int i) {
        this.even = i;
    }

    public void run()
    {
        System.out.print(even%2 != 0?even+" ":"");
        
    }
}

public class A2 {
    
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            A1 A1 = new A1(i);
            A4 A4 = new A4(i);
            A1.start();
            A4.start();
            A4.join();
            A1.join();
        }
        
        
        
    }
}
