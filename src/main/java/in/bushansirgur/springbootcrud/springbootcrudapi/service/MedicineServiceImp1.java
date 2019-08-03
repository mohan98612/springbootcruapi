package in.bushansirgur.springbootcrud.springbootcrudapi.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import in.bushansirgur.springbootcrud.springbootcrudapi.dao.MedicineDAO;
import in.bushansirgur.springbootcrud.springbootcrudapi.model.Medicine;
 
@Service
public class MedicineServiceImp1 implements MedicineService {
 
	@Autowired
	private MedicineDAO medicineDAO; 
	
	@Transactional
	@Override
	public List<Medicine> get() {
		return medicineDAO.get();
	}
 
	@Transactional
	@Override
	public Medicine get(String name) {
		return medicineDAO.get(name);
	}
 
	@Transactional
	@Override
	public void save(Medicine medicine) {
		medicineDAO.save(medicine);
	}
 
	@Transactional
	@Override
	public void delete(String name) {
		medicineDAO.delete(name);
	}
	@Transactional
	@Override
	public void update(String name,String n) {
		medicineDAO.update(name,n);
	}
	@Transactional
	@Override
	public void updateadd(String name,String n) {
		medicineDAO.updateadd(name,n);
	}
 
}