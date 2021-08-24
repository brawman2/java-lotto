package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoNumbers {
	private final List<LottoNumber> lottoNumbers;

	public LottoNumbers(List<Integer> numbers) {
		if (numbers.size() != 6) {
			throw new IllegalArgumentException("로또 숫자가 6개가 아닙니다.");
		}

		Set<Integer> union = new HashSet<>();
		numbers.forEach(number -> union.add(number));
		if(union.size() != numbers.size()) {
			throw new IllegalArgumentException("중복되는 숫자가 있습니다.");
		}

		this.lottoNumbers = numbers
			.stream()
			.map(number -> new LottoNumber(number))
			.collect(Collectors.toList());
	}

	public int matchedCount(LottoNumbers other) {
		Set<LottoNumber> union = new HashSet<>();
		this.lottoNumbers.forEach(lotto -> union.add(lotto));
		other.lottoNumbers.forEach(lotto -> union.add(lotto));

		return this.lottoNumbers.size() + other.lottoNumbers.size() - union.size();
	}
}
