package com.joseph.draw4.client.view.root;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class StartDisplay extends Composite implements StartView {
	@UiField
	SimplePanel homeContainer;
	
	public StartDisplay() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	
	//@Override
	public void setPage(IsWidget page) {
		homeContainer.setWidget(page);
	}
	
	private static RootDisplayUiBinder uiBinder = GWT.create(RootDisplayUiBinder.class);
	interface RootDisplayUiBinder extends UiBinder<Widget, StartDisplay> {}
}