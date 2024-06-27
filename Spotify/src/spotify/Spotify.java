/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotify;

/**
 *
 * @author Diego
 */
public class Spotify {
    public static void main(String[] args) {
        
        Cancion cancion156 = new Cancion(156, "Descending", "TOOL", 13.38, 2019);

        /*Llamo getters y despliega valores ya predeterminados*/
        System.out.println("ID: "+ cancion156.getIdCancion());
        System.out.println("Titulo: "+ cancion156.getTituloCancion());
        System.out.println("Autor/Banda: " + cancion156.getAutorCancion());
        System.out.println("Duracion: " + cancion156.getDuracionCancion() + " minutos");
        System.out.println("Ano creacion: " + cancion156.getAnoCancion());

        //*Con set cambio los valores que tenia con los get*//
        
        cancion156.setIdCancion(157);
        cancion156.setTituloCancion("TOXICITY - System of a Down");
        cancion156.setAutorCancion("System of a Down");
        cancion156.setDuracionCancion(3.39);
        cancion156.setAnoCancion(2001);
        
        //*Despliega los valores ya modificados *//
        System.out.println("\n----------------------------\n VALORES MODIFICADOS");
         System.out.println("ID: " +cancion156.getIdCancion());
         System.out.println("Titulo: " +cancion156.getTituloCancion());
        System.out.println("Autor/Banda: " +cancion156.getAutorCancion());
        System.out.println("Duracion: " +cancion156.getDuracionCancion()+" minutos");
         System.out.println("Ano: " +cancion156.getAnoCancion());
    }
}
