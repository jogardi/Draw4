package com.mvp4g.client;

import com.mvp4g.client.history.PlaceService;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.mvp4g.client.presenter.PresenterInterface;
import com.mvp4g.client.event.EventBus;
import com.mvp4g.client.Mvp4gException;
import com.mvp4g.client.history.HistoryConverter;
import com.mvp4g.client.Mvp4gEventPasser;
import com.mvp4g.client.Mvp4gModule;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.mvp4g.client.event.BaseEventBus;
import com.mvp4g.client.event.EventFilter;
import com.mvp4g.client.event.EventHandlerInterface;
import java.util.List;
import com.mvp4g.client.history.NavigationEventCommand;
import com.mvp4g.client.history.NavigationConfirmationInterface;
import com.google.gwt.core.client.RunAsyncCallback;
import com.mvp4g.client.Mvp4gRunAsync;
import com.google.gwt.user.client.Command;

public class Mvp4gModuleImpl implements Mvp4gModule {
    
    private abstract class AbstractEventBus extends com.mvp4g.client.event.BaseEventBusWithLookUp implements com.joseph.draw4.client.ZBus{}
    
    @GinModules({com.joseph.draw4.client.ZGinModule.class})
    public interface com_mvp4g_client_Mvp4gModuleGinjector extends Ginjector {
      com.joseph.draw4.client.presenter.StartPresenterImpl getcom_joseph_draw4_client_presenter_StartPresenterImpl();
      com.joseph.draw4.client.presenter.EditorPresenterImpl getcom_joseph_draw4_client_presenter_EditorPresenterImpl();
      com.joseph.draw4.client.presenter.HomePresenterImpl getcom_joseph_draw4_client_presenter_HomePresenterImpl();
      com.joseph.draw4.client.view.home.HomeDisplay getcom_joseph_draw4_client_presenter_HomePresenterImplView();
      com.joseph.draw4.client.view.root.StartDisplay getcom_joseph_draw4_client_presenter_StartPresenterImplView();
      com.joseph.draw4.client.view.editor.EditorDisplay getcom_joseph_draw4_client_presenter_EditorPresenterImplView();
      com.joseph.draw4.client.ZHistoryConverter getcom_joseph_draw4_client_ZHistoryConverter();
      com.mvp4g.client.history.PlaceService getcom_mvp4g_client_history_PlaceService();
    }
    private Object startView = null;
    private PresenterInterface startPresenter = null;
    protected AbstractEventBus eventBus = null;
    protected com_mvp4g_client_Mvp4gModuleGinjector injector = null;
    protected com.mvp4g.client.Mvp4gModule itself = this;
    private PlaceService placeService = null;
    public void setParentModule(com.mvp4g.client.Mvp4gModule module){}
    public void loadChildModule(String childModuleClassName, String eventName, boolean passive, Mvp4gEventPasser passer){
    }
    public void addConverter(String historyName, HistoryConverter<?> hc){
      placeService.addConverter(historyName, hc);
    }
    public void clearHistory(){
      placeService.clearHistory();
    }
    public String place(String token, String form, boolean onlyToken){
      return placeService.place( token, form, onlyToken );
    }
    public void dispatchHistoryEvent(String eventType, final Mvp4gEventPasser passer){
      int index = eventType.indexOf(PlaceService.MODULE_SEPARATOR);
      if(index > -1){
        String moduleHistoryName = eventType.substring(0, index);
        String nextToken = eventType.substring(index + 1);
        Mvp4gEventPasser nextPasser = new Mvp4gEventPasser(nextToken) {
          public void pass(Mvp4gModule module) {
            module.dispatchHistoryEvent((String) eventObjects[0], passer);
          }
        };
        passer.setEventObject(false);
        passer.pass(this);
      }else{
        passer.pass(this);
      }
    }
    public void sendInitEvent(){
      eventBus.init();
    }
    public void sendNotFoundEvent(){
      eventBus.init();
    }
    
    public void onForward(){
    }
    
