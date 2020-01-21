package pacote;



import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class PaisesTMR extends AbstractTableModel{
    
    private List<Paises> linhas;
    private String[] colunas = new String[]{"Num. Inf.","Num. Mortes","% Inf. / Pop.","% Mortes / Inf.","% Mortes / Pop.","Estado c/ > % Inf. / Pop.","Estado c/ > % Mortes / Inf.","Estado c/ > % Mortes / Pop.","Estado c/ > Num. Inf.","Estado c/ > Num. Mortes"};
    
    public PaisesTMR(){
        linhas = new ArrayList<Paises>();
    }
    
    public PaisesTMR(List<Paises> lista) {
        linhas = new ArrayList<Paises>(lista);
    }

    @Override
    public int getColumnCount() {        
        return colunas.length;
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paises p = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return p.getNumInfectados();
            case 1:
                return p.getNumMortes();
            case 2:
                return p.getPorcentInfectados();
            case 3:
                return p.getPorcentMortesTotInf();
            case 4:
                return p.getPorcentMortesTotPop();
            case 5:
                return p.getEstadoMaiorPorcentInf();
            case 6:
                return p.getEstadoMaiorPorcentMortesInf();
            case 7:
                return p.getEstadoMaiorPorcentMortesPopTot();
            case 8:
                return p.getEstadoMaiorNumInf();
            case 9:
                return p.getEstadoMaiorNumMortes();
                
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Paises p = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            case 0:
                p.setNumInfectados((int) aValue);
                break;
            case 1:
                p.setNumMortes((int) aValue);
                break;
            case 2:
                p.setPorcentInfectados((float) aValue);
                break;
            case 3:
                p.setPorcentMortesTotInf((float) aValue);
                break;
            case 4:
                p.setPorcentMortesTotPop((float) aValue);
                break;
            case 5:
                p.setEstadoMaiorPorcentInf((String) aValue);
                break;
            case 6:
                p.setEstadoMaiorPorcentMortesInf((String) aValue);
                break;
            case 7:
                p.setEstadoMaiorPorcentMortesPopTot((String) aValue);
                break;    
            case 8:
                p.setEstadoMaiorNumInf((String) aValue);
                break;
            case 9:
                p.setEstadoMaiorNumMortes((String) aValue);
                break;    
                
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(Paises aValue, int rowIndex) {
        Paises p = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        p.setNumInfectados(aValue.getNumInfectados());
        p.setNumMortes(aValue.getNumMortes());
        p.setPorcentInfectados(aValue.getPorcentInfectados());
        p.setPorcentMortesTotInf(aValue.getPorcentMortesTotInf());
        p.setPorcentMortesTotPop(aValue.getPorcentMortesTotPop());
        p.setEstadoMaiorPorcentInf(aValue.getEstadoMaiorPorcentInf());
        p.setEstadoMaiorPorcentMortesInf(aValue.getEstadoMaiorPorcentMortesInf());
        p.setEstadoMaiorPorcentMortesPopTot(aValue.getEstadoMaiorPorcentMortesPopTot());
        p.setEstadoMaiorNumInf(aValue.getEstadoMaiorNumInf());
        p.setEstadoMaiorNumMortes(aValue.getEstadoMaiorNumMortes());
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
        fireTableCellUpdated(rowIndex, 7);
        fireTableCellUpdated(rowIndex, 8);
        fireTableCellUpdated(rowIndex, 9);
        
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Paises getPaises(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addPaisesR(Paises p) {
        // Adiciona o registro.
        linhas.add(p);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     /* Remove a linha especificada. */
    public void remove(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addLista(List<Paises> p) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.
        linhas.addAll(p);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }   

        
}
