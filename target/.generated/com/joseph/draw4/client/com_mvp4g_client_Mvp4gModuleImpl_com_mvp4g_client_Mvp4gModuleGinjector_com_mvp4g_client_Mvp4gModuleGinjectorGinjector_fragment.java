package com.joseph.draw4.client;

import com.google.gwt.core.client.GWT;
import com.mvp4g.client.com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector;

public class com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$joseph$draw4$client$ZHistoryConverter$_annotation$$none$$(com.joseph.draw4.client.ZHistoryConverter injectee) {
    
  }
  
  public void memberInject_Key$type$com$joseph$draw4$client$PluginManager$_annotation$$none$$(com.joseph.draw4.client.PluginManager injectee) {
    
  }
  
  public void memberInject_Key$type$com$joseph$draw4$client$ZGinModule$EditCanvasProvider$_annotation$$none$$(com.joseph.draw4.client.ZGinModule.EditCanvasProvider injectee) {
    
  }
  
  private com.google.gwt.canvas.client.Canvas singleton_Key$type$com$google$gwt$canvas$client$Canvas$_annotation$$none$$ = null;
  
  public com.google.gwt.canvas.client.Canvas get_Key$type$com$google$gwt$canvas$client$Canvas$_annotation$$none$$() {
    
    if (singleton_Key$type$com$google$gwt$canvas$client$Canvas$_annotation$$none$$ == null) {
    com.google.gwt.canvas.client.Canvas result = get_Key$type$com$joseph$draw4$client$ZGinModule$EditCanvasProvider$_annotation$$none$$().get();
        singleton_Key$type$com$google$gwt$canvas$client$Canvas$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$google$gwt$canvas$client$Canvas$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.joseph.draw4.client.ZHistoryConverter declared at:
   *   Implicit GWT.create binding for com.joseph.draw4.client.ZHistoryConverter
   */
  public com.joseph.draw4.client.ZHistoryConverter get_Key$type$com$joseph$draw4$client$ZHistoryConverter$_annotation$$none$$() {
    Object created = GWT.create(com.joseph.draw4.client.ZHistoryConverter.class);
    assert created instanceof com.joseph.draw4.client.ZHistoryConverter;
    com.joseph.draw4.client.ZHistoryConverter result = (com.joseph.draw4.client.ZHistoryConverter) created;
    
    memberInject_Key$type$com$joseph$draw4$client$ZHistoryConverter$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.joseph.draw4.client.PluginManager singleton_Key$type$com$joseph$draw4$client$PluginManager$_annotation$$none$$ = null;
  
  public com.joseph.draw4.client.PluginManager get_Key$type$com$joseph$draw4$client$PluginManager$_annotation$$none$$() {
    
    if (singleton_Key$type$com$joseph$draw4$client$PluginManager$_annotation$$none$$ == null) {
    com.joseph.draw4.client.PluginManager result = com$joseph$draw4$client$PluginManager_com$joseph$draw4$client$PluginManager_methodInjection(get_Key$type$com$google$gwt$canvas$client$Canvas$_annotation$$none$$());
    memberInject_Key$type$com$joseph$draw4$client$PluginManager$_annotation$$none$$(result);
    
        singleton_Key$type$com$joseph$draw4$client$PluginManager$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$joseph$draw4$client$PluginManager$_annotation$$none$$;
    
  }
  
  public native com.joseph.draw4.client.PluginManager com$joseph$draw4$client$PluginManager_com$joseph$draw4$client$PluginManager_methodInjection(com.google.gwt.canvas.client.Canvas _0) /*-{
    return @com.joseph.draw4.client.PluginManager::new(Lcom/google/gwt/canvas/client/Canvas;)(_0);
  }-*/;
  
  
  /**
   * Binding for com.joseph.draw4.client.ZGinModule$EditCanvasProvider declared at:
   *   Implicit GWT.create binding for com.joseph.draw4.client.ZGinModule$EditCanvasProvider
   */
  public com.joseph.draw4.client.ZGinModule.EditCanvasProvider get_Key$type$com$joseph$draw4$client$ZGinModule$EditCanvasProvider$_annotation$$none$$() {
    Object created = GWT.create(com.joseph.draw4.client.ZGinModule.EditCanvasProvider.class);
    assert created instanceof com.joseph.draw4.client.ZGinModule.EditCanvasProvider;
    com.joseph.draw4.client.ZGinModule.EditCanvasProvider result = (com.joseph.draw4.client.ZGinModule.EditCanvasProvider) created;
    
    memberInject_Key$type$com$joseph$draw4$client$ZGinModule$EditCanvasProvider$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector injector;
  public com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector_fragment(com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
