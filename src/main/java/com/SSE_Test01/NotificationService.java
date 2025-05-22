package com.SSE_Test01;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Service
public class NotificationService {

    private final Sinks.Many<Notification> sink;

    public NotificationService() {
        this.sink = Sinks.many().multicast().onBackpressureBuffer();
    }

    public void sendNotification(Notification notification) {
        sink.tryEmitNext(notification);
    }

    public Flux<Notification> getNotifications() {
        return sink.asFlux();
    }
}
