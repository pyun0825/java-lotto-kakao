package buyer;

import lotto.Lotteries;
import lotto.Lottery;
import java.util.List;

public class Buyer {
    private final Lotteries lotteries = new Lotteries();
    private final Budget budget;

    public Buyer(int budget) {
        this.budget = new Budget(budget);
    }

    public boolean hasMoreBudgetThan(int price){
        return budget.hasMoreThan(price);
    }

    public void decreaseBudgetByPrice(int price) {
        this.budget.decreaseBudget(price);
    }

    public void addLottery(Lottery lottery) {
        lotteries.addLottery(lottery);
    }

    public List<Lottery> getLotteries() {
        return lotteries.getLotteries();
    }
}
