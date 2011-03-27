<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-definition>
    <html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/layout.css">
        <script type="text/javascript"
                src="${pageContext.request.contextPath}/resources/js/jquery-1.5.1.min.js"></script>

        <script type="text/javascript">

            $(document).ready(function() {
                $('#administrationTopMenu').click(function() {
                    handleTopMenuSelected();
                    $('#administrationTopMenu').addClass('selected');
                    $('#administration').fadeIn(500);
                });

                $('#vacationTopMenu').click(function() {
                    handleTopMenuSelected();
                    $('#vacationTopMenu').addClass('selected');
                    $('#vacation').fadeIn(500);
                });

                $('#settingsTopMenu').click(function() {
                    handleTopMenuSelected();
                    $('#settingsTopMenu').addClass('selected');
                    $('#settings').fadeIn(500);
                });

                $('#administration ul li a').click(function() {
                    handleLeftMenuSelected(this);
                    var url = $(this).attr('href');
                    $('#content').load(url);
                    return false;
                });

                $('#vacation ul li a').click(function() {
                    handleLeftMenuSelected(this);
                    return false;
                });

                $('#settings ul li a').click(function() {
                    handleLeftMenuSelected(this);
                    return false;
                });

                function handleTopMenuSelected() {
                    removeSelected($('#topmenu ul li a'));
                    removeSelected($('#leftmenu ul li a'));
                    $('#administration, #vacation, #settings').hide();
                }

                function handleLeftMenuSelected(element) {
                    removeSelected($('#leftmenu ul li a'));
                    $(element).addClass('selected');
                }

                function removeSelected(elements) {
                    $.each(elements, function(index, element) {
                        $(element).removeClass('selected');
                    });
                }
            });

        </script>

    </head>

    <body>

    <div id="app">
        <div id="header">
            <stripes:layout-component name="header">
                <jsp:include page="header.jsp"/>
            </stripes:layout-component>
        </div>

        <div id="topmenu">
            <ul>
                <li><a href="#" id="administrationTopMenu">Administration</a></li>
                <li><a href="#" id="vacationTopMenu">Ferie</a></li>
                <li><a href="#" id="settingsTopMenu">Indstillinger</a></li>
            </ul>
        </div>

        <div id="body">

            <div id="leftmenu">
                <div id="administration">
                    <ul>
                        <li><s:link beanclass="dk.speconsult.web.LoginActionBean">List medarbejdere</s:link> </li>
                        <li><a href="#" id="listEmployee">Alle medarbejdere</a></li>
                        <li><a href="#" id="createEmployee">Opret medarbejder</a></li>
                        <li><a href="#" id="editEmployee">Ret medarbejder</a></li>
                        <li><a href="#" id="deleteEmployee">Slet medarbejder</a></li>
                    </ul>
                </div>
                <div id="vacation" style="display:none">
                    <ul>
                        <li><a href="#">Opret medarbejder 2</a></li>
                        <li><a href="#">Ret medarbejder 2</a></li>
                        <li><a href="#">Slet medarbejder 2</a></li>
                    </ul>
                </div>
                <div id="settings" style="display:none">
                    <ul>
                        <li><a href="#">Opret medarbejder 3</a></li>
                        <li><a href="#">Ret medarbejder 3</a></li>
                        <li><a href="#">Slet medarbejder 3</a></li>
                    </ul>
                </div>
            </div>

            <div id="content">
                <stripes:layout-component name="content">

                </stripes:layout-component>
            </div>

        </div>


        <div id="footer">
            <stripes:layout-component name="footer">
                <jsp:include page="footer.jsp"/>
            </stripes:layout-component>
        </div>

    </div>


    </body>

    </html>


</stripes:layout-definition>