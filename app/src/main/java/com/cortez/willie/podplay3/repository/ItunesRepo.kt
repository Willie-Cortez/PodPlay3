package com.cortez.willie.podplay3.repository

import com.cortez.willie.podplay3.service.ItunesService

class ItunesRepo(private val itunesService: ItunesService) {
    suspend fun searchByTerm(term: String) = itunesService.searchPodcastByTerm(term)
}