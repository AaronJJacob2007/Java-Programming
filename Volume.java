
import java.util.*;
class Volume extends Circle

{ int height;
    double volume ;
    Volume(int r,int h)
    { super(r);
        height=h;
        volume=0.0;
        
    }

    double calculate()
    {
        volume=3.14*radius*radius*height;
        return volume;
    }

    void display()
    {System.out.println("The area of circle is "+area);
     System.out.println("The volume of cylinder is "+calculate());
    }
    public static void main ( String args[])
    { 
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of cylinder");
        int rad=sc.nextInt();
        System.out.println("Enter height of cylinder");
        int hgt=sc.nextInt();
        Volume obj=new Volume(rad,hgt);
        obj.cal_area();
        obj.display();       
    }
    }
