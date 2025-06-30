function mostrarImagen(event) {
    const archivo = event.target.files[0];
    const reader = new FileReader();

    reader.onload = function (e) {
        const imagenPreview = document.getElementById('foto-preview');
        imagenPreview.style.display = 'block'; // Mostrar la imagen de vista previa
        imagenPreview.src = e.target.result; // Establecer la imagen seleccionada como fuente
    };

    if (archivo) {
        reader.readAsDataURL(archivo);
    }
}

function validarContraseñas() {
    const contrasena = document.getElementById('contrasena').value;
    const confirmar = document.getElementById('confirmar-contrasena').value;

    if (contrasena !== confirmar) {
        alert('Las contraseñas no coinciden.');
        return false; 
    }

    return true; 
}