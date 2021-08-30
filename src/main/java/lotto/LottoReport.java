package lotto;

import java.util.List;

public class LottoReport {
	private final int lottoPrice;
	private List<LottoRank> ranks;

	public LottoReport(List<LottoRank> ranks, int lottoPrice) {
		this.ranks = ranks;
		this.lottoPrice = lottoPrice;
	}

	public int countByLottoRank(LottoRank lottorank) {
		return (int)this.ranks
			.stream()
			.filter(rank -> rank.equals(lottorank))
			.count();
	}

	public double profit() {
		int totalProfit = ranks
			.stream()
			.map(LottoRank::reward)
			.mapToInt(Integer::intValue)
			.sum();
		int totalPaid = this.ranks.size() * this.lottoPrice;
		return (double)totalProfit / (double)totalPaid;
	}
}
