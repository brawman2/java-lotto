package calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorExpressionTest {

	@Test
	void valid() {
		CalculatorExpression expression = new CalculatorExpression("1,2:3");
		CalculatorNumber result = expression.resultNumber();
		assertThat(result).isEqualTo(new CalculatorNumber(6));
	}

	@Test
	void valid2() {
		CalculatorExpression expression = new CalculatorExpression("1;2;3”");
		CalculatorNumber result = expression.resultNumber(";");
		assertThat(result).isEqualTo(new CalculatorNumber(6));
	}
}
