package org.javaexceptions;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Quanti libri vuoi inserire?");
		int numeroLibri = in.nextInt();
		
		Libro[] libri = new Libro[numeroLibri];
		
		for (int i=0; i<libri.length;i++) {
			try {
				Scanner title = new Scanner (System.in);
				System.out.println("Titolo " + "del " + "Libro " + (i+1) );
				String titoloLibro = title.nextLine();
				Scanner numberPage = new Scanner (System.in);
				System.out.println("Numero pagine " + "del " + "Libro " + (i+1));
				int numeroPagine = numberPage.nextInt();
				Scanner autor = new Scanner (System.in);
				System.out.println("Autore " + "del " + "Libro " + (i+1));
				String autoreLibro = autor.nextLine();
				Scanner editor = new Scanner (System.in);
				System.out.println("Editore " + "del " + "Libro " + (i+1));
				String editoreLibro = editor.nextLine();
				
				Libro libro = new Libro(titoloLibro, numeroPagine, autoreLibro, editoreLibro);
				libri[i]=libro;
			} catch (Exception e) {
				System.err.println("Campi non validi");
			}
			
			
			
		}
		System.out.println(Arrays.toString(libri));
		writeFile(libri);
		in.close();
		
	}
	 public static void writeFile(Libro[] libri) {
		 System.out.println("Writing file");
			try {
				 FileWriter myWriter = new FileWriter("C:/Users/pinom/text.txt");
				myWriter.write(Arrays.toString(libri));	
			myWriter.close();	
			} catch (Exception e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
	
	 }}

	

