<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>结算成功，订单信息如下：</h2>
<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--16-col mdl-grid">
  	<h1>Plan</h1>
  	<p>Shadowsocks</p>
  	<table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
	  <caption>
		   <label>订单号：</label><strong>#<s:property value="model.id"/></strong>
		   <label>总价格：</label><em class="price"><s:property value="model.totalPrice"/></em>
		   <label>用户：</label><em><s:property value="model.user.username"/></em>
		   <label>订单日期：</label><s:date format="yyyy-MM-dd HH:mm:ss" name="model.creationDate"/>
	  </caption>
	  <thead>
	    <tr>
	      <th class="mdl-data-table__cell--non-numeric">PLAN</th>
	      <th>月流量</th>
	      <th>价格</th>
	      <th>期限</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<s:iterator value="model.orderItems">
		    <tr>
		      <td class="mdl-data-table__cell--non-numeric"><s:property value="name"/></td>
		      <td><s:property value="dataTotal"/></td>
		      <td><s:property value="plan.price"/></td>
		      <td><s:property value="month"/></td>
		    </tr>
		</s:iterator>
	  </tbody>
	</table>
  </div>
</div>