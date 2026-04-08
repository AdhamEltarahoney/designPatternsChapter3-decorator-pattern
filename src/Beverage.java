public abstract class Beverage {
  protected String description;
  protected boolean milk;
  protected float milkPrice = 2.1f;
  protected boolean mocha;
  protected float mochaPrice = 3.1f;

  protected boolean soy;
  protected float soyPrice = 2.4f;

  protected boolean whip;
  protected float whipPrice = 1.1f;

  public void setMilk() {
    milk = true;
  }

  public boolean hasMilk() {
    return milk;
  }

  public boolean hasMocha() {
    return mocha;
  }

  public void setMocha() {
    mocha = true;
  }

  public boolean hasSoy() {
    return soy;
  }

  public void setSoy() {
    soy = true;
  }

  public boolean hasWhip() {
    return whip;
  }

  public void setWhip() {
    whip = true;
  }

  public String getDescription() {
    return description;
  }

  public float cost() {
    float runningCost = 0;
    if (hasMilk()) {
      runningCost += milkPrice;
    }
    if (hasSoy()) {
      runningCost += soyPrice;
    }
    if (hasMocha()) {
      runningCost += mochaPrice;
    }
    if (hasWhip()) {
      runningCost += whipPrice;
    }
    return runningCost;
  }
}
