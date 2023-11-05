/**
 * lets Assume A2 and A1 extend Thread is extendent by one Thread to Simentaniously perform based of dependent piriority.
 * But because of one thread two task the total time is n2  of total time yes its possible according to result
 *New Thread A1
New Thread A2
A1 : 5
A1 Alive:true
A2 Alive:true
A2 : 5
A1 : 4
A2 : 4
A1 : 3
A2 : 3
A1 : 2
A2 : 2
A2 : 1
A1 : 1
exit A1
exit A2
 */
class S1 extends Thread {
    protected String name ;
    S1(String c)
    {
        this.name = c;
        this.start();
        System.out.println("New Thread "+ this.name);
    }
    public void run()
    {
        System.out.println("Init Thread "+ this.name);
        try {
            System.out.println("Start Thread "+ this.name);
            sleep(1000);              
        } catch (InterruptedException e) {
                // TODO Auto-generated catch block
            System.out.println("intrrupt " + name);
        }
        System.out.println("exit " + name);
        System.out.printf("After exit Alive %s : %b \n" , name , this.isAlive());
    }
}
public class A3 {   
    public static void main(String[] args) throws InterruptedException {
        S1 A = new S1("A1");
        S1 S1 = new S1("A2");
        System.out.println("BEFORE Join Thread A1 Alive:"+A.isAlive());
        System.out.println("BEFORE Join Thread A2 Alive:"+S1.isAlive());
        A.join();
        S1.join();
         System.out.println("After Join Thread A1 Alive:"+A.isAlive());
        System.out.println("After Join Thread A2 Alive:"+S1.isAlive());
    }
}
