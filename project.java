import javax.swing.*;

public class project1 extends JFrame {

    private JPanel panel;
    private JLabel questionLabel;
    private JRadioButton answer1;
    private JRadioButton answer2;
    private JRadioButton answer3;
    private JRadioButton answer4;
    private JButton nextButton;
    private int score = 0;

    public project1() {
        panel = new JPanel();
        questionLabel = new JLabel("What is the capital of France?");
        answer1 = new JRadioButton("Paris");
        answer2 = new JRadioButton("Berlin");
        answer3 = new JRadioButton("Madrid");
        answer4 = new JRadioButton("Rome");
        nextButton = new JButton("Next");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(answer1);
        buttonGroup.add(answer2);
        buttonGroup.add(answer3);
        buttonGroup.add(answer4);
        panel.add(questionLabel);
        panel.add(answer1);
        panel.add(answer2);
        panel.add(answer3);
        panel.add(answer4);
        panel.add(nextButton);
        add(panel);
        setTitle("Quiz System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);
        nextButton.addActionListener(e -> {
            if (answer1.isSelected()) {
                score++;
            }
            questionLabel.setText("What is the largest planet in our solar system?");
            answer1.setText("Mars");
            answer2.setText("Jupiter");
            answer3.setText("Earth");
            answer4.setText("Venus");
        });
    }

    public static void main(String[] args) {
        new project1();
    }
}

