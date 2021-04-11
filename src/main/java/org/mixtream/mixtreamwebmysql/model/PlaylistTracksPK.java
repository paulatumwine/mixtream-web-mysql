package org.mixtream.mixtreamwebmysql.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PlaylistTracksPK implements Serializable {
    @Column(name = "track_id", nullable = false)
    @Id
    private Integer trackId;
    @Column(name = "playlist_id", nullable = false)
    @Id
    private Integer playlistId;

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaylistTracksPK that = (PlaylistTracksPK) o;
        return Objects.equals(trackId, that.trackId) && Objects.equals(playlistId, that.playlistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, playlistId);
    }
}
