package Data;

import Client.Client;

import java.util.Arrays;
import java.util.List;

public class DataClient {
    public List<Client> getData() {
        return Arrays.asList(
                new Client("Oleksandr", "+38(068)-258-33-12"),
                new Client("Antonina", "+38(093)-003-22-11"),
                new Client("Oleksiy", "+38(067)-554-27-19"),
                new Client("Michail", "+38(050)-731-89-99"),
                new Client("Petro", "+38(073)-988-16-00")
        );
    }
}
