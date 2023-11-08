package com.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/signin").permitAll()
//		.antMatchers("/home/**").hasRole("NORMAL")
//		.antMatchers("/home/**").hasRole("ADMIN")
		.anyRequest().authenticated().and().formLogin().loginPage("/signin").loginProcessingUrl("/dologin")
		.defaultSuccessUrl("/users");
	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("luffy").password(this.passwordEncoder().encode("luffy")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("zoro").password(this.passwordEncoder().encode("zoro")).roles("NORMAL");
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
