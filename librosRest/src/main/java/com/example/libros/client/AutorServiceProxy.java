package com.example.libros.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-gateway-zuul")
@RibbonClient(name = "autores-service")
public interface AutorServiceProxy {

	@GetMapping(path = "autores-service/v1/autores{id}")
	Object retrieveAutorById(@PathVariable(name = "id") Integer id);
}
