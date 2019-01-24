package com.appleyk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appleyk.node.Device;
import com.appleyk.node.Location;
import com.appleyk.node.Service;
import com.appleyk.node.User;
//import com.appleyk.relation.LikeRelation;
import com.appleyk.relation.Provide;
import com.appleyk.repository.DeviceRepository;
//import com.appleyk.repository.LikeRelationRepository;
import com.appleyk.repository.LocationRepository;
import com.appleyk.RelationRepository.ProvideRepository;
import com.appleyk.repository.ServiceRepository;
import com.appleyk.repository.UserRepository;

@RestController
public class testControl {
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
//	@Autowired
//	LikeRelationRepository likeRepository;
	
	
	@RequestMapping("/test3")
	 public String index() { 
     return "Hello World 888";
}
//	@RequestMapping("/cuu")
//	public void creatUser() {
//		List<User> userNodes = new ArrayList<>();
//		User userNode1 = new User();
//		userNode1.setUid(1088L);
//		System.out.println(userNode1.getUid());
//		userNode1.setName("cafe");
//		System.out.println(userNode1.getName());
//		userNode1.setAge(22);
//		userNode1.setSex("boy");
//		userNode1.addHobby("play");
//		userNode1.addHobby("sleep");
////		
//		User userNode2 = new User();
//		userNode2.setUid(1077L);
//		userNode2.setName("more");
//		userNode2.setAge(17);
//		userNode2.setSex("girl");
//		userNode2.addHobby("eat");
//		userNode2.addHobby("see");
//		userNode2.addHobby("say");
//		
//		userNodes.add(userNode1);
//		userNodes.add(userNode2);			
//		Iterable<User> iterable = userRepository.save(userNodes);	
////		User user=userRepository.save(userNode1);
//		for (User user : iterable) {
//			System.out.println("创建节点：【"+user.getName()+"】成功！");
//		}
//		
//		
//		
//	}
	
	
	@RequestMapping("/cd")
	public void creatDevice() {
		List<Device> devicesNodes = new ArrayList<>();
		Device dNode1 = new Device();
		dNode1.setNN("D5");
		dNode1.setDName("Airconditioner");
		dNode1.setLName("bedroom");
		dNode1.setKey("Temperature");
		dNode1.setValue(22);
		
		
//		Device dNode2 = new Device();
//		dNode2.setName("Light");
//		dNode2.setDescribe("This is a light.");
//		
		devicesNodes.add(dNode1);
//		devicesNodes.add(dNode2);			
		Iterable<Device> iterable = deviceRepository.save(devicesNodes);	
////		User user=userRepository.save(userNode1);
		for (Device d : iterable) {
			System.out.println("创建节点：【"+d.getDName()+"】成功！");
		}
		
		
		
	}
	
	@RequestMapping("/cs")
	public void createService() {
		Service service=new Service(); 
		service.setName("S54");
		service.setLName("bedroom");
		service.setCType("Temperature");
		service.setEffect("Assign");
		service.setDName("Airconditioner");
		service.setState("on");
		service.setValue(22);
		serviceRepository.save(service);
		
	}
	
	
	@RequestMapping("/cl")
	public void createLocation() {
		Location location=new Location(); 
		location.setNN("L2");
		location.setLName("bedroom");
		locationRepository.save(location);
	}
	
	@RequestMapping("/dps")
	public void createDeviceProvideService() {
			System.out.println("666");
			Provide provide = new Provide();
			Device startNode = new Device();
			startNode.setDName("Airconditioner");
//
			Service endNode = new Service();
			endNode.setDName("Airconditioner");
//
			provide.setStartNode(startNode);
			provide.setEndNode(endNode);
			System.out.println(startNode.getDName());
			System.out.println(endNode.getDName());
//
	List<Provide> provides = provideRepository.createLikes(startNode.getDName(),endNode.getDName());	
//			
//			/**
//			 * 遍历创建的关系
//			 */
//			for (Provide p : provides) {
//				Device d = (Device) p.getStartNode();
//				Service s = (Service) p.getEndNode();
//				System.out.println(d.getDName() + "--喜欢-->" + s.getName());
//			}
	}
	
//	@RequestMapping("/testlike")
//	public void createLikeRelation() throws Exception {
//
//		LikeRelation like = new LikeRelation();
//
//		/**
//		 * 节点 == 刘大壮
//		 */
//		User startNode = new User();
//		startNode.setUid(1004L);
//
//		/**
//		 * 节点 == 马晓丽
//		 */
//		User endNode = new User();
//		endNode.setUid(1003L);
//
//		like.setStartNode(startNode);
//		like.setEndNode(endNode);
//
//		like.setRelationID(520);
//		like.setSince(2018);
//		like.setReason("晓丽是女神");
//
//		List<LikeRelation> likes = likeRepository.createLikes(startNode.getUid(), 
//				endNode.getUid(), like.getRelationID(),like.getSince(),like.getReason());	
//		
//		/**
//		 * 遍历创建的关系
//		 */
//		for (LikeRelation likeRelation : likes) {
//			User sNode = (User) likeRelation.getStartNode();
//			User eNode = (User) likeRelation.getEndNode();
//			System.out.println(sNode.getName() + "--喜欢-->" + eNode.getName());
//		}
//	}
//	
//	
	
	
	
}


	