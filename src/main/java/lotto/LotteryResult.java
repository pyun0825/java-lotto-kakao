package lotto;

import java.util.List;

public class LotteryResult {
    private final List<Integer> winningNumbers;
    private final int bonusNumber;

    public LotteryResult(List<Integer> winningNumbers, int bonusNumber) {
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof LotteryResult)) return false;

        LotteryResult cp = (LotteryResult) obj;

        return this.winningNumbers.equals(cp.winningNumbers) && this.bonusNumber == cp.bonusNumber;
    }

    public int getMatchCount(Lottery lottery) {
        int count = 0;
        List<Integer> lotteryNumbers = lottery.getNumbers();

        for(final Integer number : winningNumbers){
            count += lotteryNumbers.contains(number) ? 1 : 0;
        }

        return count;
    }
}