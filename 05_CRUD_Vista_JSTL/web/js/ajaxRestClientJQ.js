$(document).ready( function() {
    
    $.ajax( {
        "url": "http://localhost:8084/CRUD_Vista_JSTL/api/users",
        "type": "GET",
        "success": function(respuestaArrayUsers) {
            
            respuestaArrayUsers.forEach(function(user) {
                let htmlTRnuevaFila = $("#data_table").html() + 
                    `<tr><td>${user.email}</td>
                        <td>${user.name}</td>
                    </tr>`;
                $("#data_table").html( htmlTRnuevaFila );
            });
        },
        "error": function() {
            alert("Error en peticion AJAX");
        }
    })
});
