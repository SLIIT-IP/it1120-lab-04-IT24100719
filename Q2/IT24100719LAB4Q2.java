import java.util.Scanner;


public class IT24100719LAB4Q2 {
  public static void main(String[] args) {
    Scanner pinput = new Scanner(System.in);

    

   
      System.out.print("Please enter Exam marks [out of 100]:");
      int  ExamMarks = pinput.nextInt();
     
      if (ExamMarks < 0 || ExamMarks > 100){
        System.out.print("Not possible exam Result.TERMINATION IMMINENT !!! PLEASE STEP AWAY FROM YOUR DEVICE");
        return;
      }

      System.out.print("Please enter Lab marks [out of 100]:");
      int  LabMarks = pinput.nextInt();
     
      if (LabMarks < 0 || LabMarks > 100){
        System.out.print("Not possible Lab Exam Result.TERMINATION IMMINENT !!! PLEASE RUN AWAY");
        return;
      }


      
      System.out.print("Please enter the percentage given for the Exam [out of 100]:");
      int  ExamPercentage = pinput.nextInt();
      System.out.print("Please enter the percentage given for the Lab Submission [out of 100]:");
      int  LabPercentage = pinput.nextInt();
    
      if (ExamPercentage + LabPercentage > 100){
        System.out.print("Percentages must add upto 100.TERMINATION IMMINENT !!! It Might Explode");
        return;
      }

    float  Finallabmarks = (LabMarks*LabPercentage)/100 ;
    float  Finalexammarks = (ExamMarks*ExamPercentage)/100 ;
    float  FinalMarks     = Finallabmarks + Finalexammarks ;

    System.out.print("The Final Marks is :"+FinalMarks);
   
  }
    

  }
