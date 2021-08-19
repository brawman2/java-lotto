package calculator;

import org.junit.jupiter.api.Test;

public class CalculatorContextTest {

	@Test
	void 수식() {
		CalculatorContext context = CalculatorContext("1,2:3");
		CalculatorExpression expression = context.expression();
		CalculatorSplitter splitter = context.splitter();
	}
}
