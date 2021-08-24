package lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LottoRankTest {

	@Test
	void compare() {
		Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));
		Lotto lotto1 = new Lotto(Arrays.asList(1,2,3,4,5,6));

		assertThat(LottoRank.countLotto(lotto1, lotto)).isEqualTo(LottoRank.FIRST);

		Lotto lotto2 = new Lotto(Arrays.asList(1,2,3,4,5,7));

		assertThat(LottoRank.countLotto(lotto2, lotto)).isEqualTo(LottoRank.SECOND);

		Lotto lotto3 = new Lotto(Arrays.asList(1,2,3,4,7,8));

		assertThat(LottoRank.countLotto(lotto3, lotto)).isEqualTo(LottoRank.THIRD);

		Lotto lotto4 = new Lotto(Arrays.asList(1,2,3,7,8,9));

		assertThat(LottoRank.countLotto(lotto4, lotto)).isEqualTo(LottoRank.FOURTH);
	}
}
