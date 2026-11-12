
import javax.swing.SingleSelectionModel;

public class Examen {
    public static void main(String[] args) {

sistem.out.ptrintln("Examen parcial PRG1");
sistem.out.ptrintln("¿Qué edad tienes?");
int= edad = Integer.parseInt(System.console().readLine());
if (edad >= 18) {
    sistem.out.ptrintln("Eres mayor de edad");
} else {
    sistem.out.ptrintln("Eres menor de edad");
}
if (edad >= 16 && edad <= 99) {
    sistem.out.ptrintln("Eres valido");
} else if (edad < 16 && edad > 99) {
    sistem.out.ptrintln("No eres valido");
    system.out.println("¿En cuántas asignaturas estás matriculado?");
    int asignaturas = Integer.parseInt(System.console().readLine());
    if asignaturas >= 1 && asignaturas <= 10) {
        sistem.out.ptrintln("Eres valido");
    } else if (asignaturas =0 && asignaturas > 10) {
        sistem.out.ptrintln("No eres valido");

}System.out.println(".(¿Qué nota has obtenido en la asignatura N?)");
int nota asignatura=>1 

import java.util.Random;

public class MediaNotasApp {
    public static void main(String[] args) {
        String[] asignaturas = {
            "Matemáticas", "Física", "Química", "Historia", 
            "Literatura", "Inglés", "Biología", "Informática", 
            "Geografía", "Educación Física"
        };
        
        Random random = new Random();
        double sumaNotas = 0;
        
        System.out.println("=== BOLETÍN DE CALIFICACIONES ===");
        
        for (int i = 0; i < asignaturas.length; i++) {
            int nota = random.nextInt(10) + 1;
            sumaNotas += nota;
            System.out.println(asignaturas[i] + ": " + nota);
        }
        
        double media = sumaNotas / asignaturas.length;
        System.out.println("---------------------------------");
        System.out.println("Nota media final: " + media);
        import java.util.Random;

public class CalificacionesApp {
    public static void main(String[] args) {
        String[] asignaturas = {
            "Matemáticas", "Física", "Química", "Historia", 
            "Literatura", "Inglés", "Biología", "Informática", 
            "Geografía", "Educación Física"
        };
        
        Random random = new Random();
        double sumaNotas = 0;
        int aprobadas = 0;
        
        System.out.println("=== BOLETÍN DE CALIFICACIONES ===");
        
        for (int i = 0; i < asignaturas.length; i++) {
            int nota = random.nextInt(10) + 1;
            sumaNotas += nota;
            System.out.println(asignaturas[i] + ": " + nota);
            
            // Contamos si la nota es 5 o más
            if (nota >= 5) {
                aprobadas++;
            }
        }
        
        double media = sumaNotas / asignaturas.length;
        System.out.println("---------------------------------");
        System.out.println("Nota media final: " + media);
        System.out.println("Asignaturas aprobadas (5 o más): " + aprobadas);
    }
}
    }
}
}
}