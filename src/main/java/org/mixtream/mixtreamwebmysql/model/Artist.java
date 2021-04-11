package org.mixtream.mixtreamwebmysql.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Artist {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "link", nullable = true, length = 255)
    private String link;
    @OneToMany(mappedBy = "artistByArtistId")
    private Collection<Track> tracksById;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(id, artist.id) && Objects.equals(name, artist.name) && Objects.equals(link, artist.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, link);
    }

    public Collection<Track> getTracksById() {
        return tracksById;
    }

    public void setTracksById(Collection<Track> tracksById) {
        this.tracksById = tracksById;
    }
}
