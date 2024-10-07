package org.marmotgraph.cdn.generic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Handle static resources for generic assets
        registry.addResourceHandler("/generic/**")
                .addResourceLocations("classpath:/org/marmotgraph/cdn/generic/")
                .setCacheControl(CacheControl.maxAge(30, TimeUnit.DAYS).cachePublic());

        // Handle static resources for tenant-specific assets
        registry.addResourceHandler("/ebrains/**")
                .addResourceLocations("classpath:/org/marmotgraph/cdn/ebrains/")
                .setCacheControl(CacheControl.maxAge(30, TimeUnit.DAYS).cachePublic());

        registry.addResourceHandler("/tef-health/**")
                .addResourceLocations("classpath:/org/marmotgraph/cdn/tef-health/")
                .setCacheControl(CacheControl.maxAge(30, TimeUnit.DAYS).cachePublic());
    }
}
