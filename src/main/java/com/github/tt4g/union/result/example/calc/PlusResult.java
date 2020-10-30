package com.github.tt4g.union.result.example.calc;

import com.github.tt4g.union.result.example.result.ExceptionUnionResult;
import com.github.tt4g.union.result.example.result.UnionResult;

public interface PlusResult extends UnionResult {

    <T> T visit(PlusResultListener<T> plusResultListener);

    /**
     * Success
     */
    interface SuccessPlusResult extends PlusResult {

        int getResult();

    }

    /**
     * An error occurred.
     */
    interface ExceptionPlusResult extends PlusResult, ExceptionUnionResult {

    }

    /**
     * Not supported yet.
     */
    interface NotSupportedPlusResult extends PlusResult {

    }

}
