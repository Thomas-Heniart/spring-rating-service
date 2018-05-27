package com.heniart.ratingservice.domain;

public class Rating {
    private Long id;
    private Long bookId;
    private int starts;

    public Rating(Long id, Long bookId, int starts) {
        this.id = id;
        this.bookId = bookId;
        this.starts = starts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", starts=" + starts +
                '}';
    }
}
