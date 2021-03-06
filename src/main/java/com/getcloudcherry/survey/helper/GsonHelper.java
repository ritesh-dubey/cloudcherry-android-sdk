package com.getcloudcherry.survey.helper;

import com.getcloudcherry.survey.model.Data;
import com.getcloudcherry.survey.model.LoginToken;
import com.getcloudcherry.survey.model.SurveyAnswers;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/**
 * Helper class to handle JSON related data
 */
public class GsonHelper {
    public static Gson mGson = new Gson();

    static Type type = new TypeToken<Map<String, String>>() {
    }.getType();

    /**
     * Method to parse JSON string
     *
     * @param json
     * @param class1
     * @return
     */
    public static Object getGson(String json, Class<?> class1) {

        return mGson.fromJson(json, class1);
    }

    public static String toSurveyAnswerJson(SurveyAnswers iSurveyAnswer) {
        return mGson.toJson(iSurveyAnswer);
    }

    public static String toUserJson(LoginToken iData) {
        return mGson.toJson(iData);
    }

    public static String toJson(ArrayList<Data> iData) {
        return mGson.toJson(iData);
    }
}
