package com.ioglyph.castor.persistence.infrastructure;

import com.ioglyph.castor.annotations.Repository;
import com.ioglyph.castor.persistence.PersistentPodcast;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.util.UUID;

public class PodcastReadProviderJpa
        extends SimpleJpaRepository<PersistentPodcast, UUID>
        implements PodcastReadProvider{

    public PodcastReadProviderJpa(EntityManager em){
        super(PersistentPodcast.class, em);
    }

    @Override
    public long countAll(){
        return count();
    }

}
