package test.numian.cursos.domain;

import main.numian.cursos.App;
import main.numian.cursos.domain.ConditionalFunctionality;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import test.numian.cursos.TestApplication;

@RunWith(SpringRunner.class)
@Import(TestApplication.class)
public class ConditionalFunctionalityStrategyTest {

    @Autowired
    private ConditionalFunctionality conditionalFunctionality;

    @Test
    public void foo() {
        conditionalFunctionality.doSomething();
    }
}
