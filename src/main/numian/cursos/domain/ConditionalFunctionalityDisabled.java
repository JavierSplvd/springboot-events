package main.numian.cursos.domain;

import org.springframework.stereotype.Component;

public class ConditionalFunctionalityDisabled implements ConditionalFunctionality {
    @Override
    public void doSomething() {
        System.out.println("Disabled");
    }
}
