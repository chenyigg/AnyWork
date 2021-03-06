package com.qgstudio.anywork.fmain.data;

import com.qgstudio.anywork.data.ResponseResult;
import com.qgstudio.anywork.data.model.Organization;

import java.util.List;
import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Yason on 2017/4/14.
 */

public interface OrganizationApi {

    @POST("organization/me")
    Observable<ResponseResult<List<Organization>>> getJoinOrganization();

    @POST("organization/search")
    Observable<ResponseResult<List<Organization>>> getAllOrganization(@Body Map<String, String> organizationName);

}
