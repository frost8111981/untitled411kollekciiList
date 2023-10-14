package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> task = new ArrayList<>();
        task.add("Выгул собаки");
        task.add("Приготовить еду");
        task.add("Сходить в магазин");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("Выберите действие (для завершения введите end)");
            System.out.println(" 1. Добавить задачу\n 2. Вывести список задач\n 3. Удалить задачу");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена. Список задач: ");
            } else {
                switch (Integer.parseInt(input)) {
                    case 1:
                        task.add(scanner.nextLine());
                        break;
                    case 2:
                        for (String s : task) {
                            System.out.println(s);
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Выберите задачу для удаления");
                            task.remove(Integer.parseInt(scanner.nextLine()) - 1);
                        }catch (IndexOutOfBoundsException o){
                            System.out.println("Такой задачи не существует");
                        }
                        break;

                }
            }
            for (String s : task) {
                System.out.println(s);
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
