import java.util.Scanner;

class area {
  public static void main(String[] args) {
Scanner myobj = new Scanner(System.in);


// area of rectangle
System.out.println("Enter length of rectangle");
int a1=myobj.nextInt();

System.out.println("Enter breadth of rectangle");
int b1=myobj.nextInt();

int rectangle=a1*b1;
System.out.println("Area of the reactangle " + rectangle);

// area of circle

System.out.println("Enter radius of circle");
int r=myobj.nextInt();
 
float circle=22/7*r*r;
System.out.println("Area of the circle " + circle);

// squareroot

System.out.println("Enter number");
double n=myobj.nextInt();
System.out.println("squareroot " + Math.sqrt(n));

//

System.out.println("Enter length of rectangle");
int A=myobj.nextInt();

System.out.println("Enter breadth of rectangle");
int B=myobj.nextInt();

double x =A+B;
x=x*x;
System.out.println("Value of (A+B)^2:"+x);
        
double y=(A*A)-(B*B);
System.out.println("Value of (A^2-B^2):"+y);
        
double a = 1.0;
double b = 2.0;
double c = 0.0;
double discriminant = b * b - 4 * a * c;
double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
System.out.println("Root 1 = " + root1);
System.out.println("Root 2 = " + root2);
        

}}




