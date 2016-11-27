package com.joseph.draw4.client.presenter;

import com.google.gwt.user.client.ui.IsWidget;
import com.joseph.draw4.client.ZBus;
import com.joseph.draw4.client.view.root.StartDisplay;
import com.joseph.draw4.client.view.root.StartView;
import com.joseph.draw4.client.view.root.StartView.StartPresenter;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * @author Joseph
 * this is the start presenter. The start presenters view is displayed as soon as the app starts.
 */
@Presenter(view = StartDisplay.class)
public class StartPresenterImpl extends BasePresenter<StartView, ZBus> implements StartPresenter {
	
	/**
	 * responds to init event
	 * @see com.joseph.draw4.client.ZBus#init()
	 * @see <a href="http://www.gwtproject.org/doc/latest/DevGuideCodingBasicsHistory.html">history handling</a>
	 */
	public void onInit() {
		eventBus.goEditor();
	}
	
	/**
	 * this is a single page app so I a page in this context is a page within the single page
	 * This responds to the setPage event
	 * @see com.joseph.draw4.client.ZBus#setPage(IsWidget)
	 * @param page displays this
	 */
	public void onSetPage(IsWidget page) {
		view.setPage(page);
	}
}