package com.joseph.draw4.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class PluginManager_ExporterImpl implements Exporter {
    public PluginManager_ExporterImpl() { export(); }
    public native void export0() /*-{
      var pkg = @org.timepedia.exporter.client.ExporterUtil::declarePackage(Ljava/lang/String;)('mng.PluginManager');
      var _, __ = this;
      $wnd.mng.PluginManager = $entry(function(){var g, j = this, a = arguments;
        if (a.length == 1 && __.@org.timepedia.exporter.client.Exporter::isAssignable(*)(a[0]))
          g = a[0];
        j.g = g;
        @org.timepedia.exporter.client.ExporterUtil::setWrapper(Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)(g, j);
        return j;
      });
      _ = $wnd.mng.PluginManager.prototype = new Object();
      _.activate = $entry(function(a0) {
        @org.timepedia.exporter.client.ExporterUtil::runDispatch(Ljava/lang/Object;Ljava/lang/Class;ILcom/google/gwt/core/client/JsArray;ZZ)
         (this.g, @com.joseph.draw4.client.PluginManager::class, 0 , arguments, false, false)[0];
      });
      _.addPlugin = $entry(function(a0) {
        @org.timepedia.exporter.client.ExporterUtil::runDispatch(Ljava/lang/Object;Ljava/lang/Class;ILcom/google/gwt/core/client/JsArray;ZZ)
         (this.g, @com.joseph.draw4.client.PluginManager::class, 1 , arguments, false, false)[0];
      });
      $wnd.mng.PluginManager.get = $entry(function() {
        return @org.timepedia.exporter.client.ExporterUtil::wrap(Ljava/lang/Object;)(@com.joseph.draw4.client.PluginManager::get()());
      });
      _.getEasel = $entry(function() {
        return this.g.@com.joseph.draw4.client.PluginManager::getEasel()();
      });
      _.getPlugins = $entry(function() {
        this.g.@com.joseph.draw4.client.PluginManager::getPlugins()();
      });
      _.initJs = $entry(function() {
        this.g.@com.joseph.draw4.client.PluginManager::initJs()();
      });
      
      @org.timepedia.exporter.client.ExporterUtil::registerDispatchMap(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;Z)
      (@com.joseph.draw4.client.PluginManager::class,{
        0:{
          1:[[function() { return this.@com.joseph.draw4.client.PluginManager::activate(Ljava/lang/Object;).apply(this, arguments); },null,,@java.lang.Object::class,],],
        },
        1:{
          1:[[function() { return this.@com.joseph.draw4.client.PluginManager::addPlugin(Ljava/lang/Object;).apply(this, arguments); },null,,@java.lang.Object::class,],],
        },
      }, false);
      
      if(pkg) for (p in pkg) if ($wnd.mng.PluginManager[p] === undefined) $wnd.mng.PluginManager[p] = pkg[p];
    }-*/;
    private static boolean exported;
    public void export() { 
      if(!exported) {
        exported=true;
        ExporterUtil.addExporter(com.joseph.draw4.client.PluginManager.class, this);
        export0();
      }
    }
    public boolean isAssignable(Object o) {
      return o != null && o instanceof com.joseph.draw4.client.PluginManager;
    }
    public native JavaScriptObject getJsConstructor() /*-{
      return $wnd.mng.PluginManager;
    }-*/;
}
