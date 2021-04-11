package org.mixtream.mixtreamwebmysql.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Playlist {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "title", nullable = false, length = 32)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @OneToMany(mappedBy = "playlistByPlaylistId")
    private Collection<PlaylistTracks> playlistTracksById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(id, playlist.id) && Objects.equals(title, playlist.title) && Objects.equals(description, playlist.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }

    public Collection<PlaylistTracks> getPlaylistTracksById() {
        return playlistTracksById;
    }

    public void setPlaylistTracksById(Collection<PlaylistTracks> playlistTracksById) {
        this.playlistTracksById = playlistTracksById;
    }
}
