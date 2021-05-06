package sk.kosickaakademia.threadCommunication.qAndA;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();
        new TQuestion(chat);
        new TAnswer(chat);
    }
}
