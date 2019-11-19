/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.budget;

import java.util.Scanner;

/**
 *
 * @author peter.johnson
 */


public class Budget {

private String month;

private double Salary;

private double food;

private double rent;

private double creditCard;

private double utilities;

private double clothing;

private double entertainment;

private double personalCare;

Scanner userinput = new Scanner(System.in);

/**

*

*/

public Budget() {

this.month = "";

this.Salary = 0;

this.food = 0;

this.rent = 0;

this.utilities = 0;

this.clothing = 0;

this.entertainment = 0;

this.personalCare = 0;

this.creditCard = 0;

}

/**

* @return the month

*/

public String getMonth() {

return month;

}

    public Budget(String month, double budget, double food, double rent, double utilities, double clothing, double entertainment, double personalCare, double bills) {
        this.month = month;
        this.Salary = budget;
        this.food = food;
        this.rent = rent;
        this.utilities = utilities;
        this.clothing = clothing;
        this.entertainment = entertainment;
        this.personalCare = personalCare;
        this.creditCard = bills;
    }

    

    
public double getCreditCard() {

return creditCard;

}

/**
     * @return the budget
     */
    public void setCreditCard(double creditCard) {
        this.creditCard = creditCard;
    }

    public double getSalary() {
        return Salary;
    }

/**

* @return the food

*/

public double getFood() {

return food;

}

/**

* @return the rent

*/

public double getRent() {

return rent;

}

/**

* @return the utilities

*/

public double getUtilities() {

return utilities;

}

/**

* @return the clothing

*/

public double getClothing() {

return clothing;

}

/**

* @return the entertainment

*/

public double getEntertainment() {

return entertainment;

}

/**

* @return the personalCare

*/

public double getPersonalCare() {

return personalCare;

}

/**

* @param month

* the month to set

*/

public void setMonth(String month) {

this.month = month;

}

/**

* @param Salary

* the budget to set

*/

public double setSalary(double Salary) {

this.Salary = Salary;
    return Salary;

}

/**

* @param food

* the food to set

*/

public void setFood(double food) {

this.food = food;

}

/**

* @param rent

* the rent to set

*/

public void setRent(double rent) {

this.rent = rent;

}

/**

* @param utilities

* the utilities to set

*/

public void setUtilities(double utilities) {

this.utilities = utilities;

}

/**

* @param clothing

* the clothing to set

*/

public void setClothing(double clothing) {

this.clothing = clothing;

}

/**

* @param entertainment

* the entertainment to set

*/

public void setEntertainment(double entertainment) {

this.entertainment = entertainment;

}

/**

* @param personalCare

* the personalCare to set

*/

public void setPersonalCare(double personalCare) {

this.personalCare = personalCare;

}


public double totalExpenses() {

return (food + rent + utilities + clothing + entertainment + personalCare);

}

public double getAvailableMoney(){
    return(Salary - rent - food - creditCard - utilities);
}

}

