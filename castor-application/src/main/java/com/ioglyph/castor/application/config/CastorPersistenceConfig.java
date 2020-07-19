package com.ioglyph.castor.application.config;

import javax.persistence.EntityManager;

import com.ioglyph.castor.persistence.infrastructure.PodcastReadProvider;
import com.ioglyph.castor.persistence.infrastructure.PodcastReadProviderJpa;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.ioglyph.castor.persistence")
//@EnableJpaRepositories(basePackages = "com.ioglyph.castor.persistence.infrastructure")
public class CastorPersistenceConfig {

    @Bean
    public PodcastReadProvider podcastReadProvider(EntityManager em){
        return new PodcastReadProviderJpa(em);
    }
}
