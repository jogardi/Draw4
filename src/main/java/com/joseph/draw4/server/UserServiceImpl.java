package com.joseph.draw4.server;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.joseph.draw4.shared.UserService;
import com.joseph.draw4.shared.domain.User;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UserServiceImpl extends RemoteServiceServlet implements UserService {

	@Override
	public void login(String token) {
		try {
			URL url = new URL("https://www.googleapis.com/oauth2/v1/userinfo?alt=json&access_token=" + token);
			String json;
			json = Unirest.get("https://www.googleapis.com/oauth2/v1/userinfo?alt=json&access_token=" + token).asString().getBody();
			JsonElement root = new JsonParser().parse(json);
			String email = root.getAsJsonObject().get("email").getAsString();
			
			User user = new User(email);
			
			
			System.out.println("login - " + new User(email));
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UnirestException e) {
			e.printStackTrace();
		}
	}

}
