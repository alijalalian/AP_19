package com.company.Models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Player {
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	private int money;
	private int killedZombies;
	private String userName;
	private String password;
	private ArrayList<Plant> boughtPlants;
	private ArrayList<Zombie> boughtZombies;
	private ArrayList<Plant> plantsHand;
	private ArrayList<Zombie> zombiesHand;

	public int getKilledZombies() {
		return killedZombies;
	}

	public void setKilledZombies(int killedZombies) {
		this.killedZombies = killedZombies;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Plant> getBoughtPlants() {
		return boughtPlants;
	}

	public void setBoughtPlants(ArrayList<Plant> boughtPlants) {
		this.boughtPlants = boughtPlants;
	}

	public ArrayList<Zombie> getBoughtZombies() {
		return boughtZombies;
	}

	public void setBoughtZombies(ArrayList<Zombie> boughtZombies) {
		this.boughtZombies = boughtZombies;
	}

	public ArrayList<Plant> getPlantsHand() {
		return plantsHand;
	}

	public void setPlantsHand(ArrayList<Plant> plantsHand) {
		this.plantsHand = plantsHand;
	}

	public ArrayList<Zombie> getZombiesHand() {
		return zombiesHand;
	}

	public void setZombiesHand(ArrayList<Zombie> zombiesHand) {
		this.zombiesHand = zombiesHand;
	}
}
