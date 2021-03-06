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


package com.enjoyf.platform.userservice.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * UserProfile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-08T10:52:24.374+08:00")
public class UserProfile {
  @SerializedName("accountNo")
  private String accountNo = null;

  @SerializedName("appKey")
  private String appKey = null;

  @SerializedName("backPic")
  private String backPic = null;

  @SerializedName("birthDay")
  private String birthDay = null;

  @SerializedName("cityId")
  private Integer cityId = null;

  @SerializedName("createdIp")
  private String createdIp = null;

  @SerializedName("createdTime")
  private DateTime createdTime = null;

  @SerializedName("discription")
  private String discription = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("experience")
  private Integer experience = null;

  @SerializedName("flag")
  private Integer flag = null;

  @SerializedName("hobby")
  private String hobby = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("icons")
  private String icons = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("level")
  private Integer level = null;

  @SerializedName("lowercaseNick")
  private String lowercaseNick = null;

  @SerializedName("mobileNo")
  private String mobileNo = null;

  @SerializedName("nick")
  private String nick = null;

  @SerializedName("profileKey")
  private String profileKey = null;

  @SerializedName("profileNo")
  private String profileNo = null;

  @SerializedName("provinceId")
  private Integer provinceId = null;

  @SerializedName("qq")
  private String qq = null;

  @SerializedName("realName")
  private String realName = null;

  @SerializedName("sex")
  private Integer sex = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("updatedTime")
  private DateTime updatedTime = null;

  public UserProfile accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public UserProfile appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public UserProfile backPic(String backPic) {
    this.backPic = backPic;
    return this;
  }

   /**
   * Get backPic
   * @return backPic
  **/
  @ApiModelProperty(value = "")
  public String getBackPic() {
    return backPic;
  }

  public void setBackPic(String backPic) {
    this.backPic = backPic;
  }

  public UserProfile birthDay(String birthDay) {
    this.birthDay = birthDay;
    return this;
  }

