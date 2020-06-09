package com.ioglyph.castor.application.config;

import com.ioglyph.castor.persistence.infrastructure.PodcastReadProvider;
import com.ioglyph.castor.service.PodcastQueryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CastorServiceConfig {

    @Bean
    public PodcastQueryService podcastQueryService(PodcastReadProvider provider){
        return new PodcastQueryService(provider);
    }
}
