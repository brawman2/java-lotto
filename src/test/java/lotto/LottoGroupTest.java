package lotto;

import org.junit.jupiter.api.Test;

public class LottoGroupTest {

	@Test
	void test1() {
		LottoGroup lottoGroup = new LottoGroup(LottoUtil.createRandomLottoGroup(14));
		lottoGroup.firstRankCount();
	}
}
