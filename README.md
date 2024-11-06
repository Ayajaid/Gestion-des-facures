# Gestion des Factures et des Paiements

Ce projet est une application web permettant de gérer les factures et les paiements d'une entreprise. Elle offre la possibilité de suivre les factures émises pour chaque client, ainsi que les paiements associés (partiels ou complets) à chaque facture.

## Fonctionnalités

- **Gestion des Factures** : Créer, afficher, modifier et supprimer les factures pour chaque client. Une facture inclut la date, le montant total et le client associé.
- **Gestion des Paiements** : Enregistrer un paiement (partiel ou complet) associé à une facture. Un paiement inclut la date, le montant et la référence à la facture correspondante.
- **Affichage des Factures** : Consulter la liste des factures existantes pour chaque client, avec le montant total et l'état (complète ou incomplète).
- **Affichage des Paiements** : Voir les paiements associés à une facture spécifique, avec la possibilité d'ajouter ou de modifier des paiements.

## Entités

- **Facture** : 
  - `date` : Date de création de la facture
  - `montant` : Montant total de la facture
  - `client` : Nom du client associé

- **Paiement** : 
  - `date` : Date du paiement
  - `montant` : Montant du paiement
  - `facture associée` : Facture liée au paiement

## Pages Web

- **Liste des Factures** : Affiche les factures existantes pour chaque client. L'utilisateur peut consulter le montant restant dû et l'état de la facture (complète ou incomplète).
- **Détail des Paiements** : Affiche les paiements associés à chaque facture. Cette page permet également d'ajouter, de modifier ou de supprimer un paiement pour une facture spécifique.

## Technologies Utilisées

- **Java & Spring Boot** : Framework pour le développement backend.
- **Thymeleaf** : Moteur de template pour la création des pages HTML.
- **Bootstrap** : Framework CSS pour le design et la mise en page.

## Auteur

[Aya Jaid]
