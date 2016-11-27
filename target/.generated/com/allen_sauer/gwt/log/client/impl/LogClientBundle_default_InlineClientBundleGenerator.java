package com.allen_sauer.gwt.log.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LogClientBundle_default_InlineClientBundleGenerator implements com.allen_sauer.gwt.log.client.impl.LogClientBundle {
  private static LogClientBundle_default_InlineClientBundleGenerator _instance0 = new LogClientBundle_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "css";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".log-panel{background-color:" + ("#ecf2fc")  + ";border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";margin:" + ("0")  + ";filter:" + ("alpha(" + "opacity"+ " " +"\\="+ " " +"95" + ")")  + ";opacity:" + ("0.95")  + ";z-index:" + ("1000")  + ";}.log-panel .GPOLW4RCI{font-size:" + ("10pt")  + ";margin:" + ("0")  + ";text-align:" + ("right")  + ";}.log-panel BUTTON{font-size:" + ("10pt")  + ";margin:") + (("0")  + ";}.log-panel .GPOLW4RCJ{cursor:" + ("move")  + ";font-weight:" + ("bold")  + ";}.log-panel .GPOLW4RCB{margin:" + ("0"+ " " +"1.2em")  + ";}.log-panel BUTTON.GPOLW4RCA{color:" + ("#444")  + " !important;}.log-panel .GPOLW4RCH{white-space:" + ("nowrap")  + ";}.log-panel .GPOLW4RCC{white-space:" + ("pre")  + ";font-family:" + ("monospace")  + ";cursor:" + ("help")  + ";}.log-panel .GPOLW4RCD{background-color:" + ("#f0f0f0")  + ";}.log-panel .GPOLW4RCG{background-color:" + ("#fff") ) + (";}.log-panel .GPOLW4RCF{cursor:" + ("sw-resize")  + ";}")) : ((".log-panel{background-color:" + ("#ecf2fc")  + ";border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";margin:" + ("0")  + ";filter:" + ("alpha(" + "opacity"+ " " +"\\="+ " " +"95" + ")")  + ";opacity:" + ("0.95")  + ";z-index:" + ("1000")  + ";}.log-panel .GPOLW4RCI{font-size:" + ("10pt")  + ";margin:" + ("0")  + ";text-align:" + ("left")  + ";}.log-panel BUTTON{font-size:" + ("10pt")  + ";margin:") + (("0")  + ";}.log-panel .GPOLW4RCJ{cursor:" + ("move")  + ";font-weight:" + ("bold")  + ";}.log-panel .GPOLW4RCB{margin:" + ("0"+ " " +"1.2em")  + ";}.log-panel BUTTON.GPOLW4RCA{color:" + ("#444")  + " !important;}.log-panel .GPOLW4RCH{white-space:" + ("nowrap")  + ";}.log-panel .GPOLW4RCC{white-space:" + ("pre")  + ";font-family:" + ("monospace")  + ";cursor:" + ("help")  + ";}.log-panel .GPOLW4RCD{background-color:" + ("#f0f0f0")  + ";}.log-panel .GPOLW4RCG{background-color:" + ("#fff") ) + (";}.log-panel .GPOLW4RCF{cursor:" + ("se-resize")  + ";}"));
      }
      public java.lang.String logClearAbout() {
        return "GPOLW4RCA";
      }
      public java.lang.String logClearButton() {
        return "GPOLW4RCB";
      }
      public java.lang.String logMessage() {
        return "GPOLW4RCC";
      }
      public java.lang.String logMessageHover() {
        return "GPOLW4RCD";
      }
      public java.lang.String logPanel() {
        return "log-panel";
      }
      public java.lang.String logResizeSe() {
        return "GPOLW4RCF";
      }
      public java.lang.String logScrollPanel() {
        return "GPOLW4RCG";
      }
      public java.lang.String logStacktrace() {
        return "GPOLW4RCH";
      }
      public java.lang.String logTextArea() {
        return "GPOLW4RCI";
      }
      public java.lang.String logTitle() {
        return "GPOLW4RCJ";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource get() {
      return css;
    }
  }
  public com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.allen_sauer.gwt.log.client.impl.LogClientBundle::css()();
    }
    return null;
  }-*/;
}
