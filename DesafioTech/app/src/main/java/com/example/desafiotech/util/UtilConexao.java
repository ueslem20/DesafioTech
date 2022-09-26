package com.example.desafiotech.util;

import android.net.Uri;
import android.os.AsyncTask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

//eu sou obrigrado a retornar só string já que declarei como tal no asynctask e se eu quisse valores numerocos ? :v
public class UtilConexao extends AsyncTask<Void, Void, String> {

    StringBuilder builder = new StringBuilder();

    @Override
    protected String doInBackground(Void... voids) {
        //acabei de aprender então não faço ideia de onde implementa. parece que o metodo vai ficar obsoleto xD
        URL url = null;
        try {
            url = new URL("https://tech-talent.hasura.app/api/rest/projects");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("SET");
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type","application/json");
            conn.setDoOutput(true);
            conn.setConnectTimeout(3000);

            conn.connect();

            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()){
                builder.append(scanner.next());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return builder.toString();
    }
    /*
    https://tech-talent.hasura.app/api/rest/projects
    https://tech-talent.hasura.app/api/rest/projects/:id

    pretendo usar:
    public static final int CONNECTION_TIMOUT = 20000; //20 segundos

    public static final int READ_TIMOUT = 15000;// 15 segundos
    */



}
