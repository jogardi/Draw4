package com.joseph.draw4.client.view.register_plugin;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.media.client.Audio;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RegisterPluginDisplay extends Composite implements RegisterPluginView {

	
	public native void setPresenter(RegisterPluginPresenter presenter) /*-{
		if(typeof $wnd.setPresenter == 'function') $wnd.setPresenter(presenter);
		else this.@com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay::setPresenterUndef()();
	}-*/;
	
	public void setPresenterUndef() {
		Log.error("you didn't create the setPresenter function; It should look like this: function setPresenter(presenter) {}");
		Audio audio = Audio.createIfSupported();
		audio.setSrc("resources/error.mp3");
		audio.play();
	}
	
	
	/*-----------*************	CODE THAT JS DEVS DON'T HAVE TO WORRY ABOUT		*****-------*/
	RegisterPluginDisplay() {
		initWidget(uiBinder.createAndBindUi(this));
		 /* uploadContainer.add(uploader);
		uploader.add(new HTML("<br/>"));
		TextBox name = new TextBox();
		name.setName("name");
		name.setPlaceholder("name");
		uploader.add(name);
		TextArea description = new TextArea();
		description.setName("description");
		description.setPlaceholder("description");
		uploader.add(new HTML("<br/>"));
		uploader.add(description);
		
		 final FormPanel panel = new FormPanel();  
		 uploadContainer.add(panel);
		 panel.add(new TextBox());
		 Button btn = new Button("d");
		 panel.add(btn);*/
		Log.info("display for register plugin was instantiated");
	}
	private static RegisterPluginDisplayUiBinder uiBinder = GWT.create(RegisterPluginDisplayUiBinder.class);
	interface RegisterPluginDisplayUiBinder extends UiBinder<Widget, RegisterPluginDisplay> {}
	private RegisterPluginPresenter presenter;
	@Override
	public native RegisterPluginPresenter getPresenter() /*-{
		return presenter;
	}-*/;
}
