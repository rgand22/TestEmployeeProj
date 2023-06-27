/**
 * 
 */
package com.test.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.test.bean.EmpDetails;
import com.test.bean.EmpDeptDetails;
import com.test.bean.EmpAll;
import com.test.bean.EmpPersonalDetails;
import com.test.bean.EmpSalaryDetails;
import com.test.service.EmpService;
import com.util.EmpUtils;

/**
 * @author ramya
 *
 */
public class EmpServiceImpl implements EmpService {

	public ArrayList<EmpAll> getEmpAll() {
		System.out.println("getEmpAll started::::::::");
		String sql = null;
		EmpAll empAllBean = null;
		ArrayList<EmpAll> arrEmpAll = null;
		sql = EmpUtils.qry_empAll;
		try {
			Class.forName(EmpUtils.driverName);
			Connection con = DriverManager.getConnection(EmpUtils.databaseSource, EmpUtils.dbUserName,EmpUtils.dbPwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (null != rs) {
				arrEmpAll = new ArrayList<EmpAll>();
				while (rs.next()) {
					empAllBean = new EmpAll();
					empAllBean.setDeptId(rs.getString("deptid"));
					empAllBean.setEmpId(rs.getInt("empId"));
					empAllBean.setEmpQual(rs.getString("empqual"));
					empAllBean.setStatus(rs.getString("status"));
					System.out.println("empName:::" + rs.getString("empid"));
					arrEmpAll.add(empAllBean);
				}
				System.out.println("getEmpAll records:::"+arrEmpAll.size());
			}
			rs.close();
			ps.close();
			con.close();
		} catch (ClassNotFoundException cex) {
			System.out.println("ClassNotFound Exception::::" + cex.getMessage());
			cex.printStackTrace();
		} catch (SQLException sqEx) {
			System.out.println("SQL Exception:::" + sqEx.getMessage());
			sqEx.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception:::" + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("getEmpAll ended::::::::");
		return arrEmpAll;
	}
	public ArrayList<EmpDetails> getEmpDetails(String empId) {
		System.out.println("getEmpDetails started::::::::");
		String sql = null;
		EmpDetails empDetailsBean = null;
		EmpAll empAllBean = null;
		EmpPersonalDetails empPersonalDetailsBean = null;
		EmpDeptDetails empDeptDetailsBean = null;
		EmpSalaryDetails empSalaryDetailsBean = null;
		ArrayList<EmpDetails> arrEmpDetails = null;
		
		if(null!=empId && !"".equals(empId.trim())) {
		sql = EmpUtils.qry_empDetails;
		try {
			Class.forName(EmpUtils.driverName);
			Connection con = DriverManager.getConnection(EmpUtils.databaseSource, EmpUtils.dbUserName,EmpUtils.dbPwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(empId));
			ResultSet rs = ps.executeQuery();
			if (null != rs) {
				arrEmpDetails = new ArrayList<EmpDetails>();
				while (rs.next()) {
					empDetailsBean = new EmpDetails();
					empDetailsBean.setEmpId(rs.getInt("empId"));
					System.out.println("empName:::" + rs.getInt("empid"));
					
					empAllBean = new EmpAll();
					empAllBean.setDeptId(rs.getString("deptid"));
					empAllBean.setEmpId(rs.getInt("empid"));
					empAllBean.setEmpQual(rs.getString("empqual"));
					empAllBean.setStatus(rs.getString("status"));
					empDetailsBean.setEmpDetails(empAllBean);
					
					//can include emailId too
					empPersonalDetailsBean = new EmpPersonalDetails();
					empPersonalDetailsBean.setFirstName(rs.getString("firstname"));
					empPersonalDetailsBean.setLastName(rs.getString("lastname"));
					empPersonalDetailsBean.setAddress(rs.getString("address"));
					empPersonalDetailsBean.setPhone(rs.getString("phone"));
					empDetailsBean.setEmpPersonalDetails(empPersonalDetailsBean);
					
					empDeptDetailsBean = new EmpDeptDetails();
					empDeptDetailsBean.setDeptId(rs.getString("deptid"));
					empDeptDetailsBean.setDeptName(rs.getString("deptname"));
					empDeptDetailsBean.setDeptLoc(rs.getString("deptloc"));
					empDeptDetailsBean.setDeptTotalCount(rs.getInt("totalcount"));
					empDeptDetailsBean.setDeptDM(rs.getString("deptdm"));
					empDeptDetailsBean.setDeptSM(rs.getString("deptsm"));
					empDetailsBean.setEmpDeptDetails(empDeptDetailsBean);
					
					empSalaryDetailsBean = new EmpSalaryDetails();
					empSalaryDetailsBean.setBasic(rs.getDouble("basic"));
					empSalaryDetailsBean.setHra(rs.getDouble("hra"));
					empSalaryDetailsBean.setPf(rs.getDouble("pf"));
					empSalaryDetailsBean.setTotal(rs.getDouble("total"));
					empDetailsBean.setEmpSalaryDetails(empSalaryDetailsBean);
					
					arrEmpDetails.add(empDetailsBean);
				}
				System.out.println("getEmpDetails records:::"+arrEmpDetails.size());
			}
			rs.close();
			ps.close();
			con.close();
		} catch (ClassNotFoundException cex) {
			System.out.println("ClassNotFound Exception::::" + cex.getMessage());
			cex.printStackTrace();
		} catch (SQLException sqEx) {
			System.out.println("SQL Exception:::" + sqEx.getMessage());
			sqEx.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception:::" + ex.getMessage());
			ex.printStackTrace();
		}
		}
		System.out.println("getEmpDetails ended::::::::");
		return arrEmpDetails;	
		}

	public ArrayList<EmpPersonalDetails> getEmpPersonalDetails() {
		ArrayList<EmpPersonalDetails> arrEmpPersonalDetails = null;

		return arrEmpPersonalDetails;
	}

	public ArrayList<EmpSalaryDetails> getEmpSalaryDetails() {
		ArrayList<EmpSalaryDetails> arrEmpSalaryDetails = null;

		return arrEmpSalaryDetails;
	}

}
