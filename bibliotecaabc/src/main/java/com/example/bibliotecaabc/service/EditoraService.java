package com.example.bibliotecaabc.service;

import com.example.bibliotecaabc.entity.Editora;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EditoraService {

    List<Editora> lista = new ArrayList<>();

    public Editora findById(long id)
    {
        if(lista != null)
        {
            for(Editora i : lista)
            {
                if(i.getId() == id)
                {
                    return i;
                }
            }
        }

        return null;
    }

    public List<Editora> listAll(){

        if(lista != null)
        {
            return lista;
        }
        return null;
    }

    public String save(Editora editora)
    {
        lista.add(editora);
        return editora.getNome() + " salvo com sucesso";
    }

    public String update(long id, Editora editora)
    {
        if(lista != null)
        {
            for(int i=0; i<lista.size(); i++)
            {
                if(lista.get(i).getId() == id)
                {
                    lista.set(i, editora);
                    return editora.getNome() + " alterado com sucesso";
                }
            }
        }
        return null;
    }

    public String delete(long id)
    {
        if(lista != null)
        {
            for(Editora i : lista)
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
