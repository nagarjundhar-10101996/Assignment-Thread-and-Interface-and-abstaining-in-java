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
class A1 extends Thread {
    protected String name ;
    A1(String c)
    {
        this.name = c;
        this.start();
        System.out.println("New Thread "+ this.name);
    }
    public void run()
    {
        try {
            for (int i = 5; i > 0 ; i--) {
            System.out.println(name +" : "+ i );
            sleep(1000);
            }
                
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println("intrrupt " + name);
            }
         System.out.println("exit " + name);
          System.out.printf("Alive %s : %b \n" , name , this.isAlive());
    }
    
}



public class A3 {
    
    public static void main(String[] args) throws InterruptedException {
        A1 A = new A1("A1");
        A1 A1 = new A1("A2");
        System.out.println("A1 Alive:"+A.isAlive());
        System.out.println("A2 Alive:"+A1.isAlive());
        A.join();
        A1.join();
         System.out.println("A1 Alive:"+A.isAlive());
        System.out.println("A2 Alive:"+A1.isAlive());
       
        
       
    }
}
