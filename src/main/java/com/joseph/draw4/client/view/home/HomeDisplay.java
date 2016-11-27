package com.joseph.draw4.client.view.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class HomeDisplay extends Composite implements HomeView {

	public native void setPresenterJs(HomePresenter presenter) /*-{}-*/;
	
	
	
	
	
	
	/*-----------*************	CODE THAT JS DEVS DON'T HAVE TO WORRY ABOUT		*****-------*/
	@UiField
	HTMLPanel root;
	public HomeDisplay() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	private static DisplayUiBinder uiBinder = GWT.create(DisplayUiBinder.class);
	interface DisplayUiBinder extends UiBinder<Widget, HomeDisplay> {}
	private HomePresenter presenter;
	//@Override
	public void setPresenter(HomePresenter presenter) {
		this.presenter = presenter;
		setPresenterJs(presenter);
	}
	//@Override
	public HomePresenter getPresenter() {
		return presenter;
	}
}