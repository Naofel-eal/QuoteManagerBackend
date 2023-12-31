package com.quotemanager.api.infrastructure.out.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String mail;
    private String password;

    @OneToMany(mappedBy = "owner")
    private List<CompanyDBO> companies;

    public void addCompany(CompanyDBO company) {
        companies.add(company);
        company.setOwner(this);
    }
}
