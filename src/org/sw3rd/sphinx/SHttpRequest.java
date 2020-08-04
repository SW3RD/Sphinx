package org.sw3rd.sphinx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SHttpRequest {

    String url;


    public SHttpRequest(String url) {
        this.url = url;


    }


    public String get(HashMap headers) {
        StringBuilder builder = new StringBuilder();

        if (headers == null) {
            HttpURLConnection connection;
            try {
                URL url = new URL(this.url);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setDoInput(true);
                connection.connect();


                int status = connection.getResponseCode();
                BufferedReader reader;
                String lines;

                if (status > 299) {
                    System.out.println("There is a problem with connection check if the web server is running or if require a user agent or etc..");
                    System.out.println("Status Code : " + status);
                    reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

                    while ((lines = reader.readLine()) != null) {
                        builder.append(lines);
                    }
                    reader.close();


                } else {
                    System.out.println("Request gone successfully ..");
                    System.out.println("Status Code : " + status);


                    reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                    while ((lines = reader.readLine()) != null) {
                        builder.append(lines);
                    }
                    reader.close();


                }


            } catch (Exception ex) {


            }


        } else {
            HttpURLConnection connection;
            try {
                URL url = new URL(this.url);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                Object[] headersKey = headers.keySet().toArray();
                for(int i = 0; i<headersKey.length; i++){
                    Object key = headersKey[i];
                    Object value = headers.get(key);
                    connection.setRequestProperty(key.toString(),value.toString());




                }



                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setDoInput(true);
                connection.connect();


                int status = connection.getResponseCode();
                BufferedReader reader;
                String lines;

                if (status > 299) {
                    System.out.println("There is a problem with connection check if the web server is running or if require a user agent or etc..");
                    System.out.println("Status Code : " + status);
                    reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

                    while ((lines = reader.readLine()) != null) {
                        builder.append(lines);
                    }
                    reader.close();


                } else {
                    System.out.println("Request gone successfully ..");
                    System.out.println("Status Code : " + status);


                    reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                    while ((lines = reader.readLine()) != null) {
                        builder.append(lines);
                    }
                    reader.close();


                }


            } catch (Exception ex) {

            }



        }

return builder.toString();
    }


    public String post(String post_data,HashMap headers) {
        StringBuilder builder = new StringBuilder();

        if (headers == null) {
            HttpURLConnection connection;
            try {
                URL url = new URL(this.url);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);
                connection.setDoInput(true);
                connection.connect();

                OutputStream outputStream = connection.getOutputStream();

                outputStream.write(post_data.getBytes());
                outputStream.flush();
                outputStream.close();

                int status = connection.getResponseCode();
                BufferedReader reader;
                String lines;

                if (status > 299) {
                    System.out.println("There is a problem with connection check if the web server is running or if require a user agent or etc..");
                    System.out.println("Status Code : " + status);
                    reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

                    while ((lines = reader.readLine()) != null) {
                        builder.append(lines);
                    }
                    reader.close();


                } else {
                    System.out.println("Request gone successfully ..");
                    System.out.println("Status Code : " + status);


                    reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                    while ((lines = reader.readLine()) != null) {
                        builder.append(lines);
                    }
                    reader.close();


                }


            } catch (Exception ex) {


            }


        } else {
            HttpURLConnection connection;
            try {
                URL url = new URL(this.url);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                Object[] headersKey = headers.keySet().toArray();
                for(int i = 0; i<headersKey.length; i++){
                    Object key = headersKey[i];
                    Object value = headers.get(key);
                    connection.setRequestProperty(key.toString(),value.toString());
                }

                connection.setDoOutput(true);
                connection.setDoInput(true);
                connection.connect();

                connection.connect();

                OutputStream outputStream = connection.getOutputStream();

                outputStream.write(post_data.getBytes());
                outputStream.flush();
                outputStream.close();

                int status = connection.getResponseCode();
                BufferedReader reader;
                String lines;

                if (status > 299) {
                    System.out.println("There is a problem with connection check if the web server is running or if require a user agent or etc..");
                    System.out.println("Status Code : " + status);
                    reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

                    while ((lines = reader.readLine()) != null) {
                        builder.append(lines);
                    }
                    reader.close();


                } else {
                    System.out.println("Request gone successfully ..");
                    System.out.println("Status Code : " + status);


                    reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                    while ((lines = reader.readLine()) != null) {
                        builder.append(lines);
                    }
                    reader.close();


                }


            } catch (Exception ex) {

            }



        }

        return builder.toString();
    }

}
