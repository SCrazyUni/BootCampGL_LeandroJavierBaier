package com.example.libros.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="api-gateway-zuul")
@RibbonClient(name="generos-service")
public interface GeneroServiceProxy {

	@GetMapping(path = "generos-service/v1/generos/{id}")
	Object retrieveGeneroById(@PathVariable(name = "id") Integer id);
}
