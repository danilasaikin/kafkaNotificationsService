package notificationsService.controller;

import lombok.RequiredArgsConstructor;
import notificationsService.model.Order;
import notificationsService.servise.NotificationsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notifications")
@RequiredArgsConstructor
public class NotificationsController {

    private final NotificationsService notificationsService;

    @PostMapping
    public ResponseEntity<String> notifyCustomer(@RequestBody Order order) {
        notificationsService.notifyCustomer(order);
        return ResponseEntity.ok("Customer notified successfully");
    }
}
