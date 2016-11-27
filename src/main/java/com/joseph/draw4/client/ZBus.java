package com.joseph.draw4.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.joseph.draw4.client.presenter.EditorPresenterImpl;
import com.joseph.draw4.client.presenter.HomePresenterImpl;
import com.joseph.draw4.client.presenter.StartPresenterImpl;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.InitHistory;
import com.mvp4g.client.event.EventBusWithLookup;

/**
 * @author Joseph
 */
@Events(startPresenter = StartPresenterImpl.class, historyOnStart = true, ginModules = ZGinModule.class)
public interface ZBus extends EventBusWithLookup {
	
	/**
	 * @param page this will be displayed
	 */
	@Event(handlers = StartPresenterImpl.class)
	void setPage(IsWidget page);
	
	@Event(handlers = HomePresenterImpl.class, historyConverter = ZHistoryConverter.class)
	void goHome();
	
	@Event(handlers = EditorPresenterImpl.class, historyConverter = ZHistoryConverter.class)
	void goEditor();
	
	/**
	 * this event is triggered when the history handler fails. This usually happens when the hash is empty or incorrect.
	 * Whoever responds to this event would usually take the app to some default place.
	 */
    @InitHistory
    @Event(handlers = StartPresenterImpl.class)
    void init();
}