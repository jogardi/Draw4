package com.joseph.draw4.client.view.root;

import com.google.gwt.user.client.ui.IsWidget;

public interface StartView extends IsWidget {
	public interface  StartPresenter {}
	
	/**
	 * @param page displays this
	 */
	void setPage(IsWidget page);
}
