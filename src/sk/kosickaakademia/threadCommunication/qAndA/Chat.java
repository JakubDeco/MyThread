package sk.kosickaakademia.threadCommunication.qAndA;

public class Chat {
    private boolean flag = false;

    public synchronized void question(String question){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(question);
        flag = !flag;
        notify();
    }

    public synchronized void answer(String answer){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(answer);
        flag = !flag;
        notify();
    }
}
