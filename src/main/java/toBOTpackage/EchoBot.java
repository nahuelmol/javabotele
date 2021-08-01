package toBOTpackage;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class EchoBot extends TelegramLongPollingBot {
 
	@Override
	public void onUpdateReceived(final Update update) {
 
		final String messageTextReceived = update.getMessage().getText();
                String welcomeText = "Welcome! Again...";
 
		final long chatId = update.getMessage().getChatId();
 
		SendMessage message = new SendMessage().setChatId(chatId).setText(messageTextReceived);
                SendMessage welcomeMessage = new SendMessage().setChatId(chatId).setText(welcomeText);		


		try {
			execute(message);
                        execute(welcomeMessage);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
 
	@Override
	public String getBotUsername() {
		return "EchoBot";
		// Se devuelve el nombre que dimos al bot al crearlo con el BotFather
		
	}
        
        @Override
        public String getBotSalud(){
            return "JavaBot";
        }
 
	@Override
	public String getBotToken() {
		return "1941950199:AAFRtGkZ81-2Zu1Fk_oCgH5DaqTDX2EIlEw";
	}
}
