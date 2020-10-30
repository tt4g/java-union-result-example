package com.github.tt4g.union.result.example.calc;

import java.util.Objects;

public class PlusListenerResultDispatcher<T> implements PlusResultDispatcher<T> {

    private final PlusResultListener<T> plusResultListener;

    public PlusListenerResultDispatcher(PlusResultListener<T> plusResultListener) {
        this.plusResultListener = Objects.requireNonNull(plusResultListener);
    }

    @Override
    public T dispatch(PlusResult plusResult) {
        return plusResult.visit(this.plusResultListener);
    }

}
