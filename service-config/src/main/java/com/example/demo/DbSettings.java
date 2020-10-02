package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mysql")
public class DbSettings {
 private String url;
 private int passward;
 private String userName;
 private String driverClass;
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public int getPassward() {
	return passward;
}
public void setPassward(int passward) {
	this.passward = passward;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getDriverClass() {
	return driverClass;
}
public void setDriverClass(String driverClass) {
	this.driverClass = driverClass;
} 
 
 

}
