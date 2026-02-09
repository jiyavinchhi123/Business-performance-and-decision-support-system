public class Main {

    public static void main(String[] args) {

        // Create Ledgers
        Ledger cash = new Ledger(1, "Cash", "ASSET");
        Ledger bank = new Ledger(2, "Bank", "ASSET");
        Ledger capital = new Ledger(3, "Capital", "LIABILITY");
        Ledger sales = new Ledger(4, "Sales", "INCOME");
        Ledger rent = new Ledger(5, "Rent", "EXPENSE");
        Ledger customer = new Ledger(6, "Ramesh Traders", "ASSET");

        // Register ledgers in system
        AccountingSystem.addLedger(cash);
        AccountingSystem.addLedger(bank);
        AccountingSystem.addLedger(capital);
        AccountingSystem.addLedger(sales);
        AccountingSystem.addLedger(rent);
        AccountingSystem.addLedger(customer);

        // Capital introduced
        AccountingSystem.post(new Voucher(1, "JOURNAL", cash, capital, 50000));

        // Credit Sale
        AccountingSystem.post(new Voucher(2, "SALES", customer, sales, 20000));

        // Payment received
        AccountingSystem.post(new Voucher(3, "RECEIPT", cash, customer, 8000));

        // Rent paid
        AccountingSystem.post(new Voucher(4, "PAYMENT", rent, cash, 2000));

        // Reports
        ProfitAndLoss.calculatePL(AccountingSystem.getLedgers());
        BalanceSheet.showBalanceSheet(AccountingSystem.getLedgers());
        RatioAnalysis.calculateRatio(AccountingSystem.getLedgers());
    }
}
