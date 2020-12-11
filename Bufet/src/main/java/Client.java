public class Client implements Runnable{
    private Table table;
    private boolean continued = true;

    public Client(Table t){
        this.table = t;

    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            if(table.getNumBurgers()>0) {
                table.setNumBurgers(table.getNumBurgers() - 1);
            }
            System.out.println("Cliente: " + table.getNumBurgers() + "/" + table.getMaxBurgers());
        }
    }
}
