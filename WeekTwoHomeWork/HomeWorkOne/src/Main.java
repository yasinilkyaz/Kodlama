public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(0, "Engin Demirog");
        TeacherManager teacherManager = new TeacherManager();

        Catagory catagory1 = new Catagory(0, "Backend");
        Catagory catagory2 = new Catagory(1, "Frontend");


        CatagoryManager catagoryManager = new CatagoryManager();


        System.out.println("---Hosgeldiniz----");
        System.out.println("------------------");

        catagoryManager.listCategory(catagory1);
        catagoryManager.listCategory(catagory2);

        System.out.println("Egitici");
        
        teacherManager.teacherName(teacher);
    }
}
