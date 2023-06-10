import conicas2.Circunferencia;
import conicas2.Elipse;
import conicas2.Parabola;
import conicas2.Hiperbole;
import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circunferencia circunferencia_1 = new Circunferencia(4,98);
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
                    float radio,angulo;
                    System.out.println("Ingrese radio");
                    radio = sc.nextFloat();
                    circunferencia_1.setRadio_cir(radio);
                    System.out.println("Ingrese angulo central");
                    angulo= sc.nextFloat();
                    circunferencia_1.setAngulo_central(angulo);
                    System.out.println("El area de la circunferencia es: " + circunferencia_1.perimetro_cir());
                    System.out.println("El perimetro de la circunferencia es: " + circunferencia_1.area_cir());
                    break;
                }
                case 2:{
                    float eje1,eje2;
                    System.out.println("\n\t *** ELIPSE ***\n");
                    System.out.println("Ingrese eje mayor");
                    eje1 = sc.nextFloat();
                    elipse_1.setEje_mayor(eje1);
                    System.out.println("Ingrese eje menor");
                    eje2= sc.nextFloat();
                    elipse_1.setEje_menor(eje2);
                    System.out.println("El area de la elipse es: " + elipse_1.area_elipse());
                    System.out.println("El perimetro de la elipse es: " + elipse_1.perimetro_elipse());
                    break;
                }
                case 3:{
                    System.out.println("\n\t *** PARABOLA ***\n");
                    float a,b,c;
                    System.out.println("Ingrese el valor de a");
                    a = sc.nextFloat();
                    parabola_1.setA(a);
                    System.out.println("Ingrese el valor de b");
                    b= sc.nextFloat();
                    parabola_1.setB(b);
                    System.out.println("Ingrese el valor de c");
                    c= sc.nextFloat();
                    parabola_1.setC(c);
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

