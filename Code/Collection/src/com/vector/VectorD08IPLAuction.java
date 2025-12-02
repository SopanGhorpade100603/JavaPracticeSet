package com.vector;

import java.util.Iterator;
import java.util.Vector;

record Player(Integer id, String price, Double basePrice) {

}

class IPLAuction{
	private String iplTeam;
	private Vector<Player> listofPlayers;
	
	public IPLAuction(String iplTeam) {
		super();
		this.iplTeam = iplTeam;
		listofPlayers = new Vector<Player>(); //composition
	}
	
	public void addPlayer(Player player) {
		listofPlayers.add(player);
	}
	
	public void displayAllPlayers() {
		System.out.println("All the players of "+iplTeam);
		listofPlayers.forEach(System.out::println);
	}
	
	public void retainOrRemove() {
		Iterator<Player> itr = listofPlayers.iterator();
		while(itr.hasNext()) {
			Player player = itr.next();
			if(player.basePrice() >100000) {
				itr.remove();
			}
		}
	}
	
}

public class VectorD08IPLAuction {

	public static void main(String[] args) {
		IPLAuction ipl = new IPLAuction("MI");
		ipl.addPlayer(new Player(111, "Rohit", 90000D));
		ipl.addPlayer(new Player(222, "pandya", 190000D));
		ipl.addPlayer(new Player(333, "Bumrah", 80000D));
		ipl.addPlayer(new Player(444, "Naman", 70000D));
		ipl.addPlayer(new Player(555, "Sk", 150000D));

		ipl.retainOrRemove();
		ipl.displayAllPlayers();
	}

}
