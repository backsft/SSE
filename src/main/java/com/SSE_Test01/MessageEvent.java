package com.SSE_Test01;

public class MessageEvent {
    private Long id;
    private String message;

    public MessageEvent(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
