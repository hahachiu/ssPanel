<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ss-panel</title>
<script type="text/javascript" src="style/material.min.js"></script>
<link type="text/css" rel="stylesheet" href="style/material.min.css"/>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>
	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
		<s:include value="/WEB-INF/view/header.jsp"/>
	  	<s:include value="/WEB-INF/view/sidebar.jsp"/>
		<main class="mdl-layout__content mdl-color--grey-100">
		  <div class="page-content"><!-- Your content goes here -->
		   <div id="content">
		     <s:if test="#parameters.action!=null">
		     	<s:action name="%{#parameters.action}" executeResult="true"/>      	
		     </s:if>
		     <s:elseif test="#parameters.page!=null">
		       <s:include value="/WEB-INF/view/%{#parameters.page}.jsp"/>
		     </s:elseif>
		     <s:else>
		       <s:include value="/WEB-INF/view/controlBoard.jsp"/>
		     </s:else>
		   </div>
		  </div>
		  <s:include value="/WEB-INF/view/footer.jsp"/>
		</main>
  </div>
</body>
</html>