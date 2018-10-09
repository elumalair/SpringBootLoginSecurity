# SpringBootLoginSecurity
SpringBootLoginSecurity


# Simple Security Login Application using Spring Boot.


    Prepare for Using Spring Security
    Remove All the Login Related Functionality
    Make Welcome the default page - with some hardcoding to start with.
    Refactor getLoggedInUserName
    Update Home Page Link in navigation


        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>

package com.vbt.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("dummy").password("dummy")
				.roles("USER", "ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login").permitAll()
				.antMatchers("/", "/*todo*/**").access("hasRole('USER')").and()
				.formLogin();
	}
}

Not Needed anymore in web.xml with Spring Boot Auto Configuration

	   <filter>
	    		<filter-name>springSecurityFilterChain</filter-name>
	    		<filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
	   </filter>
	 
	   <filter-mapping>
	   		<filter-name>springSecurityFilterChain</filter-name>
	    		<url-pattern>/*</url-pattern>
	   </filter-mapping> 
