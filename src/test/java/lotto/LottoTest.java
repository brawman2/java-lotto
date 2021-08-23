package lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LottoTest {

	@Test
	void scope() {
		assertThatThrownBy(() -> {
			Lotto lotto = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		}).isExactlyInstanceOf(IllegalArgumentException.class);

		assertThatThrownBy(() -> {
			Lotto lotto = new Lotto(Arrays.asList(1, 2, 3, 4, 5));
		}).isExactlyInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void compare() {
		Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));
		Lotto lotto2 = new Lotto(Arrays.asList(1,2,3,4,5,7));
		assertThat(lotto.matchedCount(lotto2)).isEqualTo(5);
	}
}
