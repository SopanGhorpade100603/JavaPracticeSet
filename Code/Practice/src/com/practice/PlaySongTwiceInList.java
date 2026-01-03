package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PlaySongTwiceInList {
	public static void main(String[] args) {
		List<Integer> list = List.of(2,4,7);
		List<Integer> twice = playSongTwice(list);
		twice.forEach(ele->System.out.print(ele+" "));
	}

	public static List<Integer> playSongTwice(List<Integer> list) {
		List<Integer> twiceList = new ArrayList<>(list);
		for(Integer l: list ) {
			twiceList.add(l);
		}
		
		return twiceList;
	}

}
