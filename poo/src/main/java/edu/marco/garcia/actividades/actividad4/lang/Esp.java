package edu.marco.garcia.actividades.actividad4.lang;

public class Esp extends Lang{

    public Esp(){
        SELECT_AN_OPTION = "Selecciona una opción: ";
        INVALID_INPUT_EMPTY = "Entrada inválida. No puedes dejar el campo vacío.";
        INVALID_OPTION = "Opción inválida. Por favor, introduce un número del menú.";
        INVALID_INPUT_NOT_NUMBER = "Entrada inválida. Por favor, introduce un número.";
        INVALID_INPUT_NEGATIVE_NUMBER = "Entrada inválida. Por favor, introduce un número positivo.";
        GOODBYE = "¡Hasta luego!";
        LANGUAGE_MENU_TOP = "\n╔══════════════════════════════════════════════╗\n║ El idioma actual de tu ordenador es: ";
        LANGUAGE_MENU_BOTTOM = "   ║\n║      ¿Te gustaría cambiar el idioma?         ║\n╠══════════════════════════════════════════════╣\n║                  1. Español                  ║\n║                  2. Ingles                   ║\n║                  3. Salir                    ║\n╚══════════════════════════════════════════════╝";
        SHOW_MENU = "+------------------------------------------+\n" +
        "|            Menú Principal               |\n" +
        "+-----------------------------------------+\n" +
        "| 1. Dar de alta a un alumno              |\n" +
        "| 2. Dar de alta a un profesor            |\n" +
        "| 3. Crear un curso                       |\n" +
        "| 4. Mostrar profesores contratados       |\n" +
        "| 5. Mostrar alumnos inscritos            |\n" +
        "| 6. Mostrar cursos actuales              |\n" +
        "| 7. Salir                                |\n" +
        "+------------------------------------------+";
        STUDENT_NAME = "Nombre del alumno: ";
        STUDENT_NAME_HEADLINER =
        "╔══════════════════════════════════╗\n" +
        "║   Ingresa el nombre del alumno   ║\n" +
        "╚══════════════════════════════════╝";
        STUDENT_ID = "Matrícula del alumno: ";
        STUDENT_ID_HEADLINER =
        "╔══════════════════════════════════╗\n" +
        "║  Ingresa la matrícula del alumno ║\n" +
        "╚══════════════════════════════════╝";
        STUDENT_AGE = "Edad del alumno: ";
        STUDENT_AGE_HEADLINER =
        "╔═════════════════════════════╗\n" +
        "║  Ingresa la edad del alumno ║\n" +
        "╚═════════════════════════════╝";
        STUDENT_ENROLLMENT = "Inscripción del alumno: ";
        STUDENT_ENROLLMENT_HEADLINER =
        "╔══════════════════════════════════════════════════════╗\n" +
        "║  Ingresa el curso al que quieres inscribir al alumno ║\n" +
        "╚══════════════════════════════════════════════════════╝";
        STUDENT_ADDED =
        "╔══════════════════════════════════════════╗\n" +
        "║ Estudiante añadido al sistema con éxito. ║\n" +
        "╚══════════════════════════════════════════╝";
        // Profesores
        TEACHER_NAME = "Nombre del profesor: ";
        TEACHER_NAME_HEADLINER =
        "╔══════════════════════════════════╗\n" +
        "║  Ingresa el nombre del profesor  ║\n" +
        "╚══════════════════════════════════╝";
        TEACHER_PAYROLL = "Nómina del profesor: ";
        TEACHER_PAYROLL_HEADLINER =
        "╔══════════════════════════════════╗\n" +
        "║  Ingresa la nómina del profesor  ║\n" +
        "╚══════════════════════════════════╝";
        TEACHER_SALARY = "Salario del profesor: ";
        TEACHER_SALARY_HEADLINER =
        "╔══════════════════════════════════╗\n" +
        "║ Ingresa el salario del profesor  ║\n" +
        "╚══════════════════════════════════╝";
        TEACHER_SUBJECT = "Materia del profesor: ";
        TEACHER_SUBJECT_HEADLINER =
        "╔════════════════════════════════════════════════════╗\n" +
        "║  Ingresa la materia que va a impartir el profesor  ║\n" +
        "╚════════════════════════════════════════════════════╝";
        TEACHER_ADDED =
        "╔════════════════════════════════════════╗\n" +
        "║ Profesor añadido al sistema con éxito. ║\n" +
        "╚════════════════════════════════════════╝";
        // Cursos
        COURSE_NAME_HEADLINER =
        "╔══════════════════════════════════════════════════════╗\n" +
        "║   Ingresa el nombre que quieres que tenga el curso   ║\n" +
        "╚══════════════════════════════════════════════════════╝";
        COURSE_NAME = "Nombre del curso: ";
        COURSE_TOPIC_NAME_HEADLINER =
        "╔══════════════════════════════════════════════════════╗\n" +
        "║ Ingresa el nombre de la materia que compone el curso ║\n" +
        "╚══════════════════════════════════════════════════════╝";
        COURSE_TOPIC_NAME = "Nombre de la materia: ";
        COURSE_TOPIC_ID_HEADLINER =
        "╔══════════════════════════════════════════════════════╗\n" +
        "║   Ingresa el ID de la materia que compone el curso   ║\n" +
        "╚══════════════════════════════════════════════════════╝";
        COURSE_TOPIC_ID = "ID de la materia: ";
        COURSE_TOPIC_CREDITS_HEADLINER =
        "╔══════════════════════════════════════════════════════╗\n" +
        "║      Ingresa los créditos que tiene la materia       ║\n" +
        "╚══════════════════════════════════════════════════════╝";
        COURSE_TOPIC_CREDITS = "Créditos de la materia: ";
        COURSE_TOPIC_HOURS_HEADLINER =
        "╔═══════════════════════════════════════════════════════╗\n" +
        "║ Ingresa las horas totales que se impartirá la materia ║\n" +
        "╚═══════════════════════════════════════════════════════╝";
        COURSE_TOPIC_HOURS = "Horas de la materia: ";
        COURSE_ADDED =
        "╔═════════════════════════════════════╗\n" +
        "║ Curso añadido al sistema con éxito. ║\n" +
        "╚═════════════════════════════════════╝";
        // Mostrar profesores
        SHOW_TEACHERS = "Profesores contratados";
        SHOW_TEACHERS_MENU =
        "╔═══════════════════╗\n" +
        "║    Profesores     ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        SHOW_TEACHERS_MENU_NAME = "║ Nombre: ";
        SHOW_TEACHERS_MENU_PAYROLL = "║ Nómina: ";
        SHOW_TEACHERS_MENU_SALARY = "║ Salario: ";
        SHOW_TEACHERS_MENU_SUBJECT = "║ Materia: ";
        SHOW_TEACHERS_MENU_BOTTOM = "╚═══════════════════╝";
        // Mostrar alumnos
        SHOW_STUDENTS = "Alumnos inscritos";
        SHOW_STUDENTS_MENU =
        "╔═══════════════════╗\n" +
        "║      Alumnos      ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        SHOW_STUDENTS_MENU_NAME = "║ Nombre: ";
        SHOW_STUDENTS_MENU_ID = "║ Matrícula: ";
        SHOW_STUDENTS_MENU_AGE = "║ Edad: ";
        SHOW_STUDENTS_MENU_ENROLLMENT = "║ Inscrito al curso de: ";
        SHOW_STUDENTS_MENU_BOTTOM = "╚═══════════════════╝";
        // Mostrar cursos
        SHOW_COURSES = "Cursos actuales";
        SHOW_COURSES_MENU =
        "╔═══════════════════╗\n" +
        "║      Cursos       ║\n" +
        "╚═══════════════════╝\n" +
        "╔═══════════════════╗";
        SHOW_COURSES_MENU_NAME = "║ Nombre: ";
        SHOW_COURSES_MENU_TOPICS = "║ Materias: ";
        SHOW_COURSES_MENU_CREDITS = "║ Créditos: ";
        SHOW_COURSES_MENU_HOURS = "║ Horas: ";
        SHOW_COURSES_MENU_BOTTOM = "╚═══════════════════╝";


        // Clase Schoolmanager
        STUDENT = "Estudiante";
        HAS_ENROLLED_IN = "Se ha inscrito en";
        ENROLLED_STUDENTS = "Estos son los estudiantes en el curso:";
        NO_ENROLLED_STUDENTS = "No hay estudiantes inscritos.";
        NO_REGISTERED_COURSES = "No hay cursos registrados.";
        COURSE = "Curso";
        TEACHER = "Profesor";
        TOPIC = "Tema";
        NOT_ASIGNATED = "No asignado";
        HOURS = "Horas";
        CREDITS = "Créditos";
        NOT_REGISTERED_TEACHERS = "No hay profesores registrados.";
        REGISTERED_TEACHERS = "Estos son los profesores registrados:";
        THERE_NO_SUBJECTS_ASIGNATED_TO = "No hay materias asignadas a";
        TOTAL_HOURS = "Total de horas";
        TOTAL_CREDITS = "Total de créditos";
        NOT_REGISTERED_TOPICS = "No hay temas registrados.";
        ID = "ID";
        NO_TEACHER_FOUND = "Profesor no encontrado.";
        THE_TEACHER = "El profesor";
        NOT_ASIGNATED_SUBJECTS = "No tiene materias asignadas.";
        TEACHER_SALARY_CALCULATION = "Cálculo de salario para el profesor:";
        TOTAL_SALARY = "Salario total: $";
        HOURS_WITH_COMA = ", Horas: ";
        PAY_PER_HOUR = ", Pago por hora: $";
        SUBTOTAL = ", Subtotal: $";
                
        // Clase Topic
        NAME_NULL_ERROR = "El nombre no puede ser nulo";
        ID_NULL_ERROR = "El ID no puede ser nulo";
        CREDITS_NUMBER_ERROR = "Los créditos no pueden ser menores o iguales a 0";
        HOURS_NUMBER_ERROR = "Las horas no pueden ser menores o iguales a 0";
              
        // Clase Teacher
        PAYROLL_NULL_ERROR = "La nómina no puede ser nula";
        SALARY_NUMBER_ERROR = "El salario no puede ser menor o igual a 0";
        PAYROLL_WITH_COLON = "Nómina: ";
        TEACHER_WITH_COLON = "Profesor: ";
        SALARY_WITH_COLON = "Salario: ";
        TOPICS_WITH_COLON = "Temas: ";
                
        // Clase Student
        AGE_NUMBER_ERROR = "La edad no puede ser menor o igual a 0";
        STUDENT_WITH_COLON = "Estudiante: ";
        AGE_WITH_COLON = "Edad: ";
        ID_WITH_COLON = "ID: ";
                
    }


}
