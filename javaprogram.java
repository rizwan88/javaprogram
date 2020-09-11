class apr
{
int a,p,l,b ;
public void read()
{l=20;
b=10;
}
public void cal()
{ a=l*b;
p=2*(l+b);
System.out.println("Area of ractangle="+a);
System.out.println("Area of Perimeter="+p);
}
}
class mainapr
{ public static void main(String x[])
 {
 apr a1;
 a1=new apr();
 a1.read();
 a1.cal();
 }
 }
