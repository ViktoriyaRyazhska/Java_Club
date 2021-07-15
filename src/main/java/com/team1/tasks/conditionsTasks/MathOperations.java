package com.team1.tasks.conditionsTasks;

public class MathOperations {
    private MathOperations() {
    }

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "/":
                if (v1 == 0 || v2 == 0) throw new IllegalArgumentException("Division by zero");
                else return v1 / v2;
            case "*":
                return v1 * v2;
            default:
                return 0;
        }
    }
}
