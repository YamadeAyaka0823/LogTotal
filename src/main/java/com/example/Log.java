package com.example;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Log {
	
     
	public static void main(String[] args) throws IOException {

//		File file = new File("C:/env/springworkspace/LogTotal/src/test/java/com/example/log.txt");
//		FileReader filereader = new FileReader(file);
//		System.out.println(filereader);
		
//		File file = new File("log.txt");
//		String str = file.getAbsolutePath();
//		System.out.println(str);
		
		File file = new File("C:/env/springworkspace/LogTotal/src/test/java/com/example/log.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String date;
		while((date = br.readLine()) != null) {
			System.out.println(date);
		}
		br.close();

	}

}
