<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>SHADOSOCKS订单</h1>
<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--16-col mdl-grid">
  	<h1>My</h1>
  	<p>Shadowsocks</p>
  	<s:if test="#session.user!=null">
	  	<s:if test="#session.user.orders.size>0">
	  		<s:iterator value="#session.user.orders">
			  	<table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
				  <caption>
					 <label>订单编号：</label><strong>#<s:property value="id"/></strong>
					 <label>合计：</label><em class="price"><s:property value="totalPrice"/></em>
					 <label>订单日期：</label><em class="date"><s:date format="yyyy-MM-dd HH:mm:ss" name="creationDate"/></em>
				  </caption>
				  <thead>
				    <tr>
				      <th class="mdl-data-table__cell--non-numeric">#</th>
				      <th>PLAN</th>
				      <th>月流量</th>
				      <th>已用流量</th>
				      <th>期限</th>
				      <th>管理</th>
				    </tr>
				  </thead>
				  <tbody>
				    <s:iterator value="orderItems">
					    <tr>
					      <td class="mdl-data-table__cell--non-numeric"><s:property value="plan.id"/></td>
					      <td><s:property value="plan.name"/></td>
					      <td><s:property value="dataTotal"/></td>
					      <td><s:property value="dataUsage"/></td>
					      <td><s:property value="month"/>
					      	<a class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent" href="orderDetail.action?id=<s:property value="id"/>">
							  管理
							</a>
					      </td>
					    </tr>
				    </s:iterator>
				  </tbody>
				</table>
			</s:iterator>
		</s:if>
		<s:else>
		  <p class="message">您还没有下过订单，订单列表为空！</p>
		  <a class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent" href="index.jsp">
			返回首页
		  </a>
		</s:else>
	</s:if>
	<s:else>
		<p class="message">您还没有登陆，无法查看订单列表！</p>
	</s:else>
  </div>
</div>