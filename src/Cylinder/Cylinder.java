package Cylinder;

public class Cylinder {
    public static void main(String[] args) {
        CylinderClass volu = new CylinderClass();   // new a object
        // volu.setCylinderClass(0, 0);
        volu.setCylinderClass(2.5, 5);
        // System.out.println("底圆半径="+volu.radius);
        // System.out.println("圆柱的高="+volu.height);
        System.out.println("圆周率="+volu.pi);
        System.out.println("圆柱");
        System.out.println("底面积="+volu.area());
        System.out.println("体积="+volu.volume());

    }
}

class CylinderClass {
    private double radius;
    private int height;
    final double pi=3.14;

    public void setCylinderClass(double radius, int height) {
        if (radius > 0 && height > 0){
            this.radius = radius;
            this.height = height;
        }
        else {
            System.out.println("您输入的数据有错误！！！");
            System.exit(1);
        }
    }

    double area() {
        return pi * radius * radius;
    }

    double volume() {
        return area() * height;
    }

}