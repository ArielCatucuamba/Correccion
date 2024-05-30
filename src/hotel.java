import java.util.Scanner;
//Esto es lo que voy a agregar
public class hotel {
    //Atributos
    public String nombre;
    public String direccion;
    public int codigo;
    public int estrella;
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }

    //Metodo constructor
    public hotel(String nombre,String direccion,int codigo,int estrella){
        this.nombre=nombre;
        this.direccion=direccion;
        this.codigo=codigo;
        this.estrella=estrella;
    }

    public hotel(){

    }
    //metodos


    public void Modificar() {
        Scanner scanner = new Scanner(System.in);
        hotel h = new hotel();
        System.out.println("Ingrese datos del hotel ");
        System.out.print("Nombre: ");
        h.setNombre(scanner.nextLine());
        System.out.print("Direccion: ");
        h.setDireccion(scanner.nextLine());
        System.out.print("Codigo: ");
        h.setCodigo(scanner.nextInt());
        System.out.print("Estrellas: ");
        h.setEstrella(scanner.nextInt());

    }
    public void Imprimir(){

        System.out.println("Nombre: "+getNombre());
        System.out.println("Direccion: "+getDireccion());
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Estrellas: "+getEstrella());

    }

    public void imprimir_null(){
        Scanner scanner = new Scanner(System.in);
        hotel h = new hotel();
        System.out.println("Ingrese datos del hotel ");
        System.out.print("Nombre: ");
        h.setNombre(scanner.nextLine());
        System.out.print("Direccion: ");
        h.setDireccion(scanner.nextLine());
        System.out.print("Codigo: ");
        h.setCodigo(scanner.nextInt());
        System.out.print("Estrellas: ");
        h.setEstrella(scanner.nextInt());

        System.out.println("Nombre: "+getNombre());
        System.out.println("Direccion: "+getDireccion());
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Estrellas: "+getEstrella());

    }


}
