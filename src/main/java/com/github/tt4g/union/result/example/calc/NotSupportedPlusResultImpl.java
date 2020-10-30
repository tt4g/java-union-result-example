package com.github.tt4g.union.result.example.calc;

import com.github.tt4g.union.result.example.calc.PlusResult.NotSupportedPlusResult;

class NotSupportedPlusResultImpl implements NotSupportedPlusResult {

    @Override
    public <T> T visit(PlusResultListener<T> plusResultListener) {
        return plusResultListener.listen(this);
    }

}
