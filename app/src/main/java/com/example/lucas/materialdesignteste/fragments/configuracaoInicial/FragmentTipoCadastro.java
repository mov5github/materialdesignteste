package com.example.lucas.materialdesignteste.fragments.configuracaoInicial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lucas.materialdesignteste.R;

/**
 * Created by Lucas on 10/01/2017.
 */

public class FragmentTipoCadastro extends Fragment{
    private static String titulo = "Usuário";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tipo_cadastro,container,false);
        return view;
    }

    public static String getTitulo() {
        return titulo;
    }
}
