<?php
$archivo = 'data.txt';
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $elementoAEliminar = htmlspecialchars($_POST['elemento']);
    
    if (file_exists($archivo)) {
        $contenido = file($archivo);
        $nuevaLista = [];

        foreach ($contenido as $linea) {
            if (trim($linea) !== $elementoAEliminar) {
                $nuevaLista[] = $linea;
            }
        }

        file_put_contents($archivo, implode("", $nuevaLista));
        echo "Elemento eliminado correctamente.";
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
    <title>Eliminar Elemento</title>
</head>
<body>
    <h1>Eliminar un Elemento</h1>
    <form method="post" action="delete.php">
        <label for="elemento">Elemento a eliminar:</label>
        <input type="text" name="elemento" id="elemento" required>
        <button type="submit">Eliminar</button>
    </form>
    <br>
    <a href="index.php">Volver al inicio</a>
</body>
</html>
