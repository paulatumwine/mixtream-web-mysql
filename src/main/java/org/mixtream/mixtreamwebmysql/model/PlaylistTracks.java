package org.mixtream.mixtreamwebmysql.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "playlist_tracks", schema = "mixtream", catalog = "")
@IdClass(PlaylistTracksPK.class)
public class PlaylistTracks {
    private Long id;
    @Id
    @Column(name = "track_id", nullable = false)
    private Integer trackId;
    @Id
    @Column(name = "playlist_id", nullable = false)
    private Integer playlistId;
    @ManyToOne
    @JoinColumn(name = "track_id", referencedColumnName = "id", nullable = false)
    private Track trackByTrackId;
    @ManyToOne
    @JoinColumn(name = "playlist_id", referencedColumnName = "id", nullable = false)
    private Playlist playlistByPlaylistId;

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
        PlaylistTracks that = (PlaylistTracks) o;
        return Objects.equals(trackId, that.trackId) && Objects.equals(playlistId, that.playlistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, playlistId);
    }

    public Track getTrackByTrackId() {
        return trackByTrackId;
    }

    public void setTrackByTrackId(Track trackByTrackId) {
        this.trackByTrackId = trackByTrackId;
    }

    public Playlist getPlaylistByPlaylistId() {
        return playlistByPlaylistId;
    }

    public void setPlaylistByPlaylistId(Playlist playlistByPlaylistId) {
        this.playlistByPlaylistId = playlistByPlaylistId;
    }
}
