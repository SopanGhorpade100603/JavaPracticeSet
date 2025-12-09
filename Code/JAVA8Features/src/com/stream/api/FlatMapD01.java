package com.stream.api;

import java.util.Arrays;

//convert multiple Collections into single collection 

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapD01 {

	public static void main(String[] args) {
		List<String> indPlayers = Arrays.asList("rohit", "virat", "shubhaman", "bumrah");
		List<String> engPlayers = Arrays.asList("stoke", "root", "butler", "broot");
		
		List<List<String>> players = Arrays.asList(indPlayers,engPlayers);

		List<String> collect = players.stream().
												flatMap(team->team.stream()).
																		collect(Collectors.toList());
		
		System.out.println(collect);
		}
}
