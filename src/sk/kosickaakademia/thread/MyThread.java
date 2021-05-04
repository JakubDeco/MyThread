package sk.kosickaakademia.thread;

public class MyThread implements Runnable{

    private String threadName;
    private Thread thread;
    private int priority;

    public MyThread(String threadName, int priority){
        this.threadName = threadName;
        this.priority = priority;
        System.out.println("created " + threadName + " thread.");
    }

    @Override
    public void run() {
        System.out.println("running " + threadName + " thread.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName+ " value: " + i);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        System.out.println("thread " + threadName + " is starting.");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.setPriority(priority);
            thread.start();
        }
    }
}
