package az.ingress.controller;

import az.ingress.service.NotificationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//setter injection
@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    private NotificationService notificationService;

    public NotificationService getNotificationService() {
        return notificationService;
    }

}
