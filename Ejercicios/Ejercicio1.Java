import java.util.Scanner;

public class EvaluacionAlumno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota de la primera evaluación: ");
        double evaluacion1 = sc.nextDouble();

        System.out.print("Ingrese la nota de la segunda evaluación: ");
        double evaluacion2 = sc.nextDouble();

        System.out.print("Ingrese la nota de la tercera evaluación: ");
        double evaluacion3 = sc.nextDouble();

        //Promedio
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        if (promedio >= 7) {
            resultado = "Aprobado";
        } else {
            resultado = "Reprobado";
        }