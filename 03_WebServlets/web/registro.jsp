<%@include file="head.jsp" %>
<!DOCTYPE html>
<%-- Pagina de inicio usando includes y funciones --%>
<html>
    <%= head("Registro") %>
    <body>
        <%@include file="header.jsp" %>
        <form name='form1' method='post' action='./param.jsp'>            
            <table border='1'>
                <tr><td>Nombre:</td>  
                    <td><input type='text' name='nombre' id='nombre'/></td></tr>
                <tr><td>Edad:</td>  
                    <td><input type='number' name='edad' id='edad'/></td></tr>
            </table>
            <input type='submit' value='Enviar'/>             
        </form>

    </body>
</html>
