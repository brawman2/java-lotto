package lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LottoTest {

	@Test
	void test() {
		Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));

		assertThat(lotto.checkResult(Arrays.asList(1,2,3,4,5,6))).isEqualTo(LottoRank.FIRST);
	}
}
