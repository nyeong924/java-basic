package poly.ex4;

public class Cat extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("냥냥이가 움직입니다");
    }
}
