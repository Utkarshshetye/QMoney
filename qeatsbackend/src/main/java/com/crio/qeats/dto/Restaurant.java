
/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.client.RestTemplate;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;


// TODO: CRIO_TASK_MODULE_SERIALIZATION
//  Implement Restaurant class.
// Complete the class such that it produces the following JSON during serialization.
// {
//  "restaurantId": "10",
//  "name": "A2B",
//  "city": "Hsr Layout",
//  "imageUrl": "www.google.com",
//  "latitude": 20.027,
//  "longitude": 30.0,
//  "opensAt": "18:00",
//  "closesAt": "23:00",
//  "attributes": [
//    "Tamil",
//    "South Indian"
//  ]
// }
@JsonIgnoreProperties({"id"})
public class Restaurant {

  private String id;
  private String restaurantId;
  private String name;
  private String city;
  private String imageUrl;
  private Double latitude;
  private Double longitude;
  private String opensAt;
  private String closesAt;
  private List<String> attributes;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(String restaurantId) {
    this.restaurantId = restaurantId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public String getOpensAt() {
    return opensAt;
  }

  public void setOpensAt(String opensAt) {
    this.opensAt = opensAt;
  }

  public String getClosesAt() {
    return closesAt;
  }

  public void setClosesAt(String closesAt) {
    this.closesAt = closesAt;
  }

  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;

  }

    // public Restaurant(@NotNull String restaurantId, @NotNull String name, @NotNull String city,
    //         @NotNull String imageUrl, @NotNull Double latitude, @NotNull Double longitude,
    //         @NotNull String opensAt, @NotNull String closesAt, @NotNull List<String> attributes) {
    //     this.restaurantId = restaurantId;
    //     this.name = name;
    //     this.city = city;
    //     this.imageUrl = imageUrl;
    //     this.latitude = latitude;
    //     this.longitude = longitude;
    //     this.opensAt = opensAt;
    //     this.closesAt = closesAt;
    //     this.attributes = attributes;
    // }

    
  

}

