package com.app.cabbooking.exception;

public class ResourceNotFoundException extends RuntimeException{
	private Long fieldValue;
	private String resourceName;
	private String fieldName;
	public ResourceNotFoundException(String resourceName, String fieldName, Long fieldValue) {
		super(String.format("%s is not found with %s : %s", resourceName,fieldName,fieldValue));
		this.fieldValue = fieldValue;
		this.resourceName = resourceName;
		this.fieldName = fieldName;
	}
	public ResourceNotFoundException(Long cabId, String fieldName2, String string) {
		// TODO Auto-generated constructor stub
	}
	public Long getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(Long fieldValue) {
		this.fieldValue = fieldValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
}
	