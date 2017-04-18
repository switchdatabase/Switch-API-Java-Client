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
 * ListOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T16:08:28.307Z")
public class ListOrder {
  @SerializedName("type")
  private String type = null;

  @SerializedName("by")
  private String by = null;

  public ListOrder type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Order types: ASC, DESC
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Order types: ASC, DESC")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ListOrder by(String by) {
    this.by = by;
    return this;
  }

   /**
   * Column name.
   * @return by
  **/
  @ApiModelProperty(example = "null", value = "Column name.")
  public String getBy() {
    return by;
  }

  public void setBy(String by) {
    this.by = by;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOrder listOrder = (ListOrder) o;
    return Objects.equals(this.type, listOrder.type) &&
        Objects.equals(this.by, listOrder.by);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, by);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOrder {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
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

