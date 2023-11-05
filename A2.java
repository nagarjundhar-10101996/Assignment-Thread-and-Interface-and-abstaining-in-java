/**
 * lets Assume T2 extend T1 extend Thread is extendent by one Thread to Simentaniously run()
 */
class T2 extends Thread {
    private int odd;
    public T2(int i) {this.odd = i;}
    public T2() {}
    public void run()
    {
        for (int i = 1; i <= odd; i++) {
        System.out.print(i%2 == 0?i+" ":"");
        } 
    }
}
class T1 extends Thread {
   
    private int even; 
    public T1(int i) {this.even = i;}
    public T1() {}
    public void run()
    {
        for (int i = 1; i <= even; i++) {
        System.out.print(i%2 != 0?i+" ":"");
        }
    }
}

public class A2 {
    public static void main(String[] args) throws InterruptedException {
        T1 A1 = new T1(20);
        T2 A4 = new T2(20);
            A4.run();
            A1.run();
    }
}
