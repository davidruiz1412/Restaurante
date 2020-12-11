public class Client extends Person implements Runnable{
    private Table table;
    private boolean continued = true;
    private Thread threadClient;

    public final long HIGH_VELOCITY= (long) Math.random()*900+1000;
    public final long LOW_VELOCITY= (long) Math.random()*800+3500;

    public Client(Table t){
        this.table = t;
        this.threadClient = new Thread(this);
        threadClient.start();
    }

    public void run() {
        while(continued){
            if(table.getNumBurgers()>0) {
                table.setNumBurgers(table.getNumBurgers() - 1);
            }else{
                System.out.println("Cliente: Tengo hambre!");
            }
            System.out.println("Cliente: " + table.getNumBurgers() + "/" + table.getMaxBurgers());
            regulateVelocity(table, HIGH_VELOCITY , LOW_VELOCITY);
        }

    }
}
