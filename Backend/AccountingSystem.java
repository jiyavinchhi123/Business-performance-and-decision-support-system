import java.util.*;

public class AccountingSystem {

    private static List<Ledger> ledgers = new ArrayList<>();
    private static List<Voucher> vouchers = new ArrayList<>();

    // Add a ledger
    public static void addLedger(Ledger l) {
        ledgers.add(l);
    }

    // Get all ledgers (for P&L, Balance Sheet, Ratio etc)
    public static List<Ledger> getLedgers() {
        return ledgers;
    }

    // Post a voucher (core Tally logic)
    public static void post(Voucher v) {
        vouchers.add(v);

        // Debit Rule
        if (v.debit.type.equals("ASSET") || v.debit.type.equals("EXPENSE"))
            v.debit.balance += v.amount;
        else
            v.debit.balance -= v.amount;

        // Credit Rule
        if (v.credit.type.equals("LIABILITY") || v.credit.type.equals("INCOME"))
            v.credit.balance += v.amount;
        else
            v.credit.balance -= v.amount;
    }

    // Get all vouchers
    public static List<Voucher> getVouchers() {
        return vouchers;
    }
}
