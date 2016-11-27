package com.joseph.draw4.client.view.register_plugin;

import com.google.gwt.core.client.js.JsType;
import com.google.gwt.user.client.ui.IsWidget;
import com.joseph.draw4.client.view.register_plugin.RegisterPluginView.RegisterPluginPresenter;
import com.mvp4g.client.view.ReverseViewInterface;

/**
 * @author Joseph
 */
public interface RegisterPluginView extends IsWidget, ReverseViewInterface<RegisterPluginPresenter>{
	
	/**
	 * @author Joseph
	 */
	@JsType
	public interface RegisterPluginPresenter {
		/**
		 * call this when done
		 */
		public void done();
	}
}