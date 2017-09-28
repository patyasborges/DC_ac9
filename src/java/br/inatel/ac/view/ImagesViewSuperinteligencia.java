
package br.inatel.ac.view;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class ImagesViewSuperinteligencia {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        
            images.add("superinteligencia.png");
            
        
    }
 
    public List<String> getImages() {
        return images;
    }
}