package com.example.student.myapplication.Providers;

import com.example.student.myapplication.Models.MessageModel;
import com.example.student.myapplication.Models.UserModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 7/14/2018.
 */

public class UsersDataProvider {
    public static List<UserModel> getUsersList(){
        List<UserModel> userModelList = new ArrayList<>();
        userModelList.add(new UserModel("Saqo", "https://www.google.am/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwi4x4-onJ7cAhWGDywKHV4pDjUQjRx6BAgBEAU&url=https%3A%2F%2Fwww.esquire.com%2Fentertainment%2Finterviews%2Fa32552%2Fesq0205scarlett-64%2F&psig=AOvVaw2OtoHP2foyE3q-B8n7M_JK&ust=1531644968920159", "kargin txa", "055888888", "saqo@mail.ru", new ArrayList<MessageModel>()));
        userModelList.add(new UserModel("Hayko", "https://www.google.am/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwi4x4-onJ7cAhWGDywKHV4pDjUQjRx6BAgBEAU&url=https%3A%2F%2Fwww.esquire.com%2Fentertainment%2Finterviews%2Fa32552%2Fesq0205scarlett-64%2F&psig=AOvVaw2OtoHP2foyE3q-B8n7M_JK&ust=1531644968920159", "kargin txa", "055888888", "saqo@mail.ru", new ArrayList<MessageModel>()));
        userModelList.add(new UserModel("Gago", "https://www.google.am/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwi4x4-onJ7cAhWGDywKHV4pDjUQjRx6BAgBEAU&url=https%3A%2F%2Fwww.esquire.com%2Fentertainment%2Finterviews%2Fa32552%2Fesq0205scarlett-64%2F&psig=AOvVaw2OtoHP2foyE3q-B8n7M_JK&ust=1531644968920159", "kargin txa", "055888888", "saqo@mail.ru", new ArrayList<MessageModel>()));
        userModelList.add(new UserModel("Aren", "https://www.google.am/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwi4x4-onJ7cAhWGDywKHV4pDjUQjRx6BAgBEAU&url=https%3A%2F%2Fwww.esquire.com%2Fentertainment%2Finterviews%2Fa32552%2Fesq0205scarlett-64%2F&psig=AOvVaw2OtoHP2foyE3q-B8n7M_JK&ust=1531644968920159", "kargin txa", "055888888", "saqo@mail.ru", new ArrayList<MessageModel>()));
        return userModelList;
    }
    public static UserModel getUserByPosition(int position){
        return getUsersList().get(position);
    }
}
