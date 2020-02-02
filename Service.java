package com.faithful.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//This class modifies retrieved from the Repo class
public class Service {
	Repo r;
	public Service(Repo r) {
		this.r = r;
	}
	public void editFile() {
		String text = r.fileName();
		File o = new File(text);
		
		Scanner reader;
		try {
			reader = new Scanner(o);
			while (reader.hasNext()) {
				System.out.println(reader.next());
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
		
	}

}
