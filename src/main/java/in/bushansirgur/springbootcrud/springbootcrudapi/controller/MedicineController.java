package in.bushansirgur.springbootcrud.springbootcrudapi.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import in.bushansirgur.springbootcrud.springbootcrudapi.model.Medicine;
import in.bushansirgur.springbootcrud.springbootcrudapi.service.MedicineService;
 
@RestController
@RequestMapping("/api")
public class MedicineController {
 
	@Autowired
	private MedicineService medicineService;
	
	@PostMapping("/medicine")
	// updating the records
	public Medicine save(@RequestBody Medicine medicineObj) {
		medicineService.save(medicineObj);
	
		return medicineObj;
	}
	
	@GetMapping("/medicine")
	// getting all records
	public List<Medicine> get(){
		return medicineService.get();
	}
	
	@GetMapping("/medicine/{name}")
	//getting particular record from database by medicine name
	public Medicine get(@PathVariable String name) {
		Medicine medicineObj = medicineService.get(name);
		if(medicineObj == null) {
			throw new RuntimeException("medicine not found for the name:"+name);
		}
		return medicineObj;
	}
	
	@PutMapping("/medicine")
	//adding a new medicine
	public Medicine update(@RequestBody Medicine medicineObj) {
		medicineService.save(medicineObj);
		return medicineObj;
	}
	@PutMapping("/medicine/sell/{name}/{n}")
	//for a selling  medicine by medicine name and quantity
	public String update(@PathVariable String name, @PathVariable String n) {
		medicineService.update(name,n);
		return "medicine has been sold";
	}
	@PutMapping("/medicine/add/{name}/{n}")
	// adding the medicine to the database by  medicine name and its quantity;
	public String add(@PathVariable String name, @PathVariable String n) {
		medicineService.updateadd(name,n);
		return "medicine has been added to database";
	}
	
	@DeleteMapping("/medicine/{name}")
	//for deleting the record by medicine name 
	public String delete(@PathVariable String name) {
		medicineService.delete(name);
		return "Medicine has been deleted with id:"+name;
	}
}