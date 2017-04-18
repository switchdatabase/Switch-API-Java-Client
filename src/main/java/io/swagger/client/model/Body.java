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
import io.swagger.client.model.ListOrder;
import io.swagger.client.model.WhereItem;
import java.util.ArrayList;
import java.util.List;

/**
 * Body
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T16:08:28.307Z")
public class Body {
  @SerializedName("list")
  private String list = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("whereType")
  private String whereType = null;

  @SerializedName("where")
  private List<WhereItem> where = new ArrayList<WhereItem>();

  @SerializedName("order")
  private ListOrder order = null;

  public Body list(String list) {
    this.list = list;
    return this;
  }

   /**
   * List name.
   * @return list
  **/
  @ApiModelProperty(example = "null", value = "List name.")
  public String getList() {
    return list;
  }

  public void setList(String list) {
    this.list = list;
  }

  public Body count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Item count.
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "Item count.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Body page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number.
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "Page number.")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Body whereType(String whereType) {
    this.whereType = whereType;
    return this;
  }

   /**
   * Optional enumerator. You can assign the mode of implementation of where criterions by using AND and OR types under whereType parameter.
   * @return whereType
  **/
  @ApiModelProperty(example = "null", value = "Optional enumerator. You can assign the mode of implementation of where criterions by using AND and OR types under whereType parameter.")
  public String getWhereType() {
    return whereType;
  }

  public void setWhereType(String whereType) {
    this.whereType = whereType;
  }

  public Body where(List<WhereItem> where) {
    this.where = where;
    return this;
  }

  public Body addWhereItem(WhereItem whereItem) {
    this.where.add(whereItem);
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WhereItem> getWhere() {
    return where;
  }

  public void setWhere(List<WhereItem> where) {
    this.where = where;
  }

  public Body order(ListOrder order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", value = "")
  public ListOrder getOrder() {
    return order;
  }

  public void setOrder(ListOrder order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.list, body.list) &&
        Objects.equals(this.count, body.count) &&
        Objects.equals(this.page, body.page) &&
        Objects.equals(this.whereType, body.whereType) &&
        Objects.equals(this.where, body.where) &&
        Objects.equals(this.order, body.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, count, page, whereType, where, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    whereType: ").append(toIndentedString(whereType)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
