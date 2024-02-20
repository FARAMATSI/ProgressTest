//package com.example.progresstest;
//
//import com.example.progresstest.domain.Advance;
//import com.example.progresstest.domain.FrHist;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author Terrance Nyamfukudza
// * 27/11/2023
// */
//@RestController
//@RequestMapping()
//public class CustomerController {
//    private final CustomerRepository customerRepository;
//
//    public CustomerController(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//    @GetMapping("/test-customers")
//    public ResponseEntity<Page<Advance>> getAll(@PageableDefault Pageable pageable){
//       return  ResponseEntity.ok(customerRepository.findAll(Pageable.unpaged()));
//
//    }
//}
