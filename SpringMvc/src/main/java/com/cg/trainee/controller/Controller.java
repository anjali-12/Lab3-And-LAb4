package com.cg.trainee.controller;
import com.cg.trainee.exception.*;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.cg.trainee.entity.Trainee;
import com.cg.trainee.entity.User;
import com.cg.trainee.service.TraineeService;
import com.cg.trainee.service.UserService;
import com.cg.trainee.exception.RecordNotFoundException;

@Controller
public class Controller {

	@Autowired
	private TraineeService traineeService;
	@Autowired
	private UserService userService;

//	@RequestMapping("/")
//	public String home() {
//		return "home";
//	}

	@RequestMapping("/")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "addtrainee";
	}

	@RequestMapping("/login")
	public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
		if (userService.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			return "home";
		} return repository.findById(id)
	            .orElseThrow(() -> new RecordNotFoundException("does no exist"));
		}
	

	
	@RequestMapping("/addtrainee")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "addtrainee";
		return repository(id)
	            .orElseThrow(() -> new ErrorResponse("Invalid"));
		
	}

	@PostMapping("/save-trainee")
	public String registerUser(@ModelAttribute Trainee trainee, BindingResult bindingResult,
			HttpServletRequest request) {
		traineeService.addtrainee(trainee);

		return "home";
		return repository.save(id).orElseThrow(() -> new MissingHeaderIngoException("Missing Info"));
		}
	}

	@GetMapping("/show-trainee")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("trainees", traineeService.retrieve());
		request.setAttribute("mode", "ALL_USERS");
		return "addtrainee";
		return repository.findById(id)
	            .orElseThrow(() -> new RecordNotFoundException("Employee id '" + id + "' does no exist"));
		}
	}

	@RequestMapping("/delete-trainee")
	public String deleteUser(@RequestParam int traineeid, HttpServletRequest request) {
		traineeService.deletetrainee(traineeid);
		request.setAttribute("trainees", traineeService.retrieve());
		request.setAttribute("mode", "ALL_USERS");
		return "addtrainee";
	}

	@RequestMapping("/edit-trainee")
	public String updatetrainee(@RequestParam int traineeid, HttpServletRequest request) {
		request.setAttribute("trainee", traineeService.edittrainee(traineeid));
		request.setAttribute("mode", "MODE_UPDATE");
		return "addtrainee";
		return repository.findById(id)
	            .orElseThrow(() -> new CustomExceptionHandler("Cannot be Edited"));
		}
	}

}
