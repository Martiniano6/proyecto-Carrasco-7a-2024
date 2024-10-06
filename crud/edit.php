<?php
$archivo = 'data.txt';
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $elementoViejo = htmlspecialchars($_POST['elemento_viejo']);
    $elementoNuevo = htmlspecialchars($_POST['elemento_nuevo']);
    
    if (file_exists($archivo)) {
        $contenido = file($archivo);
        $nuevaLista = [];

        foreach ($contenido as $linea) {
            if (trim($linea) === $elementoViejo) {
                $nuevaLista[] = $elementoNuevo . PHP_EOL;
            } else {
                $nuevaLista[] = $linea;
            }
        }

        file_put_contents($archivo, implode("", $nuevaLista));
        echo "Elemento editado correctamente.";
    } else {
        echo "No se encontró el archivo.";
    }
}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Elemento</title>
</head>
<body>
    <h1>Editar un Elemento</h1>
    <form method="post" action="edit.php">
        <label for="elemento_viejo">Elemento a editar:</label>
        <input type="text" name="elemento_viejo" id="elemento_viejo" required>
        <br>
        <label for="elemento_nuevo">Nuevo valor:</label>
        <input type="text" name="elemento_nuevo" id="elemento_nuevo" required>
        <br>
        <button type="submit">Guardar cambios</button>
    </form>
    <br>
    <a href="index.php">Volver al inicio</a>
</body>
</html>
