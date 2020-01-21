
package pacote;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class PaisesTM extends AbstractTableModel{
    
    private List<Paises> linhas;
    private String[] colunas = new String[]{"País","População"};
    
    public PaisesTM(){
        linhas = new ArrayList<Paises>();
    }
    
    public PaisesTM(List<Paises> lista) {
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
                return p.getNome();
            case 1:
                return p.getPopTotal();
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
                p.setNome(aValue.toString());
                break;
            case 1:
                p.setPopTotal((int) aValue);
                break;
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(Paises aValue, int rowIndex) {
        Paises p = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        p.setNome(aValue.getNome());
        p.setPopTotal(aValue.getPopTotal());
        
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Paises getPaises(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addPaises(Paises p) {
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
