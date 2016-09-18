<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>PROFILE</h1>
<s:if test="#session.user!=null">
	<div class="mdl-grid">
	  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--6-col mdl-grid">
	  	<h1>公告</h1>
	  	<p><label>用户名：</label><s:property value="#session.user.username"/></p>
		<p><label>邮箱：</label><s:property value="#session.user.email"/></p>
		<p><label>账户余额：</label><s:property value="#session.user.money"/></p>
	  </div>
	  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--6-col mdl-grid">
	  	<h1>Update</h1>
	  	<p>暂时关闭更新功能</p>
	  </div>
	</div>
</s:if>
<s:else>
	<s:include value="/WEB-INF/view/login.jsp"/>
</s:else>