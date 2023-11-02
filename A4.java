class A4 {
    public static void main(String[] args) throws InterruptedException {
        String course[] ={"Java", "J2EE", "Spring"};
        InnerThreadon n = new InnerThreadon(course);
        InnerThreadonchar t = new InnerThreadonchar(course);
        n.start();
        t.start();
        n.join();
        t.join();
       
    }
}
/**
 * InnerThreadon
 */
 class InnerThreadon extends Thread {
    private String [] n;
    public InnerThreadon(String[] course) {
        this.n = course;
    }
    public void run()
    {
        for (int i = 0; i < this.n.length; i++) {
            System.out.printf("Thread %d : %s\n" , i+1 , n[i]);
        }
        
        
    }
    
}
/**
 * InnerThreadon
 */
 class InnerThreadonchar extends Thread {
    private String [] k;
    public InnerThreadonchar(String[] course) {this.k = course;}

    public void run()
    {
        
        for (int i = 0; i < this.k.length; i++) {
            System.out.printf("Thread %d : %s\n" , i+1 , k[i]);
        }
        
    }
    
}
