package com.tasnime.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasnime.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
