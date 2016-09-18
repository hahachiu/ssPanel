<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--12-col mdl-grid">
  	<h1>Charge</h1>
  	<h2>选择充值方式</h2>
  	<p>
  		<a class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent" href="index.jsp">
		支付宝
	 	</a>
	</p>
	<p>
		<a class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent" href="index.jsp">
		充值码
	 	</a>
	</p>
  </div>
</div>
<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--12-col mdl-grid">
  	<h1>充值记录</h1>
  	<h2>Charge orders</h2>
  	<s:include value="/WEB-INF/view/chargeOrder.jsp"></s:include>
  </div>
</div>