    public void createAndStartModule(){
      injector = GWT.create( com_mvp4g_client_Mvp4gModuleGinjector.class );
      final com.joseph.draw4.client.view.home.HomeDisplay com_joseph_draw4_client_presenter_HomePresenterImplView = injector.getcom_joseph_draw4_client_presenter_HomePresenterImplView();
      final com.joseph.draw4.client.view.root.StartDisplay com_joseph_draw4_client_presenter_StartPresenterImplView = injector.getcom_joseph_draw4_client_presenter_StartPresenterImplView();
      final com.joseph.draw4.client.view.editor.EditorDisplay com_joseph_draw4_client_presenter_EditorPresenterImplView = injector.getcom_joseph_draw4_client_presenter_EditorPresenterImplView();
      
      
      
      placeService = injector.getcom_mvp4g_client_history_PlaceService();
      final com.joseph.draw4.client.ZHistoryConverter com_joseph_draw4_client_ZHistoryConverter = injector.getcom_joseph_draw4_client_ZHistoryConverter();
      
      final com.joseph.draw4.client.presenter.StartPresenterImpl com_joseph_draw4_client_presenter_StartPresenterImpl = injector.getcom_joseph_draw4_client_presenter_StartPresenterImpl();
      com_joseph_draw4_client_presenter_StartPresenterImpl.setView(com_joseph_draw4_client_presenter_StartPresenterImplView);
      final com.joseph.draw4.client.presenter.EditorPresenterImpl com_joseph_draw4_client_presenter_EditorPresenterImpl = injector.getcom_joseph_draw4_client_presenter_EditorPresenterImpl();
      com_joseph_draw4_client_presenter_EditorPresenterImpl.setView(com_joseph_draw4_client_presenter_EditorPresenterImplView);
      com_joseph_draw4_client_presenter_EditorPresenterImplView.setPresenter(com_joseph_draw4_client_presenter_EditorPresenterImpl);
      final com.joseph.draw4.client.presenter.HomePresenterImpl com_joseph_draw4_client_presenter_HomePresenterImpl = injector.getcom_joseph_draw4_client_presenter_HomePresenterImpl();
      com_joseph_draw4_client_presenter_HomePresenterImpl.setView(com_joseph_draw4_client_presenter_HomePresenterImplView);
      com_joseph_draw4_client_presenter_HomePresenterImplView.setPresenter(com_joseph_draw4_client_presenter_HomePresenterImpl);
      
      
      eventBus = new AbstractEventBus(){
        protected <T extends EventHandlerInterface<?>> T createHandler( Class<T> handlerClass ){
        return null;
        }
        public void setPage(com.google.gwt.user.client.ui.IsWidget attr0){
          if (com_joseph_draw4_client_presenter_StartPresenterImpl.isActivated(false, "setPage", new Object[]{attr0})){
            com_joseph_draw4_client_presenter_StartPresenterImpl.onSetPage(attr0);
          }
        }
        public void goHome(){
          place( itself, "goHome",null,false);
          if (com_joseph_draw4_client_presenter_HomePresenterImpl.isActivated(false, "goHome")){
            com_joseph_draw4_client_presenter_HomePresenterImpl.onGoHome();
          }
        }
        public void init(){
          if (com_joseph_draw4_client_presenter_StartPresenterImpl.isActivated(false, "init")){
            com_joseph_draw4_client_presenter_StartPresenterImpl.onInit();
          }
        }
        public void goEditor(){
          place( itself, "goEditor",null,false);
          if (com_joseph_draw4_client_presenter_EditorPresenterImpl.isActivated(false, "goEditor")){
            com_joseph_draw4_client_presenter_EditorPresenterImpl.onGoEditor();
          }
        }
        public void dispatch( String eventType, Object... data ){
          try{
            if ( "setPage".equals( eventType ) ){
              setPage((com.google.gwt.user.client.ui.IsWidget) data[0]);
            } else if ( "goHome".equals( eventType ) ){
              goHome();
            } else if ( "init".equals( eventType ) ){
              init();
            } else if ( "goEditor".equals( eventType ) ){
              goEditor();
            } else {
              throw new Mvp4gException( "Event " + eventType + " doesn't exist. Have you forgotten to add it to your Mvp4g configuration file?" );
            }
          } catch ( ClassCastException e ) {
            handleClassCastException( e, eventType );
          }
        }
      public void setNavigationConfirmation( NavigationConfirmationInterface navigationConfirmation ) {
        placeService.setNavigationConfirmation(navigationConfirmation);
      }
      public void confirmNavigation(NavigationEventCommand event){
        placeService.confirmEvent(event);
      }
      public void setApplicationHistoryStored( boolean historyStored ){
        placeService.setEnabled(historyStored);
      }
      };
      addConverter( "goHome",com_joseph_draw4_client_ZHistoryConverter);addConverter( "goEditor",com_joseph_draw4_client_ZHistoryConverter);
      com_joseph_draw4_client_presenter_StartPresenterImpl.setEventBus(eventBus);
      com_joseph_draw4_client_presenter_EditorPresenterImpl.setEventBus(eventBus);
      com_joseph_draw4_client_presenter_HomePresenterImpl.setEventBus(eventBus);
      placeService.setModule(itself);
      
      this.startPresenter = com_joseph_draw4_client_presenter_StartPresenterImpl;
      this.startView = startPresenter.getView();
      History.fireCurrentHistoryState();
    }
    public Object getStartView(){
      if (startPresenter != null) {
        startPresenter.setActivated(true);
        startPresenter.isActivated(false, null);
      }return startView;
    }
    
    public EventBus getEventBus(){
      return eventBus;
    }
  }
