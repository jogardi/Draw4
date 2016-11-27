package com.joseph.draw4.client.presenter;

import com.google.api.gwt.oauth2.client.Auth;
import com.google.api.gwt.oauth2.client.AuthRequest;
import com.google.api.gwt.oauth2.client.Callback;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.joseph.draw4.client.ZBus;
import com.joseph.draw4.client.view.home.HomeDisplay;
import com.joseph.draw4.client.view.home.HomeView;
import com.joseph.draw4.client.view.home.HomeView.HomePresenter;
import com.joseph.draw4.shared.UserService;
import com.joseph.draw4.shared.UserServiceAsync;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = HomeDisplay.class)
public class HomePresenterImpl extends BasePresenter<HomeView, ZBus> implements HomePresenter {

	public void onGoHome() {
		eventBus.setPage(view);
	}
	
	UserServiceAsync service = (UserServiceAsync) GWT.create(UserService.class);
	

	public void signIn() {
		String AUTH_URL = "https://accounts.google.com/o/oauth2/auth";	//auth provider in this case google
		String CLIENT_ID = "251699083945-kpbijghgmkkjch75njr5krfugols2eqr.apps.googleusercontent.com";	//my ID for google
		String READONLY_SCOPE = "https://www.googleapis.com/auth/userinfo.email";
		
		AuthRequest req = new AuthRequest(AUTH_URL, CLIENT_ID).withScopes(READONLY_SCOPE);
		
		Auth.get().login(req, new Callback<String, Throwable>() {
			  @Override
			  public void onSuccess(String token) {
				  service.login(token, new AsyncCallback<Void>() {
					@Override
					public void onSuccess(Void result) {
						Window.alert("worked");
					}
					
					@Override
					public void onFailure(Throwable caught) {}
				});
			    /*RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, 
			    		URL.encode("https://www.googleapis.com/oauth2/v1/userinfo?alt=json&access_token=" + token));
			    try {
					builder.setCallback(new RequestCallback() {
						
						@Override
						public void onResponseReceived(Request request, Response response) {
							Window.alert(response.getText());
						}
						
						@Override
						public void onError(Request request, Throwable exception) {
							// TODO Auto-generated method stub
							
						}
					});
			    	builder.send();
				} catch (RequestException e) {
					e.printStackTrace();
				}*/
			  }
			  
			  @Override
			  public void onFailure(Throwable caught) {}
		});
	}
}
