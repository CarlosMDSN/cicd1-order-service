package ie.atu.cicd1.catalogservice.controller;

import ie.atu.cicd1.catalogservice.model.PurchaseOrder;
import ie.atu.cicd1.catalogservice.service.PurchaseOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class PurchaseOrderController {
    private final PurchaseOrderService service;
    private final PurchaseOrderService purchaseOrderService;

    public PurchaseOrderController(PurchaseOrderService service, PurchaseOrderService purchaseOrderService) {
        this.service = service;
        this.purchaseOrderService = purchaseOrderService;
    }

    @GetMapping
    public List<PurchaseOrder> getALL(){
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseOrder create(@RequestBody PurchaseOrder order){
        return service.create(order);
    }

    @GetMapping("/test-catalog/{productId}")
    public String testCatalogConnection(@PathVariable Long productId)
    {
        return purchaseOrderService.testCatalogConnection(productId);
    }
}
