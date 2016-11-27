package com.joseph.draw4.pen_client;

import com.google.gwt.core.client.js.JsType;
import com.joseph.draw4.shared.createjs.Stage;

@JsType
public interface PenView {
	void setStage(final Stage stage);
	void activate();
	Stage getStage();
}