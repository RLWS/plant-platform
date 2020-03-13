package com.rlws.po.test;

import com.alibaba.druid.support.json.JSONParser;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.junit.Test;

import java.io.*;
import java.util.ListIterator;

public class JsonText {

    @Test
    public void jsonT() {
        String json = "[\"24\",\"25\"]";
        Object parse = JSON.parse(json);
        JSONArray objects = JSON.parseArray(json);
        for (int i = 0; i < objects.size(); i++) {
            Integer integer = objects.getInteger(i);
            System.out.println(integer);
        }


    }

    @Test
    public void test() {
        String test = "法轮,你给大陆官方滚蛋";
//        String test1 = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("F:\\SensitiveWords.txt")), "GBK"));
            String str;
            while ((str = br.readLine()) != null) {
                if (!str.equals("")){
                    int i = test.indexOf(str);
                    if (i != -1) {
                        test = test.replaceAll(str, "*");
                    }
                }
            }
            br.close();
            System.out.println(test);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
