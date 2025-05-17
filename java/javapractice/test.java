
// OBJECT ORIENTED PROGRAMMING-
// #1 Design a Java application for a Banking System with the following requirements:
    // - Create a base class Account with properties: accountNumber, accountHolder, balance
    // - Implement subclasses SavingsAccount and CurrentAccount, each with unique behaviors.
    // - Override the withdraw() method in subclasses to enforce different withdrawal policies.
    // - Implement encapsulation to ensure balance cannot be modified directly.

    // public class test{
    //     public static void main(String args[]){

    //         SavingsAccount act = new SavingsAccount();
    //         act.setBalance(8999);
    //             System.out.println("Balance before withdrawal: " + act.getBalance());

    //         act.withdraw(500);
    //             System.out.println("Balance after withdrawal: " + act.getBalance());
    //     }
    // }

    // class Account{
    //     int accountNumber;
    //     String accountHolder;
    //     protected int balance;

    //     public int getBalance(){
    //         return balance;
    //     }
    //     public void setBalance(int balance){
    //         this.balance = balance;
    //     }

    //     public void withdraw(int amount) {
    //         System.out.println("Your money is withdrawn from your account.");
    //     }

    // }
    // class SavingsAccount extends Account{
    //     @Override
    //     public void withdraw(int amount){
    //         if(amount > balance){
    //             System.out.println("Insufficient balance");
    //         } 
    //         else {
    //             balance -= amount;
    //             System.out.println("Withdrawal successful! "+ balance);
    //         }
    //     }
    // }
    // class CurrentAccount extends Account{
    //     @Override
    //     public void withdraw(int amount){
    //         System.out.println("Your money is Withdraw from currentAccount");
    //     }
    // }
//

//  #2 Design a basic Library System using OOP principles:
    // - Create a class Book with attributes title, author, and isAvailable.
    // - Implement a class Library that maintains a collection of books using a List<Book>.
    // - Add methods for adding books, borrowing a book, and returning a book.
    // - Use encapsulation and inheritance effectively

    // import java.util.ArrayList;

    // public class test{
    //     public static void main(String args[]){
    //         Library library = new Library();

    //         Book book1 = new Book("Hero", "John");
    //         Book book2 = new Book("Zero", "SRK");

    //         library.addBook(book1);
    //         library.addBook(book2);

    //         library.displayBook();
    //         library.searchBook("Hero");
    //     }
    // }

    // class Library{
    //     private ArrayList<Book> books;

    //     public Library(){
    //         books = new ArrayList<>();
    //     }

    //     public void addBook(Book book){
    //         books.add(book);
    //         System.out.println(book.getTitle() + " is added to Library");
    //     }

    //     public Book searchBook(String title){
    //         for(Book book: books){
    //             if(book.getTitle().equalsIgnoreCase(title)){
    //                 return book;
    //             }
    //         }
    //         return null;
    //     }

    //     public void displayBook(){
    //         System.out.println("Books in Library: ");
    //         for(Book book: books){
    //             System.out.println(book.getTitle() + " by " +  book.getAuthor()+ " is available: "+ book.isAvailable());
    //         }
    //     }
    // }
    // class Book{
    //     private String title;
    //     private String author;
    //     protected Boolean isAvailable;

    //     public Book(String title, String author){
    //         this.title = title;
    //         this.author = author;
    //         this.isAvailable = true;
    //     }

    //     public String getTitle(){
    //         return title;
    //     }
    //     public String getAuthor(){
    //         return author;
    //     }
    //     public Boolean isAvailable (){
    //         return isAvailable;
    //     }

    //     public void borrowBook(){
    //         if(isAvailable){
    //             isAvailable = false;
    //             System.out.println("Book can be borrowed");
    //         }
    //         else{
    //             System.out.println("Book is already borrowed");
    //         }
    //     }

    //     public void returnBook(){
    //         if(!isAvailable){
    //             isAvailable = true;
    //             System.out.println("Book is returned");
    //         }
    //     }
    // }
//

