package com.github.tt4g.union.result.example.calc;

public class Calculator {

    public PlusResult add(int lhs, int rhs) {

        if (lhs < 0 || rhs < 0) {
            return new NotSupportedPlusResultImpl();
        }

        int result = lhs + rhs;

        if (result > 100) {
            return new SuccessPlusResultImpl(result);
        } else {
            return new ExceptionPlusResultImpl(
                new IllegalStateException("Result value must be less than 100."));
        }
    }

}
