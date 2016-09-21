package com.backbase.kalah.web.controllers;

import com.backbase.kalah.domain.services.Game;
import com.backbase.kalah.web.viewModels.GameViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by js on 9/21/16.
 */
@Controller
@RequestMapping("/game")
public class GameController {
    @Autowired
    Game game;
    @RequestMapping( method = RequestMethod.GET)
    public ModelAndView start(){
        GameViewModel viewModel = new GameViewModel(game);
        return new ModelAndView("board", "game", viewModel);
    }
}