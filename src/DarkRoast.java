public class DarkRoast extends Beverage {
  DarkRoast() {
    description = "Dark Roast Coffee";
  }

  private static final float DarkRoastCost = 9.99f;

  @Override
  public float cost() {
    float initialCost = super.cost();
    return initialCost + DarkRoastCost;
  }
}
