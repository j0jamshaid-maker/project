public class StudentsMarks{
    public static void main(String[] args){
        Studentsmarks std=new Studentsmarks();
        String name="Jamshaid";
std.rollNo=101;
std.marks1=80;
std.marks2=70;
std.marks3=75;
std.TotalMarks();

    }
}
class Studentsmarks{
  String name;
int rollNo;
int marks1;
int marks2;
int marks3;
public void TotalMarks(){
   int TotalMarks=(marks1+marks2+marks3);
    System.out.println("Total Marks: "+TotalMarks);
       double average=(TotalMarks/3);
       System.out.println("Average: "+average);}
}