/*
 * Switch Database REST API
 * Switch API is the primary endpoint of data sevices and Switch DB's platform. You can do adding, editing, deleting or listing data works to your database with query operations by using this low-level API based on HTTP.
 *
 * OpenAPI spec version: 1.2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AddResponse;
import io.swagger.client.model.Body;
import io.swagger.client.model.Error;
import io.swagger.client.model.SetResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DBOperationsApi
 */
@Ignore
public class DBOperationsApiTest {

    private final DBOperationsApi api = new DBOperationsApi();

    
    /**
     * Add is used for adding a data object to the list created at Switch DB.
     *
     * You can choose the list that will be added tha data set to with List parameter that will be sent to Header. It&#39;s equal to INSERT query at the relational databases model. The data set that will be added to the database is transmited at request body. For versions upper than v1.2.1, if the data sent is an array, all items in the array are added one by one, so they are added as a whole. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPostTest() throws ApiException {
        String apIKey = null;
        String accessToken = null;
        String list = null;
        String body = null;
        AddResponse response = api.addPost(apIKey, accessToken, list, body);

        // TODO: test validations
    }
    
    /**
     * It&#39;s used for listing a data added before.
     *
     * List parameter sent remarks the list that will be do listing work on at Header. It&#39;s equal to SELECT query at relational databases. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPostTest() throws ApiException {
        String apIKey = null;
        String accessToken = null;
        String list = null;
        Body body = null;
        api.listPost(apIKey, accessToken, list, body);

        // TODO: test validations
    }
    
    /**
     * It&#39;s used for deleting a data added before at Switch DB.
     *
     * List parameter sent remarks the list that will be deleted data from at Header and ListItemId parameter remarks the ID consisted by Switch DB for the data that will be deleted. It&#39;s equal to DELETE query at relational databases. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setDeleteTest() throws ApiException {
        String apIKey = null;
        String accessToken = null;
        String list = null;
        String listItemId = null;
        SetResponse response = api.setDelete(apIKey, accessToken, list, listItemId);

        // TODO: test validations
    }
    
    /**
     * It&#39;s used for updating a data object that is already added to Switch DB.
     *
     * In order to UPDATE a object, Listname and ListItemId parameters should be sent in the Header of the REQUEST as \&quot;List\&quot;, \&quot;ListItemId\&quot;, respectively, as shown in the example below. It&#39;s equal to UPDATE query at relational databases. The data set that will be edited is transmited to the database at request body. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPostTest() throws ApiException {
        String apIKey = null;
        String accessToken = null;
        String list = null;
        String listItemId = null;
        String body = null;
        SetResponse response = api.setPost(apIKey, accessToken, list, listItemId, body);

        // TODO: test validations
    }
    
}
