
package com.portfolioSpring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 

/**

 * Clase que habilita CORS

 * @author YOProgramo

 */

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**").allowedOrigins("https://portfolio-nuevo.web.app");;

    }

   @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }  

}
 
 

    
