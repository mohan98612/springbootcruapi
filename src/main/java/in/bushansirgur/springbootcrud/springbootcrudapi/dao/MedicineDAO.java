
package in.bushansirgur.springbootcrud.springbootcrudapi.dao;
 
import java.util.List;
 
import in.bushansirgur.springbootcrud.springbootcrudapi.model.Medicine;
 
public interface MedicineDAO {
	
	List<Medicine> get();
	
	Medicine get(String name);
	
	void save(Medicine medicine);
	
	void delete(String name);
	void update(String name,String n);
	void updateadd(String name,String n);
}