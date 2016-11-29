package com.kolyadko_polovtseva.book_maze.controller.impl;

import com.kolyadko_polovtseva.book_maze.controller.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by DaryaKolyadko on 28.11.2016.
 */
@Controller
public class CategoryController extends AbstractController {
    @RequestMapping(path = "Category/{id}", method = RequestMethod.GET)
    public ModelAndView getCatalogue(Model model) {
        configureCloudinary(model);
        //TODO
        return new ModelAndView("bookList");
    }
}