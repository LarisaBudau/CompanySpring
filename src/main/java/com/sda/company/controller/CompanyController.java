package com.sda.company.controller;

import com.sda.company.dto.CompanyCreateDTO;
import com.sda.company.dto.CompanyInfoDTO;
import com.sda.company.service.CompanyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CompanyInfoDTO> createCompany(@RequestBody @Valid CompanyCreateDTO companyCreateDTO){

        CompanyInfoDTO companyInfoDTO = companyService.createCompany(companyCreateDTO);

        return ResponseEntity.ok(companyInfoDTO);
    }

}
