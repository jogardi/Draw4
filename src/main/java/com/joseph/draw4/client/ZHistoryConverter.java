package com.joseph.draw4.client;

import com.mvp4g.client.annotation.History;
import com.mvp4g.client.annotation.History.HistoryConverterType;
import com.mvp4g.client.history.HistoryConverter;


/**
 * @author Joseph
 * updates URL when the app goes to a different place and takes the app to the right place in response to URL changes
 */
@History(type = HistoryConverterType.NONE)
public class ZHistoryConverter implements HistoryConverter<ZBus> {

	/**
	 * it'll be called whenever the URL changes so that it can take the app to the new URL
	 */
	@Override
	public void convertFromToken(String historyName, String param, ZBus eventBus) {
		eventBus.dispatch(historyName);
		
	}
	
	/**
	 * the URLs from this history converter aren't crawlable by some spiders
	 */
	@Override
	public boolean isCrawlable() { return false; }
}