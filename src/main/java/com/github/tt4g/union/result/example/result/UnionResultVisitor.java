package com.github.tt4g.union.result.example.result;

public interface UnionResultVisitor<R extends UnionResult> {

    <T> T visit(UnionResultHandler<R, T> unionResultHandler);

}
