
import java.text.NumberFormat;
import java.util.Scanner;

public class Loan {
    private String name;
    private String dateofBirth;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String phoneNumber;
    private double salary;
    private String isEmployed;

    public Loan(String name, String dateofBirth, String address, String city, String state, int zipCode,
            String phoneNumber, double salary, String isEmployed) {
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.isEmployed = isEmployed;
    }

    public String getName() {
        return name;
    }

    public String getDateOfbirth() {
        return dateofBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public String isEmployed() {
        return isEmployed;
    }

    public void displayInfo() {
       
        // this.dateofBirth = dateofBirth;
        // this.address = address;
        // this.city = city;
        // this.state = state;
        // this.zipCode = zipCode;
        // this.phoneNumber = phoneNumber;
        // this.salary = salary;
        // this.isEmployed = isEmployed;

        System.out.println("Name: " + this.getName());
        System.out.println("Date of Birth: " + this.getDateOfbirth());
        System.out.println("Adress: " + this.getAddress());
        System.out.println("City: " + this.getCity());
        System.out.println("State: " + this.getState());
        System.out.println("Zip Code: " + this.getZipCode());
        System.out.println("Phone Number: " + this.getPhoneNumber());

    }

    public void collectInfo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        this.name = scanner.nextLine();
        System.out.println("Please enter your date of birth: ");
        this.dateofBirth = scanner.nextLine();
        System.out.println("Please enter your address: ");
        this.address = scanner.nextLine();
        System.out.println("Please enter your city: ");
        this.city = scanner.nextLine();
        System.out.println("Please enter your state: ");
        this.state = scanner.nextLine();
        System.out.println("Please enter your zip code: ");
        this.zipCode = scanner.nextInt();
        System.out.println("Please enter your phone number: ");
        this.phoneNumber = scanner.next();

        // address = address;
        // this.city = city;
        // this.state = state;
        // this.zipCode = zipCode;
        // this.phoneNumber = phoneNumber;
        // this.salary = salary;
        // this.isEmployed

    }

    public void homeLoan() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        // Employment Question
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Are you employed? ");
        String isEmployed = Scanner.nextLine();
        if (isEmployed.equalsIgnoreCase("yes"))

            System.out.println("Please enter your Salary?");
        double salary = Scanner.nextDouble();
        System.out.println("Your salary is: " + currency.format(salary));

        if (salary >= 40000 && isEmployed.equalsIgnoreCase("yes")) {

            System.out.println("Congatulations! You are eligible for a home loan.");
            System.out.println("Let's start the application process.");
            System.out.println("Please provide the following information:");

            // Loan amount
            System.out.println("How much would you like to borrow?");
            System.out.println("Please enter the loan amount:");
            double principal = Scanner.nextDouble();
            System.out.println(" Loan amount requested: " + currency.format(principal));

            // Loan term
            System.out.println("How many years would you like to take to repay the loan?");
            System.out.println("Please enter the loan term in years:");
            double loanTerm = Scanner.nextDouble();
            System.out.println("Loan term requested: " + loanTerm + " years");

            double interestRate = 0.05;
            System.out.println("Your interest rate is " + percent.format(interestRate));

            System.out.println("Loan term requested: " + loanTerm + " years");

            // Calculate monthly payment

            double monthlyInterestRate = interestRate / 12;
            double numberOfPayments = loanTerm * 12;
            double mortgage = (principal * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

            System.out.println("Just to confirm");
            displayInfo();
            System.out.println(" Loan amount requested: " + currency.format(principal));
            System.out.println("Loan term requested: " + loanTerm + " years");
            System.out.println("Your interest rate is " + percent.format(interestRate));

            System.out.println("Application Approved!");
            System.out.println("Here are the details of your loan:");
            System.out.println(" Loan amount requested: " + currency.format(principal));
            System.out.println("Loan term requested: " + loanTerm + " years");

            System.out.println("Your monthly payment would: " + currency.format(mortgage));

        } else {
            System.out.println("Sorry you did not qualify for a home loan.");
            System.out.println("Thank you for Trying Unix Banking Solutions!");
        }

    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Welcome to Unix Banking Solutions!");
        System.lineSeparator();
        System.out.println("Would You like to apply for a loan?");
        String applyforLoan = Scanner.nextLine();

        if (applyforLoan.equalsIgnoreCase("yes")) {

            System.out.println("What type of loan would you like to apply for? (home/personal/auto)");
            String loanType = Scanner.nextLine();
            

            if (loanType.equalsIgnoreCase("home")) {
                Loan loan = new Loan("", "", "", "", "", 0, "", 0.0, "");
                loan.collectInfo();
                loan.homeLoan();
            } else if (loanType.equals("personal")) {
                System.out.println("Personal loans are currently not available.");
                System.out.println("Thank you for trying Unix Banking Solutions!");
                System.out.println("Please Visit us again!");

            } else if (loanType.equals("auto")) {
                System.out.println("Auto loans Are currently not available.");
                System.out.println("Thank you for trying Unix Banking Solutions!");
                System.out.println("Please Visit us again!");

            } else { 
                System.out.println("Thank you for trying Unix Banking Solutions!");
                System.out.println("Please Visit us again!");

            }
        } else {
            System.out.println("Thank you for trying Unix Banking Solutions!");
            System.out.println("Please Visit us again!");

        }

    }
}
