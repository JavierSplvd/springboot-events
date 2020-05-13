package test.numian.cursos;

import main.numian.cursos.domain.ConditionalFunctionality;
import main.numian.cursos.domain.ConditionalFunctionalityDisabled;
import main.numian.cursos.domain.ConditionalFunctionalityEnabled;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories()
@PropertySource("classpath:application.properties")
public class TestApplication {
    @Bean
    public ConditionalFunctionality conditionalFunctionality(@Value("${feature.name_of_the_functionality}") boolean enabled) {
        return enabled ? new ConditionalFunctionalityEnabled() : new ConditionalFunctionalityDisabled();
    }
}