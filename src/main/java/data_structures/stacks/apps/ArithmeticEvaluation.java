package data_structures.stacks.apps;

import data_structures.stacks.StackGenerics;

public class ArithmeticEvaluation {

  private final String input;
  private final StackGenerics<Double> values;
  private final StackGenerics<Character> operations;

  public ArithmeticEvaluation(String s) {
    input = s;
    values = new StackGenerics<>();
    operations = new StackGenerics<>();
  }

  public Double evaluate() {

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == '(') {

      } else if (c == ' ') {

      } else if ("+-*/".indexOf(c) != -1) {
        operations.push(c);
      } else if (c == ')') {
        Double right = values.pop();
        Double left = values.pop();
        Character op = operations.pop();
        if (op == '+') {
          values.push(left + right);
        } else if (op == '-') {
          values.push(left - right);
        } else if (op == '*') {
          values.push(right * left);
        } else if (op == '/') {
          values.push(left / right);
        }
      } else {
        values.push(Double.parseDouble(String.valueOf(c)));
      }
    }
    return values.pop();
  }

}
