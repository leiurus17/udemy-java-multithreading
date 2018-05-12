package com.kamotelabs.thread7;

class Processor implements Runnable {
	
	private int id;
	
	public Processor(int id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println("Starting: " + id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed: "+ id);
	}
}

public class App {

	public static void main(String[] args) {
		
	}
}
