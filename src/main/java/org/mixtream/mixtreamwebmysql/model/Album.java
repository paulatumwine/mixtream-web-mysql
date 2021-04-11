package org.mixtream.mixtreamwebmysql.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Album {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "title", nullable = false, length = 32)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @OneToMany(mappedBy = "albumByAlbumId")
    private Collection<AlbumTracks> albumTracksById;

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
        Album album = (Album) o;
        return Objects.equals(id, album.id) && Objects.equals(title, album.title) && Objects.equals(description, album.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }

    public Collection<AlbumTracks> getAlbumTracksById() {
        return albumTracksById;
    }

    public void setAlbumTracksById(Collection<AlbumTracks> albumTracksById) {
        this.albumTracksById = albumTracksById;
    }
}
