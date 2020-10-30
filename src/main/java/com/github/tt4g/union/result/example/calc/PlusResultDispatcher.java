package com.github.tt4g.union.result.example.calc;

/**
 * Dispatch {@link PlusResult}.
 */
public interface PlusResultDispatcher<T> {

    T dispatch(PlusResult plusResult);

}
