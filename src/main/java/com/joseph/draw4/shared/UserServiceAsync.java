package com.joseph.draw4.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface UserServiceAsync {
	void login(String token, AsyncCallback<Void> callback);
}
