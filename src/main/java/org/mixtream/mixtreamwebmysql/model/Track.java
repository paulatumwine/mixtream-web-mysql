package org.mixtream.mixtreamwebmysql.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Track {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "title", nullable = false, length = 32)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "path", nullable = true, length = 255)
    private String path;
    @Basic
    @Column(name = "artist_id", nullable = false)
    private Integer artistId;
    @OneToMany(mappedBy = "trackByTrackId")
    private Collection<AlbumTracks> albumTracksById;
    @OneToMany(mappedBy = "trackByTrackId")
    private Collection<Play> playsById;
    @OneToMany(mappedBy = "trackByTrackId")
    private Collection<PlaylistTracks> playlistTracksById;
    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id", nullable = false)
    private Artist artistByArtistId;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(id, track.id) && Objects.equals(title, track.title) && Objects.equals(description, track.description) && Objects.equals(path, track.path) && Objects.equals(artistId, track.artistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, path, artistId);
    }

    public Collection<AlbumTracks> getAlbumTracksById() {
        return albumTracksById;
    }

    public void setAlbumTracksById(Collection<AlbumTracks> albumTracksById) {
        this.albumTracksById = albumTracksById;
    }

    public Collection<Play> getPlaysById() {
        return playsById;
    }

    public void setPlaysById(Collection<Play> playsById) {
        this.playsById = playsById;
    }

    public Collection<PlaylistTracks> getPlaylistTracksById() {
        return playlistTracksById;
    }

    public void setPlaylistTracksById(Collection<PlaylistTracks> playlistTracksById) {
        this.playlistTracksById = playlistTracksById;
    }

    public Artist getArtistByArtistId() {
        return artistByArtistId;
    }

    public void setArtistByArtistId(Artist artistByArtistId) {
        this.artistByArtistId = artistByArtistId;
    }
}