// #3 Develop a *Salary Calculator* system for employees:
    // - Create an Employee class with attributes name, baseSalary, and bonusPercentage.
    // - Implement FullTimeEmployee and PartTimeEmployee classes that extend Employee.
    // - Override a method calculateSalary() in both subclasses to apply different salary structures.
    // - Apply *polymorphism* and *method overriding*.

    // public class test{
    //     public static void main(String args[]){
    //         FullTimeEmployee employe1 = new FullTimeEmployee("Pratham", 9999);

    //         System.out.println(employe1.getName() +" Base Salary: "+ employe1.getBaseSalary());
    //         System.out.println(employe1.getName() +" Bonus Percentage : "+ employe1.getBonusPer());

    //         employe1.calculateSalary();
    //     }
    // }

    // class Employee{
    //     protected String name;
    //     protected int baseSalary;
    //     protected int bonusPercentage;

    //     public Employee(String name, int baseSalary){
    //         this.name = name;
    //         this.baseSalary = baseSalary;
    //         this.bonusPercentage = 5;
    //     }

    //     public String getName()  {  return name; }
    //     public int getBaseSalary() {  return baseSalary; }
    //     public int getBonusPer() { return bonusPercentage; }

    //     public void calculateSalary(){
    //         System.out.println("Salary Calculated");
    //     }
    // }

    // class FullTimeEmployee extends Employee{
    //     public FullTimeEmployee(String name, int baseSalary){
    //         super(name, baseSalary);
    //     }

    //     @Override
    //     public void calculateSalary(){
    //         if(baseSalary > 0){
    //             int totalSalary = baseSalary + (baseSalary * bonusPercentage / 100); // Calculate total salary
    //             System.out.println("Salary Calculated: " + totalSalary);
    //         }
    //         else {
    //             System.out.println("Technical Error");
    //         }
    //     }
    // }
    // class PartTimeEmployee extends Employee{
    //     public PartTimeEmployee(String name, int baseSalary) {
    //         super(name, baseSalary);
    //     }

    //     public void calculateSalary(){
    //         System.out.println("Salary Calculated"+ baseSalary);
    //     }
    // }
//

// #4 Design an *Online Quiz System* where multiple players attempt a quiz at the same time:
    // - Implement an interface Quiz with a method startQuiz().
    // - Use a QuizMaster class to handle quiz operations.
    // - Allow multiple participants to play concurrently using **multithreading (Runnable).
    // - Keep track of scores dynamically.

    // import java.util.Random;
    // public class test{
    //     public static void main(String args[]){

    //         Thread player1 = new Thread(new QuizMaster("Player 1"));
    //         Thread player2 = new Thread(new QuizMaster("Player 2"));
    //         Thread player3 = new Thread(new QuizMaster("Player 3"));

    //         player1.start();
    //         player2.start();
    //         player3.start();


    //     }
    // }

    // interface Quiz{
    //     void startQuiz();
    // }
    // class QuizMaster implements Quiz, Runnable{
    //     private String playerName;
    //     private int score;

    //     public QuizMaster(String playerName){
    //         this.playerName = playerName;
    //         this.score = 0;
    //     }

    //     @Override
    //     public void startQuiz() {
    //         System.out.println(playerName + " Starting the quiz...");
    //         play();
    //     }

    //     @Override
    //     public void run() {
    //         startQuiz();
    //     }
    //     public void play() {
    //         Random random = new Random();
    //         for (int i = 0; i < 5; i++) {
    //             try {
    //                 Thread.sleep(random.nextInt(2000));
    //             } catch (InterruptedException e) {
    //                 e.printStackTrace();
    //             }
    //             score += random.nextInt(3);
    //             System.out.println(playerName + " answered question " + (i + 1) + " | Score: " + score);
    //         }

    //         System.out.println(playerName + " Finished the quiz with score :->" + score);
    //     }

    // }
//


// EXCEPTION HANDELING-
// #1 Custom Exception for Invalid Bank Transactions
    // - Design a BankAccount class with attributes: accountNumber, accountHolder, balance.
    // - Create a custom exception InsufficientFundsException.
    // - Implement a method withdraw(int amount) that throws InsufficientFundsException if balance is insufficient

    // public class test{
    //     public static void main(String args[]){

    //         BankAccount acc1 = new BankAccount(9101, "Rohny");
    //         acc1.setBalance(999);

    //         try {
    //             acc1.withdraw(5090);
    //         } 
    //         catch (InsufficientFundsException e) {
    //             System.out.println("Transaction Failed: " + e.getMessage());
    //         }

    //     }
    // }

    // class BankAccount{
    //     private int accountNumber;
    //     private String accountHolder;
    //     private int balance;

    //     public BankAccount(int accountNumber, String accountHolder){
    //         this.accountNumber = accountNumber;
    //         this.accountHolder = accountHolder;
    //     }

    //     public int getBalance(){
    //         return balance;
    //     }
    //     public void setBalance(int balance){
    //         this.balance = balance;
    //     }

    //     public void withdraw(int amount) throws InsufficientFundsException {
    //         if(balance < amount){
    //             throw new InsufficientFundsException("Insufficent balance "+ balance);
    //         } else {
    //             balance = balance - amount;
    //             System.out.println("Withdrawal successful! Remaining Balance: " + balance);
    //         }
    //     }
    // }
    // class InsufficientFundsException extends Exception{
    //     public InsufficientFundsException(String message){
    //         super(message);
    //     }
    // }
