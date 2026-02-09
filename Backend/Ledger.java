public class Ledger {
    int id;
    String name;
    String type;   // ASSET, LIABILITY, INCOME, EXPENSE
    double balance;

    public Ledger(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = 0;
    }
}
