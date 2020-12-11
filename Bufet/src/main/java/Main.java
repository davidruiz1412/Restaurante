public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        Thread threadClient = new Thread(new Client(table));
        Thread threadCooker = new Thread(new Cooker(table));
        threadCooker.start();
        threadClient.start();
    }
}
