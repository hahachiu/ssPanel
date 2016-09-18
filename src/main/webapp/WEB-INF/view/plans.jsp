<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="mdl-grid">
  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--16-col mdl-grid">
  	<h1>Plan</h1>
  	<p>Shadowsocks</p>
  	<table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
	  <thead>
	    <tr>
	      <th class="mdl-data-table__cell--non-numeric">PLAN</th>
	      <th>月流量</th>
	      <th>价格</th>
	      <th>说明</th>
	      <th>订购</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<s:iterator value="plans">
		    <tr>
		      <td class="mdl-data-table__cell--non-numeric"><s:property value="name"/></td>
		      <td><s:property value="dataMonth"/></td>
		      <td><s:property value="price"/></td>
		      <td><s:property value="detail"/>
		      	<a class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent" href="addToCart.action?planId=<s:property value="id"/>&month=1">
				  添加到购物车
				</a>
		      </td>
		    </tr>
		</s:iterator>
	  </tbody>
	</table>
  </div>
</div>