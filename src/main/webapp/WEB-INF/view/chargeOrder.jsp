<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:if test="#session.user!=null">
	<s:if test="#session.user.chargeOrders.size>0">
	  	<table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
		  <thead>
		    <tr>
		      <th class="mdl-data-table__cell--non-numeric">充值方式</th>
		      <th>订单号</th>
		      <th>其他</th>
		      <th>金额</th>
		      <th>充值时间</th>
		    </tr>
		  </thead>
		  <tbody>
			  <s:iterator value="#session.user.chargeOrders">
			    <tr>
			      <td class="mdl-data-table__cell--non-numeric"><s:property value="way"/></td>
			      <td><s:property value="id"/></td>
			      <td><s:property value="other"/></td>
			      <td><s:property value="figure"/></td>
			      <td><s:property value="creation_date"/></td>
			    </tr>
			  </s:iterator>
		  </tbody>
		</table>
	</s:if>
	<s:else>
		<p class="message">您还没有下过充值订单，充值订单列表为空！</p>
	</s:else>
</s:if>
<s:else>
	<p class="message">您还没有登陆,无法查看充值订单！</p>
</s:else>