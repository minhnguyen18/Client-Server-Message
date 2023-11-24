// Client program
 
import java.io.*;
import java.net.*;
 
class Client {
   
    // driver function
    public static void main(String[] args)
    {
        try {
           
            // Create socket object by passing id address
            // and port number establish connection
            Socket socket = new Socket("localhost", 1346);
            System.out.println(
                "Connected Successfully.....");
            
                // Buffer reader to get all the input stream
                BufferedReader bs = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
                System.out.println("Response from Server.....");
    
                // Print response from server
                System.out.println("Client Side : "
                                + bs.readLine());
                // Close the connection
                socket.close();
            
            
        }
        catch (UnknownHostException e) {
        
            // Catch block for IP errors
            System.out.println("IP not found for" + e);
        }
        catch (IOException e) {
           
            // Catch block for data stream errors
            System.out.println("Not found data for socket"
                               + e);
        }
    }
}