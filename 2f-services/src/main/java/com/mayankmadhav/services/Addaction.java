package com.mayankmadhav.services;

/**
 *
 * @author mayank.madhav
 */
public class Addaction {
    
    public double hotDog;
    public double hamBurger;
    public double frenchFries;
    public double pizza;
    
    public double mojito;
    public double milkShake;
    public double cappuccino;
    
    public double foodPrice;
    public double fluidPrice;
    public double sum;
    
    public double sum() {
        foodPrice = hotDog+hamBurger+frenchFries+pizza;
        fluidPrice = mojito+milkShake+cappuccino;
        return foodPrice + fluidPrice;
    }
    
    public double hotDogUnitPrice = 5;
    public double hamBurgerUnitPrice = 6.5;
    public double frenchFriesUnitPrice = 9.5;
    public double pizzaUnitPrice = 10.0;
    
    public double mojitoUnitPrice = 11.0;
    public double milkShakeUnitPrice = 12.0;
    public double cappuccinoUnitPrice = 7.0;
    
}
