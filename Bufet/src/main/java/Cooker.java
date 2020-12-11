public class Cooker extends Person implements Runnable{
    private Table table;
    private boolean continued=true;
    private Thread threadCooker;

    public final long HIGH_VELOCITY = (long) Math.random()*2000+1000;
    public final long LOW_VELOCITY = (long) Math.random()*2000+3500;

    public Cooker(Table t){
        this.table = t;
        this.threadCooker = new Thread(this);
        threadCooker.start();
    }

    public void run() {
        while(continued){
            if(table.getNumBurgers()<table.getMaxBurgers()) {
                table.setNumBurgers(table.getNumBurgers() + 1);
            }
            System.out.println("Cocinero: " + table.getNumBurgers() + "/" + table.getMaxBurgers());
            regulateVelocity(table,LOW_VELOCITY,HIGH_VELOCITY);
        }
    }
}
