package server;

import java.util.concurrent.CompletableFuture;

class Service {

    public CompletableFuture<String> ask() {
        final CompletableFuture<String> future = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "42";
                });
        return future;
    }
}