// 

// #2 E-Commerce Order Processing (Handling Multiple Exceptions)
    // - Create a class OrderProcessor that takes an orderId, paymentStatus, and itemAvailability.
    // - Handle multiple exceptions:
    // - PaymentFailedException if payment status is "Failed".
    // - ItemOutOfStockException if item is unavailable.
    // - Use a multi-catch block to process different errors.

    // public class test{
    //     public static void main(String args[]){
    //         OrderProcessor order = new OrderProcessor(1019);
    //         try {
    //             order.makePayment("Failed");
    //             order.itemAvailable(false);
    //         } catch (PaymentFailedException e){
    //             System.out.println("Order Processing Failed: " + e.getMessage());
    //         } catch (ItemOutOfStockException e){
    //             System.out.println("Order Processing Failed: " + e.getMessage());
    //         }
    //     }
    // }

    // class OrderProcessor{
    //     private int orderId;
    //     private String paymentStatus;
    //     private Boolean itemAvailability;

    //     public OrderProcessor(int orderId){
    //         this.orderId = orderId;
    //         this.paymentStatus = "Successfull";
    //         this.itemAvailability = true;
    //     }

    //     public int getOrderID(){
    //         return orderId;
    //     }
    //     public String getPaymentStatus(){
    //         return paymentStatus;
    //     }
    //     public Boolean getItemAvailability(){
    //         return itemAvailability;
    //     }

    //     public void makePayment(String paymentStatus) throws PaymentFailedException{
    //         if(this.paymentStatus.equals(paymentStatus)){
    //             System.out.println("Payment Successfull");
    //         }
    //         else{
    //             throw new PaymentFailedException("Transaction Error! Payment : "+ paymentStatus);
    //         }
    //     }
    //     public void itemAvailable(Boolean type) throws ItemOutOfStockException{
    //         if(type){
    //             System.out.println("Item is available : ");
    //         }
    //         else{
    //             throw new ItemOutOfStockException("Item is unavailable : Out of stock!");
    //         }
    //     }
    // }
    // class PaymentFailedException extends Exception{
    //     public PaymentFailedException (String message){
    //         super(message);
    //     }
    // }
    // class ItemOutOfStockException extends Exception{
    //     public ItemOutOfStockException (String message){
    //         super(message);
    //     }
    // }
//

// 3. Student Grading System with Exception Handling
    // - Design a Student class with name and marks.
    // - Implement a method calculateGrade() that:
    // - Throws a InvalidMarksException if marks are negative or above 100.
    // - Assigns grades based on valid marks (A, B, C, etc.).
    // - Use try-catch to handle invalid inputs.
    // Goal:
    // Prevent incorrect marks entry using custom validation exceptions.

    // public class test{
    //     public static void main(String args[]){
    //         Student student1 = new Student("Rocky", 178);
    //         try {
    //             student1.calculateGrade();
    //         } catch(InvalidMarksException e){
    //             System.out.println("Grade can't be calculated "+ e.getMessage());
    //         }
    //     }
    // }

    // class Student{
    //     private int marks;
    //     private String name;

    //     public Student(String name, int marks){
    //         this.name = name;
    //         this.marks = marks;
    //     }

    //     public void calculateGrade() throws InvalidMarksException{
    //         if(marks < 0 || marks > 100){
    //             throw new InvalidMarksException("Please Enter valid marks :"+ marks);
    //         } else{
    //             if(marks >= 90 && marks <= 100){
    //                 System.out.println("Assigned Grade: A");
    //             } else if(marks >= 80 && marks < 90){
    //                 System.out.println("Assigned Grade: B");
    //             } else if(marks >= 70 && marks < 80){
    //                 System.out.println("Assigned Grade: C");
    //             } else if(marks >= 60 && marks < 70){
    //                 System.out.println("Assigned Grade: D");
    //             } else{
    //                 System.out.println("Assigned Grade: E");
    //             }
    //         }
    //     }
    // }
    // class InvalidMarksException extends Exception{
    //     public InvalidMarksException (String message){
    //         super(message);
    //     }
    // }
