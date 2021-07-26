

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import toBOTpackage.EchoBot;

package com.mycompany.javabot;

public class startedClass {
    public static void main(String[] args) {
		ApiContextInitializer.init();
 
		final TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
 
		try {
			telegramBotsApi.registerBot(new EchoBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}