   /**
   * Get birthDay
   * @return birthDay
  **/
  @ApiModelProperty(value = "")
  public String getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
  }

  public UserProfile cityId(Integer cityId) {
    this.cityId = cityId;
    return this;
  }

   /**
   * Get cityId
   * @return cityId
  **/
  @ApiModelProperty(value = "")
  public Integer getCityId() {
    return cityId;
  }

  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }

  public UserProfile createdIp(String createdIp) {
    this.createdIp = createdIp;
    return this;
  }

   /**
   * Get createdIp
   * @return createdIp
  **/
  @ApiModelProperty(value = "")
  public String getCreatedIp() {
    return createdIp;
  }

  public void setCreatedIp(String createdIp) {
    this.createdIp = createdIp;
  }

  public UserProfile createdTime(DateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(required = true, value = "")
  public DateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(DateTime createdTime) {
    this.createdTime = createdTime;
  }

  public UserProfile discription(String discription) {
    this.discription = discription;
    return this;
  }

   /**
   * Get discription
   * @return discription
  **/
  @ApiModelProperty(value = "")
  public String getDiscription() {
    return discription;
  }

  public void setDiscription(String discription) {
    this.discription = discription;
  }

  public UserProfile domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public UserProfile experience(Integer experience) {
    this.experience = experience;
    return this;
  }

   /**
   * Get experience
   * @return experience
  **/
  @ApiModelProperty(value = "")
  public Integer getExperience() {
    return experience;
  }

  public void setExperience(Integer experience) {
    this.experience = experience;
  }

  public UserProfile flag(Integer flag) {
    this.flag = flag;
    return this;
  }

   /**
   * Get flag
   * @return flag
  **/
  @ApiModelProperty(value = "")
  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public UserProfile hobby(String hobby) {
    this.hobby = hobby;
    return this;
  }

   /**
   * Get hobby
   * @return hobby
  **/
  @ApiModelProperty(value = "")
  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  public UserProfile icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public UserProfile icons(String icons) {
    this.icons = icons;
    return this;
  }

   /**
   * Get icons
   * @return icons
  **/
  @ApiModelProperty(value = "")
  public String getIcons() {
    return icons;
  }

  public void setIcons(String icons) {
    this.icons = icons;
  }

  public UserProfile id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserProfile level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public UserProfile lowercaseNick(String lowercaseNick) {
    this.lowercaseNick = lowercaseNick;
    return this;
  }

   /**
   * Get lowercaseNick
   * @return lowercaseNick
  **/
  @ApiModelProperty(value = "")
  public String getLowercaseNick() {
    return lowercaseNick;
  }

  public void setLowercaseNick(String lowercaseNick) {
    this.lowercaseNick = lowercaseNick;
  }

  public UserProfile mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

   /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(value = "")
  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public UserProfile nick(String nick) {
    this.nick = nick;
    return this;
  }

   /**
   * Get nick
   * @return nick
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNick() {
    return nick;
  }

  public void setNick(String nick) {
    this.nick = nick;
  }

  public UserProfile profileKey(String profileKey) {
    this.profileKey = profileKey;
    return this;
  }

   /**
   * Get profileKey
   * @return profileKey
  **/
  @ApiModelProperty(value = "")
  public String getProfileKey() {
    return profileKey;
  }

  public void setProfileKey(String profileKey) {
    this.profileKey = profileKey;
  }

  public UserProfile profileNo(String profileNo) {
    this.profileNo = profileNo;
    return this;
  }

   /**
   * Get profileNo
   * @return profileNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProfileNo() {
    return profileNo;
  }

  public void setProfileNo(String profileNo) {
    this.profileNo = profileNo;
  }

  public UserProfile provinceId(Integer provinceId) {
    this.provinceId = provinceId;
    return this;
  }

   /**
   * Get provinceId
   * @return provinceId
  **/
  @ApiModelProperty(value = "")
  public Integer getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(Integer provinceId) {
    this.provinceId = provinceId;
  }

  public UserProfile qq(String qq) {
    this.qq = qq;
    return this;
  }

   /**
   * Get qq
   * @return qq
  **/
  @ApiModelProperty(value = "")
  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public UserProfile realName(String realName) {
    this.realName = realName;
    return this;
  }

   /**
   * Get realName
   * @return realName
  **/
  @ApiModelProperty(value = "")
  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public UserProfile sex(Integer sex) {
    this.sex = sex;
    return this;
  }

   /**
   * Get sex
   * @return sex
  **/
  @ApiModelProperty(value = "")
  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }

  public UserProfile signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(value = "")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public UserProfile updatedTime(DateTime updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Get updatedTime
   * @return updatedTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(DateTime updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.accountNo, userProfile.accountNo) &&
        Objects.equals(this.appKey, userProfile.appKey) &&
        Objects.equals(this.backPic, userProfile.backPic) &&
        Objects.equals(this.birthDay, userProfile.birthDay) &&
        Objects.equals(this.cityId, userProfile.cityId) &&
        Objects.equals(this.createdIp, userProfile.createdIp) &&
        Objects.equals(this.createdTime, userProfile.createdTime) &&
        Objects.equals(this.discription, userProfile.discription) &&
        Objects.equals(this.domain, userProfile.domain) &&
        Objects.equals(this.experience, userProfile.experience) &&
        Objects.equals(this.flag, userProfile.flag) &&
        Objects.equals(this.hobby, userProfile.hobby) &&
        Objects.equals(this.icon, userProfile.icon) &&
        Objects.equals(this.icons, userProfile.icons) &&
        Objects.equals(this.id, userProfile.id) &&
        Objects.equals(this.level, userProfile.level) &&
        Objects.equals(this.lowercaseNick, userProfile.lowercaseNick) &&
        Objects.equals(this.mobileNo, userProfile.mobileNo) &&
        Objects.equals(this.nick, userProfile.nick) &&
        Objects.equals(this.profileKey, userProfile.profileKey) &&
        Objects.equals(this.profileNo, userProfile.profileNo) &&
        Objects.equals(this.provinceId, userProfile.provinceId) &&
        Objects.equals(this.qq, userProfile.qq) &&
        Objects.equals(this.realName, userProfile.realName) &&
        Objects.equals(this.sex, userProfile.sex) &&
        Objects.equals(this.signature, userProfile.signature) &&
        Objects.equals(this.updatedTime, userProfile.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, appKey, backPic, birthDay, cityId, createdIp, createdTime, discription, domain, experience, flag, hobby, icon, icons, id, level, lowercaseNick, mobileNo, nick, profileKey, profileNo, provinceId, qq, realName, sex, signature, updatedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    backPic: ").append(toIndentedString(backPic)).append("\n");
    sb.append("    birthDay: ").append(toIndentedString(birthDay)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    createdIp: ").append(toIndentedString(createdIp)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    discription: ").append(toIndentedString(discription)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    hobby: ").append(toIndentedString(hobby)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    icons: ").append(toIndentedString(icons)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    lowercaseNick: ").append(toIndentedString(lowercaseNick)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    nick: ").append(toIndentedString(nick)).append("\n");
    sb.append("    profileKey: ").append(toIndentedString(profileKey)).append("\n");
    sb.append("    profileNo: ").append(toIndentedString(profileNo)).append("\n");
    sb.append("    provinceId: ").append(toIndentedString(provinceId)).append("\n");
    sb.append("    qq: ").append(toIndentedString(qq)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

