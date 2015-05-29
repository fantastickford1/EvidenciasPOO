import java.io.*; //Importacion de librerias

public class AnalizaFile{

//Atributos de la clase//
  String aarchivo;
  String rdline;
  FileReader fr;
  BufferedReader br;

//Constructor por default: se tuvo que declarar ya que sin el no reconocia el Constructor por default//
  public AnalizaFile(){
  }
//Constructor con parametro del nombre del archivo//
  public AnalizaFile(String nombre_archivo){
    aarchivo = nombre_archivo;
  }
//Metodo que obtiene el numero de lineas//
  public int getLines(){
    int numLines = 0;
    try{
      fr = new FileReader(aarchivo);
      br = new BufferedReader(fr);
      while((rdline = br.readLine()) != null){
      numLines++;
      }
    }catch(java.io.IOException ioex){
      return -1;
    }finally{
      try{
        if(null != fr){
          fr.close();
        }
      }catch(java.io.IOException ioex){
      }
    }
    return numLines;
  }
//Metodo que obtiene la primera linea del txt//
  public String getFirstLine(){
    try{
      fr = new FileReader(aarchivo);
      br = new BufferedReader(fr);
      rdline = br.readLine();
    }catch(java.io.IOException ioex){
      return "ERROR,  especificar un nombre de archivo";
    }finally{
      try{
        if(null != fr){
          fr.close();
        }
      }catch(java.io.IOException ioex){
      }
    }
    return rdline;
  }
//Metodo que obtiene la ultima linea del txt//
  public String getLastLine(){
    int firtLines = 0;
    String lastLine="";
    try{
      fr = new FileReader(aarchivo);
      br = new BufferedReader(fr);
      while((rdline = br.readLine()) != null){
        lastLine = rdline;
      }
    }catch(java.io.IOException ioex){
      return "ERROR,  especificar un nombre de archivo";
    }finally{
      try{
        if(null != fr){
          fr.close();
        }
      }catch(java.io.IOException ioex){
      }
    }
    return lastLine;
  }
//Metodo que sirve como auxiliar para recibir el nombre del txt si se usa el Constructor por defecto//
  public void setFileName(String nfile){
    aarchivo = nfile;
  }
//Creditos con informacion del proyecto//
  public void creditos(){
    System.out.println("Programa: Lectura de archivos");
    System.out.println("Docente: Dr. Juan Carlos Lopez Pimentel");
    System.out.println("Intregrandes del equipo: \n Diana Alondra Toledo Maza: 143355 \n Hugo Sarmiento Toledo: 143359\n Carlos Alejandro Zenteno Robles:143382");
    System.out.println("Asignatura: Programacion Orientada a Objetos");
    System.out.println("Corte: 1er");
    System.out.println("Fecha de entrega:05/30/2015");
  }

}
