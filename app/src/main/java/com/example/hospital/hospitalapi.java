package com.example.hospital;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface hospitalapi {
    @Headers("accept: application/json")
    @GET("https://api.odcloud.kr/api/15055148/v1/uddi:92d438ee-afe5-482c-b166-faffc32600ff_201810082023?page=1&perPage=10")
}
