package lotto;

import java.util.List;

public class Lotto {

	private final LottoNumbers lottoNumbers;

	public Lotto(List<Integer> numbers) {
		this.lottoNumbers = new LottoNumbers(numbers);
	}
}
