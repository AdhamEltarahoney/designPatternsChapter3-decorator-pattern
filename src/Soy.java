public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " , Soy";
  }

  @Override
  public double cost() {
    double base = beverage.cost();

    switch (beverage.getSize()) {
      case TALL -> {
        return base + 0.10;
      }
      case VENTI -> {
        return base + 0.20;
      }
      case GRANDE -> {
        return base + 0.30;
      }
    }
    return base;
  }
}
