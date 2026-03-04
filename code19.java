/* write a program to create a class called library that has method to add and remove books from library, 
arrays book[],book_id[],author[], if book is removed then author as well as book id also removed*/
import java.util.*;

class Library {
    String[] books = new String[100];
    String[] authors = new String[100];
    int[] bookIds = new int[100];
    int count = 0; // number of books stored

    // Add a book
    void addBook(int id, String name, String author) {
        bookIds[count] = id;
        books[count] = name;
        authors[count] = author;
        count++;
        System.out.println("Book added successfully!");
    }

    // Remove a book by ID
    void removeBook(int id) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (bookIds[i] == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Book not found!");
            return;
        }
        // shift elements left
        for (int i = index; i < count - 1; i++) {
            bookIds[i] = bookIds[i + 1];
            books[i] = books[i + 1];
            authors[i] = authors[i + 1];
        }
        count--;
        System.out.println("Book removed successfully!");
    }

    // Display all books
    void displayBooks() {
        if (count == 0) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("\nBooks in Library:");
        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + bookIds[i] + ", Name: " + books[i] + ", Author: " + authors[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library li = new Library();

        while (true) {
            System.out.println("\n1. Add Book\n2. Remove Book\n3. Display Books\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();
                li.addBook(id, name, author);
            } else if (choice == 2) {
                System.out.print("Enter Book ID to remove: ");
                int id = sc.nextInt();
                li.removeBook(id);
            } else if (choice == 3) {
                li.displayBooks();
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}

