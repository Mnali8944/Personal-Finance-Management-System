1. Introduction to the System
The Personal Finance Management System (PFMS) is a Java-based application designed to assist
individuals in managing their financial information, including bank accounts, transactions, and
tax calculations. The system aims to provide users with a convenient and secure platform to
track their financial activities and make informed decisions.

2. Classes, their attributes, and methods used
   
2.1 User Class
- Attributes:
- name: String
- city: String
- phoneNumber: String
- Methods:
- display(): Captures user information through user input and displays it.
- purpose(): Prints a personalized message explaining the purpose of the application.
  
2.2 BankAccount Class
- Attributes:
- accountType: String
- balance: double
- Methods:
- deposit(double amount): Deposits a specified amount into the account.
- withdraw(double amount): Withdraws a specified amount from the account.
- getBalance(): Retrieves the current balance.
- show(): Displays a menu for users to perform deposit, withdrawal, and balance check
operations.

2.3 AccountBookRun Class
- Attributes:
- connecting: ArrayList<AccountBookRegister>
- input: Scanner
- Methods:
- addAccount(): Accepts user input to add a bank account to the system.
- viewAccount(): Displays the list of existing bank accounts.
- editAccount(): Allows users to edit the details of a specific bank account.
- deleteAccount(): Deletes a bank account based on user input.
- displayMenu(): Provides a menu for users to interact with the PFMS functionalities.
2.4 AccountBookRegister Class
- Attributes:
- nameOftheBank: String
- nameOftheBranch: String
- accountNumber: String
- email: String
- Methods:
- Getters and setters for each attribute.
- toString(): Generates a formatted string representation of the account information.
  
2.5 TransactionChecking Class
- Attributes:
- transactionDate: date
- transactionTime: Time
- isComplete: boolean
- Methods:
- completeTransaction(): Marks a transaction as complete.
- isComplete(): Returns the status of transaction completion.
- toString(): Provides a formatted string representation of the transaction date.
- 
2.6 TaxCalculator2024 Class
- Methods:
- calculateTax(): Implements the TaxCalculator interface to calculate income tax based on user
input.

2.7 Date Class
- Attributes:
- day: int
- month: int
- year: int
- Methods:
- Getters and setters for each attribute.
- getFormatDate(): Returns a formatted date string.

3. Used Cases of OOP Concepts in our System
In this code, several Object-Oriented Programming (OOP) principles have been used. Here are
some key principles and examples:

1. Encapsulation:
- Classes like User, BankAccount, TaxCalculator2024, AccountBookRun, AccountBookRegister,
TransactionChecking, and date encapsulate data and related methods within themselves.
- Attributes in each class are encapsulated, limiting direct access and modification. Getters and
setters provide controlled access to class attributes.

2. Inheritance:
- AccountBookRegister extends AccountBookRun, indicating an inheritance relationship.
- Inheritance is not extensively used in the current implementation. However, the concept can
be applied for future expansion, such as creating specialized account types that inherit from the
BankAccount class.

3. Polymorphism:
- Polymorphism is demonstrated in the calculateTax() method, which can be overridden by
different implementations of the TaxCalculator interface, based on the input parameters.

4. Abstraction:
- Methods like deposit, withdraw, calculateTax, displayMenu provide abstraction by hiding the
internal implementation details and exposing only necessary functionalities.

5. Constructor Overloading:
- The classes, such as User, date, and AccountBookRegister, have multiple constructors,
allowing different ways to initialize objects.

6. Method Overriding:
- The calculateTax method in TaxCalculator2024 overrides the method from the TaxCalculator
interface.
These principles contribute to building modular, maintainable, and extensible code following
OOP principles.

4. Modification for the Initial Plan and Reasons
Reasons:
1. Enhanced User Interface:
- A more interactive user interface was added to the BankAccount class, allowing users to
perform operations seamlessly.
2. Extended Financial Features:
- The initial plan did not include comprehensive tax calculation features. The
TaxCalculator2024 class was added to address this, enabling users to calculate income tax
based on their filing status and taxable income.
Challenges:
- Integrating the tax calculation functionality required careful consideration of user input and
adherence to tax calculation rules.
- Programming errors due to lack of human error.
Solutions:
- A modular approach was adopted, separating tax calculation into a distinct class implementing
an interface. This ensured maintainability and ease of future enhancements.

5. Teamwork
Effective teamwork was crucial in developing the PFMS. Regular team meetings, collaborative
decision-making, and efficient communication facilitated the integration of individual
components into a cohesive and functional system. Each team member played a vital role in
ensuring the success of the project.

7. Conclusion
In conclusion, the Personal Finance Management System demonstrates the effective
application of OOP principles to create a versatile and user-friendly financial management
solution. The system's modular design and thoughtful incorporation of tax calculation features
make it a valuable tool for individuals seeking efficient financial tracking and planning.

Team:
1) M. N. M. Nusrath Ali
2) N. M. ILHAM 
3) K. M. NASFAN
4) M. Y. M. AATHIL 
