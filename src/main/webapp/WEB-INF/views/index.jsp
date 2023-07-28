<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Spring with Jsp</title>

    <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">


    <link rel="stylesheet" href="resources/datatables/css/dataTables.bootstrap5.min.css">
</head>
<body>

    <section class="m-4">


<h1>DataTables with Bootstrap</h1>
<table id="dataTable" class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>Id</th>
        <th>Nama</th>
        <th>Alamat</th>
        <th>Kota</th>
        <th>Provinsi</th>
        <th>Tgl_Registrasi</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${customers}" var="customer" varStatus="loop">
    <tr>

        <td>${loop.index + 1}</td>
        <td>${customer.nama}</td>
        <td>${customer.alamat}</td>
        <td>${customer.kota}</td>
        <td>${customer.provinsi}</td>
        <td>${customer.tglRegistrasi}</td>
        <td>${customer.status}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>

    </section>

<script src="resources/jQuery/jquery-3.7.0.min.js"></script>
<script src="resources/bootstrap/js/bootstrap.min.js"></script>

<script src="resources/datatables/js/jquery.dataTables.min.js"></script>
<script src="resources/datatables/js/dataTables.bootstrap5.min.js"></script>

<script>
    $(document).ready(function() {
        $('#dataTable').DataTable();
    });
</script>
</body>
</html>
