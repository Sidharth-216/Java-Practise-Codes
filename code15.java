/* write a java program to create a class employeewith name,job and salary as a variables.
create 2 methods that calculates and update the salary according to number of working days*/


import java.util.*;
class Employee
{
  String name,job;
  int salary;
  public Employee(String name,String job,int salary)
  {
    this.name=name;
    this.job=job;
    this.salary=salary;
    
  }
  void calculate(int days)
  {
  	int sal1=days*1000;
  	System.out.println("the salary of "+name+" of job "+job+"is:"+sal1);
  }
  void update(int days2)
  {
  	int up_sal=salary+(1000*days2);
  	System.out.println("the updated salary of "+name+ " of job "+job+"is:"+up_sal);
  }
  public static void main(String [] args)
  {
	Scanner sc=new Scanner(System.in);
  	System.out.println("Enter your name:");
	String name=sc.next();
	System.out.println("Enter the job:");
	String job=sc.next();
	System.out.println("Enter the current salary:");
	int salary=sc.nextInt();
	Employee em=new Employee(name,job,salary);
  	while(true)
        {
     
	     System.out.println("1.Calculate salary");
	     System.out.println("2.Update the salary:");
	     System.out.println("3.exit");
	     System.out.println("enter the choice:");
	     int cho=sc.nextInt();
     
	     switch(cho)
	     {
	     	case 1:
	     	   System.out.println("enter the working days:");
	     	   int days1=sc.nextInt();
	     	   em.calculate(days1);
	     	   break;
	       case 2:
		   System.out.println("enter the latest working days:");
		   int days2=sc.nextInt();
		   em.update(days2);
		   break;
	      case 3:
		   System.exit(0);
		   break;
	      default:
	      	   System.out.println("Invalid input");
	     }
	 }
    }
 }
     	   
     
     
    
