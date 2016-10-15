package com.example.coolweather.model;

public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;
    
    public int getId() {
    	return id;
    }
    
    public void setId(int id){
    	this.id=id;
    }
    
    public String getProvinceName() {
    	return provinceName;
    }	
	
    public void setProvinceName(String proinceName){
    	this.provinceName=provinceName;
    }
    
    public String getProvinceCode(){
    	return provinceCode;
    }
    
    public void setProbinceCode(String provinceCode) {
    	this.provinceCode=provinceCode;
    }
    
}
