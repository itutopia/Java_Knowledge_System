package cn.itutopia.designpattern.flyweightpattern;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/9/1 01:32
 */
public class FlyWeightPatternDemo {
    public static final String[] colors = {"Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    public static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
