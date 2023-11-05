class A4 {
    public static void main(String[] args) throws InterruptedException {
        String course[] ={"Java", "J2EE", "Spring"};
        Course n = new Course(course);
        Courseext t = new Courseext(course);
        Course d = new Course(course);
        
        n.start();
        t.start();
        d.start();
       
    }
}
/**
 * InnerThreadon
 */
 class Course extends Thread {
    private String [] n;
    public Course(String[] course) {
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
 class Courseext extends Thread {
    private String [] k;
    public Courseext(String[] course) {this.k = course;}

    public void run()
    {
        
        for (int i = 0; i < this.k.length; i++) {
            System.out.printf("Thread %d : %s\n" , i+1 , k[i]);
        }
        
    }
    
}
