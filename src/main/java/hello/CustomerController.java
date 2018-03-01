package hello;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

	@Resource
	CustomerRepository customer;
	
	@RequestMapping("/customers")
	public String getallReviews(Model model) {
		model.addAttribute("customers", customer.findAll());
		return "customers";
	}

}
