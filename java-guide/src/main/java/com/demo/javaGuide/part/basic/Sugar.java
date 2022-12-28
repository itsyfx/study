package com.demo.javaGuide.part.basic;

import lombok.Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  语法糖
 */
public class Sugar {


//    public static void main(String args[]) {
//
//
//        String code = String.valueOf((int)((Math.random()*9+1)*1000000));
//        System.out.println(code);
//
//
//    }

    /**
     *  try - with - resources
     */
    public void tryWith(){
        try(BufferedReader br = new BufferedReader(new FileReader(new File("")))){
            String readLine = br.readLine();
        }catch (Exception e){

        }
    }


    /**
     *  stream
     */
    public void _8stream(){

        String[] strArr = {"a","b","c"};
        List<String> fixedList = Arrays.asList(strArr);
        //fixedList.add("x");  //error occurs

        List<String> stringList = Arrays.stream(strArr).collect(Collectors.toList());

        List<String> obsobs = stringList.stream().filter(str -> str.contains("obs")).collect(Collectors.toList());

        User u = new User();
        List<User> users = new ArrayList<>();
        users.add(u);

        users.stream().collect(Collectors.toMap(User::getName,User::getAge,(k1,k2)->k1));

    }

    @Data
    private class User {
        private String name;
        private Integer age;
    }

}
