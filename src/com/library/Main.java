package com.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book(1, "Wings Of Fire", "Dr.A.P.J Abdul Kalam"));
        library.addBook(new Book(2, "You Can Win ", "Shiv Khera"));
        library.addBook(new Book(3, "The Habit of Winning", "Prakash Iyer"));
        library.addBook(new Book(3, "Do Epic Shit", "Ankur Warikoo"));

        int choice;

        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    library.issueBook(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Book ID to return: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
