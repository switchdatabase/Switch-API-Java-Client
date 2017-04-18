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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SetResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T16:08:28.307Z")
public class SetResponse {
  @SerializedName("ResponseTime")
  private Long responseTime = null;

  @SerializedName("Response")
  private String response = null;

  public SetResponse responseTime(Long responseTime) {
    this.responseTime = responseTime;
    return this;
  }

   /**
   * Get responseTime
   * @return responseTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getResponseTime() {
    return responseTime;
  }

  public void setResponseTime(Long responseTime) {
    this.responseTime = responseTime;
  }

  public SetResponse response(String response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetResponse setResponse = (SetResponse) o;
    return Objects.equals(this.responseTime, setResponse.responseTime) &&
        Objects.equals(this.response, setResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseTime, response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetResponse {\n");
    
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

