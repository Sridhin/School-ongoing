<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <title>School Management</title>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
      crossorigin="anonymous"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900"
      rel="stylesheet"
    />

    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link rel="stylesheet" href="css/bootstrap/admissionstyle.css" />
  </head>
  <body>
    <% 
        
        
        
        try { Class.forName("com.mysql.jdbc.Driver"); Connection
    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tb", "root",
    "root"); PreparedStatement ps=c.prepareStatement("select * from leadModule");
    
    ResultSet rs=ps.executeQuery(); if(rs.next()) { %>

    <div class="wrapper d-flex align-items-stretch">
      <nav id="sidebar">
        <div class="custom-menu">
          <button type="button" id="sidebarCollapse" class="btn btn-primary">
            <i class="fa fa-bars"></i>
            <span class="sr-only">Toggle Menu</span>
          </button>
        </div>
        <div class="p-4">
          <h1>
            <a href="index.html" class="logo"
              >School Management<span>Administration</span></a
            >
          </h1>
          <ul class="list-unstyled components mb-5">
            <li>
              <a href="#"><span class="fa fa-home mr-3"></span> Home</a>
            </li>
            <li>
              <a href="http://127.0.0.1:5500/leadenquiry.html#"
                ><span class="fa fa-user mr-3"></span> About</a
              >
            </li>
            <li class="active">
              <a href="#"><span class="fa fa-briefcase mr-3"></span> Works</a>
            </li>
            <li>
              <a href="#"><span class="fa fa-sticky-note mr-3"></span> Blog</a>
            </li>
            <li>
              <a href="#"><span class="fa fa-suitcase mr-3"></span> Gallery</a>
            </li>
            <li>
              <a href="#"><span class="fa fa-cogs mr-3"></span> Services</a>
            </li>
            <li>
              <a href="#"
                ><span class="fa fa-paper-plane mr-3"></span> Contacts</a
              >
            </li>
          </ul>

          <div class="mb-5">
            <h3 class="h6 mb-3">Subscribe for newsletter</h3>
            <form action="#" class="subscribe-form">
              <div class="form-group d-flex">
                <div class="icon"><span class="icon-paper-plane"></span></div>
                <input
                  type="text"
                  class="form-control"
                  placeholder="Enter Email Address"
                />
              </div>
            </form>
          </div>

          <div class="footer">
            <p>
              Copyright &copy;
              <script>
                document.write(new Date().getFullYear());
              </script>
              All rights reserved
            </p>
          </div>
        </div>
      </nav>

      <!-- Page Content  -->

      <div id="content" class="p-4 p-md-5 pt-5">
        <h2 class="mb-4">Admission Module</h2>
        <div
          class="alert alert-warning alert-dismissible fade show"
          role="alert"
        >
          <strong>Holy guacamole!</strong> You should check in on some of those
          fields below.
          <button
            type="button"
            class="close"
            data-dismiss="alert"
            aria-label="Close"
          >
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <nav aria-label="breadcrumb">
          <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Home</a></li>
            <li class="breadcrumb-item"><a href="#">Library</a></li>
            <li class="breadcrumb-item active" aria-current="page">
              Admission
            </li>
          </ol>
        </nav>
        <!--Bootstrap Form starts-->

        <!--studentsname and gender starts-->

        <form action="findbyrefernceid.jsp">
          <div class="form-group mb-3">
            <label for="referencenumber" class="form-label"
              >Search For Reference ID</label
            >
            <input
              type="text"
              class="form-control"
              id="studentsname"
              aria-describedby="studentsname"
            />
            <div class="mb-3">
                <button  class="btn btn-primary" type="submit">Button</button>
            </div>
          </div>
        </form>

        <form>
          <!--Standard for starts-->
          <div class="admission-standard">
            <label for="form-select-standard">Standard </label>

            <p class="fw-normal">here comes the standard dynamically</p>
          </div>
          <!--Standard for ends-->
          <!--Generated Admission Number-->
          <div class="admission-generated-number">
            <label for="form-select-generated-number"
              >Generated Admission Number
            </label>

            <p class="fw-normal">here comes the number dynamically</p>
          </div>
          <!--Generated Admission Number-->
          <!--Student's Name-->
          <div class="admission-studentname">
            <label for="form-select-generated-number">Student's name </label>
            <h1><%=rs.getString(1)%></h1>
            
            <p class="fw-normal">here comes the number dynamically</p>
          </div>
          <!--Student's Name-->
        </form>
            <% } }catch(Exception e) { System.out.println(e); } %>
      </div>
    </div>
    <script
      src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
      integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
      integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
      integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
      crossorigin="anonymous"
    ></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
  </body>
</html>
