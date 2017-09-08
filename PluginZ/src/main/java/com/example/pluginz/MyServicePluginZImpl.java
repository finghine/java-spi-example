package com.example.pluginz;

import com.example.apix.MyService;

public class MyServicePluginZImpl implements MyService{

	@Override
	public int add(int a, int b) {
		System.out.println("call MyServicePluginZImpl add -- pluginZ");
		return a+b;
	}
}
