package edu.marco.garcia.actividades.actividad4.lang;

public class Eng extends Lang{
    public Eng(){
        SELECT_AN_OPTION = "Select an option: ";
        INVALID_INPUT_EMPTY = "Invalid input. You can't leave the field empty.";
        INVALID_OPTION = "Invalid option. Please, enter a number from the menu.";
        INVALID_INPUT_NOT_NUMBER = "Invalid input. Please, enter a number.";
        INVALID_INPUT_NEGATIVE_NUMBER = "Invalid input. Please, enter a positive number.";
        GOODBYE = "Goodbye!";
        LANGUAGE_MENU_TOP = "\n╔══════════════════════════════════════════════╗\n║   Your system language is : ";
        LANGUAGE_MENU_BOTTOM = "           ║\n║   Would you like to change the language?     ║\n╠══════════════════════════════════════════════╣\n║                  1. Spanish                  ║\n║                  2. English                  ║\n║                  3. Exit                     ║\n╚══════════════════════════════════════════════╝";
        SHOW_MENU = "+------------------------------------------+\n" +
        "|            Main Menu                    |\n" +
        "+------------------------------------------+\n" +
        "| 1. Add a student                        |\n" +
        "| 2. Add a professor                      |\n" +
        "| 3. Create a course                      |\n" +
        "| 4. Show hired professors                |\n" +
        "| 5. Show enrolled students               |\n" +
        "| 6. Show current courses                 |\n" +
        "| 7. Exit                                 |\n" +
        "+------------------------------------------+";
        STUDENT_NAME = "Student's name: ";
        STUDENT_NAME_HEADLINER = "╔════════════════════════╗\n" +
                               "║   Enter Student name   ║\n" +
                               "╚════════════════════════╝";
        STUDENT_ID = "Student's ID: ";
        STUDENT_ID_HEADLINER = "╔═══════════════════╗\n" +
                             "║  Enter Student ID ║\n" +
                             "╚═══════════════════╝";
        STUDENT_AGE = "Student's age: ";
        STUDENT_ENROLLMENT_HEADLINER = "╔════════════════════╗\n" +
                                     "║  Enter Student age ║\n" +
                                     "╚════════════════════╝";
        STUDENT_ENROLLMENT = "Student's enrollment: ";
        STUDENT_ENROLLMENT_HEADLINER = "╔══════════════════════════════════════════════════════╗\n" +
                                     "║  Enter the course you want to enroll the student in. ║\n" +
                                     "╚══════════════════════════════════════════════════════╝";
        STUDENT_ADDED = "Student added correctly";
       // Profesores
        TEACHER_NAME = "Teacher's name: ";
        TEACHER_NAME_HEADLINER = "╔══════════════════════╗\n" +
                               "║  Enter Teacher name  ║\n" +
                               "╚══════════════════════╝";
        TEACHER_PAYROLL = "Teacher's payroll: ";
        TEACHER_PAYROLL_HEADLINER = "╔═════════════════════════╗\n" +
                                  "║  Enter Teacher payroll  ║\n" +
                                  "╚═════════════════════════╝";
        TEACHER_SALARY = "Teacher's salary: ";
        TEACHER_SALARY_HEADLINER = "╔═══════════════════════╗\n" +
                                 "║ Enter Teacher salary  ║\n" +
                                 "╚═══════════════════════╝";
        TEACHER_SUBJECT = "Teacher's subject: ";
        TEACHER_SUBJECT_HEADLINER = "╔════════════════════════════════════════════════════════╗\n" +
                                  "║  Enter the subject that the teacher is going to teach  ║\n" +
                                  "╚════════════════════════════════════════════════════════╝";
        TEACHER_ADDED = "Teacher added correctly";
       // Cursos
        COURSE_NAME = "Course's name: ";
        COURSE_NAME_HEADLINER = "╔════════════════════════════════════════════════╗\n" +
                              "║   Enter the name you want the course to have   ║\n" +
                              "╚════════════════════════════════════════════════╝";
        COURSE_TOPIC_NAME = "Enter the topic that composes the course: ";
        COURSE_TOPIC_NAME_HEADLINER = "╔════════════════════════════════════════════════════════╗\n" +
                                    "║ Enter the name of the subject that makes up the course ║\n" +
                                    "╚════════════════════════════════════════════════════════╝";
        COURSE_TOPIC_ID = "Enter the topic's ID: ";
        COURSE_TOPIC_ID_HEADLINER = "╔══════════════════════════════════════════════════════════╗\n" +
                                  "║   Enter the ID of the subject that makes up the course   ║\n" +
                                  "╚══════════════════════════════════════════════════════════╝";
        COURSE_TOPIC_CREDITS = "Enter the topic's credits: ";
        COURSE_TOPIC_CREDITS_HEADLINER = "╔═══════════════════════════════════════════════════╗\n" +
                                       "║      Enter the credits that the subject has       ║\n" +
                                       "╚═══════════════════════════════════════════════════╝";
        COURSE_TOPIC_HOURS = "Enter the topic's hours: ";
        COURSE_TOPIC_HOURS_HEADLINER = "╔═══════════════════════════════════════════════════════╗\n" +
                                     "║ Enter the total hours that the subject will be taught ║\n" +
                                     "╚═══════════════════════════════════════════════════════╝";
        COURSE_ADDED = "Course added correctly";

       // Mostrar profesores
        SHOW_TEACHERS = "Hired professors";
        SHOW_TEACHERS_MENU = "╔═══════════════════╗\n" +
        "║    Teachers       ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        SHOW_TEACHERS_MENU_NAME = "║ Name: ";
        SHOW_TEACHERS_MENU_PAYROLL = "║ Payroll: ";
        SHOW_TEACHERS_MENU_SALARY = "║ Salary: ";
        SHOW_TEACHERS_MENU_SUBJECT = "║ Subject: ";
        SHOW_TEACHERS_MENU_BOTTOM = "╚═══════════════════╝";
       
        // Mostrar alumnos
        SHOW_STUDENTS = "Enrolled students";
        SHOW_STUDENTS_MENU = "╔═══════════════════╗\n" +
        "║    Students       ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        SHOW_STUDENTS_MENU_NAME = "║ Name: ";
        SHOW_STUDENTS_MENU_ID = "║ ID: ";
        SHOW_STUDENTS_MENU_AGE = "║ Age: ";
        SHOW_STUDENTS_MENU_ENROLLMENT = "║ Enrollment: ";
        SHOW_STUDENTS_MENU_BOTTOM = "╚═══════════════════╝";

       // Mostrar cursos
        SHOW_COURSES = "Current courses";
        SHOW_COURSES_MENU = "╔═══════════════════╗\n" +
        "║    Courses        ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        SHOW_COURSES_MENU_NAME = "║ Name: ";
        SHOW_COURSES_MENU_TOPICS = "║ Topics: ";
        SHOW_COURSES_MENU_CREDITS = "║ Credits: ";
        SHOW_COURSES_MENU_HOURS = "║ Hours: ";
        SHOW_COURSES_MENU_BOTTOM = "╚═══════════════════╝";


        //Clase SchoolManager
        STUDENT = " student";
        HAS_ENROLLED_IN = " has enrolled in";
        ENROLLED_STUDENTS = " These are the students in the course:";
        NO_ENROLLED_STUDENTS = " No students enrolled.";     
        NO_REGISTERED_COURSES = " No courses registered.";
        COURSE = " Course";
        TEACHER = " Teacher";
        TOPIC = " Topic";
        NOT_ASIGNATED = "Not assigned";
        HOURS = "Hours";
        CREDITS = "Credits";
        NOT_REGISTERED_TEACHERS = "No teachers registered.";
        REGISTERED_TEACHERS = "These are the registered teachers:";
        THERE_NO_SUBJECTS_ASIGNATED_TO = "There are no subjects assigned to";
        TOTAL_HOURS = "Total hours";
        TOTAL_CREDITS = "Total credits";
        NOT_REGISTERED_TOPICS = "No topics registered.";
        ID = "ID";
        NO_TEACHER_FOUND = "Teacher not found.";
        THE_TEACHER = "The teacher";
        NOT_ASIGNATED_SUBJECTS = "Has no assigned subjects.";
        TEACHER_SALARY_CALCULATION = "Salary calculation for the teacher:";
        TOTAL_SALARY = "Total salary: $";
        HOURS_WITH_COMA = ", Hours: ";
        PAY_PER_HOUR = ", Pay per hour: $";
        SUBTOTAL = ", Subtotal: $";

        // Clase Topics
        NAME_NULL_ERROR = "Name cannot be null";
        ID_NULL_ERROR = "ID cannot be null";
        CREDITS_NUMBER_ERROR = "Credits cannot be less than or equal to 0";
        HOURS_NUMBER_ERROR = "Hours cannot be less than or equal to 0";

        // Clase Teacher
        PAYROLL_NULL_ERROR = "Payroll cannot be null";
        SALARY_NUMBER_ERROR = "Salary cannot be less than or equal to 0";
        PAYROLL_WITH_COLON = " Payroll: ";
        TEACHER_WITH_COLON = " Teacher: ";
        SALARY_WITH_COLON = " Salary: ";
        TOPICS_WITH_COLON = " Topics: ";

        // Clase Student
        AGE_NUMBER_ERROR = "Age cannot be less than or equal to 0";
        STUDENT_WITH_COLON = "Student: ";
        AGE_WITH_COLON = " Age: ";
        ID_WITH_COLON = " ID: ";

    }


}
