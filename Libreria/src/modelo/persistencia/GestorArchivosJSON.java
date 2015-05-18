package modelo.persistencia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import modelo.entidades.Libro;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class GestorArchivosJSON {
	String formatoJSON;
	JsonReader jsonReader;

	public GestorArchivosJSON(){


	}
	public void escribirJSON(Libro  libro, String ruta){
		Gson gson = new Gson();
		formatoJSON = gson.toJson(libro);
		//imprimimos en consola el texto con formato JSON
		System.out.println("Texto en Formato JSON de los alumnos agregados:n"+formatoJSON);
		try {
			FileWriter file = new FileWriter(ruta);
			file.write(formatoJSON);
			file.flush();
			file.close();

		} catch (IOException e) {
			//manejar error
		}
	}
	public Libro leerJSON(String ruta){
		Libro libro = null;
		try {
			Gson gson = new Gson();
			FileReader fr = new FileReader(ruta);
			java.lang.reflect.Type tipoObjeto = new TypeToken <Libro>(){}.getType();
			libro=gson.fromJson(fr, tipoObjeto);
			Libro al=libro;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return libro;

	}
}

