package com.faithful.demo;

//This class retrieves the file from the disk returns it to the Service Class
public class Repo {
	public String file;
	
	public Repo(String file) {
		this.file = file;
	}
	
	public String fileName() {
		return file;
	}

}
