package edu.marco.garcia.actividades.actividad4.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.marco.garcia.actividades.actividad4.models.Course;
import edu.marco.garcia.actividades.actividad4.models.Student;
import edu.marco.garcia.actividades.actividad4.models.Subject;
import edu.marco.garcia.actividades.actividad4.models.Teacher;

public class SchoolManager {

    public static Map<Course, List<Subject>> courseMap = new HashMap<>();
    public static Map<Teacher, List<Subject>> teacherMap = new HashMap<>();
    public static Map<Course, Teacher> courseTeacherMap = new HashMap<>();
    public static Map<Course, List<Student>> studentCourseMap = new HashMap<>();  
    public static Map<Student, List<Student>> studentMap = new HashMap<>();
    public static Map<Subject, List<Subject>> subjectMap = new HashMap<>();
    public static List<Subject> subjectsP = new ArrayList<>();

    public static void enrollTeacher(Teacher teacher) {
        teacherMap.put(teacher, new ArrayList<>());
    }

    public static void enrollCourse(Course course) {
        courseMap.put(course, new ArrayList<>());
    }

    public static void enrollStudent(Student student) {
        studentMap.put(student, new ArrayList<>());
    }

    public static void enrollSubject(Subject subject) {
        subjectMap.put(subject, new ArrayList<>());
    }

    public static void assignStudentToCourse( Student student, Course course) {
        boolean isAlreadyEnrolled = false;
        for (Map.Entry<Course, List<Student>> entry : studentCourseMap.entrySet()) {
            if (entry.getValue().contains(student)) {
                isAlreadyEnrolled = true;
                break;
            }
        }
        if (isAlreadyEnrolled) {
            System.out.println("N" + student.getName() + " ya está inscrito en otro curso.");
            return;
        }

        studentCourseMap.putIfAbsent(course, new ArrayList<>());
        studentCourseMap.get(course).add(student);

        List<Subject> subjects = courseMap.get(course);
        if (subjects != null && !subjects.isEmpty()) {
            for (Subject subject : subjects) {
                subject.getStudents().add(student);
            }
        } else {
            System.out.println(" El curso " + course.getName() + " no tiene materias asignadas.");
        }

        if(courseMap.get(course).size()<3){
            throw new RuntimeException("El curso al que se quiere inscribir no tiene suficientes materias, vuelva mas tarde");
        }
        if (studentCourseMap.get(course).size() >=26) {
            System.out.println(" Error: El curso " + course.getName() + " ya tiene 26 estudiantes inscritos. No se puede agregar más.");
            return;   
        }
        System.out.println(" Estudiante " + student.getName() + " se ha inscrito en " + course.getName());
    }

    public static void assignSubjectToTeacher(Subject subject, Teacher teacher) {
        teacherMap.putIfAbsent(teacher, new ArrayList<>());
    
        if (teacherMap.get(teacher).size() >= 4) {
            System.out.println("Error: El profesor " + teacher.getName() + " ya tiene 4 materias asignadas.");
            return;
        }
        if (subject.getTeacher() != null) {
            System.out.println("Error: La materia " + subject.getName() + " ya tiene un profesor asignado: " + subject.getTeacher().getName());
            return;
        }
        subject.setTeacher(teacher);
        teacherMap.get(teacher).add(subject);
    
        System.out.println("La materia " + subject.getName() + " se ha asignado al profesor " + teacher.getName());
    }

    public static void assignSubjectToCourse(Subject subject, Course course) {
        courseMap.putIfAbsent(course, new ArrayList<>());
        if (courseMap.get(course).size() >= 3) {
            System.out.println("Error: El curso " + course.getName() + " ya tiene 3 materias asignadas.");
            return;
        }
        Teacher assignedTeacher = subject.getTeacher();
        if (assignedTeacher == null) {
            assignedTeacher = findAvailableTeacher();
    
            if (assignedTeacher == null) {
                System.out.println("Error: No hay profesores disponibles para asignar la materia " + subject.getName());
                return;
            }
            subject.setTeacher(assignedTeacher);
            teacherMap.putIfAbsent(assignedTeacher, new ArrayList<>());
            teacherMap.get(assignedTeacher).add(subject);
    
            System.out.println("Se ha asignado automáticamente el profesor " + assignedTeacher.getName() + " a la materia " + subject.getName());
        } else {
            System.out.println("La materia " + subject.getName() + " ya tiene un profesor asignado: " + assignedTeacher.getName());
        }
        courseMap.get(course).add(subject);
        course.addTeacher(assignedTeacher);
        System.out.println("La materia " + subject.getName() + " se ha agregado al curso " + course.getName());
    }
    
