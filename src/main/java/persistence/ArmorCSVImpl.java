package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import source.ArmorType;
import source.WeaponType;

public class ArmorCSVImpl implements ArmorDAO {
	
	private static ArmorCSVImpl instance;
	
	private ArmorCSVImpl() {
		
	}
	
	public static ArmorCSVImpl getInstance() {
		if(instance==null) instance = new ArmorCSVImpl();
		return instance;
	}

	private static ArrayList<ArmorDTO> infoArmorList = new ArrayList<ArmorDTO>();
	private final static String FILE_PATH = "src\\main\\resources\\data\\item\\armor\\armor.csv";
	
	public void startArmorBD() {

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
			ArmorDTO auxArmor = new ArmorDTO(ArmorType.valueOf(aux[0].toUpperCase()), Integer.parseInt(aux[1]), aux[2], Integer.parseInt(aux[3]), Integer.parseInt(aux[4]));
				infoArmorList.add(auxArmor);
				
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

	public ArmorDTO getInfoArmor(WeaponType type, int tier) {
		for (ArmorDTO a : infoArmorList) {
			if(a.getType().equals(type) && a.getTier() == tier) return a;
		}
		return null;
	}

	public List<ArmorDTO> getInfoArmorList() {
		return infoArmorList;
	}

}
