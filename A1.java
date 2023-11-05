class A1 {
    public static void main(String[] args) throws InterruptedException {
        InnerThreadon n = new InnerThreadon(10);
        InnerThreadonchar t = new InnerThreadonchar();
        n.start();
        t.start();       
    }
}
/**
 * InnerThreadon
 */
 class InnerThreadon extends Thread {
    private int n;
    public InnerThreadon(int i) {
        this.n = i;
    }
    public void run()
    {
        for (int i = 1; i < this.n; i++) {
            System.err.printf("%d " ,i);
        }
    }
}
/**
 * InnerThreadon
 */
 class InnerThreadonchar extends Thread {
    public void run()
    {
        for (char i = 'a'; i < '{'; i++) {
            System.err.printf("%c " ,i);
        }        
    }   
}
