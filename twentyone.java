/*write a program to demonstrate priorities among multiple threads */
public class twentyone {
    public static void main(String[] args) {
        Thread t1 = new MyThread(
        "Thread 1");
        Thread t2 = new MyThread("thread 2");
        Thread t3 = new MyThread("thread 3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

}
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 1; i<=5; i++) {
            System.out.println(name + "; " + i);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
