<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $nuevoElemento = htmlspecialchars($_POST['elemento']);
    if (!empty($nuevoElemento)) {
        file_put_contents('data.txt', $nuevoElemento . PHP_EOL, FILE_APPEND);
        echo "Elemento guardado correctamente.";
    } else {
        echo "Por favor, ingresa un elemento.";
    }
}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Elemento</title>
</head>
<body>
    <h1>Crear un Nuevo Elemento</h1>
    <form method="post" action="create.php">
        <label for="elemento">Nuevo Elemento:</label>
        <input type="text" name="elemento" id="elemento" required>
        <button type="submit">Guardar</button>
    </form>
    <br>
    <a href="index.php">Volver al inicio</a>
</body>
</html>
