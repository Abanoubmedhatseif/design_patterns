package Structural.Decorator.StarBakr.classes.Decorators;

import Structural.Decorator.StarBakr.classes.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
