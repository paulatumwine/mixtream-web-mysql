package org.mixtream.mixtreamwebmysql.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "album_tracks", schema = "mixtream", catalog = "")
@IdClass(AlbumTracksPK.class)
public class AlbumTracks {
    private Long id;
    @Id
    @Column(name = "track_id", nullable = false)
    private Integer trackId;
    @Id
    @Column(name = "album_id", nullable = false)
    private Integer albumId;
    @ManyToOne
    @JoinColumn(name = "track_id", referencedColumnName = "id", nullable = false)
    private Track trackByTrackId;
    @ManyToOne
    @JoinColumn(name = "album_id", referencedColumnName = "id", nullable = false)
    private Album albumByAlbumId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumTracks that = (AlbumTracks) o;
        return Objects.equals(trackId, that.trackId) && Objects.equals(albumId, that.albumId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, albumId);
    }

    public Track getTrackByTrackId() {
        return trackByTrackId;
    }

    public void setTrackByTrackId(Track trackByTrackId) {
        this.trackByTrackId = trackByTrackId;
    }

    public Album getAlbumByAlbumId() {
        return albumByAlbumId;
    }

    public void setAlbumByAlbumId(Album albumByAlbumId) {
        this.albumByAlbumId = albumByAlbumId;
    }
}
