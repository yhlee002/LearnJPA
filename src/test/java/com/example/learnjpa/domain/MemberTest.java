package com.example.learnjpa.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

class MemberTest {

  static EntityManagerFactory factory;

  @BeforeAll
  @DisplayName("init")
  static void initEntityManagerFactory() {
    factory = Persistence.createEntityManagerFactory("default");
  }

  @Test
  @DisplayName("save member")
  void saveMember() {
    EntityManager em = factory.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    try {
      tx.begin();
      executeLogic(em);
      tx.commit();
    } catch (Exception e) {
      e.printStackTrace();
      tx.rollback();
    } finally {
      em.close();
    }
  }

  private static void executeLogic(EntityManager em) {
    Member member = new Member();
//    member.setId(0L); // @GeneratedValue값이 존재하기 때문에 값을 부여하면 Exception 발생
    member.setName("yhlee");
    member.setAge(28);
    em.persist(member);

//    em.remove(member);
  }
}