<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<html>
<head>
<TITLE>药品采购平台</TITLE>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<LINK rel="stylesheet" type="text/css" href="${baseurl}styles/style.css">
<LINK rel="stylesheet" type="text/css" href="${baseurl}styles/login.css">
<LINK rel="stylesheet" type="text/css"	href="${baseurl}js/easyui/themes/default/easyui.css">
<LINK rel="stylesheet" type="text/css"	href="${baseurl}js/easyui/themes/icon.css">

<STYLE type="text/css">
.btnalink {
	cursor: hand;
	display: block;
	width: 80px;
	height: 29px;
	float: left;
	margin: 12px 28px 12px auto;
	line-height: 30px;
	background: url('${baseurl}images/login/btnbg.jpg') no-repeat;
	font-size: 14px;
	color: #fff;
	font-weight: bold;
	text-decoration: none;
}
</STYLE>
<%@ include file="/WEB-INF/jsp/common_js.jsp"%>

<script type="text/javascript">

	//登录提示方法
	function loginsubmit() {
		
    	// 做表单输入校验  
        var username = $("#username");  
        var password = $("#password");  
        var code = $("#code");  
        if ($.trim(userId.val()) == ""){  
            msg = "用户名不能为空！";  
            $("#userspan").html("<font color='red'>用户名不能为空！且用户名长度为5-15</font>");
            userId.focus();  
        }else if ($.trim(password.val()) == ""){  
            $("#passspan").html("<font color='red'>密码不能为空！</font>");
            password.focus();  
        }else if ($.trim(code.val()) == ""){  
        	$("#randomcodespan").html("<font color='red'>验证码不能为空！</font>");
            code.focus();  
        }else if (!/^[0-9a-zA-Z]{4}$/.test($.trim(code.val()))){  
            code.focus();  
        }else{  
            // 获取表单中的参数  
            var params = $("#loginForm").serialize();  
            //alert(params);  
            // 发送登录的异步请求  
            $.post("${ctx}/loginAjax.action", params, function(data, status){  
                alert(data.tip);  
            }, "json");  
            
            $.post("login", {
                username : username,
                password : password
              }, callback, "json");
            }
         
            function callback(data) {
              var value=data.flag;
              if(value=="登陆成功"){
              location.href="./success.jsp" rel="external nofollow" ;
              }else{
               alert(value);
            }
            
        }  
            
    }
        
      // 为document绑定onkeydown事件监听是否按了回车键  
      $(document).keydown(function(event){  
          if (event.keyCode === 13){ // 按了回车键  
              $("#loginBtn").trigger("click");  
          }  
      });  
	
</SCRIPT>
</HEAD>
<BODY style="background: #f6fdff url(${baseurl}images/login/bg1.jpg) repeat-x;">
		<DIV class="logincon">

			<DIV class="title">
				<IMG alt="" src="${baseurl}images/login/logo.png">
			</DIV>

			<DIV class="cen_con">
				<IMG alt="" src="${baseurl}images/login/bg2.png">
			</DIV>

			<DIV class="tab_con">

				<input type="password" style="display:none;" />
				<TABLE class="tab" border="0" cellSpacing="6" cellPadding="8">
					<TBODY>
						<TR>
							<TD>用户名：</TD>
							<TD colSpan="2"><input type="text" id="usercode"
								name="username" style="WIDTH: 130px" /><span id="userspan"></span></TD>
						</TR>
						<TR>
							<TD>密 码：</TD>
							<TD><input type="password" id="pwd" name="password" style="WIDTH: 130px" /><span id="passspan"></span>
							</TD>
						</TR>
						<TR>
							<TD>验证码：</TD>
							<TD><input id="randomcode" name="randomcode" size="8" /> <img
								id="randomcode_img" src="${baseurl}validatecode.jsp" alt=""
								width="56" height="20" align='absMiddle' /> <a
								href=javascript:randomcode_refresh()>刷新</a><span id="randomcodespan"></span></TD>
						</TR>

						<TR>
							<TD colSpan="2" align="center"><input type="button"
								class="btnalink" onclick="loginsubmit()" value="登&nbsp;&nbsp;录" />
								<input type="reset" class="btnalink" value="重&nbsp;&nbsp;置" /></TD>
						</TR>
					</TBODY>
				</TABLE>

			</DIV>
		</DIV>
</BODY>
</HTML>
