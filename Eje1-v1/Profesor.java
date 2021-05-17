import java.util.List;

/*
 * @author <Davidvillarroel>
 */

public class Profesor extends People {
  
  String str;
  int edad;
  String NumeroDeTelefono;
  List<Prestamo> Prestamos;

  public Profesor(String NumeroDeTelefono) {
    super(NumeroDeTelefono);
  }
  public void printInformacionPersonal() {
    System.out.println("Nombre: " + str);
    System.out.print("Edad "+ edad);
    System.out.print("Telefono: " + numeroDeTelefono);
  }
  
   public void printTodaLaInformacion() {
     System.out.print("Nombre: " + str);
     System.out.print("Edad: " + edad);
     System.out.print("Telefono " + this.numeroDeTelefono);
     for (Prestamo p: Prestamos) {
       System.out.println(p);
     }
     
   }

 }
