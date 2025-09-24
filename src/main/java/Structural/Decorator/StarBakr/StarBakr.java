package Structural.Decorator.StarBakr;

import Structural.Decorator.StarBakr.classes.Beverage;
import Structural.Decorator.StarBakr.classes.DarkRoast;
import Structural.Decorator.StarBakr.classes.Decorators.BeverageFormatter;
import Structural.Decorator.StarBakr.classes.Decorators.Milk;
import Structural.Decorator.StarBakr.classes.Decorators.Mocha;
import Structural.Decorator.StarBakr.classes.HouseBlend;

public class StarBakr {
    public static void main(String[] args) {


        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println(BeverageFormatter.formatDescription(beverage1.getDescription()) + " $" + (int)(beverage1.cost()));

    }
}
