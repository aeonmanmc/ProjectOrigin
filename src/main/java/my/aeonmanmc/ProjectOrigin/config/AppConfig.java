package my.aeonmanmc.ProjectOrigin.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = { "my.aeonmanmc.ProjectOrigin.model" })
@EnableJpaRepositories(basePackages = { "my.aeonmanmc.ProjectOrigin.repo" })
@EnableTransactionManagement
public class AppConfig {

}
