package com.company.Models;

public class Profile {
	private Player player;


	public void changePassword(String userName,String password) {
		if ( checkUser(userName,password) ) {
		player.setPassword(password);
		} 
	}

	public void changeUsername(String password,String userName){
		if ( checkUser(userName,password) ) {
		player.setUserName(userName);
		}
	}

	public boolean checkUser(String userName,String password) {
		if ( player.getUserName().equals(userName) & player.getPassword().equals(password) ) {
			return true;
		} else {
			return false;
		}
		
	}

	public void rename(String userName){
		player.setUserName(userName);
	}

	public String show(){
		player.getUserName();
		return player.getUserName();
	}
	
	public void delete(String userName,String password) {
		if(checkUser(userName,password)) {
			player = null;
		}
	}

	//public void help(){}

	//public void exit(){}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
