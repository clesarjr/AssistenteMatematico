package Assistente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class PersistenciaJSON{

	private String nomeArq;
	private GsonBuilder builder;
	private Gson gson;
	
	//set e get
	public String getNomeArq() {
		return nomeArq;
	}
	public void setNomeArq(String nomeArq) {
		this.nomeArq = nomeArq;
	}

	public boolean gravar(String[] tes) {
		builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			FileWriter writer = new FileWriter(nomeArq);
			writer.write(gson.toJson(tes));
			writer.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String[] ler(String nomeArq) {
		builder = new GsonBuilder();
		gson = builder.create();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArq));
			Type listType = new TypeToken<ArrayList<String>>() {
			}.getType();
			String[] lista = null;
			lista = new Gson().fromJson(bufferedReader, listType);
				return lista;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
