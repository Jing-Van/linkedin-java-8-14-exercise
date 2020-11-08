/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;

/**
 *
 * @author ehenr
 */
@Stateful
@LocalBean
public class NewSessionBean {

    List<String> artistList;
    
    public NewSessionBean() {
        artistList = new ArrayList<String>();
    }
    
    public void addArtists(String artistName){
        artistList.add(artistName);
    }
    
    public List<String> getArtists() {
        return artistList;
    }
}
