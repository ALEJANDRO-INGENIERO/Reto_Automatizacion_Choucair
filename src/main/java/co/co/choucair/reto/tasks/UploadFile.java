package co.co.choucair.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;
import java.io.File;

public class UploadFile implements Task {

    private final String filePath;
    private final Target fileInputLocator;

    public UploadFile(String filePath, Target fileInputLocator) {
        this.filePath = filePath;
        this.fileInputLocator = fileInputLocator;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        File file = new File(filePath);

        // Verificar si el archivo existe
        if (!file.exists()) {
            throw new IllegalArgumentException("El archivo no existe en la ruta: " + filePath);
        }

        // Usamos SendKeys para enviar la ruta del archivo al campo de carga
        actor.attemptsTo(
                SendKeys.of(file.getAbsolutePath()).into(fileInputLocator)
        );
    }

    // Método estático con el nombre correcto: withFile
    public static UploadFile withFile(String filePath, Target fileInputLocator) {
        return new UploadFile(filePath, fileInputLocator);
    }
}