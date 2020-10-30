package com.github.tt4g.union.result.example;

import com.github.tt4g.union.result.example.calc.PlusResult.ExceptionPlusResult;
import com.github.tt4g.union.result.example.calc.PlusResult.NotSupportedPlusResult;
import com.github.tt4g.union.result.example.calc.PlusResult.SuccessPlusResult;
import com.github.tt4g.union.result.example.calc.PlusResultListener;
import com.github.tt4g.union.result.example.result.ExceptionUnionResultHandler;

public class PlusResultListenerImpl implements PlusResultListener<String> {

    private final ExceptionUnionResultHandler<String> stringExceptionUnionResultHandler;

    PlusResultListenerImpl(ExceptionUnionResultHandler<String> stringExceptionUnionResultHandler) {
        this.stringExceptionUnionResultHandler = stringExceptionUnionResultHandler;
    }

    @Override
    public String listen(SuccessPlusResult successPlusResult) {
        return String.valueOf(successPlusResult.getResult());
    }

    @Override
    public String listen(ExceptionPlusResult exceptionPlusResult) {
        return this.stringExceptionUnionResultHandler.handle(exceptionPlusResult);
    }

    @Override
    public String listen(NotSupportedPlusResult notSupportedPlusResult) {
        return "Oops! this operation not supported yet.";
    }
}