    private static Teacher findAvailableTeacher() {
        for (Map.Entry<Teacher, List<Subject>> entry : teacherMap.entrySet()) {
            if (entry.getValue().size() < 4) {
                return entry.getKey();
            }
        }
        return null; 
    }

    public static void showStudentsInCourse(Course course) {
        List<Student> students = studentCourseMap.get(course);

        System.out.println("\n Estos son los estudiantes en el curso: " + course.getName());
        if (students == null || students.isEmpty()) {
            System.out.println(" No hay estudiantes inscritos.");
            return;
        }

        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }

    public static void showTeachersInCourse(Course course) {
        List<Teacher> teachers = course.getTeachers();
    
        if (teachers == null || teachers.isEmpty()) {
            System.out.println("No hay profesores asignados a " + course.getName());
            return;
        }
    
        System.out.println("\nProfesores asignados al curso " + course.getName() + ":");
        for (Teacher teacher : teachers) {
            System.out.println("- " + teacher.getName());
        }
    }

    public static void showSubjectsInTeacher(Teacher teacher) {
        List<Subject> subjects = teacherMap.get(teacher);
    
        if (subjects == null || subjects.isEmpty()) {
            System.out.println("No hay materias asignadas a " + teacher.getName());
            return;
        }
    
        System.out.println("\nMaterias asignadas al profesor " + teacher.getName() + ":");
        for (Subject subject : subjects) {
            System.out.println("- " + subject.getName());
        }
    }

    public static void showSubjectsInCourse(Course course) {
        List<Subject> subjects = courseMap.get(course);

        if (subjects == null || subjects.isEmpty()) {
            System.out.println(" No hay materias asignadas a " + course.getName());
            return;
        }

        System.out.println("\n Materias asignadas al curso " + course.getName());
        for (Subject subject : subjects) {
            System.out.println(" - " + subject.getName());
        }
    }
    
    public static void showCourses() {
        if (courseMap.isEmpty()) {
            System.out.println(" No hay cursos registrados.");
            return;
        }

        for (Map.Entry<Course, List<Subject>> entry : courseMap.entrySet()) {
            Course course = entry.getKey();
            List<Subject> subjects = entry.getValue();
            Teacher teacher = courseTeacherMap.get(course);

            System.out.println("\n Curso: " + course.getName());
            if (teacher != null) {
                System.out.println(" Profesor: " + teacher.getName());
            }

            for (Subject subject : subjects) {
                System.out.println(" - Materia: " + subject.getName() + ", Horas: " + subject.getHours() + ", Créditos: " + subject.getCredits());
            }
        }
    }

    public static void showTeachers() {
        if (teacherMap.isEmpty()) {
            System.out.println(" No hay profesores registrados.");
            return;
        }

        for (Map.Entry<Teacher, List<Subject>> entry : teacherMap.entrySet()) {
            Teacher teacher = entry.getKey();
            List<Subject> subjects = entry.getValue();

            System.out.println("\n Estos son los profesores registrados: " + teacher.getName() + ", Nómina: " + teacher.getPayroll());
            for (Subject subject : subjects) {
                System.out.println(" - Materia: " + subject.getName() + ", Horas: " + subject.getHours() + ", Créditos: " + subject.getCredits());
            }
        }
    }

    public static void showStudents() {
        if (studentMap.isEmpty()) {
            System.out.println(" No hay estudiantes registrados.");
            return;
        }
        for (Map.Entry<Student, List<Student>> entry : studentMap.entrySet()) {
            Student student = entry.getKey();
            List<Student> students = entry.getValue();

            System.out.println("\n Estudiantes registrados: " + student.getName()+ ", Edad: " + student.getAge() + ", Matricula: " + student.getId());
            for (Student student1 : students) {
                System.out.println(" - " + student1.getName());
            }
        }

    }   
    
    public static void showSubjects() {
        if (subjectMap.isEmpty()) {
            System.out.println(" No hay materias registradas.");
            return;
        }

        for (Map.Entry<Subject, List<Subject>> entry : subjectMap.entrySet()) {
            Subject subject = entry.getKey();
            List<Subject> subjects = entry.getValue();

            System.out.println("\n Materias registradas: " + subject.getName()+ ", ID: " + subject.getId() + ", Créditos: " + subject.getCredits() + ", Horas: " + subject.getHours());
            for (Subject subject1 : subjects) {
                System.out.println(" - " + subject1.getName());
            }
        }
        
    }
    
