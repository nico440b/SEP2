package ServerPackage;

import ClientPackage.Klient;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(6789);
        Thread thread = new Thread(server);
        thread.start();
    }
}
