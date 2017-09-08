package com.example.pluginy;

import com.example.apix.MyService;

public class MyServicePluginYImpl implements MyService{

	@Override
	public int add(int a, int b) {
		System.out.println("call MyServicePluginYImpl add -- pluginY");
		return a+b;
	}
}
