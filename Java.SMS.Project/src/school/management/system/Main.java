package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahmed on 12/2/2022.
 */
public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher John = new Teacher(3,"John",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(John);


        Student Lauren = new Student(1,"Lauren",4);
        Student Ahmed = new Student(2,"Ahmed Alzehhawi",12);
        Student Alex = new Student(3,"Alex",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Lauren);
        studentList.add(Alex);
        studentList.add(Ahmed);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        Lauren.payFees(5000);
        Ahmed.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        John.receiveSalary(John.getSalary());
        System.out.println("GHS has spent for salary to " + John.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(Ahmed);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);


    }
}
