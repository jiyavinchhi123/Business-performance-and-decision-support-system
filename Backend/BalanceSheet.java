import java.util.List;

public class BalanceSheet {

    public static void showBalanceSheet(List<Ledger> ledgers) {

        double assets = 0;
        double liabilities = 0;

        for (Ledger l : ledgers) {
            if (l.type.equals("ASSET")) assets += l.balance;
            if (l.type.equals("LIABILITY")) liabilities += l.balance;
        }

        System.out.println("\n--- Balance Sheet ---");
        System.out.println("Total Assets      : ₹" + assets);
        System.out.println("Total Liabilities : ₹" + liabilities);

        if (assets == liabilities) {
            System.out.println("Balance Sheet is Balanced ✔");
        } else {
            System.out.println("Difference : ₹" + (assets - liabilities));
        }
    }
}
