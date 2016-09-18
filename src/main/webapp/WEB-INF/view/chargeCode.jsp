<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--12-col mdl-grid">
  	<h1>Code</h1>
  	<h2>充值码</h2>
	<s:form theme="simple" action="updatePassword" method="post">
	  <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
	    <s:password name="password" cssClass="mdl-textfield__input"/>
	  	<label class="mdl-textfield__label" for="sample4">充值码</label>
	    <p>
	    	<s:submit value="确定" cssClass="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent"/>
	    </p>
	  </div>
	</s:form>
  </div>
</div>