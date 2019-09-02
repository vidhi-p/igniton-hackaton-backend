package sample.promotion.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){ return new Docket(DocumentationType.SWAGGER_2).select().paths(paths()).build().pathMapping("/")
            .genericModelSubstitutes(ResponseEntity.class)
            .useDefaultResponseMessages(false)
            .apiInfo(apiInfo());
    }

    private Predicate<String> paths(){
        return or( regex("/.*"));
    }

    private ApiInfo apiInfo()
    {
        String title = "I got that Swag :)";
        String description = "great microservices";
        return simpleApiInfo(title,description);
    }
    private ApiInfo simpleApiInfo(String title, String description)
    {
        return new ApiInfo(title, description, null, null, null, null, null, Collections.emptyList());
    }
}