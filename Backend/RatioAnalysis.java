import java.util.List;

public class RatioAnalysis {

    public static void calculateRatio(List<Ledger> ledgers) {

        double currentAssets = 0;
        double currentLiab = 0;

        for (Ledger l : ledgers) {
            if (l.type.equals("ASSET")) currentAssets += l.balance;
            if (l.type.equals("LIABILITY")) currentLiab += l.balance;
        }

        if (currentLiab == 0) {
            System.out.println("Current Ratio: Cannot divide by zero");
        } else {
            System.out.println("Current Ratio = " + (currentAssets / currentLiab));
        }
    }
}
