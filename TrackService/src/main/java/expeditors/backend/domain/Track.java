package expeditors.backend.domain;

import java.sql.Time;
import java.time.LocalDate;

public class Track {
    private int id;
    private String title;
    private String album;
    private LocalDate issueDate;
    private Time duration;
    private MediaType mediaType;

    private Artist artist;

    public Track(int id, String title, String album, LocalDate issueDate, Time duration, MediaType mediaType, Artist artist){
        this.id = id;
        this.title = title;
        this.album = album;
        this.issueDate = issueDate;
        this.duration = duration;
        this.mediaType = mediaType;
        this.artist = artist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
