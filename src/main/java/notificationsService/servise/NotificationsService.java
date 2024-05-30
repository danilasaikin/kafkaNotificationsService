package notificationsService.servise;

import lombok.extern.slf4j.Slf4j;
import notificationsService.model.Order;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationsService {

    public void notifyCustomer(Order order) {
        log.info("Notifying customer about order: {}", order);
        //  логикa для отправки уведомлений
    }
}
