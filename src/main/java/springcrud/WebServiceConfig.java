package springcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan({ "springcrud.controller" })
public class WebServiceConfig extends WebMvcConfigurerAdapter {
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/test/home").setViewName("sample");

	}

}
