import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportePDF {
    public static void main(String[] args) {
        // Simulación de datos del sistema
        HashMap<String, Curso> cursos = new HashMap<>();
        
        // Agregamos cursos de ejemplo
        cursos.put("Mat001", new Curso("Matemáticas", "Juan Pérez", List.of("Ana", "Carlos", "Elena")));
        cursos.put("Prog002", new Curso("Programación", "María López", List.of("Luis", "Sofía", "Pedro")));

        // Generar el reporte
        generarReporte(cursos, "reporte_cursos.pdf");
    }

    public static void generarReporte(HashMap<String, Curso> cursos, String destino) {
        try {
            PdfWriter writer = new PdfWriter(destino);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Título del reporte
            document.add(new Paragraph("Reporte de Cursos").setBold().setFontSize(16));

            // Tabla con los datos
            Table table = new Table(3);
            table.addCell("Curso");
            table.addCell("Profesor");
            table.addCell("Alumnos Inscritos");

            // Llenamos la tabla con los datos del HashMap
            for (Map.Entry<String, Curso> entry : cursos.entrySet()) {
                Curso curso = entry.getValue();
                table.addCell(curso.getNombre());
                table.addCell(curso.getProfesor());
                table.addCell(String.join(", ", curso.getAlumnos())); // Lista de alumnos
            }

            // Agregar tabla al documento
            document.add(table);
            document.close();
            System.out.println("Reporte generado: " + destino);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Clase auxiliar para modelar los cursos
class Curso {
    private String nombre;
    private String profesor;
    private List<String> alumnos;

    public Curso(String nombre, String profesor, List<String> alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public String getNombre() { return nombre; }
    public String getProfesor() { return profesor; }
    public List<String> getAlumnos() { return alumnos; }
}

