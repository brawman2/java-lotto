package lotto;

public class LottoRule {

	//private construct
	private LottoRule() {}

	private static class InnerInstanceClazz {
		private static final LottoRule instance = new LottoRule();
	}

	public static LottoRule getInstance() {
		return InnerInstanceClazz.instance;
	}

	public boolean isCorrectNumber(int number) {
		return false;
	}

	public boolean isCorrectNumberSize(List<Integer> numbers) {
		return false;
	}
}
