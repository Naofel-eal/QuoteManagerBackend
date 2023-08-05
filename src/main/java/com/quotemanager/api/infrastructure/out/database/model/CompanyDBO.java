package com.quotemanager.api.infrastructure.out.database.model;

import com.quotemanager.api.core.domain.model.enumeration.CompanyStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String tel;
    private String mail;
    private CompanyStatus status;
    private String SIREN;
    private String SIRET;
    private String RNE;
    private String TVANumber;
    private float capital;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private UserDBO owner;

    @OneToMany(mappedBy="company", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ClientDBO> clients;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<QuoteDBO> quotes;

    public void addClient(ClientDBO client) {
        clients.add(client);
    }

    public void removeClient(ClientDBO client) { clients.remove(client); }
}
