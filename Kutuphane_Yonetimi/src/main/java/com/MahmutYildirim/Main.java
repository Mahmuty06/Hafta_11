package com.MahmutYildirim;

import jakarta.persistence.*;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Kütüphane");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();


        transaction.commit();
    }

}