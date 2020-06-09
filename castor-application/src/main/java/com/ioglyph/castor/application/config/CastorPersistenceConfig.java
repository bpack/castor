package com.ioglyph.castor.application.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ioglyph.castor.persistence.infrastructure.PodcastReadProvider;
import com.ioglyph.castor.persistence.infrastructure.PodcastReadProviderJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.ioglyph.castor.persistence")
//@EnableJpaRepositories(basePackages = "com.ioglyph.castor.persistence.infrastructure")
public class CastorPersistenceConfig {

    @Bean
    public PodcastReadProvider podcastReadProvider(EntityManager em){
        return new PodcastReadProviderJpa(em);
    }
}
