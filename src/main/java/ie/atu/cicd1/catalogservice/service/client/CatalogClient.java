package ie.atu.cicd1.catalogservice.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service", url = "http//localhost:8081")
public interface CatalogClient {
    String getProductbyId(@PathVariable("id") Long id);

}
