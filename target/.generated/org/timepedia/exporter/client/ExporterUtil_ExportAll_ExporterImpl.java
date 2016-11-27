package org.timepedia.exporter.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class ExporterUtil_ExportAll_ExporterImpl extends ExporterUtil.ExportAll implements Exporter {
  public void export(boolean all) { 
    if (all) {
    }
    GWT.create(com.joseph.draw4.client.PluginManager.class);
  }
  public void exportAll() { 
    export();
  }
  public boolean isAssignable(Object o) {
    return o != null && o instanceof org.timepedia.exporter.client.ExporterUtil.ExportAll;
  }
  public native JavaScriptObject getJsConstructor() /*-{
    return $wnd.org.timepedia.exporter.ExporterUtil.ExportAll;
  }-*/;
}
