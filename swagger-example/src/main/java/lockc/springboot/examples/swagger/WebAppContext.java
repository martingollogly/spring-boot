package lockc.springboot.examples.swagger;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mangofactory.swagger.plugin.EnableSwagger;

@EnableWebMvc
@EnableSwagger
@Configuration
public class WebAppContext extends WebMvcConfigurerAdapter
{


}
