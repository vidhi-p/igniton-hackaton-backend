package sample.promotion.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component

@ConfigurationProperties("app")
public class AppConfig {
	private String name;

	private String profiles;
}
