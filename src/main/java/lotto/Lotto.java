package lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lotto {
	private final List<LottoNumber> lottoNumbers;

	public Lotto(List<Integer> numbers) {
		if (numbers.size() != 6) {
			throw new IllegalArgumentException("로또 숫자가 6개가 아닙니다.");
		}
		// 겹치는 숫자 있으면 예외처리
		this.lottoNumbers = numbers
			.stream()
			.map(number -> new LottoNumber(number))
			.collect(Collectors.toList());
	}

	public int matchedCount(Lotto other) {
		Set<LottoNumber> union = new HashSet<>();
		this.lottoNumbers.forEach(lotto -> union.add(lotto));
		other.lottoNumbers.forEach(lotto -> union.add(lotto));

		return this.lottoNumbers.size() + other.lottoNumbers.size() - union.size();
	}
}
