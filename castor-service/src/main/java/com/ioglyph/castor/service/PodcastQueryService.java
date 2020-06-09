package com.ioglyph.castor.service;

import com.ioglyph.castor.common.Page;
import com.ioglyph.castor.common.data.PodcastListData;
import com.ioglyph.castor.persistence.infrastructure.PodcastReadProvider;

import java.util.ArrayList;

public class PodcastQueryService {

    PodcastReadProvider reader;

    public PodcastListData findArticles(Page page){
        long count = reader.countAll();
        return new PodcastListData(new ArrayList<>(), count);
    }

    public PodcastQueryService(PodcastReadProvider reader){
        this.reader = reader;
    }
}
