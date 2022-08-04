package com.thread;
//@author Owashim Chowdhury

public class ThreadRunnable implements Runnable{//implements runnable interface
	
		public void run() {//run method
			System.out.println("iam a thread");
		}

		public static void main(String[] args) {
			ThreadTest t=new ThreadTest();//creating object
			t.start();//call
		}

	}

