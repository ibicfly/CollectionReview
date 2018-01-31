package com.ibicfly.list;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.omg.PortableServer.ServantRetentionPolicyValue;
/**
 * 
 * @author ibicfly
 *
 */
public class ArrayListTest {
	
public static void main(String[] args) {
	ArrayList arrayList=new ArrayList(10);
	Object a=new Object();
	arrayList.add(a);
	arrayList.remove(a);
	arrayList.iterator();
	}
}
