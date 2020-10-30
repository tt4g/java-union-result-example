package com.github.tt4g.union.result.example.result;

/**
 * The basic result that fail due to {@link Exception}.<br>
 */
public interface ExceptionUnionResult extends UnionResult {

    Exception getCause();

}
