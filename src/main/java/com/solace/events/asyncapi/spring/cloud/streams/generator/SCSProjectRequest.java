package com.solace.events.asyncapi.spring.cloud.streams.generator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import io.spring.initializr.generator.ProjectRequest;

@Configuration
@ConfigurationProperties(prefix = "spring.initializr")
public class SCSProjectRequest {
	private List<String> style = new ArrayList<>();

	private List<String> dependencies = new ArrayList<>();

	private String name;

	private String type;

	private String description;

	private String groupId;

	private String artifactId;

	private String version;

	private String bootVersion;

	private String packaging;

	private String applicationName;

	private String language;

	private String packageName;

	private String javaVersion;

	// The base directory to create in the archive - no baseDir by default
	private String baseDir;

	public List<String> getStyle() {
		return this.style;
	}

	public void setStyle(List<String> style) {
		this.style = style;
	}

	public List<String> getDependencies() {
		return this.dependencies;
	}

	public void setDependencies(List<String> dependencies) {
		this.dependencies = dependencies;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return this.artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getBootVersion() {
		return this.bootVersion;
	}

	public void setBootVersion(String bootVersion) {
		this.bootVersion = bootVersion;
	}

	public String getPackaging() {
		return this.packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPackageName() {
		if (StringUtils.hasText(this.packageName)) {
			return this.packageName;
		}
		if (StringUtils.hasText(this.groupId) && StringUtils.hasText(this.artifactId)) {
			return getGroupId() + "." + getArtifactId();
		}
		return null;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getJavaVersion() {
		return this.javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getBaseDir() {
		return this.baseDir;
	}

	public void setBaseDir(String baseDir) {
		this.baseDir = baseDir;
	}
	
	public ProjectRequest getProjectRequest()
	{
		ProjectRequest pr = new ProjectRequest();
		pr.setApplicationName(this.applicationName);
		pr.setArtifactId(this.artifactId);
		pr.setBaseDir(this.baseDir);
		pr.setBootVersion(this.bootVersion);
		pr.setDependencies(this.dependencies);
		pr.setDescription(this.description);
		pr.setGroupId(this.groupId);
		pr.setJavaVersion(this.javaVersion);
		pr.setLanguage(this.language);
		pr.setName(this.name);
		pr.setPackageName(this.packageName);
		pr.setPackaging(this.packaging);
		pr.setType(this.type);
		pr.setStyle(this.style);
		pr.setVersion(this.version);
		
		
		
		return pr;
	}

}