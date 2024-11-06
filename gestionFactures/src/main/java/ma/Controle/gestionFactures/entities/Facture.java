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


    private double montantRestant;

    private String etat ;

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

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }



    public double getMontantRestant() {
        if (paiements == null) {
            return montant;
        }
        double totalPaiements = paiements.stream().mapToDouble(Paiement::getMontant).sum();
        return montant - totalPaiements;
    }

    public void setMontantRestant(double montantRestant) {
        this.montantRestant = montantRestant;
    }
    public String getEtat() {
        double montantRestant = getMontantRestant();
        if (montantRestant == 0) {
            return "Complète";
        } else {
            return "Incomplète";
        }
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }





}