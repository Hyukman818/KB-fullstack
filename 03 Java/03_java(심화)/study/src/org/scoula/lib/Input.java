package org.scoula.lib;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static String read(String title){
        System.out.print(title);
        return scanner.nextLine();
    }

    public static String read(String title, String defaultValue){
        System.out.print(defaultValue);

        String userInput = scanner.nextLine();
        if(userInput.isEmpty()){
            return defaultValue;
        }
        else {
            return userInput;
        }
    }

    public static int readInt(String title){
        System.out.print(title);
        return Integer.parseInt(scanner.nextLine());
    }

    boolean confirm(String title, boolean defaultValue){
        if(defaultValue == true){
            System.out.print(title + " (Y/n): ");
        }
        else{
            System.out.print(title + "(y/N): ");
        }

        String userInput = scanner.nextLine();
        if(userInput.isEmpty()){
            return defaultValue;
        }

        // 솔직히 이 return문 왜 하는지 모르겠음
        return userInput.equalsIgnoreCase("y");
    }
}
