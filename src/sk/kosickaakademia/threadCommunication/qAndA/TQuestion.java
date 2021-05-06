package sk.kosickaakademia.threadCommunication.qAndA;

public class TQuestion extends Thread{
    private Chat chat;
    private Thread t;
    private String[] questions = {"Hello", "What's your name?", "How are you?", "Goodbye"};

    public TQuestion(Chat chat) {
        this.chat = chat;
        start();
    }

    @Override
    public synchronized void start() {
        if (t == null){
            t = new Thread(this,"TQuestion");
            t.start();
        }
    }

    @Override
    public void run() {
        for (String str :
                questions) {
            chat.question(str);
        }
    }
}
