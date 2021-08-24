package lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LottoNumbersTest {
	@Test
	void scope() {
		assertThatThrownBy(() -> {
			LottoNumbers numbers = new LottoNumbers(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		}).isExactlyInstanceOf(IllegalArgumentException.class);

		assertThatThrownBy(() -> {
			LottoNumbers numbers = new LottoNumbers(Arrays.asList(1, 2, 3, 4, 5));
		}).isExactlyInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void overlap() {
		assertThatThrownBy(() -> {
			LottoNumbers numbers = new LottoNumbers(Arrays.asList(1,2,3,3,4,5));
		}).isExactlyInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void compare() {
		LottoNumbers numbers = new LottoNumbers(Arrays.asList(1,2,3,4,5,6));
		LottoNumbers numbers2 = new LottoNumbers(Arrays.asList(1,2,3,4,5,7));
		assertThat(numbers.matchedCount(numbers2)).isEqualTo(5);
	}
}
