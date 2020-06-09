package com.ioglyph.castor.rest;

import com.ioglyph.castor.common.Page;
import com.ioglyph.castor.service.PodcastQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/podcasts")
public class PodcastEndpoint {

    PodcastQueryService podcastQueryService;

    @GetMapping
    public ResponseEntity getPodcasts(@RequestParam(value = "offset", defaultValue = "0") int offset,
            @RequestParam(value = "limit", defaultValue = "20") int limit){

        return ResponseEntity.ok(podcastQueryService.findArticles(new Page(offset, limit)));
    }

    public PodcastEndpoint(PodcastQueryService podcastQueryService){
        this.podcastQueryService = podcastQueryService;
    }
}
