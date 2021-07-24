package toBOTpackage;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class EchoBot extends TelegramLongPollingBot {
 
	@Override
	public void onUpdateReceived(final Update update) {
		// Esta función se invocará cuando nuestro bot reciba un mensaje
 
		// Se obtiene el mensaje escrito por el usuario
		final String messageTextReceived = update.getMessage().getText();
                String welcomeText = "Welcome! Again...";
 
		// Se obtiene el id de chat del usuario
		final long chatId = update.getMessage().getChatId();
 
		// Se crea un objeto mensaje
		SendMessage message = new SendMessage().setChatId(chatId).setText(messageTextReceived);
                SendMessage welcomeMessage = new SendMessage().setChatId(chatId).setText(welcomeText);		


		try {
			// Se envía el mensaje
			execute(message);
                        execute(welcomeMessage);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
 
	@Override
	public String getBotUsername() {
		// Se devuelve el nombre que dimos al bot al crearlo con el BotFather
		return "JavaBot";
	}
 
	@Override
	public String getBotToken() {
		// Se devuelve el token que nos generó el BotFather de nuestro bot
		return "1941950199:AAFRtGkZ81-2Zu1Fk_oCgH5DaqTDX2EIlEw";
	}
}
