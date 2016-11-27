// .ui.xml template last modified: 1422330713000
package com.joseph.draw4.client.view.register_plugin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class RegisterPluginDisplay_RegisterPluginDisplayUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay>, com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay.RegisterPluginDisplayUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<form action='.gupld' id='form' method='POST'> <input type='file'> <input type='submit' value='submit'> </form>")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay owner;


    public Widgets(final com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay_RegisterPluginDisplayUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay_RegisterPluginDisplayUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay_RegisterPluginDisplayUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay_RegisterPluginDisplayUiBinderImpl_GenBundle) GWT.create(com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay_RegisterPluginDisplayUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay_RegisterPluginDisplayUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay_RegisterPluginDisplayUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.joseph.draw4.client.view.register_plugin.RegisterPluginDisplay_RegisterPluginDisplayUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_FlowPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel1() {
      return build_f_FlowPanel1();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel1.add(get_f_Heading2());
      f_FlowPanel1.add(get_uploadContainer());
      f_FlowPanel1.add(get_f_HTMLPanel3());

      return f_FlowPanel1;
    }

    /**
     * Getter for f_Heading2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.github.gwtbootstrap.client.ui.Heading get_f_Heading2() {
      return build_f_Heading2();
    }
    private com.github.gwtbootstrap.client.ui.Heading build_f_Heading2() {
      // Creation section.
      final com.github.gwtbootstrap.client.ui.Heading f_Heading2 = new com.github.gwtbootstrap.client.ui.Heading(2);
      // Setup section.
      f_Heading2.setText("Upload plugin");

      return f_Heading2;
    }

    /**
     * Getter for uploadContainer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_uploadContainer() {
      return build_uploadContainer();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_uploadContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel uploadContainer = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.

      return uploadContainer;
    }

    /**
     * Getter for f_HTMLPanel3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel3() {
      return build_f_HTMLPanel3();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel3 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      return f_HTMLPanel3;
    }
  }
}
