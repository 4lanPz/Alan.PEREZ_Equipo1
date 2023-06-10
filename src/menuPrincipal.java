import conicas2.Circunferencia;
import conicas2.Elipse;
import conicas2.Parabola;
import conicas2.Hiperbole;
import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circunferencia circunferencia_1 = new Circunferencia(45,8);
        Elipse elipse_1 = new Elipse(87,90);
        Parabola parabola_1 = new Parabola(2,6,3,2,8);
        Hiperbole hiperbole_1 = new Hiperbole(2,6);
        int opcion;

        do {
            menu();
            System.out.print("Ingresar opción: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:{
                    System.out.println("\n\t *** CIRCUNFERENCIA ***\n");
                    System.out.println("El area de la circunferencia es: " + circunferencia_1.perimetro_cir());
                    System.out.println("El perimetro de la circunferencia es: " + circunferencia_1.area_cir());
                    break;
                }
                case 2:{
                    System.out.println("\n\t *** ELIPSE ***\n");
                    System.out.println("El area de la elipse es: " + elipse_1.area_elipse());
                    System.out.println("El perimetro de la elipse es: " + elipse_1.perimetro_elipse());
                    break;
                }
                case 3:{
                    System.out.println("\n\t *** PARABOLA ***\n");
                    float a=0,b=0,c=0;
                    System.out.println("El vertice en x es: "+ parabola_1.Parabola_VerticeX(a,b));
                    System.out.println("El vertice en y es: "+ parabola_1.Parabola_VerticeY(a,b,c));
                    break;
                }
                case 4: {
                    System.out.println("\n\t *** HIPERBOLE ***\n");
                    System.out.println(hiperbole_1.variables());
                    break;
                }
            }
        }while (opcion != 5);
    }

    private static void menu(){
        System.out.println("\n\t\t ===== MENU PRINCIPAL =====\n");
        System.out.println("1. CIRCUNFERENCIA");
        System.out.println("2. ELPISE");
        System.out.println("3. PARABOLA");
        System.out.println("4. HIPERBOLE");
        System.out.println("5. SALIR");
    }

}

