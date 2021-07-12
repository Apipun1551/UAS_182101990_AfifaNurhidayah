package com.afifa.uas.rest;

import com.afifa.uas.model.GetUser;
import com.afifa.uas.model.PostPutDelUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("users")
    Call<GetUser> getUser();
    @FormUrlEncoded
    @POST("users")
    Call<PostPutDelUser>postUser(@Field("first_name") String first_name, @Field("last_name") String last_name, @Field("email") String job);

    @FormUrlEncoded
    @PUT("users")
    Call<PostPutDelUser>putUser(@Field("first_name") String name, @Field("last_name") String last_name, @Field("email") String job);

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "users", hasBody = true)
    Call<PostPutDelUser>deleteUser(@Field("id") String id);
}
