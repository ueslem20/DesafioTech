package com.example.desafiotech.ui.lista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.desafiotech.databinding.FragmentListarBinding;

public class ListarFragment extends Fragment {

    private FragmentListarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ListarViewModel listarViewModel =
                new ViewModelProvider(this).get(ListarViewModel.class);

        binding = FragmentListarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        final ListView lv = binding.lvNavView;
        //tentei chamar o ListView para atribuir valor mas não consegui.

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}