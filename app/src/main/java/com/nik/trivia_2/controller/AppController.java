package com.nik.trivia_2.controller;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class AppController extends Application {
    private static AppController instance;
    private static RequestQueue requestQueue;

    public static synchronized AppController getInstance() {
        return instance;
    }

    public RequestQueue getRequestQueue() {

        if (requestQueue == null) {

            requestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return requestQueue;

    }

    public <T> void addToRequestQueue(Request<T> req) {

        getRequestQueue().add(req);

    }

    @Override
    public void onCreate() {

        super.onCreate();
        instance = this;
    }


}
