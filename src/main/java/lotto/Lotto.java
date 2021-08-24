package lotto;

import java.util.List;

public class Lotto {

	private final LottoNumbers lottoNumbers;
	private final int price;

	public Lotto(List<Integer> numbers, int price) {
		this.lottoNumbers = new LottoNumbers(numbers);
		this.price = price;
	}

	public LottoRank checkResult(List<Integer> winningNumber) {
		return LottoRank.findLottoRank(this.lottoNumbers, new LottoNumbers(winningNumber));
	}
}
