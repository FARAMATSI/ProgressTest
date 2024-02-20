package com.example.progresstest;

import com.example.progresstest.domain.Advance;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvanceController {
    private final AdvanceRepository advanceRepository;

    public AdvanceController(AdvanceRepository advanceRepository) {
        this.advanceRepository = advanceRepository;
    }

    @GetMapping("/test-advances")
    public ResponseEntity<Page<Advance>> getAll(@PageableDefault Pageable pageable){
       return  ResponseEntity.ok(advanceRepository.findAll(Pageable.unpaged()));

    }
}
