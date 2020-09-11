//import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class des implements ActionListener
{
 Frame f1;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
 List ls1;
// TextField t1;
int a[],n,M;
 des()
 {
  f1=new Frame("Check Charater");
  f1.setBounds(200,200,600,400);
  f1.setBackground(Color.CYAN);
  f1.setLayout(null);
  b1=new JButton("Read");
  f1.add(b1);
  b1.setBounds(100,100,100,30);
   b2=new JButton("Print");
  f1.add(b2); 
  b2.setBounds(100,140,100,30);
   b3=new JButton("Sort");
  f1.add(b3);
  b3.setBounds(100,180,100,30);
   b4=new JButton("Append");
  f1.add(b4);
  b4.setBounds(100,220,100,30);
   b5=new JButton("Search");
  f1.add(b5);
  b5.setBounds(100,260,100,30);
   b6=new JButton("Update");
  f1.add(b6);
  b6.setBounds(210,100,100,30);
  b7=new JButton("Delete");
  f1.add(b7);
  b7.setBounds(210,140,100,30);
  b8=new JButton("Reverse");
  f1.add(b8);
  b8.setBounds(210,180,100,30);
  b9=new JButton("Insert");
  f1.add(b9);
  b9.setBounds(210,220,100,30);
  b0=new JButton("Exit");
  f1.add(b0);
  b0.setBounds(210,260,100,30);
  ls1=new List();
  f1.add(ls1);
  ls1.setBounds(350,70,100,280);
  ls1.setFont(new Font("arial",Font.BOLD,20));
  //t1=new TextField();
  //t1.setBounds(150,500,250,30);
  //f1.add(t1);
  //list1

  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  b0.addActionListener(this);



  f1.setVisible(true);
  }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b1)
  read();
  else if(e.getSource()==b2)
  print();
  else if(e.getSource()==b3)
  sort();
  else if(e.getSource()==b4)
  append();
  else if(e.getSource()==b5)
  search();
  else if(e.getSource()==b6)
  update();
  else if(e.getSource()==b7)
  delete();
  else if(e.getSource()==b8)
  reverse();
  else if(e.getSource()==b9)
  insert();
  else if(e.getSource()==b0)
  System.exit(0);

 }
 void read()
 {
  n=Integer.parseInt(JOptionPane.showInputDialog(f1,"How many Number do you wnat"));
  M=n+5;
  a=new int[M];
  for(int i=0;i<n;i++)
  {
   a[i]=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter elements"));
  }
 }
 void print()
 {
 ls1.removeAll();
 for(int i=0;i<n;i++)
 {
  ls1.add(Integer.toString(a[i]));
  }
 }
 void sort()
 {
 ls1.removeAll();
 int i,j,x;
 for(i=0;i<n-1;i++)
 {
  for(j=i+1;j<n;j++)
  {
   if(a[i]>a[j])
   {
    x=a[i];
    a[i]=a[j];
    a[j]=x;
    }
   }
  }
 }
 void insert()
 {
  ls1.removeAll();
  int i,x;
  if(n<M)
  {
  x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Insert value "));
  for(i=n-1;i>=0;i--)
  {
  if(a[i]>x)
  {
   a[i+1]=a[i];
   }
   else
   {
    break;
   }
  }
  a[i+1]=x;
  n++;
  }
else
{
 JOptionPane.showMessageDialog(f1," Not insert because memory is full");
}
}
 void append()
 {
  ls1.removeAll();
  int x;
  if(n<M)
  {
   x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter Append value "));
   a[n]=x;
   n++;
  }
  else
  {
   JOptionPane.showMessageDialog(f1,"Array is full");
  }
 }
 void search()
 {
  int i,x;
  boolean f;
 //JOptionPane.showMessageDialog( f1, "The sum is " + sum, "Results", JOptionPane.PLAIN_MESSAGE );
 x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter a value"));
  f=false;
  for(i=n;i>=0;i--)
  {
   if(a[i]==x)
   {
    f=true;
    break;
    }
   }
   if(f==false)
   {
  JOptionPane.showMessageDialog( null, "Not present " +x, "Results", JOptionPane.PLAIN_MESSAGE );
  //x=Integer.parseInt(JOptionPane.showMessageDialog(f1,"not Present");
   }
  else
  {
   JOptionPane.showMessageDialog( null, "Is prsent " + x, "Results", JOptionPane.PLAIN_MESSAGE );
  //x=Integer.parseInt(JOptionPane.showMessageDialog(f1,"is Prasent"));
  }
 }
 void update()
 {
 ls1.removeAll();
 int i,x;
  boolean f;
  x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter a value"));
  f=false;
  for(i=n-1;i>=0;i--)
  {
   if(a[i]==x)
   {
    f=true;
    break;
   }
 }
 if(f==false)
 {
 JOptionPane.showMessageDialog( f1,x+ "is not present");
 //x=Integer.parseInt(JOptionPane.showInputDialog(f1,"not Present"x));
  }
 else
 {
 JOptionPane.showMessageDialog(f1,x+" is prestnt at Possition"+i);
 a[i]=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter a new value"));
 }
 }
 void delete()
 {
  int i,j,x;
  boolean f;
  x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Etner a value"));
  f=false;
  for(i=n-1;i>=0;i--)
  {
   if(a[i]==x)
   {
   f=true;
   break;
   }
  }
  if(f==false)
  {
   JOptionPane.showMessageDialog(f1,x+"Is not Present");
   }
   else
   {
   JOptionPane.showMessageDialog(f1,x+"Is deleted at Position"+i);
   for(j=i+1;j<n;j++)
   {a[j-1]=a[j];
   }
   n--;
   }
  }
 void reverse()
 {
  ls1.removeAll();
  for(int i=n-1;i>=0;i--)
  {
//a[i]=Integer.parseInt(
ls1.add(Integer.toString(a[i]));//JOptionPane.showMessageDialog(f1,a[i]+"Content of array reversely");
 }
}
}
class array_all_gui
{
 public static void main(String x[])
 {
  des d1=new des();
  }
}