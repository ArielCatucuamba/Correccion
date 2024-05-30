import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1)   Creacion de las instancias con datos quemados

        hotel hotelA=new hotel("Aguazul","Av.Dorsal - calle coma",123456,5);
        hotel hotelB=new hotel("Turcal","Av chibuleo - calle carci",121234,3);
        hotel hotelC=new hotel("Mangar","Av socrates - calle pelicanos",124634,5);
        hotel hotelD=new hotel("Manati","Av barcelona - calle Madrid",812621,4);
        hotel hotelE=new hotel("Tevez ","Av galandrias - calle aguacate",936534,1);

        //2)   crear 2 objetos con valores nulos y setear sus datos
        //objetos con valor null
        hotel hotelF=new hotel();
        hotel hotelH=new hotel();

        System.out.println("****************Impresion de datos null****************");
        System.out.println("Nombre: "+hotelF.getNombre()+"Ubicado en "+hotelF.getDireccion()+"con codigo "
                +hotelF.getCodigo()+ "el caul tiene una valoracion de "+hotelF.getEstrella()+" estrellas");
        System.out.println("Nombre: "+hotelH.getNombre()+"Ubicado en "+hotelH.getDireccion()+"con codigo "
                +hotelH.getCodigo()+ "el caul tiene una valoracion de "+hotelH.getEstrella()+" estrellas");
        hotelF.setNombre("paz");
        hotelF.setDireccion("Av Laz - calle roldof");
        hotelF.setCodigo(123333);
        hotelF.setEstrella(4);

        hotelH.setNombre("Luz");
        hotelH.setDireccion("Av losares - calle bolivar");
        hotelH.setCodigo(232145);
        hotelH.setEstrella(5);
        System.out.println("****************Impresion de datos seteados****************");
        System.out.println("Nombre: "+hotelF.getNombre()+" ubicado en "+hotelF.getDireccion()+" con codigo "
                +hotelF.getCodigo()+ " el cual tiene una valoracion de "+hotelF.getEstrella()+" estrellas");
        System.out.println("Nombre: "+hotelH.getNombre()+" ubicado en "+hotelH.getDireccion()+" con codigo "
                +hotelH.getCodigo()+ " el cual tiene una valoracion de "+hotelH.getEstrella()+" estrellas");

        //3)  Modificar los objetgos creados
        System.out.println("*******************************");
        System.out.println("Modificar el objeto hotelA");
        System.out.println("*******************************");
        hotelA.Modificar();
        System.out.println("*******************************");
        System.out.println("Modificar el objeto hotelB");
        System.out.println("*******************************");
        hotelB.Modificar();
        System.out.println("*******************************");
        System.out.println("Modificar el objeto hotelC");
        System.out.println("*******************************");
        hotelC.Modificar();
        System.out.println("*******************************");
        System.out.println("Modificar el objeto hotelD");
        System.out.println("*******************************");
        hotelD.Modificar();
        System.out.println("*******************************");
        System.out.println("Modificar el objeto hotelE");
        System.out.println("*******************************");
        hotelE.Modificar();

        //4) Uso el metodo imprimir
        System.out.println("*******************************");
        System.out.println("Impresion de los objetos del hotelA");
        System.out.println("*******************************");
        hotelA.Imprimir();
        System.out.println("*******************************");
        System.out.println("Impresion de los objetos del hotelB");
        System.out.println("*******************************");
        hotelB.Imprimir();
        System.out.println("*******************************");
        System.out.println("Impresion de los objetos del hotelC");
        System.out.println("*******************************");
        hotelC.Imprimir();
        System.out.println("*******************************");
        System.out.println("Impresion de los objetos del hotelD");
        System.out.println("*******************************");
        hotelD.Imprimir();
        System.out.println("*******************************");
        System.out.println("Impresion de los objetos del hotelE");
        System.out.println("*******************************");
        hotelE.Imprimir();

        //5)         objetos con valor null
        /*hotel hotelF=new hotel();
        hotel hotelH=new hotel();*/ //utilizare los objetos vacios que ya cree + 1

        hotel hotelG=new hotel();
        System.out.println("*******************************");
        System.out.println("Modificacion e impresion de los objetos del hotelF");
        System.out.println("*******************************");
        hotelF.imprimir_null();
        System.out.println("*******************************");
        System.out.println("Modificacion e impresion de los objetos del hotelH");
        System.out.println("*******************************");
        hotelH.imprimir_null();
        System.out.println("*******************************");
        System.out.println("Modificacion e impresion de los objetos del hotelG");
        System.out.println("*******************************");
        hotelG.imprimir_null();



    }
}