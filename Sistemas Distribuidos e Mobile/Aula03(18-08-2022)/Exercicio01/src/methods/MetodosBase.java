package methods;

import java.sql.*;
import javax.swing.*;
import model.*;

public class MetodosBase {

    /**
     * It sets the look and feel of the program to Nimbus
     */
    public static void tema(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
    }

    public boolean inserir(Cliente cliente){
        MetodosDatabase db = new MetodosDatabase();
        try {
            db.insertUser(cliente);
            return true;
        } 
        catch (SQLException x) {
            JOptionPane.showMessageDialog(null, x);
        }
        return false;
    }

    public void remover(){
        MetodosDatabase db = new MetodosDatabase();
        String delete_user = JOptionPane.showInputDialog(null, "Quem deseja remover?");
		try {
            if (db.deleteUser(delete_user)) {
                JOptionPane.showMessageDialog(null, "Usuario " + delete_user + " foi excluído com sucesso.", "Deletado", JOptionPane.PLAIN_MESSAGE);
            } 
            else {
                JOptionPane.showMessageDialog(null, "Usuario " + delete_user + " não encontrado.", "Erro Delete", JOptionPane.ERROR_MESSAGE);
            }
		} 
        catch (Exception x) {
			JOptionPane.showMessageDialog(null, "Algo deu errado\n"+x, "Erro no Delete", JOptionPane.ERROR_MESSAGE);
		}
    }

    public boolean alterar(){
        MetodosDatabase db = new MetodosDatabase();
        String nome = JOptionPane.showInputDialog(null, "Qual usuario deseja alterar?");
		try {
			Cliente cliente = db.findUser(nome);
			int confirm = JOptionPane.showConfirmDialog(null, "O usuario que deseja alterar é:\n" + cliente.toString(), "Alterar", JOptionPane.YES_NO_OPTION);
			switch (confirm) {
                case 0:
                    cliente.setNome(JOptionPane.showInputDialog(null, "Digite o novo nome: "));
				    cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova idade: ")));
                    if (db.updateUser(cliente)) {
                        JOptionPane.showMessageDialog(null, "Alteração concluída com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            
                default:
                    break;
            }
		}
        catch (SQLException e1) {
			e1.printStackTrace();
		}
        return false;
    }

}
