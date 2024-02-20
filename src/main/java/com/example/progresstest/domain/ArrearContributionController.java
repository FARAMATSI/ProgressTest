package com.example.progresstest.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrearContributionController {
   private final ArrearContributionRepository arrearsContributionRepository;

    public ArrearContributionController(ArrearContributionRepository arrearsContributionRepository) {
        this.arrearsContributionRepository = arrearsContributionRepository;
    }

    @GetMapping("/arrear-contribution")
    public ResponseEntity<Page<ArrearsContributionApplication>> getAll(@PageableDefault Pageable pageable){
        return  ResponseEntity.ok(arrearsContributionRepository.findAll(Pageable.unpaged()));

    }
}
