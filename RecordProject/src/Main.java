public class Main {

    public static void main(String[] args) {
        System.out.println("-------Using POJO--------");
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s); // calls the toString method implicitly from the Student Class
        }

        System.out.println("-------Using Record--------");
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s); // calls the toString method implicitly from the Student Class
        }
        System.out.println("----POJO Vs Record------");

        // creating POJO instance
        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");
        // creating Record instance
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");//can set using POJO
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");//cannot set as Record is immutable

        // POJO use getters
        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        // Record use direct access
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());

    }
}
