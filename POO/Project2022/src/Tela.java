import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tela extends JFrame {
    private JButton button;
    private JList list;
    private DefaultListModel model;

    public Tela() {
        super("Tarefas");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        model = new DefaultListModel();
        model.addElement("Comprar carvão");
        model.addElement("Comprar salgadinho");
        model.addElement("Descer com o cachorro");
        model.addElement("Fazer trabalho");

        list = new JList(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setVisibleRowCount(4);
        JScrollPane scrollPane = new JScrollPane(list);

        button = new JButton("Adicionar");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tarefa = JOptionPane.showInputDialog(null, "Digite a tarefa:");
                model.addElement(tarefa);
            }
        });

        c.add(scrollPane);
        c.add(button);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Tela();
    }
}