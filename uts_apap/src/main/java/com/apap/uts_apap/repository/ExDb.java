package com.apap.uts_apap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.uts_apap.model.ExModel;

@Repository
public interface ExDb extends JpaRepository<ExModel, Long>{

}
