package com.company.Models;

import java.util.ArrayList;

public class Shop {

	private ArrayList<Plant> listOfPlants;
	private ArrayList<Zombie> listOfZombies;
	private Player player;

	public void buy(Card card) {
		// check if this card is exist
		// check if player has enough money
		if ( player.getMoney() > card.getPrice() ) {
			// check the type of card
			if ( card instanceof Zombie ) {
				// cast card to zombie
				Zombie zombie =(Zombie) card;
				// check if player has this zombie already
				if (player.getBoughtZombies().contains(zombie) ) {
					throw new RepeatedCardException("you have this card already!");
				} else {
					//add zombie to player's zombies
					player.getBoughtZombies().add(zombie);
				}
				// check if type of card is plant:
			} else  if ( card instanceof Plant ) {
				//cast card to plant
				Plant plant =(Plant) card;
				// check if player has this plant already
				if (player.getBoughtPlants().contains(plant) ) {
					throw new RepeatedCardException("you have this card already!");
				} else {
					//add plant to player's plants
					player.getBoughtPlants().add(plant);
				}
			}
		} else {
			// if player hasn't enough money
			throw new NotEnoughMoneyException("you have not enough mony, I'm sorry.");
		}
		
	}
	public ArrayList<Plant> getListOfPlants() {
		return listOfPlants;
	}

	public void setListOfPlants(ArrayList<Plant> listOfPlants) {
		this.listOfPlants = listOfPlants;
	}

	public ArrayList<Zombie> getListOfZombies() {
		return listOfZombies;
	}

	public void setListOfZombies(ArrayList<Zombie> listOfZombies) {
		this.listOfZombies = listOfZombies;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}