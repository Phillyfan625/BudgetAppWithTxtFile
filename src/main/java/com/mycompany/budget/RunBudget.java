/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.budget;

/**
 *
 * @author peter.johnson
 */
import java.io.File;

import java.io.PrintWriter;

import java.util.Scanner;


public class RunBudget {

public static void main(String[] args) {
    
try {

Scanner scanner = new Scanner(new File("budgetinput.txt"));

PrintWriter printWriter = new PrintWriter("BudgetOutput.txt");

Budget budget = new Budget();

while (scanner.hasNext()) {

budget.setMonth(scanner.next());

budget.setSalary(scanner.nextDouble());

for (int i = 0; i < 6; i++) {

if (i == 0)

budget.setFood(scanner.nextDouble());

else if (i == 1)

budget.setRent(scanner.nextDouble());

else if (i == 2)

budget.setUtilities(scanner.nextDouble());

else if (i == 3)

budget.setClothing(scanner.nextDouble());

else if (i == 4)

budget.setEntertainment(scanner.nextDouble());

else

budget.setPersonalCare(scanner.nextDouble());

}

}

printWriter.println("Month: " + budget.getMonth());

printWriter.println("Total Budget for Month: $"

+ budget.getSalary());

printWriter

.println("Food Expenses for Month: $" + budget.getFood());

printWriter

.println("Rent Expenses for Month: $" + budget.getRent());

printWriter.println("Utilities Expenses for Month: $"

+ budget.getUtilities());

printWriter.println("Clothing Expenses for Month: $"

+ budget.getClothing());

printWriter.println("Entertainment Expenses for Month: $"

+ budget.getEntertainment());

printWriter.println("Personal Expenses for Month: $"

+ budget.getPersonalCare());

printWriter.println("Total spent for " + budget.getMonth() + " :$"

+ budget.totalExpenses());

if (budget.getSalary() > budget.totalExpenses())

printWriter.println("You went under Budget for "

+ budget.getMonth() + " by $"

+ (budget.getSalary() - budget.totalExpenses()));

else

printWriter.println("You went over Budget for "

+ budget.getMonth() + " by $"

+ (budget.totalExpenses() - budget.getSalary()));

printWriter.flush();

scanner.close();

printWriter.close();

} catch (Exception e) {

// TODO: handle exception

e.printStackTrace();

}

}

}
    
    