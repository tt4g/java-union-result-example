package com.github.tt4g.union.result.example.result;

/**
 * An {@link UnionResult} handler.<br>
 *
 * @param <R> A handle target.
 * @param <T> A result.
 */
public interface UnionResultHandler<R extends UnionResult, T> {

    T handle(R result);

}
