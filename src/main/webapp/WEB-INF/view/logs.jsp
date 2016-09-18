<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<ul id="logs"> 
  <s:iterator value="logs"> 
	<li> 
	  <a href="logDetail?logId=<s:property value="id"/>"> 
		<s:property value="title" />
	  </a>
	</li> 
  </s:iterator> 
</ul> 