package in.bushansirgur.springbootcrud.springbootcrudapi.service;
 
import java.util.List;
 
import in.bushansirgur.springbootcrud.springbootcrudapi.model.Medicine;
 
public interface MedicineService {
	
	List<Medicine> get();
	
	Medicine get(String name);
	
	void save(Medicine medicine);
	
	void delete(String name);
	void update(String name,String n);
	void updateadd(String name,String n);
}