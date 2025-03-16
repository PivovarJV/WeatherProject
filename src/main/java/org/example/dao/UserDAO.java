package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import org.example.model.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class UserDAO {

    @PersistenceContext
    private EntityManager entityManager;


    public boolean isUserExist(String login) {
        String jpql = "SELECT COUNT(u) FROM User u WHERE u.login = :login";
        try {
            Long count = entityManager.createQuery(jpql, Long.class)
                    .setParameter("login", login)
                    .getSingleResult();
            return count > 0;
        } catch (NoResultException e) {
            return false;
        }
    }
}
