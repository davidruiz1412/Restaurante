public class Cooker implements Runnable{
    private Table table;
    private boolean continued;

    public Cooker(Table t){
        this.table = t;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            if(table.getNumBurgers()<table.getMaxBurgers()) {
                table.setNumBurgers(table.getNumBurgers() + 1);
            }
            System.out.println("Cocinero: " + table.getNumBurgers() + "/" + table.getMaxBurgers());
        }
    }
}
