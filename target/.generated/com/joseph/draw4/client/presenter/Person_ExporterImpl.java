package com.joseph.draw4.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class Person_ExporterImpl implements Exporter {
    public Person_ExporterImpl() { export(); }
    public native void export0() /*-{
      var pkg = @org.timepedia.exporter.client.ExporterUtil::declarePackage(Ljava/lang/String;)('com.joseph.draw4.presenter.Person');
      var _, __ = this;
      $wnd.com.joseph.draw4.presenter.Person = $entry(function(){var g, j = this, a = arguments;
        if (a.length == 1 && __.@org.timepedia.exporter.client.Exporter::isAssignable(*)(a[0]))
          g = a[0];
        else if (a.length == 0)
          g = @com.joseph.draw4.client.presenter.Person_ExporterImpl::___create()();
        j.g = g;
        @org.timepedia.exporter.client.ExporterUtil::setWrapper(Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)(g, j);
        return j;
      });
      _ = $wnd.com.joseph.draw4.presenter.Person.prototype = new Object();
      _.dod = $entry(function() {
        this.g.@com.joseph.draw4.client.presenter.Person::dod()();
      });
      
      if(pkg) for (p in pkg) if ($wnd.com.joseph.draw4.presenter.Person[p] === undefined) $wnd.com.joseph.draw4.presenter.Person[p] = pkg[p];
    }-*/;
    public static com.joseph.draw4.client.presenter.Person ___create() {
      return new com.joseph.draw4.client.presenter.Person();
    }
    private static boolean exported;
    public void export() { 
      if(!exported) {
        exported=true;
        ExporterUtil.addExporter(com.joseph.draw4.client.presenter.Person.class, this);
        export0();
      }
    }
    public boolean isAssignable(Object o) {
      return o != null && o instanceof com.joseph.draw4.client.presenter.Person;
    }
    public native JavaScriptObject getJsConstructor() /*-{
      return $wnd.com.joseph.draw4.presenter.Person;
    }-*/;
}
