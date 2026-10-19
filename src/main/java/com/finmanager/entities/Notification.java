package com.finmanager.entities;

import java.time.LocalDateTime;

/**
 * Message envoyé à un utilisateur.
 */
public class Notification {

    private Long id;
    private String message;
    private LocalDateTime createdAt;
    private boolean read;
    private User user;

    public Notification() {
    }

    public Notification(Long id, String message, LocalDateTime createdAt, boolean read) {
        this();
        this.id = id;
        this.message = message;
        this.createdAt = createdAt;
        this.read = read;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", message=" + message +
                ", createdAt=" + createdAt +
                ", read=" + read +
                "}";
    }
}
