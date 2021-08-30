package lotto;

import java.util.List;
import java.util.stream.Collectors;

public class LottoGame {

	private final int lottoPrice;
	private final int minimumNumber;
	private final int maximumNumber;
	private final int lottoNumberCount;

	public LottoGame(int lottoPrice, int minimumNumber, int maximumNumber, int lottoNumberCount) {
		this.lottoPrice = lottoPrice;
		this.minimumNumber = minimumNumber;
		this.maximumNumber = maximumNumber;
		this.lottoNumberCount = lottoNumberCount;
	}

	public Lotto//

	LottoReport run(List<List<Integer>> lottoNumbers, List<Integer> winningNumber) {

		LottoGroup lottoGroup = new LottoGroup(lottoNumbers.stream().map(Lotto::new).collect(Collectors.toList()));
		return lottoGroup.lottoResultReport(winningNumber);
	}
}
