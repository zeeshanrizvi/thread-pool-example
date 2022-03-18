package EchoServer;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;
 
public class Task implements Runnable {
    private String name;
 
    public Task(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void run() {
        try {
            Long duration = (long) (Math.random() * 10);
            System.out.println("| " + new Timestamp(new Date().getTime()) + " | TASK | Executing | " + name + " |");
            TimeUnit.SECONDS.sleep(duration);
            System.out.println("| " + new Timestamp(new Date().getTime()) + " | TASK | Done | " + name + " |");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}