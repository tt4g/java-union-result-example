package com.github.tt4g.union.result.example.calc;

import com.github.tt4g.union.result.example.calc.PlusResult.ExceptionPlusResult;
import com.github.tt4g.union.result.example.result.ExceptionUnionResultVisitorBase;

class ExceptionPlusResultImpl extends ExceptionUnionResultVisitorBase implements ExceptionPlusResult {

    ExceptionPlusResultImpl(Exception cause) {
        super(cause);
    }

    @Override
    public <T> T visit(PlusResultListener<T> plusResultListener) {
        return plusResultListener.listen(this);
    }

}
