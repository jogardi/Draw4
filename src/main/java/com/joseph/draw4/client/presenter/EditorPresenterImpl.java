package com.joseph.draw4.client.presenter;

import com.google.inject.Inject;
import com.joseph.draw4.client.PluginManager;
import com.joseph.draw4.client.ZBus;
import com.joseph.draw4.client.view.editor.EditorDisplay;
import com.joseph.draw4.client.view.editor.EditorView;
import com.joseph.draw4.client.view.editor.EditorView.EditorPresenter;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * presents the editor for the note
 * @author Joseph
 */
@Presenter(view = EditorDisplay.class)
public class EditorPresenterImpl extends BasePresenter<EditorView, ZBus> implements EditorPresenter {
	@Inject
	PluginManager manager;
	
	public void onGoEditor() {
		eventBus.setPage(view);
	}
}
