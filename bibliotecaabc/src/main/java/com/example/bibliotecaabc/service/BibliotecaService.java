package com.example.bibliotecaabc.service;

import com.example.bibliotecaabc.entity.Biblioteca;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BibliotecaService {

    List<Biblioteca> lista = new ArrayList<>();

    public Biblioteca findById(long id)
    {
        if(lista != null)
        {
            for(Biblioteca i : lista)
            {
                if(i.getId() == id)
                {
                    return i;
                }
            }
        }

        return null;
    }

    public List<Biblioteca> listAll(){

        if(lista != null)
        {
            return lista;
        }
        return null;
    }

    public String save(Biblioteca biblioteca)
    {
        lista.add(biblioteca);
        return biblioteca.getNome() + " salvo com sucesso";
    }

    public String update(long id, Biblioteca biblioteca)
    {
        if(lista != null)
        {
            for(int i=0; i<lista.size(); i++)
            {
                if(lista.get(i).getId() == id)
                {
                    lista.set(i, biblioteca);
                    return biblioteca.getNome() + " alterado com sucesso";
                }
            }
        }
        return null;
    }

    public String delete(long id)
    {
        if(lista != null)
        {
            for(Biblioteca i : lista)
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
