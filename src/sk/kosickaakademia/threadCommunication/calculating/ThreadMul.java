package sk.kosickaakademia.threadCommunication.calculating;

public class ThreadMul extends Thread{
    private Thread t;
    private String name;
    private MyNumber number;

    public ThreadMul(String name, MyNumber number){
        this.name = name;
        this.number = number;
        start();
    }
    @Override
    public synchronized void start() {
        if (t == null){
            t = new Thread(this,name);
            t.start();
        }
    }

    @Override
    public void run() {
        int value = number.getValue();
        while (value < 1000){
            number.setValue(number.getValue() * 2);
            number.multiply(number.getValue());
            value = number.getValue();
        }
    }
}
