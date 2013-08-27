<?php 
    //Conexion
    $conexion = mysqli_connect("127.0.0.1", "root", "");
    mysqli_select_db($conexion, "soporte");
    
    $queEmp = "SELECT * FROM usuarios ORDER BY nombre ASC";
    $resEmp = mysqli_query($conexion, $queEmp) or die(mysql_error());
    $totEmp = mysqli_num_rows($resEmp);
    
   
    if ($totEmp > 0) {
       while ($rowEmp = mysqli_fetch_assoc($resEmp)) {
          $arreglo[] = $rowEmp;
       }
    }
    
    echo json_encode($arreglo);

?>

