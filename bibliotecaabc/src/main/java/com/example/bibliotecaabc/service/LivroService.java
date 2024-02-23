package com.example.bibliotecaabc.service;

import com.example.bibliotecaabc.entity.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    List<Livro> lista = new ArrayList<>();

    public Livro findById(long id)
    {
        if(lista != null)
        {
            for(Livro i : lista)
            {
                if(i.getId() == id)
                {
                    return i;
                }
            }
        }

        return null;
    }

    public List<Livro> listAll(){

        if(lista != null)
        {
            return lista;
        }
        return null;
    }

    public String save(Livro livro)
    {
        lista.add(livro);
        return livro.getTitulo() + " salvo com sucesso";
    }

    public String update(long id, Livro livro)
    {
        if(lista != null)
        {
            for(int i=0; i<lista.size(); i++)
            {
                if(lista.get(i).getId() == id)
                {
                    lista.set(i, livro);
                    return livro.getTitulo() + " alterado com sucesso";
                }
            }
        }
        return null;
    }

    public String delete(long id)
    {
        if(lista != null)
        {
            for(Livro i : lista)
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
