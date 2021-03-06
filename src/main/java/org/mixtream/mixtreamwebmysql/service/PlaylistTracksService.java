package org.mixtream.mixtreamwebmysql.service;

import org.mixtream.mixtreamwebmysql.model.PlaylistTracks;
import org.mixtream.mixtreamwebmysql.repository.PlaylistTracksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 11/04/2021
*/
@Component
public class PlaylistTracksService {

	private PlaylistTracksRepository playlistTracksRepository;

	@Autowired
	public PlaylistTracksService(PlaylistTracksRepository playlistTracksRepository) {
		this.playlistTracksRepository = playlistTracksRepository;
	}

}
