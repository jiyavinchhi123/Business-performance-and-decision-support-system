import java.time.LocalDate;

public class Voucher {
    int id;
    String type;  // SALES, PURCHASE, PAYMENT, RECEIPT, JOURNAL
    Ledger debit;
    Ledger credit;
    double amount;
    LocalDate date;

    public Voucher(int id, String type, Ledger debit, Ledger credit, double amount) {
        this.id = id;
        this.type = type;
        this.debit = debit;
        this.credit = credit;
        this.amount = amount;
        this.date = LocalDate.now();
    }
}
