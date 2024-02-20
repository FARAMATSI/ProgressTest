package com.example.progresstest.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrearContributionRepository extends JpaRepository<ArrearsContributionApplication,String> {

}
