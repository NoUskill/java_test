package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import com.google.gson.annotations.SerializedName;

class wik_page{
    int ns;
    String title;
    int pagid;
    int size;
    int wordcount;
    String snippet;
    String timestamp;
    void print(){
        System.out.println(this.ns);
        System.out.println(this.title);
        System.out.println(this.pagid);
        System.out.println(this.size);
        System.out.println(this.wordcount);
        System.out.println(this.snippet);
        System.out.println(timestamp);
    }
}




class ansverJson{
    String batchcomplete;
    @SerializedName("continue") con con;
    class con{
        int sroffset;
        @SerializedName("continue") String c;

    }

}




public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {

        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        String urlAddres;
        urlAddres="https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";
        str=URLEncoder.encode(str, StandardCharsets.UTF_8);

        urlAddres=urlAddres+str;

        URL home = new URI(urlAddres).toURL();
        System.out.println(home);
        HttpURLConnection connection=(HttpURLConnection) home.openConnection();
        connection.setRequestMethod("GET");
        int rescode=connection.getResponseCode();
        System.out.println(rescode);
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while((line=reader.readLine())!=null){
            System.out.println(line);
            System.out.println("\n");
            response.append(line);
        }
        reader.close();

    }
}