package edu.marco.garcia.actividades.actividad4.models;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Subject> subjects;
    private List<Teacher> teachers;

    public Course(String name, List<Subject> subjects) {
        setName(name);
        this.teachers = new ArrayList<>();
        this.subjects = subjects != null ? new ArrayList<>(subjects) : new ArrayList<>(); // Mantiene la lista original o crea una nueva si es null
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del curso no puede estar vacío o ser nulo.");
        }
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return new ArrayList<>(subjects); // Devuelve una copia para evitar modificaciones externas
    }

    public void addSubject(Subject subject) {
        if (subject == null) {
            throw new IllegalArgumentException("La materia no puede ser nula.");
        }
        if (!subjects.contains(subject)) { // Evita duplicados
            subjects.add(subject);
        } else {
            System.out.println("La materia " + subject.getName() + " ya está asignada a este curso.");
        }
    }

    public List<Teacher> getTeachers() {
        return new ArrayList<>(teachers); // Devuelve una copia para evitar modificaciones externas
    }

    public void addTeacher(Teacher teacher) {
        if (teacher == null) {
            throw new IllegalArgumentException("El profesor no puede ser nulo.");
        }
        if (!teachers.contains(teacher)) { 
            teachers.add(teacher);
        } else {
            System.out.println("El profesor " + teacher.getName() + " ya está asignado a este curso.");
        }
    }

    public int getCredits() {
        return subjects.stream().mapToInt(Subject::getCredits).sum();
    }

    public int getHours() {
        return subjects.stream().mapToInt(Subject::getHours).sum();
    }

    @Override
    public String toString() {
        return "Curso: " + name +
                ", Créditos: " + getCredits() +
                ", Horas: " + getHours() +
                ", Materias: " + subjects.size() + 
                ", Profesores: " + teachers.size();
    }
}