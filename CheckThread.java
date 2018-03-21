package oop6z5;

import java.io.File;

public class CheckThread implements Runnable {
	private String nameFile;

	public CheckThread(String nameFile) {
		super();
		this.nameFile = nameFile;
	}

	public String getNameFile() {
		return nameFile;
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		long start = System.currentTimeMillis();
		long timeWork = 1000 * 60 * 5;// work 5 min
		File folder = new File(nameFile);
		File[] fileArray = folder.listFiles();
		int startFile = fileArray.length;
		for (; (System.currentTimeMillis() - start) < timeWork;) {
			folder = new File(nameFile);
			fileArray = folder.listFiles();
			if (fileArray.length > startFile) {
				System.out.println("in folder add files");
			}
			if (fileArray.length < startFile) {
				System.out.println("in folder deleate files");
			}
			try {
				th.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
