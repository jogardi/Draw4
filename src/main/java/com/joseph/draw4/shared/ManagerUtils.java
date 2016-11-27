package com.joseph.draw4.shared;

public class ManagerUtils {
	public native static Manager getManager() /*-{
		return $wnd.mng();
	}-*/;

}
