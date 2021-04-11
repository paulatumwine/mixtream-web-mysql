package org.mixtream.mixtreamwebmysql.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Play {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "play_time", nullable = false)
    private Timestamp playTime;
    @Basic
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Basic
    @Column(name = "track_id", nullable = false)
    private Integer trackId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User userByUserId;
    @ManyToOne
    @JoinColumn(name = "track_id", referencedColumnName = "id", nullable = false)
    private Track trackByTrackId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Timestamp playTime) {
        this.playTime = playTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Play play = (Play) o;
        return Objects.equals(id, play.id) && Objects.equals(playTime, play.playTime) && Objects.equals(userId, play.userId) && Objects.equals(trackId, play.trackId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, playTime, userId, trackId);
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    public Track getTrackByTrackId() {
        return trackByTrackId;
    }

    public void setTrackByTrackId(Track trackByTrackId) {
        this.trackByTrackId = trackByTrackId;
    }
}
