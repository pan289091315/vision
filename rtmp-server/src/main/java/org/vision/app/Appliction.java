package org.vision.app;

import org.red5.server.adapter.ApplicationAdapter;
import org.red5.server.api.IConnection;

public class Appliction extends ApplicationAdapter {
	
	@Override
	public boolean appConnect(IConnection conn, Object[] args) {
		return super.appConnect(conn, args);
	}
	
	public String change(String str){
		System.out.println("客户端调用服务器");
		return str.toUpperCase();
	}

	public String login(String name){
		return "Red5 say:Hello," + name;
	}
}
