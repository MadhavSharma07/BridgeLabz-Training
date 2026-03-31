package madhav.sonarqube;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
@Test
public void testAddition() {
Calculator calculator = new Calculator();
assertEquals(5, calculator.add(2, 3));
}

@Test
public void testSubtraction() {
Calculator calculator = new Calculator();
assertEquals(2, calculator.subtract(5, 3));
}
}