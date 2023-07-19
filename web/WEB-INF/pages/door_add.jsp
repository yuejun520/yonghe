<%@ page pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>新增门店</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<style type="text/css">
	body{ font-family: "微软雅黑"; background-color: #EDEDED; }
	h2{ text-align: center;font-size:26px; }
	table{ margin: 30px auto; text-align: center; border-collapse:collapse; width:50%; }
	td, th{ padding: 7px;font-size:18px;}
	hr{ margin-bottom:20px; border:1px solid #aaa; }
	input,select,textarea{ width:284px; height:30px; background:#EDEDED; border:1px solid #999; text-indent:5px; font-size:18px; }
	input[type='submit']{ width:130px; height:36px; cursor:pointer; border-radius:5px 5px 5px 5px; background:#ddd; }
	select{text-indent:0px;}
	textarea{height:100px;font-size:22px;}
</style>

<script type="text/javascript">
	function check() {
		var name = document.getElementsByName("name")[0].value;
		var tel = document.getElementsByName("tel")[0].value;
		var addrr = document.getElementsByName("addrr")[0].value;
		if (name === "" || name ==null) {
			alert("门店名称不能为空!" + name)
			return false;
		} else if (tel === "" || tel ==null) {
			alert("联系电话不能为空!" + tel)
			return false;
		} else if (addrr === "" || addrr ==null) {
			alert("门店地址不能为空!" + addrr)
			return false;
		}
	}
</script>
</head>
<body>
	<h2>新增门店</h2>
	<hr/>
	<form action="doorAdd" method="POST">
		<table border="1">
			<tr>
				<td width="30%">门店名称</td>
				<td>
					<input type="text" name="name"/>
				</td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td>
					<input type="text" name="tel"/>
				</td>
			</tr>
			<tr>
				<td>门店地址</td>
				<td>
					<input type="text" name="addr"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" onclick="return check()" value="提 	交"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>



