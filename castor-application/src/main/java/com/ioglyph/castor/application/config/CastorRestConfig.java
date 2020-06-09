package com.ioglyph.castor.application.config;

import com.ioglyph.castor.rest.PodcastEndpoint;
import com.ioglyph.castor.service.PodcastQueryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CastorRestConfig {

    @Bean
    public PodcastEndpoint podcastEndpoint(PodcastQueryService queryService){
        return new PodcastEndpoint(queryService);
    }
}
