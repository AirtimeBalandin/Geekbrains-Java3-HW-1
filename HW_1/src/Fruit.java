public abstract class Fruit {
    abstract float getWeight();
}

class Apple extends Fruit {
    @Override
    float getWeight() {
        return 1.0f;
    }
}

class Orange extends Fruit {
    @Override
    float getWeight() {
        return 1.5f;
    }
}