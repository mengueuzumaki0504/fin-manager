package com.finmanager.dto;

import java.time.LocalDateTime;

/**
 * Objet de transfert de données pour Notification.
 */
public class NotificationDTO {

    private Long id;
    private String message;
    private LocalDateTime createdAt;
    private boolean read;
    private Long userId;

    public NotificationDTO() {
    }

    public NotificationDTO(Long id, String message, LocalDateTime createdAt, boolean read, Long userId) {
        this();
        this.id = id;
        this.message = message;
        this.createdAt = createdAt;
        this.read = read;
        this.userId = userId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "NotificationDTO{" +
                "id=" + id +
                ", message=" + message +
                ", createdAt=" + createdAt +
                ", read=" + read +
                ", userId=" + userId +
                "}";
    }
}
