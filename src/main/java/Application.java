import ui.InputView;
import ui.ResultView;

public class Application {

	private final InputView inputView;
	private final ResultView resultView;

	public Application() {
		this.inputView = new InputView();
		this.resultView = new ResultView();
	}

	void startLottoGame() {
		this.inputView.drawQuestionOfMoney();
		int lottoCount = this.inputView.inputAmountOfMoney();

		this.inputView.drawQuestionOf1stLotto();
		this.inputView.inputLottoNumbers();
	}
	public static void main(String[] args) {
	}
}
