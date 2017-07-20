/*
 * userservice API
 * userservice API documentation
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.enjoyf.platform.userservice.client.api;

import com.enjoyf.platform.userservice.client.ApiException;
import com.enjoyf.platform.userservice.client.model.UserToken;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserTokenResourceApi
 */
@Ignore
public class UserTokenResourceApiTest {

    private final UserTokenResourceApi api = new UserTokenResourceApi();

    
    /**
     * createUserToken
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTokenUsingPOSTTest() throws ApiException {
        UserToken userToken = null;
        UserToken response = api.createUserTokenUsingPOST(userToken);

        // TODO: test validations
    }
    
    /**
     * deleteUserToken
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTokenUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteUserTokenUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * getAllUserTokens
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllUserTokensUsingGETTest() throws ApiException {
        List<UserToken> response = api.getAllUserTokensUsingGET();

        // TODO: test validations
    }
    
    /**
     * getUserToken
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTokenUsingGETTest() throws ApiException {
        Long id = null;
        UserToken response = api.getUserTokenUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * updateUserToken
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTokenUsingPUTTest() throws ApiException {
        UserToken userToken = null;
        UserToken response = api.updateUserTokenUsingPUT(userToken);

        // TODO: test validations
    }
    
}