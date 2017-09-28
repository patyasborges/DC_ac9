package br.inatel.ac.view;

/**
 *
 * @author patri
 */
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ImagesViewGreenlantern {

    private List<String> images;

    @PostConstruct
    public void init() {
        images = new ArrayList<String>();

        images.add("greenlantern.jpg");
        images.add("greenlantern1.jpg");

    }

    public List<String> getImages() {
        return images;
    }
}
