package lotto;

import java.util.Arrays;

public enum LottoRank {
	FIRST(6, 2000000000),

	SECOND(5, 1500000),

	THIRD(4, 50000),

	FOURTH(3, 5000);

	private final int reward;
	private final int matchCount;

	LottoRank(int matchCount, int reward) {
		this.matchCount = matchCount;
		this.reward = reward;
	}

	public static LottoRank countLotto(Lotto target, Lotto firstRank) {
		return Arrays
			.stream(LottoRank.values())
			.filter(rank -> target.matchedCount(firstRank) == rank.matchCount)
			.findFirst()
			.get();
	}
}
