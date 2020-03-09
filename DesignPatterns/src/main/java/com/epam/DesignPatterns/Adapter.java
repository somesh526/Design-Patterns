package com.epam.DesignPatterns;

import java.util.List;
import java.util.ArrayList;

interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}
class Rectangle implements Shape {
    
    public void draw() {
    System.out.println("Drawing Rectangle");
    }
  
    public void resize() {
    System.out.println("Resizing Rectangle");
    }

    public String description() {
    return "Rectangle object";
    }
   
    public boolean isHide() {
    return false;
    }
}
class Circle implements Shape {
    
    public void draw() {
    System.out.println("Drawing Circle");
    }
   
    public void resize() {
    System.out.println("Resizing Circle");
    }

    public String description() {
    return "Circle object";
    }
   
    public boolean isHide() {
    return false;
    }
}
class Drawing {
    List<Shape> shapes = new ArrayList<Shape>();
    public Drawing() {
    super();
    }
    public void addShape(Shape shape) {
    shapes.add(shape);
    }
    public List<Shape> getShapes() {
        return new ArrayList<Shape>(shapes);
        }
        public void draw() {
              if (shapes.isEmpty()) {
              System.out.println("Nothing to draw!");
              } else {
              shapes.stream().forEach(shape -> shape.draw());
              }
        }
        public void resize() {
              if (shapes.isEmpty()) {
              System.out.println("Nothing to resize!");
              } else {
              shapes.stream().forEach(shape -> shape.resize());
              }
        }
    }
public class Adapter {
	 public static void main(String[] args) {
         System.out.println("Creating drawing of shapes...");
         Drawing drawing = new Drawing();
         drawing.addShape(new Rectangle());
         drawing.addShape(new Circle());
         System.out.println("Drawing...");
         drawing.draw();
         System.out.println("Resizing...");
         drawing.resize();
   }

}