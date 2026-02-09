import java.util.List;

public class ProfitAndLoss {

    public static void calculatePL(List<Ledger> ledgers) {

        double income = 0;
        double expense = 0;

        for (Ledger l : ledgers) {
            if (l.type.equals("INCOME")) income += l.balance;
            if (l.type.equals("EXPENSE")) expense += l.balance;
        }

        double profit = income - expense;

        System.out.println("\n--- Profit & Loss Account ---");
        System.out.println("Total Income  : ₹" + income);
        System.out.println("Total Expense : ₹" + expense);
        System.out.println("Net Profit    : ₹" + profit);
    }
}
