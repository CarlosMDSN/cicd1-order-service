package ie.atu.cicd1.catalogservice.service;

import ie.atu.cicd1.catalogservice.client.CatalogClient;
import ie.atu.cicd1.catalogservice.model.PurchaseOrder;
import ie.atu.cicd1.catalogservice.Repository.PurchaseOrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository repository;
private final CatalogClient catalogClient;

    public PurchaseOrderService(PurchaseOrderRepository repository, CatalogClient catalogClient) {
        this.repository = repository;
        this.catalogClient = catalogClient;
    }

    public List<PurchaseOrder> getAll() {
        return repository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder order) {
        order.setId(null);
        return repository.save(order);
    }

    public String testCatalogConnection(Long productId)
    {

        return catalogClient.getProductbyId(productId);
    }

}

