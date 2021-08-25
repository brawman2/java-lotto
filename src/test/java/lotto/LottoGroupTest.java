package lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LottoGroupTest {

	@Test
	void test1() {
		LottoGroup lottoGroup = new LottoGroup(Arrays.asList(new Lotto(Arrays.asList(8, 21, 23, 41, 42, 43))));

		assertThat(lottoGroup.result())
	}
}
