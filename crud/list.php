<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listar Elementos</title>
</head>
<body>
    <h1>Lista de Elementos</h1>
    <ul>
    <?php
    if (file_exists('data.txt')) {
        $archivo = fopen('data.txt', 'r');
        while (($linea = fgets($archivo)) !== false) {
            echo "<li>" . htmlspecialchars($linea) . "</li>";
        }
        fclose($archivo);
    } else {
        echo "<li>No hay elementos guardados.</li>";
    }
    ?>
    </ul>
    <br>
    <a href="index.php">Volver al inicio</a>
</body>
</html>
