package com.github.tt4g.union.result.example.result;

import java.util.Objects;

public abstract class ExceptionUnionResultVisitorBase
    implements ExceptionUnionResultVisitor {

    private final Exception cause;

    protected ExceptionUnionResultVisitorBase(Exception cause) {
        this.cause = Objects.requireNonNull(cause);
    }

    @Override
    public <T> T visit(UnionResultHandler<ExceptionUnionResult, T> unionResultHandler) {
        return unionResultHandler.handle(this);
    }

    @Override
    public Exception getCause() {
        return this.cause;
    }

}