    public static void calculateHoursAndCredits(Course course) {
        List<Subject> subjects = courseMap.get(course);

        if (subjects == null || subjects.isEmpty()) {
            System.out.println(" No hay materias asignadas a " + course.getName());
            return;
        }

        int totalHours = 0;
        int totalCredits = 0;

        System.out.println("\n Curso: " + course.getName());

        for (Subject subject : subjects) {
            System.out.println(" - Tema: " + subject.getName() + ", Horas: " + subject.getHours() + ", Créditos: " + subject.getCredits());
            totalHours += subject.getHours();
            totalCredits += subject.getCredits();
        }

        System.out.println(" Total de horas: " + totalHours);
        System.out.println(" Total de créditos: " + totalCredits);
    }

    public static void calculateSalary(Teacher teacher) {
        if (!teacherMap.containsKey(teacher)) {
            System.out.println("Profesor no encontrado.");
            return;
        }
        List<Subject> assignedSubjects = teacherMap.get(teacher);
        if (assignedSubjects == null || assignedSubjects.isEmpty()) {
            System.out.println("El profesor " + teacher.getName() + " no tiene materias asignadas.");
            return;
        }
        int subjectCount = assignedSubjects.size();
        double baseSalaryPerHour = 250; // Salario base por hora
        double multiplier = 1.0;
        switch (subjectCount) {
            case 2:
                multiplier = 1.25; 
                break;
            case 3:
                multiplier = 1.50; 
                break;
            case 4:
                multiplier = 1.75; 
                break;
            default:
                multiplier = 1.0; 
                break;
        }
        double salaryPerHour = baseSalaryPerHour * multiplier;
        double totalSalary = 0;
        System.out.println("\nCálculo de salario para el profesor: " + teacher.getName());
        System.out.println("Materias asignadas: " + subjectCount);
        System.out.println("Pago por hora ajustado: $" + salaryPerHour);
        for (Subject subject : assignedSubjects) {
            double topicSalary = subject.getHours() * salaryPerHour;
            totalSalary += topicSalary;
            System.out.println(" - Materia: " + subject.getName() + ", Horas: " + subject.getHours() + ", Pago por hora: $" + salaryPerHour + ", Subtotal: $" + topicSalary);
        }
        System.out.println("Salario total: $" + totalSalary);
    }
    
    public static void dataBase(){
        Student student1 = new Student("Jose", 20, "1234");
        Student student2 = new Student("Juan", 21, "5678");
        Student student3 = new Student("Pedro", 22, "91011");
        Student student4 = new Student("Maria", 23, "121314");
        Student student5 = new Student("Ana", 24, "151617");
        Student student6 = new Student("Luis", 25, "181920");
        Subject  topic1 = new Subject("Matematicas", "1", 4, 80);
        Subject  topic2 = new Subject("fundamentos", "2", 5, 80);
        Subject  topic3 = new Subject("POO", "3", 6, 80);
        Subject  topic4 = new Subject("Estructura", "4", 7, 80);
        Subject topic5 = new Subject("Base de datos", "5", 8, 80);
        Subject topic6 = new Subject("Redes", "6", 9, 80);
        Teacher teacher1 = new Teacher("Marco",  "Al086731");
        Teacher teacher2 = new Teacher("Pedro",  "Al086732");
        Teacher teacher3 = new Teacher("Maria",  "Al086733");
        Teacher teacher4 = new Teacher("Ana",  "Al086734");
        Course course1 = new Course("programacion", null);
        Course course2 = new Course("Fundamentos", null);
        enrollCourse(course2);
        enrollCourse(course1);
        enrollStudent(student1);
        enrollStudent(student2);
        enrollStudent(student3);
        enrollStudent(student4);
        enrollStudent(student5);
        enrollStudent(student6);
        enrollSubject(topic1);
        enrollSubject(topic2);
        enrollSubject(topic3);
        enrollSubject(topic4);
        enrollSubject(topic5);
        enrollSubject(topic6);
        enrollTeacher(teacher1);
        enrollTeacher(teacher2);
        enrollTeacher(teacher3);
        enrollTeacher(teacher4);

    }



}