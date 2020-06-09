package com.ioglyph.castor.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "podcast")
public class PersistentPodcast {
    @Id
    private UUID id;

    public PersistentPodcast() { }
}
