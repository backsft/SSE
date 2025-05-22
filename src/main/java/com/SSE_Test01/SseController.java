package com.SSE_Test01;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class SseController {

    private final NotificationService notificationService;

    public SseController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping(value = "/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Notification> streamSse() {
        return notificationService.getNotifications();
    }

    @PostMapping("/send-notification")
    public String sendNotification(@RequestBody Notification notification) {
        notificationService.sendNotification(notification);
        return "Notification sent!";
    }
}
