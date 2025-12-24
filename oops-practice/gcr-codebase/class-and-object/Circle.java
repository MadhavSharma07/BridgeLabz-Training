package oops.gcr-codebase.class-and-object;

class Circle {
    
    double radius;             // non-static variable

    Circle(double radius){          // constructor
        this.radius = radius;
    }

    public void areaOfCircle(){     // method to find and print area 
        System.out.printf("The area of circle is: %.2f%n"+(3.14*radius*radius));
    }

    public void circumfenceOfCircle(){         // methid to find and print circumfence
        System.out.printf("The circumfence of circle is: %.2f%n"+(2*3.14*radius));
    }
    
    public static void main(String[] args) {       // main method
        Circle circle = new Circle(2.5);      // create object and calling constructor

        circle.areaOfCircle();
        circle.circumfenceOfCircle();
    }


}
