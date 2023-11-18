/*Desactivar todas las opciones del menú*/
var elemento = document.getElementsByClassName("opMenu");
for(var i=0; i<elemento.length;i++){
    elemento[i].className = "nav-link opMenu";
}

var pro = document.getElementById("mProducto");
pro.className = "nav-link opMenu activado";