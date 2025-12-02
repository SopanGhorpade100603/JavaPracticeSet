package com.arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<String> flavours = new ArrayList<>();
		flavours.add("vanila");
		flavours.add("strawbarry");
		flavours.add("butte-Scotch");
		
		String filePath = "D:\\Naresh IT\\JAVA\\Serialization-Deserialization\\flavours.txt";
//		Serialization
		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try(fos;oos){
			oos.writeObject(flavours);
			System.out.println("Data Stored successfully");
		}
		
//		De-serialization
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try(fis;ois){
			@SuppressWarnings("unchecked")
			ArrayList<String> list = (ArrayList<String>) ois.readObject();
			list.forEach(System.out::println);
		}
		
	}
}
