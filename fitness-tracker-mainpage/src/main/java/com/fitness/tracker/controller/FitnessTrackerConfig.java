package com.fitness.tracker.controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@EnableWebSecurity
@Configuration
@EnableOAuth2Sso
public class FitnessTrackerConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.antMatcher("/**")
//		.authorizeRequests()
//		.antMatchers("/","login").permitAll()
//		.anyRequest().authenticated()
//		.and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());

		http.authorizeRequests()
		.antMatchers("/createUser").permitAll()
		.antMatchers("/", "/error", "/webjars/**").permitAll()
		.anyRequest().authenticated()
		.and().csrf(c -> c.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
		.oauth2Login();
		
	}
}
