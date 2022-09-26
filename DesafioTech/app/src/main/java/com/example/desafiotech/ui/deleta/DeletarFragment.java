package com.example.desafiotech.ui.deleta;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.desafiotech.databinding.FragmentDeletarBinding;


public class DeletarFragment extends Fragment {

    private FragmentDeletarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DeletarViewModel deletarViewModel =
                new ViewModelProvider(this).get(DeletarViewModel.class);

        binding = FragmentDeletarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.txtDeletar;

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}