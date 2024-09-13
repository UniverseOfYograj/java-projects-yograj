# java-projects-yograj
This repository contains a collection of Java projects and exercises that I've worked on, including applications, algorithms, and small code snippets. Each project is organized into separate directories and demonstrates my progress and learning in Java programming. Feel free to explore and provide feedback!

# Library Management System

## Description

The **Library Management System** is a simple Java-based project that allows for the management of a collection of books in a library. It provides functionalities for adding books, removing books, and retrieving details about the library collection. This system uses a `HashSet` to store books, ensuring no duplicate entries exist, and includes methods to display and manage the data effectively.

## Features

- **Add Books**: Add new books to the library, ensuring no duplicates are allowed.
- **Delete Books**: Remove specific books from the library.
- **View All Books**: Display all the books currently available in the library.
- **Book Count**: Get the total number of books in the library.
- **`HashSet` for Book Storage**: Efficient storage and management of books using Java's `HashSet`.
- **Override Methods**: Custom `equals()`, `hashCode()`, and `toString()` methods to define book uniqueness and how books are represented in output.

## Technologies Used

- **Programming Language**: Java
- **Data Structures**: `HashSet`
- **IDE**: Any Java-supported IDE (Eclipse, IntelliJ IDEA, VS Code, etc.)

## Project Structure

```
|-- src/
|   |-- Book.java           # Class for Book entity with attributes like book name, author, and price.
|   |-- Library.java        # Contains Library class to manage books using a HashSet.
|   |-- UseLibrary.java     # Main class to demonstrate the functionality of the Library class.
|-- README.md
```

## How It Works

### 1. **Book Class (`Book.java`)**:
   - Represents a book with the following attributes:
     - `bookName`: Name of the book.
     - `author`: Author of the book.
     - `price`: Price of the book.
   - **`equals()`**: Determines if two `Book` objects are the same based on their `bookName`, `author`, and `price`.
   - **`hashCode()`**: Generates a unique hash for each book, ensuring `HashSet` can manage uniqueness correctly.
   - **`toString()`**: Provides a string representation of a `Book` object, used for easy output of book details.

### 2. **Library Class (`Library.java`)**:
   - Manages a collection of books using a `HashSet<Book>` to store `Book` objects.
   - **Methods**:
     - `addBook(Book b)`: Adds a book to the `HashSet`. Returns `true` if the book is successfully added (i.e., it’s not a duplicate).
     - `getBookCount()`: Returns the total number of books in the library.
     - `getAllBooks()`: Returns the `HashSet` containing all the books in the library.
     - `Delete(Book b)`: Removes the specified book from the library and provides confirmation.

### 3. **UseLibrary Class (`UseLibrary.java`)**:
   - Contains the `main` method to demonstrate the functionality of the Library Management System.
   - Example books are created and added to the library. The program showcases how to add, retrieve, and delete books from the `Library`.

## Example Code

```java
// Example of adding books to the library
Book b1 = new Book("Life is a myth", "Yograj", 99);
Book b2 = new Book("Existence of God", "Yograj", 999);
Library library = new Library();
library.addBook(b1);
library.addBook(b2);

// Retrieve all books
System.out.println("All books in the library: " + library.getAllBooks());

// Remove a book
library.Delete(b1);
System.out.println("Book removed. Remaining books: " + library.getAllBooks());
```

## HashSet Explanation

The **`HashSet`** data structure is used to store books in the library. This ensures that each book is unique (no duplicates). A `HashSet` provides constant-time performance for basic operations like adding and removing elements, making it an efficient choice for managing the collection.

Key methods:
- **`add()`**: Adds an element to the `HashSet` only if it doesn't already exist.
- **`remove()`**: Removes a specified element if it is found in the `HashSet`.
- **`size()`**: Returns the total number of elements in the `HashSet`.

In your `Library` class, books are added and removed using these methods. The `equals()` and `hashCode()` methods in the `Book` class ensure that two books are considered equal if they have the same name, author, and price, which prevents duplicate entries in the `HashSet`.

## Usage

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/UniverseOfYograj/java-projects-yograj.git
   ```

2. Navigate to the `LibraryManagementSystem` folder and open the project in your preferred IDE.

3. Compile and run the `UseLibrary.java` file to see the system in action.

4. Follow the prompts in the `main()` method to add, view, and delete books.

## Future Enhancements

- Implement a graphical user interface (GUI) to make the system more user-friendly.
- Integrate a database (e.g., MySQL, SQLite) to store book data persistently.
- Add functionality to update book details.
- Implement search features to find books by name, author, or price range.

## License

This project is open source and available under the [MIT License](LICENSE).
