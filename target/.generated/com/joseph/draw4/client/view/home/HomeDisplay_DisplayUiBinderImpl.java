// .ui.xml template last modified: 1422063512000
package com.joseph.draw4.client.view.home;

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

public class HomeDisplay_DisplayUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.joseph.draw4.client.view.home.HomeDisplay>, com.joseph.draw4.client.view.home.HomeDisplay.DisplayUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Home")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.joseph.draw4.client.view.home.HomeDisplay owner) {


    return new Widgets(owner).get_root();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.joseph.draw4.client.view.home.HomeDisplay owner;


    public Widgets(final com.joseph.draw4.client.view.home.HomeDisplay owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.joseph.draw4.client.view.home.HomeDisplay_DisplayUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.joseph.draw4.client.view.home.HomeDisplay_DisplayUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.joseph.draw4.client.view.home.HomeDisplay_DisplayUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.joseph.draw4.client.view.home.HomeDisplay_DisplayUiBinderImpl_GenBundle) GWT.create(com.joseph.draw4.client.view.home.HomeDisplay_DisplayUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.joseph.draw4.client.view.home.HomeDisplay_DisplayUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.joseph.draw4.client.view.home.HomeDisplay_DisplayUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.joseph.draw4.client.view.home.HomeDisplay_DisplayUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for root called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_root() {
      return build_root();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_root() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel root = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      this.owner.root = root;

      return root;
    }
  }
}
