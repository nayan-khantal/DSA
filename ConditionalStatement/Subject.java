package ConditionalStatement;
import java.util.Scanner;
public class Subject {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        int input;
            do{
                System.out.print("To display the subjects of IS engineering semester wise,\nEnter the semester: ");
                int sem = sc.nextInt();
                if(sem==1){
                    System.out.println("Theory\n1)Calculus, Statistics and Linear Algebra\n2) Engineering Chemistry\n3) C- Prograaming\n4) Electronics Fundamentals\n5)Computer Aided Engineering Drawing\nLab\n6) Engineering Chemistry Lab\n7) C - Programming Lab\nMandatory Learning Courses\n8)English Enhancement Course");
                }else if (sem==2){
                    System.out.println("1) Multi Variable Calculus and Laplace Transforms\n2) Engineering Physics\n3) Engineering Mechanics\n4) Mechanical Engineering Science\n5) Basic Electrical Engineering\n6) Engineering Physics Lab\n7) General Engineering Practice\n8) Introduction To Engineering Design");
                }else if(sem==3){
                    System.out.println("1) Transforms, Numerical Methods and Number Theory\n2) Discrete Mathematics And Graph Theory\n3) Logic Design\n4) Data Structures\n5) Finite Automata and Formal Languages\n6) Unix and Shell Programming\n7) Logic Design Lab\n8) Data Structure Lab\n9) Environment Studies");
                }else if(sem==4){
                    System.out.println("1) Complex Analysis, Numerical Analysis & Stochastic Process\n2) Software Engineering\n3) Computer Organization\n4) Analysis and Design Of Algorithms\n5) Object Oriented Prograaming With Java\n6) Database Systems\n7) Analysis and Design of Algorithms Lab\n8) Database Systems Lab\n9) Constitution of India & Profession Ethics\n10) Vyavaharika Kannada/ Adalitha Kannada");
                }else if(sem==5){
                    System.out.println("1) MicroProcessor\n2) Systems Software\n3) Data Communication\n4) Operating Systems\n5) Engg. Management and Entrepreneurship\n6) Any one subject of MOOC Elective\n7) Microprocessor Lab\n8) Operating Systems Lab");
                }else if(sem==6){
                    System.out.println("1) Software Architecture\n2) Web Technologies\n3) Computer Networks\n4) Cryptography Ans Network Security\n5) Engg. Economics\n6) Any one from Dept. Elective 1\n7) Web Technologies Lab\n8) Computer Networks Lab\n9) Minor Projects");
                }else if (sem==7){
                    System.out.println("1) Advanced Computer Architecture\n2) Human Computer Interface Systems\n3) Any one from Dept. Elective 2\n4) Any one from Dept. Elective 3\n5) Any one from Industrial Driven Elective\n6) Any one from Open Electives\n7) Any one from Dept. Elective 4\n8) Seminar/Paper Presentation\n9) Major Project Phase-1\n10) Competency Training");
                }else if(sem==8){
                    System.out.println("1) Any one from Dept. Elective 5\n2) Any one from Dept. Elective 6\n3) Any one from Dept. Elective 7\n4) Intership\n5) Major Project Phase-2");
                }else{
                    System.out.println("Invalid");
                }
                System.out.println("To continue press 0 else 9");
                input = sc.nextInt();
            }while (input == 0);
    }
    }
}
