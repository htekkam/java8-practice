package com.java8.features.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		//before java8
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread-1 started");
				
			}
		};

		new Thread(r1).start();
		
		//after java8
		new Thread(()-> System.out.println("Thread-2 java 8 syntax")).start();
	}

}
