public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    this.beverage = beverage; // beverage gotten from super abstract class we are extending
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " , mocha";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.40;
  }
}
