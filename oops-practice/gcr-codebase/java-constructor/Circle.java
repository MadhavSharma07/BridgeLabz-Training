package oops.gcr-codebase.java-constructor;

class Circle {
    double radius;             // non-static variable

    Circle(double radius){          // parameterised constructor
        this.radius = radius;
    }
    Circle(){                   // default constructor
        radius = 1.0;
    }

   public void displayRadius(){           // method to print radius
    System.out.println("The radius fo circle is: "+radius);
   }
    
    public static void main(String[] args) {       // main method
        System.out.println("Defult Constructor-");
        Circle defaultCircle = new Circle();        // create object calling default constructor
        defaultCircle.displayRadius(); 
    	System.out.println();
    	System.out.println("Parameterize Constructor-");
        Circle parameterisedCircle = new Circle(2.5);      // create object and calling paramerterised constructor
        parameterisedCircle.displayRadius();

        
    }
}
