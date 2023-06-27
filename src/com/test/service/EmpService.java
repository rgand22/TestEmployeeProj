/**
 * 
 */
package com.test.service;

import java.util.ArrayList;

import com.test.bean.EmpDetails;
import com.test.bean.EmpAll;
import com.test.bean.EmpPersonalDetails;
import com.test.bean.EmpSalaryDetails;

/**
 * @author ramya
 *
 */
public interface EmpService {

	public ArrayList<EmpAll> getEmpAll();
	public ArrayList<EmpDetails> getEmpDetails(String empId);
	public ArrayList<EmpPersonalDetails> getEmpPersonalDetails();
	public ArrayList<EmpSalaryDetails> getEmpSalaryDetails();
}
