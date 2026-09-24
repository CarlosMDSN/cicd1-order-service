package ie.atu.cicd1.catalogservice.service;

import ie.atu.cicd1.catalogservice.model.PurchaseOrder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class PurchaseOrderService {
    private final List<PurchaseOrder> orders = new ArrayList<>();
    private long nextId = 1;

    public List<PurchaseOrder> getALL() {
        return orders;
    }
    public PurchaseOrder create(PurchaseOrder order) {
        order.setId(nextId++);
        orders.add(order);
        return order;
    }
}
