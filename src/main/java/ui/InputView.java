package ui;

import java.util.Scanner;

public class InputView {
	private final Scanner scanner;

	public InputView() {
		this.scanner = new Scanner(System.in);
	}

	public void drawQuestionOfMoney() {
		System.out.println("구입금액을 입력해 주세요.");
	}

	public int inputAmountOfMoney() {
		return this.scanner.nextInt();
	}

	public void drawQuestionOf1stLotto() {
		System.out.println("지난 주 당첨 번호를 입력해 주세요.");
	}

	public String inputLottoNumbers() {
		return this.scanner.nextLine();
	}
}
