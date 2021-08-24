package lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LottoTest {

	@Test
	void test() {
		Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6), 1000);
		LottoRank rank = lotto.checkResult(Arrays.asList(1,2,3,4,5,6));
	}
}
