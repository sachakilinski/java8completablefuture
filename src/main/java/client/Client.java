package client;

import server.EntryPoint;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        EntryPoint entryPoint = new EntryPoint();
        CompletableFuture<String> answer = entryPoint.ask();
        answer.thenAccept((result)->System.out.println(result));
        answer.join();
    }
}
