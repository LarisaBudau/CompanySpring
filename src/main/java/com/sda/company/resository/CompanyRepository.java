package com.sda.company.resository;

import com.sda.company.model.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<CompanyEntity, Integer> {
}
