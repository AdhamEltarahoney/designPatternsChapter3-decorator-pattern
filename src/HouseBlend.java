public class HouseBlend extends Beverage {
  public HouseBlend(float houseBlendCost) {
    description = "House Blend Coffee";
  }

  private static final float HouseBlendCost = 7.3f;

  @Override
  public float cost() {
    return super.cost() + HouseBlendCost;
  }
}
