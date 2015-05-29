package server;

import java.util.concurrent.CompletableFuture;

public class EntryPoint {
    private Service service;

    public EntryPoint(){
        this.service = new Service();
    }

    public CompletableFuture<String> ask(){
        return service.ask();
    }

}
