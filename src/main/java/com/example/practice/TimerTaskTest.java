package com.example.practice;

import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer task executed.");
    }

}

public class TimerTaskTest {
    public static void main(String[] args) {
        var myTask = new MyTimerTask();
        var myTimer = new Timer();
        myTimer.schedule(myTask, 1000, 500);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myTimer.cancel();
    }
}
