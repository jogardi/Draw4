package com.joseph.draw4.shared;

import com.google.gwt.core.client.js.JsType;
import com.joseph.draw4.shared.createjs.Stage;

@JsType
public interface Manager {
	public void addPlugin(final Plugin obj);
	public Stage getStage();
	
	@JsType
	public interface Plugin {
		public void activate();
	}
}