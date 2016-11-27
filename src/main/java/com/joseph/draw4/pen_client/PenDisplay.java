package com.joseph.draw4.pen_client;

import com.google.common.base.Preconditions;
import com.joseph.draw4.shared.createjs.Stage;

public class PenDisplay implements PenView {
	private Stage stage;

	public PenDisplay(final Stage stage) {
		this.stage = Preconditions.checkNotNull(stage);
	}

	
	@Override
	public native void activate() /*-{
		var circle = new $wnd.createjs.Shape();
		circle.graphics.beginFill("red").drawCircle(0, 0, 50);
		circle.x = 100;
		circle.y = 100;
		this.getStage().addChild(circle);
		this.getStage().update();
	}-*/;	
	


	@Override
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	@Override
	public Stage getStage() {
		return stage;
	}
}
