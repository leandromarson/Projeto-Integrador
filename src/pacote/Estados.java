package pacote;


public final class Estados extends Paises{//A classe Estados herda caracteristicas de Paises
    //Inicialização das variaveis
    String bioma;
    private int biomaId;
    
    //Metodo Construtor
    public Estados(int popTotal, String nome, int numInfectados, int numMortes, String bioma) {
        super(popTotal, nome);
        this.numInfectados = numInfectados;
        this.numMortes = numMortes;
        this.bioma = bioma;
        this.setBiomaId(bioma);
    }
    
    
    //Getters e Setters  
    public int getBiomaId() {
        return biomaId;
    }

    public void setBiomaId(String bioma) {
        if("Amazônia".equals(bioma))this.biomaId = 0;
        if("Cerrado".equals(bioma))this.biomaId = 1;
        if("Caatinga".equals(bioma))this.biomaId = 2;
        if("Mata Atlântica".equals(bioma))this.biomaId = 3;
        if("Pantanal".equals(bioma))this.biomaId = 4;
        if("Pampa".equals(bioma))this.biomaId = 5;
    }

    
    
    public String getBioma() {
        return bioma;
    }

    public void setBioma(String Bioma) {
        this.bioma = Bioma;
    }

       
    
}
