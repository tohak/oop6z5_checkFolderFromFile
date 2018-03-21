package oop6z5;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String path = "a";
		Thread thOne = new Thread(new CheckThread(path));

		thOne.start();
		try {
			thOne.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Finish 5 min, check close");
	}

}
