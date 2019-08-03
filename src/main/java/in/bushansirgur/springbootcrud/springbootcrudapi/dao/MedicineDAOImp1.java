package in.bushansirgur.springbootcrud.springbootcrudapi.dao;
 
import java.util.List;
 
import javax.persistence.EntityManager;
 
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
 
 
import in.bushansirgur.springbootcrud.springbootcrudapi.model.Medicine;
 
@Repository
public class MedicineDAOImp1 implements MedicineDAO {
 
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Medicine> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Medicine> query = currentSession.createQuery("from Medicine", Medicine.class);
		List<Medicine> list = query.getResultList();
		return list;
	}
 
	@Override
	public Medicine get(String name) {
		Session currentSession = entityManager.unwrap(Session.class);
		String sql=("FROM Medicine WHERE name='" + name +"'");
	
		Query<Medicine> query=currentSession.createQuery(sql,Medicine.class);
		//Medicine medicineObj = currentSession.get(Medicine.class, name);
		Medicine medicineObj= query.uniqueResult();
		return  medicineObj;
	}
 
	@Override
	public void save(Medicine medicine) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(medicine);
	}
 
	@Override
	public void delete(String name) {
		Session currentSession = entityManager.unwrap(Session.class);
		String sql=("FROM Medicine WHERE name='" + name +"'");
		
		Query<Medicine> query=currentSession.createQuery(sql,Medicine.class);
		Medicine medicineObj= query.uniqueResult();
		//Medicine medicineObj = currentSession.get(Medicine.class, name);
		currentSession.delete(medicineObj);
	}
	@Override
	public void update(String name,String n) {
		Session currentSession = entityManager.unwrap(Session.class);
		String sql=("FROM Medicine WHERE name='" + name +"'");
		
		Query<Medicine> query=currentSession.createQuery(sql,Medicine.class);
		Medicine medicineObj= query.uniqueResult();
		int a=medicineObj.getquantity();
		int b=Integer.parseInt(n);
		medicineObj.setquantity(a-b);
		//Medicine medicineObj = currentSession.get(Medicine.class, name);
		currentSession.saveOrUpdate(medicineObj);
	}
	
	@Override
	public void updateadd(String name,String n) {
		Session currentSession = entityManager.unwrap(Session.class);
		String sql=("FROM Medicine WHERE name='" + name +"'");
		
		Query<Medicine> query=currentSession.createQuery(sql,Medicine.class);
		Medicine medicineObj= query.uniqueResult();
		int a=medicineObj.getquantity();
		int b=Integer.parseInt(n);
		medicineObj.setquantity(a+b);
		//Medicine medicineObj = currentSession.get(Medicine.class, name);
		currentSession.saveOrUpdate(medicineObj);
	}
 
}