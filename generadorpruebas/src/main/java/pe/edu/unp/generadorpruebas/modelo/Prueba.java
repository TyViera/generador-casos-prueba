package pe.edu.unp.generadorpruebas.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import pe.edu.unp.generadorpruebas.util.Constantes;

/**
 * Modelacion de un JUNIT TEST que sera ejecutado Esta Prueba ha sido creada a
 * partir de un caso de prueba
 */
public class Prueba implements Serializable {

    private final String packageName;
    private String extraImports;
    private final String testClassName;
    private String setUpClassCode;
    private String tearDownClassCode;
    private String setUpCode;
    private String tearDownCode;
    private final List<PruebaMetodo> testsCode;

    public Prueba(Integer testId) {
        this(testId + "");
    }

    public Prueba(String testClassName) {
        this.testClassName = Constantes.BASE_JUNITTEST_CLASS_NAME + testClassName;
//        this.packageName = Constantes.BASE_JUNITTEST_PACKAGE_NAME;
        this.packageName = "";
        this.extraImports = "";
        this.setUpClassCode = "";
        this.tearDownClassCode = "";
        this.setUpCode = "";
        this.tearDownCode = "";
        this.testsCode = new ArrayList<>();
    }

    public String getExtraImports() {
        return extraImports;
    }

    public void setExtraImports(String extraImports) {
        this.extraImports = extraImports;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getTestClassName() {
        return testClassName;
    }

    public String getSetUpClassCode() {
        return setUpClassCode;
    }

    public void setSetUpClassCode(String setUpClassCode) {
        this.setUpClassCode = setUpClassCode;
    }

    public String getTearDownClassCode() {
        return tearDownClassCode;
    }

    public void setTearDownClassCode(String tearDownClassCode) {
        this.tearDownClassCode = tearDownClassCode;
    }

    public String getSetUpCode() {
        return setUpCode;
    }

    public void setSetUpCode(String setUpCode) {
        this.setUpCode = setUpCode;
    }

    public String getTearDownCode() {
        return tearDownCode;
    }

    public void setTearDownCode(String tearDownCode) {
        this.tearDownCode = tearDownCode;
    }

    public List<PruebaMetodo> getTestsCode() {
        return testsCode;
    }

    public List<PruebaMetodo> addTestCode(PruebaMetodo pruebaMetodo) {
        this.testsCode.add(pruebaMetodo);
        return this.testsCode;
    }

}
