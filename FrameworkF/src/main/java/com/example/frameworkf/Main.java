package com.example.frameworkf;

import java.util.ServiceLoader;

import com.example.apix.MyService;

public class Main {
	public static void main(String[] args) {
		ServiceLoader<MyService> loads = ServiceLoader.load(MyService.class);
		for (MyService myService : loads) {
			int res = myService.add(1, 2);
			System.out.println("res: "+res);
		}
		System.out.println("end");
	}
}
