package edu.cau.hzz;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//在每个请求处理之前都会先调用该方法
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		System.out.println("called initBinder method.");
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		//对String都采用stringTrimmerEditor
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult) {
		
		System.out.println("Last name: | "+customer.getLastName()+" |");
		System.out.println("Binding Result: "+bindingResult);
		System.out.println("\n\n\n\n");
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
	}
	
	
}
