package moldes;

public class casaUniverso {
    private String id;
    private String Clima;
    private int Creado;
    private int diametro;
    private String editado;
    private int gravedad;
    private String nombreplaneta;
    private int periodoOrbital;
    private int poblacion;
    private int rotacion;
    private int superficieAguada;
    private String terreno;
    private String url = "https://swapi.dev/api/planets/";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClima() {
        return Clima;
    }

    public void setClima(String clima) {
        Clima = clima;
    }

    public int getCreado() {
        return Creado;
    }

    public void setCreado(int creado) {
        Creado = creado;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getEditado() {
        return editado;
    }

    public void setEditado(String editado) {
        this.editado = editado;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public String getNombreplaneta() {
        return nombreplaneta;
    }

    public void setNombreplaneta(String nombreplaneta) {
        this.nombreplaneta = nombreplaneta;
    }

    public int getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(int periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getRotacion() {
        return rotacion;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
    }

    public int getSuperficieAguada() {
        return superficieAguada;
    }

    public void setSuperficieAguada(int superficieAguada) {
        this.superficieAguada = superficieAguada;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
