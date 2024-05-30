package notificationsService.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import notificationsService.model.Order;
import notificationsService.servise.NotificationsService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class NotificationsListener {

    private final NotificationsService notificationsService;

    @KafkaListener(topics = "${app.kafka.sentOrdersTopic}", groupId = "${app.kafka.groupId}", containerFactory = "kafkaListenerContainerFactory")
    public void listen(Order order) {
        log.info("Received shipped order: {}", order);
        notificationsService.notifyCustomer(order);
    }
}