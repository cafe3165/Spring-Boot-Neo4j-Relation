package com.appleyk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appleyk.RelationRepository.ProvideRepository;
import com.appleyk.node.Device;
import com.appleyk.node.Location;
import com.appleyk.node.Service;
import com.appleyk.relation.Provide;
import com.appleyk.repository.DeviceRepository;
import com.appleyk.repository.LocationRepository;
import com.appleyk.repository.ServiceRepository;
import com.appleyk.repository.UserRepository;

@RestController
public class SmartController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	DeviceRepository deviceRepository;
	@Autowired
	ServiceRepository serviceRepository;
	@Autowired
	LocationRepository locationRepository;
	@Autowired
	ProvideRepository provideRepository;
	
	@RequestMapping("/cdevice")
	
	public void creatDevice() {
		List<Device> devicesNodes = new ArrayList<>();
		Device dNode1 = new Device();
		dNode1.setNN("D1");
		dNode1.setDName("Airconditioner");
		dNode1.setLName("sittingroom");
		dNode1.setKey("Temperature");
		dNode1.setValue(22);
		
		Device dNode2 = new Device();
		dNode2.setNN("D2");
		dNode2.setDName("SmartLight");
		dNode2.setLName("sittingroom");
		dNode2.setKey("Brightness");
		dNode2.setValue(22);
		
		Device dNode3 = new Device();
		dNode3.setNN("D3");
		dNode3.setDName("PMMonitor");
		dNode3.setLName("sittingroom");
		dNode3.setKey("PM2.5");
		dNode3.setValue(22);
		
		Device dNode4 = new Device();
		dNode4.setNN("D4");
		dNode4.setDName("Air2s");
		dNode4.setLName("bedroom");
		dNode4.setKey("PM2.5");
		dNode4.setValue(22);
		
		Device dNode5 = new Device();
		dNode5.setNN("D5");
		dNode5.setDName("Airconditioner");
		dNode5.setLName("bedroom");
		dNode5.setKey("Temperature");
		dNode5.setValue(22);
		
		Device dNode6 = new Device();
		dNode6.setNN("D6");
		dNode6.setDName("SmartLight");
		dNode6.setLName("bedroom");
		dNode6.setKey("Brightness");
		dNode6.setValue(22);
		
		Device dNode7 = new Device();
		dNode7.setNN("D7");
		dNode7.setDName("FlowerMonitor");
		dNode7.setLName("balcony");
		dNode7.setKey("Humidity");
		dNode7.setValue(22);
		
		Device dNode8 = new Device();
		dNode8.setNN("D8");
		dNode8.setDName("SmartWaterPump");
		dNode8.setLName("balcony");
		dNode8.setKey("Humidity");
		dNode8.setValue(22);

		devicesNodes.add(dNode1);devicesNodes.add(dNode2);devicesNodes.add(dNode3);
		devicesNodes.add(dNode4);devicesNodes.add(dNode5);devicesNodes.add(dNode6);
		devicesNodes.add(dNode7);devicesNodes.add(dNode8);
		Iterable<Device> iterable = deviceRepository.save(devicesNodes);	
		for (Device d : iterable) {
			System.out.println("创建节点：【"+d.getDName()+"】成功！");
		}
		
		
		
	}
	
	
	@RequestMapping("/cservice")
	
	public void createService() {
		List<Service> servicesNodes = new ArrayList<>();
		//空调
		Service service1=new Service(); 
		service1.setName("S11");
		service1.setLName("sittingroom");
		service1.setCType("Temperature");
		service1.setEffect("Monitor");
		service1.setDName("Airconditioner");
		service1.setState("Off");
		service1.setValue(22);
		
		Service service2=new Service(); 
		service2.setName("S12");
		service2.setLName("sittingroom");
		service2.setCType("Temperature");
		service2.setEffect("Increase");
		service2.setDName("Airconditioner");
		service2.setState("Off");
		service2.setValue(22);
		
		Service service3=new Service(); 
		service3.setName("S13");
		service3.setLName("sittingroom");
		service3.setCType("Temperature");
		service3.setEffect("Reduce");
		service3.setDName("Airconditioner");
		service3.setState("Off");
		service3.setValue(22);
		
		Service service4=new Service(); 
		service4.setName("S14");
		service4.setLName("sittingroom");
		service4.setCType("Temperature");
		service4.setEffect("Assign");
		service4.setDName("Airconditioner");
		service4.setState("Off");
		service4.setValue(22);
		//灯
		Service service5=new Service(); 
		service5.setName("S21");
		service5.setLName("sittingroom");
		service5.setCType("Brightness");
		service5.setEffect("Monitor");
		service5.setDName("SmartLight");
		service5.setState("Off");
		service5.setValue(22);
		
		Service service6=new Service(); 
		service6.setName("S22");
		service6.setLName("sittingroom");
		service6.setCType("Brightness");
		service6.setEffect("Increase");
		service6.setDName("SmartLight");
		service6.setState("Off");
		service6.setValue(22);
		
		Service service7=new Service(); 
		service7.setName("S23");
		service7.setLName("sittingroom");
		service7.setCType("Brightness");
		service7.setEffect("Assign");
		service7.setDName("SmartLight");
		service7.setState("Off");
		service7.setValue(22);
		//pm检测
		Service service8=new Service(); 
		service8.setName("S31");
		service8.setLName("sittingroom");
		service8.setCType("PM2.5");
		service8.setEffect("Monitor");
		service8.setDName("PMMonitor");
		service8.setState("Off");
		service8.setValue(22);
		//空气净化器
		Service service9=new Service(); 
		service9.setName("S41");
		service9.setLName("sittingroom");
		service9.setCType("PM2.5");
		service9.setEffect("Reduce");
		service9.setDName("Air2s");
		service9.setState("Off");
		service9.setValue(22);
		//卧室空调
		Service service10=new Service(); 
		service10.setName("S51");
		service10.setLName("bedroom");
		service10.setCType("Temperature");
		service10.setEffect("Monitor");
		service10.setDName("Airconditioner");
		service10.setState("Off");
		service10.setValue(22);
		
		Service service11=new Service(); 
		service11.setName("S52");
		service11.setLName("bedroom");
		service11.setCType("Temperature");
		service11.setEffect("Increase");
		service11.setDName("Airconditioner");
		service11.setState("Off");
		service11.setValue(22);
		
		Service service12=new Service(); 
		service12.setName("S53");
		service12.setLName("bedroom");
		service12.setCType("Temperature");
		service12.setEffect("Reduce");
		service12.setDName("Airconditioner");
		service12.setState("Off");
		service12.setValue(22);
		
		Service service13=new Service(); 
		service13.setName("S54");
		service13.setLName("bedroom");
		service13.setCType("Temperature");
		service13.setEffect("Assign");
		service13.setDName("Airconditioner");
		service13.setState("Off");
		service13.setValue(22);
		//卧室的灯
		Service service14=new Service(); 
		service14.setName("S61");
		service14.setLName("bedroom");
		service14.setCType("Brightness");
		service14.setEffect("Monitor");
		service14.setDName("SmartLight");
		service14.setState("Off");
		service14.setValue(22);
		
		Service service15=new Service(); 
		service15.setName("S62");
		service15.setLName("bedroom");
		service15.setCType("Brightness");
		service15.setEffect("Increase");
		service15.setDName("SmartLight");
		service15.setState("Off");
		service15.setValue(22);
		
		Service service16=new Service(); 
		service16.setName("S63");
		service16.setLName("bedroom");
		service16.setCType("Brightness");
		service16.setEffect("Assign");
		service16.setDName("SmartLight");
		service16.setState("Off");
		service16.setValue(22);
		//阳台花草检测仪
		Service service17=new Service(); 
		service17.setName("S71");
		service17.setLName("balcony");
		service17.setCType("Humidity");
		service17.setEffect("Monitor");
		service17.setDName("FlowerMonitor");
		service17.setState("Off");
		service17.setValue(22);
		
		Service service18=new Service(); 
		service18.setName("S81");
		service18.setLName("balcony");
		service18.setCType("Humidity");
		service18.setEffect("Increase");
		service18.setDName("SmartWaterPump");
		service18.setState("Off");
		service18.setValue(22);
		
		servicesNodes.add(service1);servicesNodes.add(service2);servicesNodes.add(service3);
		servicesNodes.add(service4);servicesNodes.add(service5);servicesNodes.add(service6);
		servicesNodes.add(service7);servicesNodes.add(service8);servicesNodes.add(service9);
		servicesNodes.add(service10);servicesNodes.add(service11);servicesNodes.add(service12);
		servicesNodes.add(service13);servicesNodes.add(service14);servicesNodes.add(service15);
		servicesNodes.add(service16);servicesNodes.add(service17);servicesNodes.add(service18);
		Iterable<Service> iterable = serviceRepository.save(servicesNodes);	
		for (Service s : iterable) {
			System.out.println("创建节点：【"+s.getName()+"】成功！");
		}
		
		
		serviceRepository.save(service1);
		
	}

	
	@RequestMapping("/clocation")
	public void createLocation() {
		List<Location> locationsNodes = new ArrayList<>();

		Location location1=new Location(); 
		location1.setNN("L1");
		location1.setLName("sittingroom");
		
		Location location2=new Location(); 
		location2.setNN("L2");
		location2.setLName("bedroom");
		
		Location location3=new Location(); 
		location3.setNN("L3");
		location3.setLName("balcony");
		
		locationsNodes.add(location1);locationsNodes.add(location2);locationsNodes.add(location3);
		locationRepository.save(locationsNodes);
		
	}
	
	
	@RequestMapping("/cdps")
	public void createDeviceProvideService() {

		List<Provide> provides = provideRepository.createProvide();	
	}
		
		
}
	

