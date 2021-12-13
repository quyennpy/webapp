<%-- 
    Document   : register
    Created on : Aug 11, 2021, 2:09:00 AM
    Author     : NGUYEN_NGUYEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="string" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="bg-info">
  <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">TẠO TÀI KHOẢN</h3></div>
                                    <div class="card-body">
                                        <form>
                                            <div class="row mb-3">
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputFirstName" type="text" placeholder="Nhập thông tin họ" />
                                                        <label for="inputFirstName">Họ</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating">
                                                        <!--//Java-->
                                                        <input class="form-control" id="inputLastName" type="text" placeholder="ENhập thông tin tên" />
                                                        <label for="inputLastName">Tên</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <!--//Java-->
                                                <input class="form-control" id="inputEmail" type="email" placeholder="name@gmail.com" />
                                                <label for="inputEmail">Email </label>
                                            </div>
                                            <div class="row mb-3">
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <!--//Java-->
                                                        <input class="form-control" id="inputPassword" type="password" placeholder="Mật khẩu" />
                                                        <label for="inputPassword">Mật khẩu</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                          <!--// java-->
                                                        <input class="form-control" id="inputPasswordConfirm" type="password" placeholder="Nhắc lại mật khẩu" />
                                                      
                                                        <label for="inputPasswordConfirm">Nhắc lại mật khẩu</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="mt-4 mb-0">
                                                <!--//java-->
                                                <div class="d-grid"><a class="btn btn-primary btn-block" href="login.html">TẠO TÀI KHOẢN</a></div>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="card-footer text-center py-3">
                                        <div class="small"><a href="<c:url value="/redirectLogin"/>">Tồn tại tài khoản? Đăng nhập</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
  </div>
      