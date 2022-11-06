public class Main {
    public static void main(String[] args) {
        School school = new School(29, "Sun");
        HeadTeacher headTeacher = new HeadTeacher(45, "Valentina", Salary.AVERAGE, school);
        System.out.println(headTeacher.getInfo());
        headTeacher.mood();
        headTeacher.mood("хорошее");
        System.out.println("----------------------");

        School school1 = new School(66, "Moon");
        Teacher teacher = new Teacher(27, "MArina", Salary.SMALL, school1, "5 лет");
        System.out.println(teacher.getInfo());
        teacher.mood();
        teacher.mood("плохое");
        System.out.println("---------------------");

        School school2 = new School(88, "Razakova") ;
        Teacher teacher2 = new Teacher(40,"Leyla",Salary.BIG,school2,"8 лет");
        System.out.println(teacher2.getInfo());
        teacher2.mood();
        teacher2.mood("плохое");


    }

}
