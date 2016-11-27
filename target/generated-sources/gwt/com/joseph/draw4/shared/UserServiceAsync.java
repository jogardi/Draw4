package com.joseph.draw4.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface UserServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.joseph.draw4.shared.UserService
     */
    void login( java.lang.String token, AsyncCallback<Void> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static UserServiceAsync instance;

        public static final UserServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (UserServiceAsync) GWT.create( UserService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instantiated
        }
    }
}
