package lotto;

import java.util.List;

public class LottoReport {
	private final int lottoPrice;
	private List<LottoRank> ranks;

	public LottoReport(List<LottoRank> ranks, int lottoPrice) {
		this.ranks = ranks;
		this.lottoPrice = lottoPrice;
	}

	private long countByLottoRank(LottoRank lottorank) {
		return this.ranks.stream().filter(rank -> rank.equals(lottorank)).count();
	}

	public int yield() {
		int profit = 0;
		this.ranks.forEach(lottoRank ->  {
			profit = lottoRank.yield(profit);
		});
		return profit / this.ranks.size();
	}

	public long firstPlace() {
		return countByLottoRank(LottoRank.FIRST);
	}

	public long secondPlace() {
		return countByLottoRank(LottoRank.SECOND);
	}

	public long thirdPlace() {
		return countByLottoRank(LottoRank.THIRD);
	}

	public long fourthPlace() {
		return countByLottoRank(LottoRank.FOURTH);
	}
}
