package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    public int getX(){
      return x;
    }

    public int getY(){
      return y;
    }

    public void incrementX(int increment){
      x += increment;
    }

    public void incrementY(int increment){
      y += increment;
    }

    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      double xComponent = (double) (x - other.x) * (x - other.x);
      double yComponent = (double) (y - other.y) * (y - other.y);
      return Math.sqrt(xComponent + yComponent);
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")";
    }
  }    
  