package com.thread;

//@author Owashim Chowdhury

//multithreading using Thread
public class ThreadTest extends Thread{//it extends Thread
	
	public void run() {//run method
		System.out.println("iam a thread");
	}

	public static void main(String[] args) {//main method
		ThreadTest t=new ThreadTest();//creating object
		t.start();//call
	}

}
