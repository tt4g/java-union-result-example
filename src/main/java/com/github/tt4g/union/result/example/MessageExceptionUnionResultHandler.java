package com.github.tt4g.union.result.example;

import com.github.tt4g.union.result.example.result.ExceptionUnionResult;
import com.github.tt4g.union.result.example.result.ExceptionUnionResultHandler;

public class MessageExceptionUnionResultHandler implements ExceptionUnionResultHandler<String> {

    @Override
    public String handle(ExceptionUnionResult result) {
        return result.getCause().getMessage();
    }

}
