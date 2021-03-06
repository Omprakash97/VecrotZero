
package com.example.prakash.retro_test1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// THIS FILE HANDLES EACH AND EVERY ELEMENT RETURNED BY THE JSON - HAS CORRESPONDING FUNCTIONS TO RETURN THE ELEMENTS'S PRESENT VALUE

// GENERATED ONLINE USING SITE CALLED - http://www.jsonschema2pojo.org/
// Source type: - JSON Annotation style: - GSON , REST OF THE THINGS ARE LEFT DEFAULT

public class IpInfo {

    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("region_code")
    @Expose
    private String regionCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("continent_code")
    @Expose
    private String continentCode;
    @SerializedName("in_eu")
    @Expose
    private Boolean inEu;
    @SerializedName("postal")
    @Expose
    private String postal;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("utc_offset")
    @Expose
    private String utcOffset;
    @SerializedName("country_calling_code")
    @Expose
    private String countryCallingCode;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("languages")
    @Expose
    private String languages;
    @SerializedName("asn")
    @Expose
    private String asn;
    @SerializedName("org")
    @Expose
    private String org;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public Boolean getInEu() {
        return inEu;
    }

    public void setInEu(Boolean inEu) {
        this.inEu = inEu;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getCountryCallingCode() {
        return countryCallingCode;
    }

    public void setCountryCallingCode(String countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

}
