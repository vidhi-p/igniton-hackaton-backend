package sample.promotion;

import sample.promotion.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class PromoApplication {
	private static final Logger log = LoggerFactory.getLogger(PromoApplication.class);
	@Autowired
	AppConfig appConfig;

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(PromoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void init() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n\n\t\t##############################################################\n");
		sb.append("\t\t######################## APP CONFIG ##########################\n");
		sb.append("\t\t##############################################################\n");
//		sb.append(String.format("\t\t\tNAME: %s\n", appConfig.getName()));
//		sb.append(String.format("\t\t\tPROFILES: %s\n", appConfig.getProfiles()));
		sb.append("\t\t##############################################################\n");
		sb.append("\t\t##############################################################\n");
		sb.append("\t\t##############################################################\n");

		log.info(sb.toString());
	}

}
