package org.mixtream.mixtreamwebmysql.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AlbumTracksPK implements Serializable {
    @Column(name = "track_id", nullable = false)
    @Id
    private Integer trackId;
    @Column(name = "album_id", nullable = false)
    @Id
    private Integer albumId;

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
        AlbumTracksPK that = (AlbumTracksPK) o;
        return Objects.equals(trackId, that.trackId) && Objects.equals(albumId, that.albumId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, albumId);
    }
}
