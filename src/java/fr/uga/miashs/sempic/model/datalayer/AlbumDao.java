package fr.uga.miashs.sempic.model.datalayer;

import fr.uga.miashs.sempic.model.Album;
import fr.uga.miashs.sempic.model.SempicUser;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author eddie
 */
@Stateless
public class AlbumDao extends AbstractJpaDao<Album,Long>{

    @PersistenceContext(unitName = "SempicPU")
    private EntityManager em;
    
    public AlbumDao(Class<Album> entityClass) {
        super(Album.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List<Album> getAlbums(SempicUser u){
        try{
            return (List<Album>)
                    getEntityManager().createQuery("SELECT a FROM Album a "
                                                    + "WHERE a.owner=:owner")
                    .setParameter("owner", u)
                    .getSingleResult();
        }
        catch(Exception e){
            return null;    
        }
    }
    
}
