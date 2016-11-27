package com.joseph.draw4.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class PluginManager_ExporterImpl implements Exporter {
    public PluginManager_ExporterImpl() { export(); }
    public native void export0() /*-{
      var pkg = @org.timepedia.exporter.client.ExporterUtil::declarePackage(Ljava/lang/String;)('pkg.PluginManager');
      var _, __ = this;
      $wnd.pkg.PluginManager = $entry(function(){var g, j = this, a = arguments;
        if (a.length == 1 && __.@org.timepedia.exporter.client.Exporter::isAssignable(*)(a[0]))
          g = a[0];
        else if (a.length == 0)
          g = @com.joseph.draw4.shared.PluginManager_ExporterImpl::___create()();
        j.g = g;
        @org.timepedia.exporter.client.ExporterUtil::setWrapper(Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)(g, j);
        return j;
      });
      _ = $wnd.pkg.PluginManager.prototype = new Object();
      _.addPlugin = $entry(function(a0) {
        @org.timepedia.exporter.client.ExporterUtil::runDispatch(Ljava/lang/Object;Ljava/lang/Class;ILcom/google/gwt/core/client/JsArray;ZZ)
         (this.g, @com.joseph.draw4.shared.PluginManager::class, 1 , arguments, false, false)[0];
      });
      _.createCanvas = $entry(function() {
        return this.g.@com.joseph.draw4.shared.PluginManager::createCanvas()();
      });
      _.display = $entry(function(a0) {
        @org.timepedia.exporter.client.ExporterUtil::runDispatch(Ljava/lang/Object;Ljava/lang/Class;ILcom/google/gwt/core/client/JsArray;ZZ)
         (this.g, @com.joseph.draw4.shared.PluginManager::class, 0 , arguments, false, false)[0];
      });
      $wnd.pkg.PluginManager.get = $entry(function() {
        return @org.timepedia.exporter.client.ExporterUtil::wrap(Ljava/lang/Object;)(@com.joseph.draw4.shared.PluginManager::get()());
      });
      _.getEasel = $entry(function() {
        return this.g.@com.joseph.draw4.shared.PluginManager::getEasel()();
      });
      
      @org.timepedia.exporter.client.ExporterUtil::registerDispatchMap(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;Z)
      (@com.joseph.draw4.shared.PluginManager::class,{
        0:{
          1:[[function() { return this.@com.joseph.draw4.shared.PluginManager::display(Ljava/lang/Object;).apply(this, arguments); },null,,@java.lang.Object::class,],],
        },
        1:{
          1:[[function() { return this.@com.joseph.draw4.shared.PluginManager::addPlugin(Ljava/lang/Object;).apply(this, arguments); },null,,@java.lang.Object::class,],],
        },
      }, false);
      
      if(pkg) for (p in pkg) if ($wnd.pkg.PluginManager[p] === undefined) $wnd.pkg.PluginManager[p] = pkg[p];
    }-*/;
    public static com.joseph.draw4.shared.PluginManager ___create() {
      return new com.joseph.draw4.shared.PluginManager();
    }
    private static boolean exported;
    public void export() { 
      if(!exported) {
        exported=true;
        ExporterUtil.addExporter(com.joseph.draw4.shared.PluginManager.class, this);
        export0();
      }
    }
    public boolean isAssignable(Object o) {
      return o != null && o instanceof com.joseph.draw4.shared.PluginManager;
    }
    public native JavaScriptObject getJsConstructor() /*-{
      return $wnd.pkg.PluginManager;
    }-*/;
}
