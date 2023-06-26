//Реализовать простой калькулятор
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class task3 extends JFrame{
 public int res = 0;
 public task3(){
    setTitle("Калькулятор");
    JPanel panel = new JPanel(); // Создание панели
    JButton plus = new JButton("+");// Создаем кнопку плюс
    JButton minus = new JButton("-");// создаем кнопку минус
    JButton multiply= new JButton("*"); // создаем кнопку умножения
    JButton divide = new JButton("/"); // создаем кнопку деления
    JLabel result = new JLabel("result");// результат
    JTextField x1 = new JTextField("1");// операции
    JTextField x2 = new JTextField ("2");// операции

    ActionListener listenerPlus - new ActionListener { // функция которая ожидает проведение операций
        @Override
        public void actionPerformed(ActiveEvent actionEvent) {
            int x_1 = Integer.parseInt(x1.getText);// перевод строки в число
             int x_2 = Integer.parseInt(x2.getText);// перевод строки в число
             res = x_1 + x_2;
             result.setText(String.valueOf(res)); // перевод в строку
         }
        };
        
        ActionListener listenerMinus - new ActionListener { // функция которая ожидает проведение операций
        @Override
        public void actionPerformed(ActiveEvent actionEvent) {
            int x_1 = Integer.parseInt(x1.getText);// перевод строки в число
             int x_2 = Integer.parseInt(x2.getText);// перевод строки в число
             res = x_1 - x_2;
             result.setText(String.valueOf(res)); 
        }
    };
             ActionListener listenerMultiply - new ActionListener { // функция которая ожидает проведение операций
        @Override
        public void actionPerformed(ActiveEvent actionEvent) {
            int x_1 = Integer.parseInt(x1.getText);// перевод строки в число
             int x_2 = Integer.parseInt(x2.getText);// перевод строки в число
             res = x_1 * x_2;
             result.setText(String.valueOf(res));
        }
    };
             ActionListener listenerDivide - new ActionListener { // функция которая ожидает проведение операций
            
             @Override
        public void actionPerformed(ActiveEvent actionEvent) {
            int x_1 = Integer.parseInt(x1.getText);// перевод строки в число
             int x_2 = Integer.parseInt(x2.getText);// перевод строки в число
             res = x_1 / x_2;
             result.setText(String.valueOf(res)); 
                    
            }

    };


plus.addActionListener(listenerPlus);// привязываем к кнопкам
minus.addActionListener(listenerMinus);
multiply.addActionListener(listenerMultiply);
divide.addActionListener(listenerDivide);
panel.setSize(new Dimension( 500, 500));//задаем размер панели
add(panel);
panel.add(plus);// привязываем к панели
panel.add(minus);
panel.add(multiply);
panel.add(divide);
panel.add(x1);
panel.add(x2);
setPreferredSize(new Dimension(600, 600));
setVisible(true);
setDefaultCloseOperation(EXITON_CLOSE);
pack();
        }
    }

