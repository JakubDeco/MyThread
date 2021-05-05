package sk.kosickaakademia.thread;

public class PrimeNTread extends Thread{
    private Thread t;
    private String threadName;
    private int base;

    public PrimeNTread(String threadName, int base) {
        this.threadName = threadName;
        this.base = base;
        System.out.println("created " + threadName + " thread.");
    }

    @Override
    public synchronized void start() {
        System.out.println("thread " + threadName + " is starting.");
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("running " + threadName + " thread.");

    }

    public int findPrimeNumber(int base){
        if (base <= 2)
            return 2;

        if (base%2 == 0)
            base++;

        while (!isPrime(base)) {
            base++;
        }
        return base;
    }

    public boolean isPrime(int number){

        int y=number/2;
        int pd=1;
        while (y!=0){
            if (number%y==0){
                pd++;
            }
            y--;
        }

        return pd == 2;
    }
}
