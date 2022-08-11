

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.IOException;
import java.util.Iterator;


public class HttpClient {

    public static void main(String[] args) throws IOException {


        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            // создаем объект клиента
            HttpGet request = new HttpGet("https://app.friend.work/api/Accounts/LogIn?username=d.teryaev@teamforce.ru&password=Qwerty123");
            CloseableHttpResponse response = httpClient.execute(request);

            try {

                // статус ответа
                System.out.println(response.getProtocolVersion());              // HTTP/1.1
                System.out.println(response.getStatusLine().getStatusCode());   // 200
                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();
                String jwt = null;
                // если есть тело ответа
                if (entity != null) {
                    // возвращаем строку
                    jwt = EntityUtils.toString(entity);
                    System.out.println(jwt);
                }
                Object obj = new JSONParser().parse(jwt);
// Кастим obj в JSONObject
                JSONObject jo = (JSONObject) obj;
// Достаём токен
                String jwtToken = (String) jo.get("jwtToken");
                System.out.println(jwtToken);

                HttpPost request1 = new HttpPost("https://app.friend.work/api/Jobs/ByFilter");

                JSONObject json = new JSONObject();

                StringEntity stringEntity = new StringEntity("{\"Status\":1,\"FromDate\":\"2020-01-01\",\"ToDate\":\"2022-08-09\",\"Paging\":{\"page\":1,\"count\":100}}");
                request1.setEntity(stringEntity);
                request1.addHeader("Content-Type", "application/json");
                request1.addHeader("Authorization","Bearer " + jwtToken);

                CloseableHttpResponse response1 = httpClient.execute(request1);
                System.out.println(response1.getProtocolVersion());              // HTTP/1.1
                System.out.println(response1.getStatusLine().getStatusCode());   // 200
                System.out.println(response1.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response1.getStatusLine().toString());
                HttpEntity entity1 = response1.getEntity();
                String strJson = null;

                strJson = EntityUtils.toString(entity1);
                //System.out.println(EntityUtils.toString(entity1));
                // }

                Object obj1 = new JSONParser().parse(strJson);
                System.out.println(obj1);
// Кастим obj в JSONObject
                JSONObject jo1 = (JSONObject) obj1;

                String js = (String) jo.get("items");
                System.out.println(js);

// Достаём токен
                JSONArray jsonArray = (JSONArray) jo1.get("items");
                Iterator itemItr = jsonArray.iterator();

                while (itemItr.hasNext()) {
                    JSONObject test = (JSONObject) itemItr.next();
                    System.out.println("- название: " + test.get("name"));
                    System.out.println("- ID: " + test.get("jobId"));
                    System.out.println("- описание: " + test.get("description"));
                    System.out.println("- комментарии: " + test.get("comment"));
                    //System.out.println(" - КастомФиелдВэлю: " + test.get("customFieldsValues"));
                    JSONArray jsonArrayCustomFieldsValues = (JSONArray) test.get("customFieldsValues");
                    Iterator customFieldsValuesItr = jsonArrayCustomFieldsValues.iterator();
                    while (customFieldsValuesItr.hasNext()){
                        JSONObject test1 = (JSONObject) customFieldsValuesItr.next();
                        //System.out.println("- ФайлдСтэмп: " + test1.get("fieldStamp"));
                        if (test1.get("systemName").equals("TeamForce_Project")){
                            System.out.println("- Проект: " + test1.get("value"));
                        }else if (test1.get("systemName").equals("TeamForce_Requirements")){
                            System.out.println("- Требования: " + test1.get("value"));
                        } else if(test1.get("systemName").equals("TeamForce_Role1111")){
                            System.out.println("- номер Стека: " + test1.get("value"));
                        } else if(test1.get("systemName").equals("TeamForce_Grades")) {
                            System.out.println("- номер Грейда: " + test1.get("value"));
                        } else if(test1.get("systemName").equals("TeamForce_Exp")) {
                            System.out.println("- номер Опыта: " + test1.get("value"));
                        }else if(test1.get("systemName").equals("TeamForce_Address")) {
                            System.out.println("- адресс: " + test1.get("value"));
                        }else if(test1.get("systemName").equals("TeamForce_Format")) {
                            System.out.println("- номер Формат работы: " + test1.get("value"));
                        }else if(test1.get("systemName").equals("TeamForce_Resource_manager")) {
                            System.out.println("- номер Ресурсного менеджера: " + test1.get("value"));
                        }else if(test1.get("systemName").equals("TeamForce_Search_Geography")) {
                            System.out.println("- Локация: " + test1.get("value"));
                        }
                    }
                    //System.out.println("- rk.x: " + test.get("fieldStamp"));
                    //JSONArray jsonArray1 = (JSONArray) jo1.get("customFieldsValues");
                    // Iterator itemItr1 = jsonArray1.iterator();
                    // while (itemItr1.hasNext()){
                    //JSONObject test1 = (JSONObject) itemItr1.next();
                    //System.out.println("- rk.x: " + test.get("customFieldsValues"));
                    System.out.println("----------------------------------------------------------------------");

                }


                // System.out.println("- item: " + test.get("customFieldsValues"));
                // System.out.println("----------------------------------------------------------------------");

                // }






            } catch (ParseException e) {
                e.printStackTrace();
            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }

    }

}