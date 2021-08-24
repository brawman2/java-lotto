package lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LottoRankTest {

	@Test
	void compare() {
		LottoNumbers winningNumber = new LottoNumbers(Arrays.asList(1,2,3,4,5,6));
		LottoNumbers lotto1 = new LottoNumbers(Arrays.asList(1,2,3,4,5,6));

		assertThat(LottoRank.findLottoRank(lotto1, winningNumber)).isEqualTo(LottoRank.FIRST);

		LottoNumbers lotto2 = new LottoNumbers(Arrays.asList(1,2,3,4,5,7));

		assertThat(LottoRank.findLottoRank(lotto2, winningNumber)).isEqualTo(LottoRank.SECOND);

		LottoNumbers lotto3 = new LottoNumbers(Arrays.asList(1,2,3,4,7,8));

		assertThat(LottoRank.findLottoRank(lotto3, winningNumber)).isEqualTo(LottoRank.THIRD);

		LottoNumbers lotto4 = new LottoNumbers(Arrays.asList(1,2,3,7,8,9));

		assertThat(LottoRank.findLottoRank(lotto4, winningNumber)).isEqualTo(LottoRank.FOURTH);

		LottoNumbers lotto5 = new LottoNumbers(Arrays.asList(1,2,7,8,9,10));

		assertThat(LottoRank.findLottoRank(lotto4, winningNumber)).isEqualTo(LottoRank.FOURTH);
	}
}
