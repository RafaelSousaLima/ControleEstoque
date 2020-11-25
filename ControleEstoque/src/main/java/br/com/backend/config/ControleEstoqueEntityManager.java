package br.com.backend.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ControleEstoqueEntityManager {

    @PersistenceContext
    private EntityManager entityManager;

}
