package ma.Controle.gestionFactures.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

@Entity
public class Facture {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date date;

    private Double montant;

    @NotBlank(message = "Client is mandatory")
    private String client;

    @OneToMany(mappedBy = "facture", cascade = CascadeType.ALL)
    private List<Paiement> paiements;

    @Transient
    private double montantPaye;


    private double montantRestant;

    private String etat = "Incomplète";

    public Facture() {
    }

    public @NotBlank(message = "Client is mandatory") String getClient() {

        return client;
    }

    public void setClient(@NotBlank(message = "Client is mandatory") String client) {

        this.client = client;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public Double getMontant() {

        return montant;
    }

    public void setMontant(Double montant) {

        this.montant = montant;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public double getMontantRestant() {
        return montantRestant;
    }

    public void setMontantRestant(double montantRestant) {
        this.montantRestant = montantRestant;
    }

    @PrePersist
    public void prePersist() {

        if (montantRestant == 0.0) {
            montantRestant = montant;
        }
        if (etat == null) {
            etat = "Incomplète";
        }
    }

}