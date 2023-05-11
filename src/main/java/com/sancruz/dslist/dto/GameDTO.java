package com.sancruz.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.sancruz.dslist.entities.Game;

public class GameDTO {
  private Long id;
  private Integer year;
  private String title;
  private String genre;
  private String platforms;
  private Double score;
  private String imgUrl;
  private String shortDescription;  
  private String longDescription;  

  public GameDTO() {}

  public GameDTO(Game entity) {
    // BeanUtils.copyProperties(copia tudo que está na entidade, para este/this objeto DTO)
    // É pratico para copiar objetos grande que contenham os mesmos nomes de atributos 
    // E para funcionar está cópia, o DTO precisa dos getters e setters para cada atributo.
    BeanUtils.copyProperties(entity, this);
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getPlatforms() {
    return platforms;
  }
  public void setPlatforms(String platforms) {
    this.platforms = platforms;
  }

  public Double getScore() {
    return score;
  }
  public void setScore(Double score) {
    this.score = score;
  }

  public String getImgUrl() {
    return imgUrl;
  }
  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  
}
