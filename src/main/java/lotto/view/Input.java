package lotto.view;


import lotto.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    private Input() {
    }

    public static Money inputMoney() {

        System.out.println("구입금액을 입력해 주세요.");
        int inputMoney = scanner.nextInt();
        return new Money(inputMoney);

    }


    public static WinningLotto inputLastWinningNumber() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        Lotto wininglotto = new Lotto(inputNumbers());
        return inputLastBonusNumber(wininglotto);
    }

    public static WinningLotto inputLastBonusNumber(Lotto wininglotto) {

        System.out.println("보너스 번호를 입력해주세요.");
        int inputBonusNumber = scanner.nextInt();
        return new WinningLotto(wininglotto, new LottoNumber(inputBonusNumber));

    }

    public static Boolean isEmptyOrBlank(String inputName) {
        return inputName == null || inputName.trim().isEmpty();
    }

    public static int inputSelectLottoCount() {

        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        return scanner.nextInt();
    }

    public static List<Lotto> inputSelectLottonumber(int selectCount) {

        List<Lotto> selectLottos = new ArrayList<Lotto>();
        System.out.println("수동으로 구매할 번호를 입력해 주세요.");

        for (int count = 0; count < selectCount; count++) {
            Lotto lotto = new Lotto(inputNumbers());
            selectLottos.add(lotto);
        }

        return selectLottos;
    }

    private static String inputNumbers() {
        String inputLastWinningNumber = scanner.next();
        if (isEmptyOrBlank(inputLastWinningNumber)) {
            throw new IllegalArgumentException("값이 입력되지 않았습니다.");
        }
        return inputLastWinningNumber;
    }
}