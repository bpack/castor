package com.ioglyph.castor.common.data;

import java.util.List;

public class PodcastListData {

    public final List<PodcastData> podcasts;
    public final long count;

    public PodcastListData(List<PodcastData> podcasts, long count){
        this.podcasts = podcasts;
        this.count = count;
    }
}
