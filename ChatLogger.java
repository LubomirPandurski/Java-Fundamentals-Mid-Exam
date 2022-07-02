package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        List<String> chat = new ArrayList<>();
        while(true){
            command = scanner.nextLine();
            String [] data = command.split(" ");
            if(command.equals("end")) {
                break;
            }
            switch (data[0]){
                case "Chat":
                    chat.add(data[1]);
                    break;
                case "Delete":
                    String message = data[1];
                    if(chat.contains(message)){
                        chat.remove(message);
                    }
                    else{
                        break;
                    }
                break;
                case "Edit":
                    String oldmessage = data[1];
                    String edited = data[2];
                    if(chat.contains(oldmessage)){
                        int position = chat.indexOf(oldmessage);
                        chat.set(position, edited);
                        chat.remove(oldmessage);
                        break;
                    }
                    else{
                        break;
                    }
                case "Pin":
                    String pinnedElement = data[1];
                    if(chat.contains(pinnedElement)){
                        int pinnedElementIndex = chat.indexOf(pinnedElement);
                        chat.add(pinnedElement);
                        chat.remove(pinnedElementIndex);
                        break;
                    }else{
                        break;
                    }
                case "Spam":
                    for (int i = 1; i < data.length; i++) {
                        chat.add(data[i]);
                    }
                    break;
            }
        }
        for (String chats:chat){
            System.out.println(chats);
        }
    }
}
