package com.joseph.draw4.client.view.editor;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class EditorDisplay extends Composite implements EditorView {
	public EditorPresenter presenter;
	@UiField
	HTMLPanel root;
	
	@Inject
	public EditorDisplay(final Canvas canvas) {
		initWidget(uiBinder.createAndBindUi(this));
		Log.info(canvas.toString());
		root.add(canvas);
	}
	

	
	//@Override
	public void setPresenter(EditorPresenter presenter) {
		this.presenter = presenter;
	}
	//@Override
	public EditorPresenter getPresenter() {
		return presenter;
	}
	
	private static EditorDisplayUiBinder uiBinder = GWT.create(EditorDisplayUiBinder.class);
	interface EditorDisplayUiBinder extends UiBinder<Widget, EditorDisplay> {}
}
