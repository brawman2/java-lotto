package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculatorExpression {
	private final String expression;

	public CalculatorExpression(String expression) {
		this.expression = expression;
	}

	public CalculatorNumber resultNumber() {
		String[] numbers = expression.split(",|:");
		List<CalculatorNumber> calculatorNumbers = Arrays
			.stream(numbers)
			.map(number -> new CalculatorNumber(number))
			.collect(Collectors.toList());

		CalculatorNumber result = new CalculatorNumber(0);

		for (int i = 0; i < calculatorNumbers.size(); i++) {
			CalculatorNumber sum = result.add(calculatorNumbers.get(i));
			result = sum;
		}
		return result;
	}
}
