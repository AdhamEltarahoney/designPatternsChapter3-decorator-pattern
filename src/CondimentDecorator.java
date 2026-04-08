public abstract class CondimentDecorator
    extends Beverage { // extend with beverage cause condiment needs to be interchangeable with
  // beverage

  Beverage beverage; // This is the beverage that each decorator will be wrapping

  public abstract String getDescription(); // re-implement the getDescription method
}
