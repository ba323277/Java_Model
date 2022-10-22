package bouquet;

public enum Flower {
    ROSE(1),JASMINE(2),LILY(3) ;


    public final int cost;

    Flower(int i) {
        cost=i;
    }
    public int getValue() {
      return this.cost;
    }
}
