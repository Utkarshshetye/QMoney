/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import com.mongodb.lang.NonNull;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// TODO: CRIO_TASK_MODULE_RESTAURANTSAPI
//  Implement GetRestaurantsRequest.
//  Complete the class such that it is able to deserialize the incoming query params from
//  REST API clients.
//  For instance, if a REST client calls API
//  /qeats/v1/restaurants?latitude=28.4900591&longitude=77.536386&searchFor=tamil,
//  this class should be able to deserialize lat/long and optional searchFor from that.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetRestaurantsRequest {

  
  //private int Id;
  
  
  @NotNull
  @Max(90)
  @Min(-90)
   private Double latitude;

  @NotNull
  @Max(180)
  @Min(-180)
   private Double longitude;
  
   private String searchFor = "";
  
   public GetRestaurantsRequest(Double latitude, Double longitude) {
     this.latitude = latitude;
     this.longitude = longitude;
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

  public String getSearchFor() {
    return searchFor;
  }

  public void setSearchFor(String searchFor) {
    this.searchFor = searchFor;
  }
  

}


