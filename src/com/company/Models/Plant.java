package com.company.Models;

public class Plant extends Card {
	private int sunsProduction;

	private int turn;
	private int shotPerTurn;
	private int speedReduction;
	private int times;
	private boolean isMelee;
	private boolean isScarely;
	private boolean hasForwardShooting;
	private boolean hasBackwardShooting;
	private boolean isActive;
	private boolean idSeaweed;
	private boolean isCat;
	public int getShotPerTurn() {
		return shotPerTurn;
	}

	public int getSpeedReduction() {
		return speedReduction;
	}

	public int getSunsProduction() {
		return sunsProduction;
	}

	public int getTimes() {
		return times;
	}

	public int getTurn() {
		return turn;
	}

	public boolean isActive() {
		return isActive;
	}

	public boolean isCat() {
		return isCat;
	}

	public boolean isHasBackwardShooting() {
		return hasBackwardShooting;
	}

	public boolean isHasForwardShooting() {
		return hasForwardShooting;
	}

	public boolean isIdSeaweed() {
		return idSeaweed;
	}

	public boolean isMelee() {
		return isMelee;
	}

	public boolean isScarely() {
		return isScarely;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	public void setCat(boolean cat) {
		isCat = cat;
	}

	public void setHasBackwardShooting(boolean hasBackwardShooting) {
		this.hasBackwardShooting = hasBackwardShooting;
	}

	public void setHasForwardShooting(boolean hasForwardShooting) {
		this.hasForwardShooting = hasForwardShooting;
	}

	public void setIdSeaweed(boolean idSeaweed) {
		this.idSeaweed = idSeaweed;
	}

	public void setMelee(boolean melee) {
		isMelee = melee;
	}

	public void setScarely(boolean scarely) {
		isScarely = scarely;
	}

	public void setShotPerTurn(int shotPerTurn) {
		this.shotPerTurn = shotPerTurn;
	}

	public void setSpeedReduction(int speedReduction) {
		this.speedReduction = speedReduction;
	}

	public void setSunsProduction(int suns) {
		this.sunsProduction = sunsProduction;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

}
