/**
 * 
 */
package com.test.bean;

/**
 * @author ramya
 *
 */
public class EmpAll implements java.io.Serializable{

	
	private Integer empId;
	private String empQual;
	private String deptId;
	private String status;
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	/**
	 * @return the empQual
	 */
	public String getEmpQual() {
		return empQual;
	}
	/**
	 * @param empQual the empQual to set
	 */
	public void setEmpQual(String empQual) {
		this.empQual = empQual;
	}
	/**
	 * @return the deptId
	 */
	public String getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
