import java.util.*;

class Main {
 static int y=10;
  static class Student
  {
     int roll;
     String name;
     Student(int r, String s)
     {
	    roll=r;
	    name=s;
	 }
	 public String toString()
	 {
	    return(""+roll+" "+name);
	  }
  }
  public static  void  main(String aa[])
  {


    ArrayList<Student> a2=new ArrayList<Student>();
    a2.add(new Student(2,"Saurabh"));
    a2.add(new Student(3,"Abhi"));
    a2.add(new Student(1,"Dharmesh"));
    a2.add(new Student(5,"Ram"));
    a2.add(new Student(6,"Ramu"));
    System.out.println(a2);
    Collections.sort(a2,( s,s1)->(s.roll<s1.roll)?-1:1);
System.out.println("Static "+y);

    ArrayList<Integer> a1=new ArrayList<Integer>();
    a1.add(120);
     a1.add(110);
     a1.add(1);
     a1.add(105);
     a1.add(510);
     a1.add(160);

    // System.out.println(a1);

   TreeSet<Integer> t1=new TreeSet<Integer>((a,b)->(a>b)?-1:1);
   t1.add(120);
        t1.add(110);
        t1.add(1);
        t1.add(105);
        t1.add(510);
          t1.add(510);  t1.add(510);
     t1.add(160);
     int $n=10;
     int n1[]=new int[10];
     float n3=$n;
    System.out.println();
  }
}
