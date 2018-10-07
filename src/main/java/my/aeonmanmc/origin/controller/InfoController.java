package my.aeonmanmc.origin.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class InfoController implements InfoContributor {

	@Value("${app.artifactId}")
	private String appArtifactId;

	@Value("${app.version}")
	private String appVersion;

	@Value("${app.description}")
	private String appDescription;

	private final Environment env;

	@Inject
	public InfoController(Environment env) {
		this.env = env;
	}

	@Override
	public void contribute(Builder builder) {

		builder.withDetail("ArtifactID", appArtifactId);
		builder.withDetail("Version", appVersion);
		builder.withDetail("Description", appDescription);
		String[] activeProfiles = env.getActiveProfiles();
		String[] defaultProfiles = env.getDefaultProfiles();
		builder.withDetail("Default profiles", StringUtils.arrayToCommaDelimitedString(defaultProfiles));
		builder.withDetail("Active profiles", StringUtils.arrayToCommaDelimitedString(activeProfiles));
	}

}
