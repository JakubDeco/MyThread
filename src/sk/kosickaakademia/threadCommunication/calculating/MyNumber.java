package sk.kosickaakademia.threadCommunication.calculating;

public class MyNumber {
    private static int value;
    private boolean flag = false;

    public MyNumber(int value){
        MyNumber.value = value;
        //flag = true;
    }

    public synchronized void add(int value){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(value);
        flag = !flag;
        notify();
    }

    public synchronized void multiply(int value){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(value);
        flag = !flag;
        notify();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        MyNumber.value = value;
    }
}
