import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi botApi = new TelegramBotsApi(DefaultBotSession.class);
        Bot bot = new Bot();
        botApi.registerBot(bot);
        //bot.sendText(1144830564l, "Hello world");
    }
}
