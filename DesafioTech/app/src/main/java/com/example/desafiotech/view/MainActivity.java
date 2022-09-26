package com.example.desafiotech.view;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.desafiotech.R;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.desafiotech.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration BarConfig;
    private ActivityMainBinding binding;
    private NavigationView navigationView;
    private Menu menu;
    private MenuItem nav_add;
    private MenuItem nav_deletar;
    private MenuItem nav_listar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;


        BarConfig = new AppBarConfiguration.Builder(
                R.id.nav_adicionar, R.id.nav_deletar, R.id.nav_lista)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, BarConfig);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int tool = item.getItemId();
        //int color = item.getItemId();



        if(tool == R.id.tool_sair){
            finish();
            return true;
        }
        /* não consegui encontrar o onNavigationItemSelected talvez é import errado.
        if(color == R.id.nav_adicionar){
            menu = navigationView.getMenu();

            nav_add = menu.findItem(R.id.nav_adicionar);
            nav_add.setTitle("Mudou");

            navigationView.setItemTextColor(ColorStateList.valueOf(Color.GREEN));
        }*/

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, BarConfig)
                || super.onSupportNavigateUp();
    }
}