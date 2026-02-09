package com.nt.exception;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

class DataBaseResourse implements Closeable{ // from jdk 1.7 Closeable

	@Override
	public void close() throws IOException {
		System.out.println("DataBaseResourse.close()");
	}
}

class FileResourse implements AutoCloseable{ // from jdk9 AutoCloseable

	@Override
	public void close() throws IOException {
		System.out.println("FileResourse.close()");
	}
	
}
public class TryWithResourseDemo05 {

	public static void main(String[] args) throws IOException{
		DataBaseResourse db = new DataBaseResourse();
		FileResourse fr = new FileResourse();
		try(db;fr){
			System.out.println("try block");
			int res = 10/0;
		}catch (ArithmeticException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("main method end");
	}

}
