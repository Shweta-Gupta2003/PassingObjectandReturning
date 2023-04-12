import java.util.*;
class Rect
{
int l,b,area;
Rect(int l,int b)
{
this.l=l;
this.b=b;
}

Rect area(Rect a)
{
Rect r=new Rect(2,3);
r.area=a.l*a.b;
return(r);
}

void display()
{
System.out.println("Area of a rectangle "+area);
}

}

class ParameterObject
{
public static void main(String args[])
{
Rect rec1=new Rect(100,12);
Rect rec2=new Rect(10,12);
Rect rec3=new Rect(1000,12);
rec3=rec1.area(rec3);
rec3.display();
}
}