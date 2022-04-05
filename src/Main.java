public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerOnError = System.out::println;

        Worker worker = new Worker(listener, listenerOnError);
        worker.start();
    }
}
