package org.mixtream.mixtreamwebmysql.service;

import org.mixtream.mixtreamwebmysql.model.Album;
import org.mixtream.mixtreamwebmysql.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 11/04/2021
*/
@Component
public class AlbumService {

	private AlbumRepository albumRepository;

	@Autowired
	public AlbumService(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
	}

}
