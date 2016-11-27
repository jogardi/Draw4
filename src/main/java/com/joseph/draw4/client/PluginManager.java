package com.joseph.draw4.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.plugins.ajax.Ajax;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.joseph.draw4.shared.Manager;
import com.joseph.draw4.shared.createjs.Stage;

@Singleton
public class PluginManager implements Manager {
	private List<Plugin> plugins = new ArrayList<Plugin>();
	private Stage stage;
	
	@Inject
	private PluginManager(Canvas canvas) {
		jsInit(canvas.getElement());
		Ajax.getScript("Pen/Pen.nocache.js");
	}
	private native void jsInit(Element element) /*-{
		this.@com.joseph.draw4.client.PluginManager::stage = new $wnd.createjs.Stage(element);
		$wnd.createjs.Touch.enable(this.stage);

		var that = this;
		$wnd.mng = function() {
			return that;
		};
	}-*/;

	@Override
	public void addPlugin(Plugin plugin) {
		plugins.add(plugin);
		plugin.activate();
	}

	@Override
	public Stage getStage() {
		return stage;
	}
}