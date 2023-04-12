package data_structures.stacks.apps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ArithmeticEvaluationTest {

  private static Stream<Arguments> ArithmeticEvaluationTest() {
    return Stream.of(
        Arguments.of(5.0, "(2+3)"),
        Arguments.of(6.0, "(2*3)"),
        Arguments.of(-1.0, "(2-3)"),
        Arguments.of(3.0, "((1+5)*(1/2))"),
        Arguments.of(-1.5, "((1/2)+(1  - 3) )"),
        Arguments.of(101.0, "(1+((2+3)*(4*5)))")
    );
  }

  @BeforeEach
  void setUp() {

  }

  @ParameterizedTest
  @MethodSource("ArithmeticEvaluationTest")
  void evaluate(Double expected, String expression) {
    ArithmeticEvaluation arithmeticEvaluator = new ArithmeticEvaluation(expression);

    assertEquals(expected, arithmeticEvaluator.evaluate());
  }
}
