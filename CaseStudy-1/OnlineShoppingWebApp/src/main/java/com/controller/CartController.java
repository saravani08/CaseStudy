package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Cart;
import com.model.CartService;
import com.model.Product;
import com.model.User;
import com.model.UserDAO;
import com.model.UserService;

@RestController
public class CartController {
@Autowired
CartService service;
@Autowired
UserService userService;
@PostMapping("/addtocart/{email}")
public String addtocart(@RequestBody List<Product> productlist,@PathVariable("email") String email)
{
Cart cart=new Cart();
cart.setProductList(productlist);
float sum=0;
for(Product p:productlist)
{
sum+=p.getPrice();
}
cart.setTotal_amount(sum);
cart.setStatus(true);
User user=userService.findUser(email+".com");
if(user!=null)
{
cart.setCustomer(user);
service.savecart(cart);
return "cart confirmed";
}
return "cart not confirmed";


}

}