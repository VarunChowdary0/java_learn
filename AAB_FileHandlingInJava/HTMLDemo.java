package AAB_FileHandlingInJava;

import javax.swing.*;
public class HTMLDemo extends JFrame {
    public HTMLDemo() {
        super("HTML Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText("<html><body><h1>Hello, World!</h1><button>hello</button><p>This is a <strong>bold</strong> paragraph.</p><i href='#'>hi</i></body></html>");

        JScrollPane scrollPane = new JScrollPane(editorPane);
        getContentPane().add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HTMLDemo());
    }
}

