package lotto;

import java.util.Arrays;

public enum LottoRank {
	FIRST(6, 2000000000),

	SECOND(5, 1500000),

	THIRD(4, 50000),

	FOURTH(3, 5000),

	NOTHING(0,0);

	private final int reward;
	private final int matchCount;

	LottoRank(int matchCount, int reward) {
		this.matchCount = matchCount;
		this.reward = reward;
	}

	public static LottoRank findLottoRank(LottoNumbers lotto, LottoNumbers winningNumber) {
		return Arrays
			.stream(LottoRank.values())
			.filter(rank -> rank.isWin(lotto, winningNumber))
			.findFirst()
			.get();
	}

	private boolean isWin(LottoNumbers lotto, LottoNumbers winningNumber) {
		return lotto.matchedCount(winningNumber) == matchCount;
	}
}
