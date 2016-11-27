package com.joseph.draw4.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provider;
import com.google.inject.Singleton;

public class ZGinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(Canvas.class).toProvider(EditCanvasProvider.class).in(Singleton.class);
	}
	
	public static class EditCanvasProvider implements Provider<Canvas> {
		private Canvas canvas;
		@Override
		public Canvas get() {
			if(canvas == null) {
				canvas = Canvas.createIfSupported();
				canvas.getElement().setAttribute("width", "800px");
				canvas.getElement().setAttribute("height", "600px");
				canvas.getElement().setAttribute("id", "canvas");
				
			}
			
			return canvas;
		}
	}
}