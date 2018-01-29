 class Student {
  
  private String first = "", //if you add a comma you don't need to repeat 'private string'
  last = "";
  
  private int grade,
   id;
  
  private double gpa; 
  
  private static int idlast = 0;
  
  Student(String firstName, String lastName, int gradeLevel, double GPA){
    first = firstName;
    last = lastName;
    grade = gradeLevel;
    gpa = GPA;
    if (gradeLevel >= 0 &&  gradeLevel <= 12){
    grade = gradeLevel;
  }
  else {
    grade = 0;
  }
  
  if (gpa >= 0.0 && gpa <= 4.5) {
    gpa = GPA;
  }
  else {
      gpa = 0.0;
  }
    id = ++idlast;
  }
   
  Student(){
   this("None", "None", 0, 0.0);
  }

  String  toString()
  { 
    return(last + ", " + first + "\nGPA: " + gpa + "\nGrade Level: " + grade + "id # " + id);
  }
  
} 
 
