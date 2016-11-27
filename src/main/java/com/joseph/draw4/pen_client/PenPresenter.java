package com.joseph.draw4.pen_client;

import com.joseph.draw4.shared.Manager;
import com.joseph.draw4.shared.Manager.Plugin;
import com.joseph.draw4.shared.ManagerUtils;

public class PenPresenter implements Plugin {
	private Manager manager = ManagerUtils.getManager();
	private PenView view = new PenDisplay(manager.getStage());

	public PenPresenter() {
		manager.addPlugin(this);
	}

	@Override
	public void activate() {
		view.activate();
	}
}