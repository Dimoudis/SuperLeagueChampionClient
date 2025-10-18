package champions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Input user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Δώσε IP του server: ");
        String ip = scanner.nextLine();

        String url = "http://" + ip + "/getSLChampion.php";

        // Handler για HTTP request
        try {
        	HttpHandler httpHandler = new HttpHandler();
            ChampionList cList = httpHandler.getResponse(url);
            cList.printAll();
        } catch (Exception e){
        	System.out.println("error" + e.getMessage());
        }
        
        scanner.close();
    }
}