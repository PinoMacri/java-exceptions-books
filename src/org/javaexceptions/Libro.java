package org.javaexceptions;

public class Libro {
private String titolo;
private int pagine;
private String autore;
private String editore;
public Libro (String titolo, int pagine, String autore, String editore) throws Exception {
	setTitolo(titolo);
	setPagine(pagine);
	setAutore(autore);
	setEditore(editore);
}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) throws Exception {
    this.titolo = titolo;
    if (this.titolo.equals("")) {
        throw new Exception("Il titolo non può essere una stringa vuota");
    }
}

public int getPagine() {
	return pagine;
}
public void setPagine(int pagine) throws Exception {
	this.pagine = pagine;
	if (pagine <=0 ) {
		 throw new Exception("Non puoi creare un libro con 0 pagine");
	}
}
public String getAutore() {
	return autore;
}
public void setAutore(String autore) {
	this.autore = autore;
}
public String getEditore() {
	return editore;
}
public void setEditore(String editore) {
	this.editore = editore;
}
public String toString() {

    return "titolo: " + titolo + " pagine " + pagine + " autore: " + autore + " " + "editore: " + editore + " " ;
}
}
