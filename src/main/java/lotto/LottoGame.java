package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LottoGame {

	private final Supplier<List<Integer>> lottoMaker;
	private final int lottoPrice;

	protected LottoGame(int lottoPrice, Supplier<List<Integer>> lottoMaker) {
		this.lottoPrice = lottoPrice;
		this.lottoMaker = lottoMaker;
	}

	public static LottoGame of(int price, int minimum, int maximum, int count) {
		return new LottoGame(price, () -> {
			return makeLottoNumbers(minimum, maximum, count);
		});
	}

	public static List<Integer> makeLottoNumbers(int minimum, int maximum, int count) {
		ArrayList<Integer> numberScope = new ArrayList<>();
		for (int i = minimum; i < maximum + 1; i++) {
			numberScope.add(i);
		}
		Collections.shuffle(numberScope);
		List<Integer> lottoNumbers = numberScope.subList(0, count);
		Collections.sort(lottoNumbers);
		return lottoNumbers;
	}

	public List<LottoTicket> buyLotto(int price) {
		ArrayList<LottoTicket> lottos = new ArrayList<>();
		while (price >= this.lottoPrice) {
			List<Integer> numbers = this.lottoMaker.get();
			List<Integer> lottoNumbers = numbers.subList(0, numbers.size() - 1);
			int bonusNumber = numbers.get(numbers.size() - 1);

			lottos.add(new Lotto(lottoNumbers, bonusNumber, this.lottoPrice));
			price = price - this.lottoPrice;
		}
		return lottos;
	}

	public LottoReport lottoResult(List<LottoTicket> lottos, String winningNumbers, int bonusNumber) {
		LottoGroup lottoGroup = new LottoGroup(lottos
			.stream()
			.map(lottoTicket -> (Lotto)lottoTicket)
			.collect(Collectors.toList()));
		return lottoGroup.lottoResultReport(new Lotto(Arrays
			.stream(winningNumbers.split(", "))
			.map(Integer::parseInt)
			.collect(Collectors.toList()), bonusNumber, 0));
	}
}
