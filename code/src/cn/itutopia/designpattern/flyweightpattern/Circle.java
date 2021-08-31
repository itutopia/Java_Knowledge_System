package cn.itutopia.designpattern.flyweightpattern;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2021/9/1 01:24
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw()[Color:" + color + ",x:" + x + ",y:" + y + ",radius:" + radius);
    }
}
