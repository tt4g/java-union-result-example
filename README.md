# Overview

Example for returns union result type on Java.

NOTE: This is a workaround until pattern matching can be used in Java.

## Run

```bash
$ ./gradlew run
100 - 1: Oops! this operation not supported yet.
100 + 0: Result value must be less than 100.
100 + 1: 101
```

source:

```java
package com.github.tt4g.union.result.example;

import com.github.tt4g.union.result.example.calc.Calculator;
import com.github.tt4g.union.result.example.calc.PlusListenerResultDispatcher;

public class App {

    public static void main(String[] args) {
        var messageExceptionUnionResultHandler = new MessageExceptionUnionResultHandler();
        var plusResultListener = new PlusResultListenerImpl(messageExceptionUnionResultHandler);

        PlusListenerResultDispatcher<String> stringPlusListenerResultDispatcher =
            new PlusListenerResultDispatcher<>(plusResultListener);

        var calculator = new Calculator();

        System.out.println("100 - 1: " +
            stringPlusListenerResultDispatcher.dispatch(calculator.add(100, -1)));
        System.out.println("100 + 0: " +
        stringPlusListenerResultDispatcher.dispatch(calculator.add(100, 0)));
        System.out.println("100 + 1: " +
            stringPlusListenerResultDispatcher.dispatch(calculator.add(100, 1)));
    }

}
```
