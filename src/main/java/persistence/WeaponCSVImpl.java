package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import source.WeaponType;

public class WeaponCSVImpl implements WeaponDAO{

	private static WeaponCSVImpl instance;
	
	private WeaponCSVImpl() {
		
	}
	
	public static WeaponCSVImpl getInstance() {
		if(instance==null) instance = new WeaponCSVImpl();
		return instance;
	}

	private static ArrayList<WeaponDTO> infoWeaponList = new ArrayList<WeaponDTO>();
	private final static String FILE_PATH = "src\\main\\resources\\data\\item\\weapon\\weapon.csv";
	
	public void startWeaponBD() {
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;

		String[] aux = null; 
		
		try {
			
			file = new File(FILE_PATH);
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String linea;
			linea=br.readLine();
			
			while ((linea=br.readLine())!=null) {

				aux = linea.split(";");
				WeaponDTO auxWeapon = new WeaponDTO(WeaponType.valueOf(aux[0].toUpperCase()), Integer.parseInt(aux[1]), aux[2], Integer.parseInt(aux[3]), Integer.parseInt(aux[4]), Integer.parseInt(aux[5]), Integer.parseInt(aux[6]));
				infoWeaponList.add(auxWeapon);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public WeaponDTO getInfoWeapon(WeaponType type, int tier) {
		for (WeaponDTO w : infoWeaponList) {
			if(w.getType().equals(type) && w.getTier() == tier) return w;
		}
		return null;
	}
	
	public List<WeaponDTO> getInfoWeaponList(){
		return infoWeaponList;
	}
	
}
