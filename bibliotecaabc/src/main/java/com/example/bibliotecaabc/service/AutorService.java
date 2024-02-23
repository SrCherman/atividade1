package com.example.bibliotecaabc.service;

import com.example.bibliotecaabc.entity.Autor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutorService {

    List<Autor> lista = new ArrayList<>();

    public Autor findById(long id)
    {
        if(lista != null)
        {
            for(Autor i : lista)
            {
                if(i.getId() == id)
                {
                    return i;
                }
            }
        }

        return null;
    }

    public List<Autor> listAll(){

        if(lista != null)
        {
            return lista;
        }
        return null;
    }

    public String save(Autor autor)
    {
        lista.add(autor);
        return autor.getNome() + " salvo com sucesso";
    }

    public String update(long id, Autor autor)
    {
        if(lista != null)
        {
            for(int i=0; i<lista.size(); i++)
            {
                if(lista.get(i).getId() == id)
                {
                    lista.set(i, autor);
                    return autor.getNome() + " alterado com sucesso";
                }
            }
        }
        return null;
    }

    public String delete(long id)
    {
        if(lista != null)
        {
            for(Autor i : lista)
            {
                if(i.getId() == id)
                {
                    lista.remove(i);
                    return "Deletado com sucesso";
                }
            }
        }
        return null;

    }

}
