package sk.kosickaakademia.threadCommunication.qAndA;

public class TAnswer extends Thread{
    private Chat chat;
    private Thread t;
    private String[] answers = {"Hi friend.", "I'm Linus.", "Quite well.", "See you later."};

    public TAnswer(Chat chat) {
        this.chat = chat;
        start();
    }

    @Override
    public synchronized void start() {
        if (t == null){
            t = new Thread(this, "TAnswer");
            t.start();
        }
    }

    @Override
    public void run() {
        for (String str :
                answers) {
            chat.answer(str);
        }
    }
}
