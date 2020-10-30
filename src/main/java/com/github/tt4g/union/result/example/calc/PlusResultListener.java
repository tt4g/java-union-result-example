package com.github.tt4g.union.result.example.calc;

public interface PlusResultListener<T> {

    T listen(PlusResult.SuccessPlusResult successPlusResult);

    T listen(PlusResult.ExceptionPlusResult exceptionPlusResult);

    T listen(PlusResult.NotSupportedPlusResult notSupportedPlusResult);

}
