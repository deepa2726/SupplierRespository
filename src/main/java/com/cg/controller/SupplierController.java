package com.cg.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.entity.Supplier;
import com.cg.service.SupplierService;

@RestController
@RequestMapping("/supplierapi")
  public class SupplierController {
	
		@Autowired
		private SupplierService service;

		@PostMapping("/")
		public String addProduct(@RequestBody Supplier s){
	    return service.addSupplier(s);
		}

	
		@GetMapping("/")
		public List<Supplier> getAll(){
			return service.getSupplierList();
		}
}
