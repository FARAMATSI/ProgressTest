//package com.example.progresstest;
//
//import com.example.progresstest.domain.Refunds;
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
// * 28/11/2023
// */
//@RestController
//@RequestMapping()
//public class RefundController {
//    private final RefundRepository refundRepository;
//
//    public RefundController(RefundRepository refundRepository) {
//        this.refundRepository = refundRepository;
//    }
//
//    @GetMapping("/refunds")
//    public ResponseEntity<Page<Refunds>> getAll(@PageableDefault Pageable pageable){
//        return  ResponseEntity.ok(refundRepository.findAll(Pageable.unpaged()));
//
//    }
//}
