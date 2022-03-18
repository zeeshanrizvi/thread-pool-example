package EchoServer;

//import java.net.*; 
import java.io.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor; 

public class EchoServer 
{ 
 public static void main(String[] args) throws IOException 
   { 
	 
	 ThreadPooledServer server = new ThreadPooledServer(4444);
	 new Thread(server).start();
     System.out.println("Server started..");
     
	 /*try {
	     Thread.sleep(200 * 1000);
	 } catch (InterruptedException e) {
	     e.printStackTrace();
	 }
	 
	 System.out.println("Stopping Server");
	 server.stop();*/
     
     ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
     Monitor monitor= new Monitor("MONITOR");
     executor.execute(monitor);

   } 
} 