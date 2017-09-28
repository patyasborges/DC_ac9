/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.ac.view;

/**
 *
 * @author patri*/
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class ImagesViewJoker{
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        
            images.add("joker1.png");
            images.add("joker2.png");
        
    }
 
    public List<String> getImages() {
        return images;
    }
}