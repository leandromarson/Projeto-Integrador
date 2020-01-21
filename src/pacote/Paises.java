package pacote;

public class Paises {
    //Inicialização das variaveis
    protected int popTotal;
    protected String nome;
    protected int numInfectados;
    protected int numMortes;
    protected float porcentMortesTotPop;
    protected float porcentInfectados;
    protected float porcentMortesTotInf;
    protected String estadoMaiorPorcentInf;
    protected String estadoMaiorPorcentMortesInf;
    protected String estadoMaiorPorcentMortesPopTot;
    protected String estadoMaiorNumInf;
    protected String estadoMaiorNumMortes;
    
    //Metodo Costrutor
    public Paises(int popTotal, String nome) {
        this.popTotal = popTotal;
        this.nome = nome;
    }
    //Getters e Setters
    public String getEstadoMaiorPorcentInf() {
        return estadoMaiorPorcentInf;
    }

    public void setEstadoMaiorPorcentInf(String estadoMaiorPorcentInf) {
        this.estadoMaiorPorcentInf = estadoMaiorPorcentInf;
    }

    public String getEstadoMaiorPorcentMortesInf() {
        return estadoMaiorPorcentMortesInf;
    }

    public void setEstadoMaiorPorcentMortesInf(String estadoMaiorPorcentMortesInf) {
        this.estadoMaiorPorcentMortesInf = estadoMaiorPorcentMortesInf;
    }

    public String getEstadoMaiorPorcentMortesPopTot() {
        return estadoMaiorPorcentMortesPopTot;
    }

    public void setEstadoMaiorPorcentMortesPopTot(String estadoMaiorPorcentMortesPopTot) {
        this.estadoMaiorPorcentMortesPopTot = estadoMaiorPorcentMortesPopTot;
    }

    public String getEstadoMaiorNumInf() {
        return estadoMaiorNumInf;
    }

    public void setEstadoMaiorNumInf(String estadoMaiorNumInf) {
        this.estadoMaiorNumInf = estadoMaiorNumInf;
    }

    public String getEstadoMaiorNumMortes() {
        return estadoMaiorNumMortes;
    }

    public void setEstadoMaiorNumMortes(String estadoMaiorNumMortes) {
        this.estadoMaiorNumMortes = estadoMaiorNumMortes;
    }
    

    public float getPorcentMortesTotPop() {
        return porcentMortesTotPop;
    }

    public void setPorcentMortesTotPop(float porcentMortesTotPop) {
        this.porcentMortesTotPop = porcentMortesTotPop;
    }

    public float getPorcentInfectados() {
        return porcentInfectados;
    }

    public void setPorcentInfectados(float porcentInfectados) {
        this.porcentInfectados = porcentInfectados;
    }

    public float getPorcentMortesTotInf() {
        return porcentMortesTotInf;
    }

    public void setPorcentMortesTotInf(float porcentMortesTotInf) {
        this.porcentMortesTotInf = porcentMortesTotInf;
    }
        
    public int getPopTotal() {
        return popTotal;
    }

    public void setPopTotal(int popTotal) {
        this.popTotal = popTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumInfectados() {
        return numInfectados;
    }

    public void setNumInfectados(int numInfectados) {
        this.numInfectados = numInfectados;
    }

    public int getNumMortes() {
        return numMortes;
    }

    public void setNumMortes(int numMortes) {
        this.numMortes = numMortes;
    }   
    
}
