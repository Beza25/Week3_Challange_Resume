package Week3_Challange;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //--------------------------------------ArrayLists-----------------------------
        ArrayList<String> Persons = new ArrayList<>();
        ArrayList<Education> educations = new ArrayList<>();

        System.out.println("----------------------------------------------------------------------------------\n" +
                           "----------------------------------------------------------------------------------");


        //--------------------Person----------------------------------
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your email address: ");
        String emailAddress = sc.nextLine();
        Person p1 = new Person(name, emailAddress );
        Persons.add(p1.toString());

        //------------------------Educations----------------------------
        Persons.add("Education");
        System.out.println("Enter your degreeType: [Associate's, Bachelor's, Master's, PhD, etc..]");
        String degreeType = sc.nextLine();

        System.out.println("Enter your major: ");
        String major = sc.nextLine();

        System.out.println("Enter your university name: ");
        String university = sc.nextLine();

        System.out.println("Enter your graduation year: ");
        int graduationYear = sc.nextInt();
        sc.nextLine();

        for (Education education : educations) {
            education = new Education(degreeType, major, university ,graduationYear);
            Persons.add(education.toString());
        }




        //------------------------Work Experience-------------------------------
        Persons.add("Experience");
        System.out.println("Enter your company: ");
        String companyName = sc.nextLine();
        System.out.println("Enter your job title: ");
        String jobTitle = sc.nextLine();
        System.out.println("Enter the start date: (example: August 2005)");
        String startDate = sc.nextLine();
        System.out.println("Enter the end date: (example: August 2010)");
        String endDate = sc.nextLine();
        System.out.println("Enter the job description");
        String description = sc.nextLine();
        for(int i=0; i<5 ; i++){
            System.out.println("Enter another job description: (If you want to stop entering another description enter STOP");
            description = sc.nextLine();
            if(description.equalsIgnoreCase("stop")){
                break;
            }
        }
        WorkExperience we1 = new WorkExperience(companyName,jobTitle,startDate,endDate,description);
        Persons.add(we1.toString());

        //---------------------Skills---------------------------------------------
        Persons.add("Skills");

        for(int i =0; i< 3; i++){
            System.out.println("Enter your skill: ");
            String skillName = sc.nextLine();
            System.out.println("Enter the rating/proficiency of your skill: [Fundamental, Novice, Intermediate, Advanced, Expert]");
            String skillRating = sc.nextLine();
            Skills skill = new Skills(skillName, skillRating);
            Persons.add(skill.toString());
            }

        //---------------Display Resume-----------------------------------------
        for(String person: Persons){
            System.out.println(person);;
        }

    }
}

