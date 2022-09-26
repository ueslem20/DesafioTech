package com.example.desafiotech.ui.cadastro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.desafiotech.databinding.FragmentCadBinding;

public class CadastroFragment extends Fragment {

    private FragmentCadBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CadastroViewModel cadastroViewModel =
                new ViewModelProvider(this).get(CadastroViewModel.class);

        binding = FragmentCadBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.txtCad;

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}