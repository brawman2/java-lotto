package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoGroup {
	private final List<Lotto> lottoGroup;

	public LottoGroup(List<Lotto> lottoGroup) {
		this.lottoGroup = lottoGroup;
	}

	public int yield() {
	}

	public LottoReport lottoResultReport(List<Integer> winningNumbers) {

		List<LottoRank> result = new ArrayList<>();
		this.lottoGroup.forEach(lotto -> {
			result.add(lotto.checkResult(winningNumbers));
		});
		return new LottoReport(result, 1000);
	}
}
