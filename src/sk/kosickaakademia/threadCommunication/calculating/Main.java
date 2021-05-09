package sk.kosickaakademia.threadCommunication.calculating;

public class Main {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(1);
        new ThreadAdd("Add", number);
        new ThreadMul("Mul", number);
    }
}
