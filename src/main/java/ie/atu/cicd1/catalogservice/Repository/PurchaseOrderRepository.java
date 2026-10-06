package ie.atu.cicd1.catalogservice.Repository;

import ie.atu.cicd1.catalogservice.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository
        extends JpaRepository<PurchaseOrder, Long> {
}
