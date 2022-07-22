package com.Bank_Account_Management_Java.dao;


import com.Bank_Account_Management_Java.entity.BankAcc1;

public class BankDao {
	public EntityManager getEM() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bank_pu");
    	EntityManager em = emf.createEntityManager();
    	return em;
	}
	
	public boolean addAccountRecord(BankAcc1 b)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		return true;
	}
	
	public BankAcc1 getAccountRecord(int AccNo)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		BankAcc1 b = em.find(BankAcc1.class, AccNo);
		em.getTransaction().commit();
		return b;
	}
	
	public BankAcc1 viewAccountRecord(int AccNo)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		BankAcc1 b = em.find(BankAcc1.class, AccNo);
		em.getTransaction().commit();
		return b;
	}
	public boolean updateAccountRecord(BankAcc1 b)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		BankAcc1 b1 = em.find(BankAcc1.class,b.getAccNo());
		b1.setName(b.getName());
		b1.setAccType(b.getAccType());
		b1.setBalance(b.getBalance());
		em.getTransaction().commit();
		return true;
	}
	
	public boolean withdraw(BankAcc1 b)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		BankAcc1 b1 = em.find(BankAcc1.class,b.getAccNo());
		b1.setBalance(b.getBalance());
		Balance=Balance-amount;
		em.getTransaction().commit();
		return true;
	}
	
	public boolean deposite(BankAcc1 b)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		BankAcc1 b1 = em.find(BankAcc1.class,b.getAccNo());
		b1.setBalance(b.getBalance());
		Balance=Balance+amount;
		em.getTransaction().commit();
		return true;
	}
	public boolean deleteAccountRecord(int AccNo)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		BankAcc1 b = em.find(BankAcc1.class, AccNo);
		em.remove(b);
		em.getTransaction().commit();
		return true;
	}
}
