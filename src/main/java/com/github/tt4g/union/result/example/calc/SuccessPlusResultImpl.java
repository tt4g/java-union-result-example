package com.github.tt4g.union.result.example.calc;

import com.github.tt4g.union.result.example.calc.PlusResult.SuccessPlusResult;

class SuccessPlusResultImpl implements SuccessPlusResult {

    private final int result;

    public SuccessPlusResultImpl(int result) {
        this.result = result;
    }

    @Override
    public int getResult() {
        return this.result;
    }

    @Override
    public <T> T visit(PlusResultListener<T> plusResultListener) {
        return plusResultListener.listen(this);
    }
}
