package com.example.progresstest;

import com.example.progresstest.domain.Advance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
@Repository
@RequestMapping()
public interface AdvanceRepository extends JpaRepository<Advance, Integer> {

}
