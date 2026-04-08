public class StarbuzzCode {
  public static void main(String[] args) {

    Beverage beverage1 = new DarkRoast();
    System.out.println(beverage1.getDescription() + " has a cost of $" + beverage1.cost());
    Beverage beverage2 = new HouseBlend();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() +" $ "+ beverage2.cost());
  }
}
