package com.google.gwt.query.client.builders;

import com.google.gwt.query.client.js.*;
import com.google.gwt.query.client.*;
import com.google.gwt.core.client.*;
import com.google.gwt.dom.client.*;
import java.util.*;

public class JsonFactory_JsonBuilder implements com.google.gwt.query.client.builders.JsonFactory {
  public <T extends com.google.gwt.query.client.builders.JsonBuilder> T create(Class<T> clz) {
    if (clz == com.google.gwt.query.client.builders.JsonBuilder.class) return GWT.<T>create(com.google.gwt.query.client.builders.JsonBuilder.class);
    if (clz == com.google.gwt.query.client.plugins.ajax.Ajax.Settings.class) return GWT.<T>create(com.google.gwt.query.client.plugins.ajax.Ajax.Settings.class);
    return null;
  }
  public com.google.gwt.query.client.IsProperties create(String s) {
    return (com.google.gwt.query.client.IsProperties)com.google.gwt.query.client.js.JsUtils.parseJSON(s);
  }
  public com.google.gwt.query.client.IsProperties create() {
    return com.google.gwt.query.client.Properties.create();
  }
}
