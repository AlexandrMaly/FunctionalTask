import Data.DataClient;
import Handler.HandlerClient;

public class Main {
    public static void main(String[] args) {
        HandlerClient handler = new HandlerClient();
        handler.handleData(new DataClient().getData(), handler.getClient());
    }
}
