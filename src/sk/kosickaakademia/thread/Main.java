package sk.kosickaakademia.thread;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Main started ---");

        MyThread myThread1 = new MyThread("myThread1",7);
        myThread1.start();

        MyThread myThread2 = new MyThread("myThread2",8);
        myThread2.start();

        System.out.println("--- Main ended ---");
    }
}
