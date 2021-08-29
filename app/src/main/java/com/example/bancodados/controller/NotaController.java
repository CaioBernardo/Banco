package com.example.bancodados.controller;

import android.content.Context;

import com.example.bancodados.modelo.Nota;
import com.example.bancodados.modelo.NotaDao;

public class NotaController {

    Context mContext;
    NotaDao notaDao;

    public NotaController(Context c) {

        mContext = c;
        notaDao = new NotaDao(c);

    }

    public Nota cadastrarNovaNota(Nota n){

        return notaDao.inserirNota(n);

    }


}
