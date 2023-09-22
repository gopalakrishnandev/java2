package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class arrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean flag = true;
        ArrayList<String> todoList = new ArrayList<>();

        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(todoList);
                case 2 -> removeItems(todoList);
                default -> flag =false;
            }
            todoList.sort(Comparator.naturalOrder());
            System.out.println(todoList);
        }
    }

    private static void addItems(ArrayList<String> todoList){
        System.out.println("Add item(s) [seprate items by comma]:");
         String[] items = scanner.nextLine().split(",");
         todoList.addAll(List.of(items));

         for(String i:items){
             String trimmed  = i.trim();
             if(todoList.indexOf(trimmed) < 0){
                    todoList.add(trimmed);
             }
         }
    }

    private static void removeItems(ArrayList<String> todoList){
        System.out.println("Remove item(s) [seprate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for(String i:items){
            String trimmed  = i.trim();
                todoList.remove(trimmed);
        }
    }
    private static void printActions(){
        String textBlock  = """
                
                Available actions:
                0 - shutdown
                1 - add item
                2 - remove item
                Enter a number:
                """;
        System.out.println(textBlock + " ");
    }
}
