<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%--<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!-- 引入jstl库 -->--%>
<!DOCTYPE html >
<html>
<%@include file="common/taglibs.jsp"%>
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- 下面这个文件，考场有就用，没有就不用，能漂亮点 -->
    <!--    <link rel="stylesheet" href="css/bootstrap-theme.min.css">-->
    <style>
        .main{
            padding-top:120px;
        }
    </style>
</head>
<body>
<!--    导航，默认主题-->
<%@include file="common/header.jsp"%>

<div class="container main">
    <h3>这个表单，会变成占领整个外部容器的那种</h3>
    <form class="form-horizontal row">
        <div class="form-group">
            <label class="control-label col-md-1" for="username" >用户名</label>
            <div class="col-md-11">
                <input type="text" class="form-control" name="username" id="username"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-1" for="password">密码</label>
            <div class="col-md-11">
                <input type="text" class="form-control" name="password" id="password" />
            </div>
        </div>

        <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
                <button class="btn btn-default">登陆</button>
            </div>
        </div>
    </form>


    <!--        什么 select input checkbox  radio 之类的，给他加上个form-control就行了。-->
    <hr />
    <h3>这个是内联表单，横向排列</h3>
    <form class="form-inline row">
        <div class="form-group">
            <input type="text" class="form-control" name="username" id="username1" placeholder="用户名"/>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="password" id="password1" placeholder="密码"/>
        </div>

        <div class="form-group">
            <button class="btn btn-default">登陆</button>
        </div>
    </form>

    <hr/>

    <!--        表格-->
    <h3>表格类</h3>
    <!--        表格，带框的，鼠标悬停效果的，自适应的，隔行换色（斑马）的-->
    <table class="table table-bordered table-hover table-responsive table-striped">
        <thead>
        <tr>
            <th>列1</th>
            <th>列2</th>
            <th>列3</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>我</td>
            <td>我</td>
            <td>我</td>
        </tr>
        <tr>
            <td>好</td>
            <td>好</td>
            <td>好</td>
        </tr>
        <tr>
            <td>帅</td>
            <td>帅</td>
            <td>帅</td>
        </tr>
        </tbody>
    </table>

    <form class="form-horizontal">
        <div class="form-control">
            <label for="test" class="control-label col-md-2">测试1</label>
            <div class="col-md-10">
                <select name="" class="form-control" id="test">
                    <option value="test2">测试2</option>
                    <option value="test3">测试3</option>
                    <option value="test4">测试4</option>
                    <option value="test5">测试5</option>
                    <option value="test6">测试6</option>
                </select>
            </div>
        </div>
    </form>
</div>














<script type="text/javascript" src="js/jquery-1.12.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>