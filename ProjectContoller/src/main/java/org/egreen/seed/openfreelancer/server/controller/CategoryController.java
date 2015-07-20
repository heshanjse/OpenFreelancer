package org.egreen.seed.openfreelancer.server.controller;


/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
import org.egreen.seed.openfreelancer.server.entity.Category;
import org.egreen.seed.openfreelancer.server.service.CategoryDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("OpenFreelancer/category")
public class CategoryController {

@Autowired
private CategoryDAOService categoryDAOService;



@RequestMapping(value = "add", method = RequestMethod.POST)
@ResponseBody
public ResponseMessage save(@RequestBody Category category) {
Long res = categoryDAOService.save(category);
ResponseMessage responseMessage;
if(res != null){
responseMessage = ResponseMessage.SUCCESS;
responseMessage.setData(res);
}else{
responseMessage = ResponseMessage.DANGER;
responseMessage.setData(res);
}
return responseMessage;
}

@RequestMapping(value = "edit", method = RequestMethod.POST)
@ResponseBody
public ResponseMessage edit(@RequestBody Category category) {
Long res = categoryDAOService.edit(category);
ResponseMessage responseMessage;
if(res != null){
responseMessage = ResponseMessage.SUCCESS;
responseMessage.setData(res);
}else{
responseMessage = ResponseMessage.DANGER;
responseMessage.setData(res);
}
return responseMessage;
}

@RequestMapping(value = "getCategoryById", method = RequestMethod.GET, headers = "Accept=application/json")
@ResponseBody
public Category getCategoryById(@RequestParam("CategoryId")Long CategoryId) {
return categoryDAOService.getCategoryById(CategoryId);
}

@RequestMapping(value = "viewallCategoryies", method = RequestMethod.GET, headers = "Accept=application/json")
@ResponseBody
public List<Category> getAll() {
return categoryDAOService.getAll();
}

@RequestMapping(value = "deleteCategoryById", method = RequestMethod.GET, headers = "Accept=application/json")
@ResponseBody
public int deleteCategoryById(@RequestParam("CategoryId")Long CategoryId) {
return categoryDAOService.deleteCategoryById(CategoryId);
}

@RequestMapping(value = "ob", method = RequestMethod.GET, headers = "Accept=application/json")
@ResponseBody
public Category getob() {
return new Category();
}


}
