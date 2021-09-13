package conditionals;

/*
EXERCISE:
A Simple Car Loan Payment Calculator
Let’s combine a few of the concepts that you have learned so far: conditionals, Boolean expressions, and arithmethic expressions.

In this project, you will write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan. The program will include the following:

Car loan amount
Interest rate of the loan
Length of the loan (in years)
Down payment
The instructions provided are general guidelines. Upon completion of the project, feel free to add functionality of your own.

If you get stuck during this project or would like to see an experienced developer work through it, click “Get Unstuck“ to see a project walkthrough video.
 */

/* TASKS:
1.
Create an int variable called carLoan and set it equal to 10000.

2.
Next, create an int variable called loanLength and set it equal to 3. This will represent a loan length of 3 years.

3.
Now create an int variable called interestRate and set it equal to 5. This will represent an interest rate of 5% on the loan.

4.
Next, create an int variable called downPayment and set it equal 2000. This will represent the down payment provided by a user for this car purchase.

5.
Let’s build in some requirements that would prevent a buyer from taking out an invalid car loan. Write an if statement that checks whether the loan length is less than or equal to zero or whether the interest rate is less than or equal to zero.

6.
Next, inside of the if statement, print out a helpful error message to the user. For example, you can print out something like: Error! You must take out a valid car loan.

7.
What if the down payment is more than the price of the car? Add to the if statement and use else if to check whether the down payment is greater than or equal to the car loan.

8.
Inside of the else if block, print out a helpful message to the user about the down payment and car loan amounts. For example, you can print out something like: The car can be paid in full.

9.
Finally, if none of the previous Boolean expressions evaluate to true, calculate the monthly payment in an else block.

10.
Inside of the else block, create an int variable called remainingBalance and set it equal to carLoan minus downPayment.

11.
Since we need the monthly payment, we must convert the loan length from years to months. On the next line, create an int variable called months and set it equal to loanLength times 12.

12.
Create an int variable called monthlyBalance and set it equal to remainingBalance divided by months. This represents the monthly payment without interest included.

13.
The user needs to pay interest on the loan borrowed. Create an int variable called interest and set it equal to the monthly balance times the interest rate, divided all by 100.

14.
Calculate the final monthly payment. Create an int variable called monthlyPayment and set it equal to the monthly balance plus the interest.

15.
On the next line, print out the monthly payment. If you correctly completed this project, the console should print out 233 as the monthly payment.

16.
Add comments near the top of the program that describe what the program does.
 */

public class CarLoan {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment) {

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }

        this.carLoan = carLoan;
        this.loanLength = loanLength;
        this.interestRate = interestRate;
        this.downPayment = downPayment;
    }

    @Override
    public String toString() {
        return "CarLoan{" +
                "carLoan=" + carLoan +
                ", loanLength=" + loanLength +
                ", interestRate=" + interestRate +
                ", downPayment=" + downPayment +
                '}';
    }

    public static void main(String[] args) {
        CarLoan carLoan = new CarLoan(10000, 3, 5, 2000);
        System.out.println(carLoan);
    }
}
