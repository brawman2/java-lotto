package lotto;

import java.util.List;

public class Lotto {

	private final LottoNumbers lottoNumbers;

	public Lotto(List<Integer> numbers) {
		this(new LottoNumbers(numbers));
	}

	public Lotto(LottoNumbers lottoNumbers) {
		this.lottoNumbers = lottoNumbers;
	}

	public LottoRank checkResult(List<Integer> winningNumber) {
		return LottoRank.findLottoRank(this.lottoNumbers, new LottoNumbers(winningNumber));
	}
}
