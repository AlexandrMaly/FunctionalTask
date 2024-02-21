package Handler;

import Client.Client;
import Output.Outputer;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class HandlerClient {
    AtomicInteger count = new AtomicInteger(1);

    public void handleData(List<Client> list, Consumer<Client> consumer) {
        for (Client client : list) {
            consumer.accept(client);
        }
    }

    public Consumer<Client> getClient() {
        return client ->
                new Outputer().getOutput(count.getAndIncrement() +
                        ") Name: " + client.getName() +
                        ", phone: " + client.getPhone()
                );
    }
}
