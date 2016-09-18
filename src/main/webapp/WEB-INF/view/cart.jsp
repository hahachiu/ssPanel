<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>购物车</h1>
<s:if test="#session.cart.orderItems.size>0">
	<s:form theme="simple" action="updateCart" method="post">
		<div class="mdl-grid">
		  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--16-col mdl-grid">
		  	<h1>Plan</h1>
		  	<p>Shadowsocks</p>
		  	<table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
			  <thead>
			    <tr>
			      <th class="mdl-data-table__cell--non-numeric">PLAN</th>
			      <th>价格</th>
			      <th>时间</th>
			      <th>操作</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<s:iterator value="#session.cart.orderItems">
				    <tr>
				      <td class="mdl-data-table__cell--non-numeric"><s:property value="plan.name"/></td>
				      <td><s:property value="plan.price"/></td>
				      <td>
					      <s:if test="month>1">
					      <a href="updateCart.action?planId=<s:property value="plan.id"/>&month=<s:property value="month-1"/>">[-]</a>
					      </s:if>
					      <s:else>
					      <span>[-]</span>
					      </s:else>
					      <s:textfield name="month"/>
					      <a href="updateCart.action?planId=<s:property value="plan.id"/>&month=<s:property value="month+1"/>">[+]</a>
					  </td>
				      <td>
				      	  <a href="removeFromCart.action?planId=<s:property value="plan.id"/>">[删除]</a>
				      </td>
				    </tr>
				</s:iterator>
					<tr>
				        <td id="totalPrice" colspan="4">
				          <strong>总价：</strong>
				          <em class="price"><s:property value="#session.cart.totalPrice"/></em>
				        </td>
				    </tr>
			  </tbody>
			</table>
			<p class="action-bar">
		      <s:submit value="更新数量"/>
		      <a href="checkout.action" class="button button-red">去结算</a>
		    </p>
		  </div>
		</div>
	</s:form>
	<div class="mdl-grid">
	  <div class="mdl-color--white mdl-shadow--2dp mdl-cell mdl-cell--6-col mdl-grid">
	  	<h1>注意！</h1>
	  	<p>
		  	1个月30天，半年180天，一年365天
			月付套餐: 流量每隔30天重置一次
			月付套餐: 部分节点流量使用按照百分结算
		</p>
		<p>
	  		确认购买后将会立即扣款并创建订单.
		</p>
		<p>
	  		不支持退款,请先购买一个月速度满意在续费.
		</p>
	  </div>
	</div>
</s:if>
<s:else>
  <p class="message">购物车为空，您还没有购买任何套餐！</p>
</s:else>