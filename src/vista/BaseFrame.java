package vista;
import javax.swing.JFrame;
import modelo.SistemaDVD;

public abstract class BaseFrame extends JFrame {
    protected SistemaDVD sistema;
    
    public BaseFrame(String titulo, SistemaDVD sistema) {
        super(titulo);
        this.sistema = sistema;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    public abstract void mostrar();
}