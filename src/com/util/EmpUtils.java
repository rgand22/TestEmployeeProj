/**
 * 
 */
package com.util;

import java.util.*;
/**
 * @author ramya
 *
 */
public class EmpUtils {

	
	public static String driverName = "org.postgresql.Driver";
	public static String databaseSource="jdbc:postgresql://localhost:5432/postgres";
	public static String dbUserName="postgres";
	public static String dbPwd="postgres";
	
	/*
	 * EmpDetails Queries
	 */
	public static String qry_empAll = "select * from public.emp";
	
	/*
	 * EmpDetails Queries
	 */
	public static String qry_empDetails = "select * from public.fn_getEmpAllDetails(?)";

	/*
	 * EmpPersonalDetails Queries
	 */
	public static String qry_empPersonalDetails = "select * from public.emppersonaldet";
	
	/*
	 * EmpSalaryDetails Queries
	 */
	public static String qry_empSalaryDetails = "select * from public.empsalarydet";

	public static String emp_all_page = "/jsp/EmpAllPage.jsp";
	public static String emp_details_page = "/jsp/EmpDetailsPage.jsp";
	
	
	
}