// 


// COLLECTION FRAMEWORK-


// MULTITHREADING-
// 1. Multi-threaded Bank Transaction System (Deadlock Prevention)
    // - Create a BankAccount class with attributes balance and accountNumber.
    // - Allow multiple users to withdraw money concurrently.
    // - Implement a deadlock-free mechanism using synchronized or ReentrantLock.
    // - Throw InsufficientFundsException if balance is insufficient.
    // import java.util.concurrent.locks.ReentrantLock;

    // public class test{
    //     public static void main(String args[]){
    //         BankAccount account = new BankAccount(7999, 90911);

    //         Thread t1 = new Thread(account, "User-1");
    //         Thread t2 = new Thread(account, "User-2");

    //         t1.start();
    //         t2.start();
    //     }
    // }

    // class BankAccount implements Runnable{
    //     private int balance;
    //     private int accountNumber;
    //     private final ReentrantLock lock = new ReentrantLock();

    //     public BankAccount(int balance, int accountNumber){
    //         this.balance = balance;
    //         this.accountNumber = accountNumber;
    //     }

    //     public int getBalance(){ return balance; }
    //     public int getAccountNumber(){ return accountNumber; }

    //     public void withdrawMoney(int amount) throws InsufficientFundsException{
    //         lock.lock();
    //         try {
    //             if(amount <= balance){
    //                 balance -= amount;
    //                 System.out.println(Thread.currentThread().getName() + " withdrew " + amount +
    //                                    " | Remaining balance: " + balance);
    //             } 
    //             else {
    //                 throw new InsufficientFundsException("Insufficient funds! You tried to withdraw: " + amount);
    //             }
    //         } 
    //         finally{
    //             lock.unlock();
    //         }
    //     }

    //     @Override
    //     public void run(){
    //         try{
    //             withdrawMoney(3000);
    //         } catch (InsufficientFundsException e){
    //             System.out.println(Thread.currentThread().getName() + ": " + e.getMessage());
    //         }
    //     }
    // }
    // class InsufficientFundsException extends Exception {
    //     public InsufficientFundsException(String message) {
    //         super(message);
    //     }
    // }
//

// 2. Producer-Consumer Problem with Exception Handling
// - Simulate a food delivery system using producer-consumer logic.
// - Restaurant (Producer) prepares food and places it in a shared queue.
// - Customer (Consumer) picks up food from the queue.
// - If food is unavailable, throw FoodOutOfStockException.
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class test{
    public static void main(String args[]){
        FoodDelivery foodDelivery = new FoodDelivery();

        Thread restaurant = new Thread(() -> {
            foodDelivery.preparedFood("Pizza");
            foodDelivery.preparedFood("Burger");
        });

        Thread customer = new Thread(() -> {
            try {
                foodDelivery.pickUpFood();
                foodDelivery.pickUpFood();
                foodDelivery.pickUpFood(); // Third attempt may fail
            } catch (FoodOutOfStockException e) {
                System.out.println(e.getMessage());
            }
        });

        restaurant.start();
        customer.start();
    }
}

class FoodDelivery{ 
    // private final BlockingQueue<String> foodQueue = new LinkedBlockingQueue<>(5);
    private final BlockingQueue<String> foodQueue = new LinkedBlockingQueue<>(5);

    public void preparedFood(String foodItem){
        try{
            foodQueue.put(foodItem);
            System.out.println("Restaurant prepared: " + foodItem);
        }
        catch (InterruptedException e){
            System.out.println("Error while preparing food");
        }
    }

    public void pickUpFood() throws FoodOutOfStockException{
        try{
            String foodItem = foodQueue.take();
            System.out.println("Customer picked up: " + foodItem);
        } catch (InterruptedException e) {
            throw new FoodOutOfStockException("Food is out of stock!");
        }
    }
}

class FoodOutOfStockException extends Exception{
    public FoodOutOfStockException(String message){
        super(message);
    }
}

