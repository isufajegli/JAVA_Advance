package com.sda.lesson.four.communication.between.threads;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
    private Data data;

    public Sender(Data data) {
        this.data = data;
    }

    // standard constructors

    public void run() {
        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };

        for (String packet : packets) {
            data.send(packet);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Something went wrong");
            }
        }
    }
}
