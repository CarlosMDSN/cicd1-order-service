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

    public PurchaseOrderController(PurchaseOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<PurchaseOrder> getALL(){
        return service.getALL();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseOrder create(@RequestBody PurchaseOrder order){
        return service.create(order);
    }
}
