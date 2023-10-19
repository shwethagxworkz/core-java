package com.xworkz.examapplication.halticket;

class ExamExcecutor{


    public static void main (String vtuExam[]){

//Hallticket ticket = new Hallticket(3654757 ,"english,"123C80","dywwn");

        Halticket ticket= null;
        Exam exam= new Exam();
        exam.fees = 1300;

        //has a relationship
        exam.write(ticket);
    }
}


