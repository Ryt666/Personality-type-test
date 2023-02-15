package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {

    private JButton b1 = new JButton("B №1");
    private JButton b2 = new JButton("B №2");
    private JButton b3 = new JButton("B №3");
    private JButton b4 = new JButton("B №4");

    int count=0;

    ButtonGroup group1 = new ButtonGroup();
    JRadioButton no1 = new JRadioButton("No", true);
    JRadioButton yes1 = new JRadioButton("yes", false);

    ButtonGroup group2 = new ButtonGroup();
    JRadioButton no2 = new JRadioButton("No", true);
    JRadioButton yes2 = new JRadioButton("yes", false);

    ButtonGroup group3 = new ButtonGroup();
    JRadioButton no3 = new JRadioButton("No", true);
    JRadioButton yes3 = new JRadioButton("yes", false);

    ButtonGroup group4 = new ButtonGroup();
    JRadioButton no4 = new JRadioButton("No", true);
    JRadioButton yes4 = new JRadioButton("yes", false);

    ButtonGroup group5 = new ButtonGroup();
    JRadioButton no5 = new JRadioButton("No", true);
    JRadioButton yes5 = new JRadioButton("yes", false);

    ButtonGroup group6 = new ButtonGroup();
    JRadioButton no6 = new JRadioButton("No", true);
    JRadioButton yes6 = new JRadioButton("yes", false);

    ButtonGroup group7 = new ButtonGroup();
    JRadioButton no7 = new JRadioButton("No", true);
    JRadioButton yes7 = new JRadioButton("yes", false);

    ButtonGroup group8 = new ButtonGroup();
    JRadioButton no8 = new JRadioButton("No", true);
    JRadioButton yes8 = new JRadioButton("yes", false);

    ButtonGroup group9 = new ButtonGroup();
    JRadioButton no9 = new JRadioButton("No", true);
    JRadioButton yes9 = new JRadioButton("yes", false);

    ButtonGroup group10 = new ButtonGroup();
    JRadioButton no10 = new JRadioButton("No", true);
    JRadioButton yes10 = new JRadioButton("yes", false);

// 194.23

    JTextField field1 = new JTextField();
    JTextField field2 = new JTextField();
    JTextField field3 = new JTextField();
    JTextField field4 = new JTextField();
    JTextField field5 = new JTextField();
    JTextField field6 = new JTextField();
    JTextField field7 = new JTextField();
    JTextField field8 = new JTextField();
    JTextField field9 = new JTextField();
    JTextField field10 = new JTextField();



    private JSlider slider1 = new JSlider(0,100,0);
    private JSlider slider2 = new JSlider(0,100,0);
    private JSlider slider3 = new JSlider(0,100,0);
    private JSlider slider4 = new JSlider(0,100,0);

    private JLabel label1 = new JLabel("Флегматик нa ");
    private JLabel label2 = new JLabel("Меланхолик нa ");
    private JLabel label3 = new JLabel("Холерик нa ");
    private JLabel label4 = new JLabel("Сангвиник нa ");

    public Panel()
    {
        setLayout(null);
        Label();
        Slider();
        Button();
        Event();
        Field();
        Radio_Button();
    }


    private void Label()
    {
        label1.setBounds(10,10,100,30);
        add(label1);


        label2.setBounds(10,90,100,30);
        add(label2);

        label3.setBounds(10,170,100,30);
        add(label3);

        label4.setBounds(10,250,100,30);
        add(label4);




    }
    private void Slider()
    {
        slider1.setBounds(110,15,250,50);
        slider1.setPaintTicks(true);    //логическое значение определяет, будут ли помечены метки на ползунке или нет.
        slider1.setMajorTickSpacing(10);    //устанавливает интервал для основных тиков
        slider1.setPaintTrack(true);    //логическое значение определяет, будет ли дорожка нарисована на слайдере или нет
        slider1.setSnapToTicks(true);   //если true передано, то положение ползунка устанавливается на ближайший тик.
        slider1.setPaintLabels(true);   // возвращает, нарисованы ли метки или нет
        add(slider1);


        slider2.setBounds(110,90,250,50);
        slider2.setPaintTicks(true);    //логическое значение определяет, будут ли помечены метки на ползунке или нет.
        slider2.setMajorTickSpacing(10);    //устанавливает интервал для основных тиков
        slider2.setPaintTrack(true);    //логическое значение определяет, будет ли дорожка нарисована на слайдере или нет
        slider2.setSnapToTicks(true);   //если true передано, то положение ползунка устанавливается на ближайший тик.
        slider2.setPaintLabels(true);   // возвращает, нарисованы ли метки или нет
        add(slider2);

        slider3.setBounds(110,165,250,50);
        slider3.setPaintTicks(true);    //логическое значение определяет, будут ли помечены метки на ползунке или нет.
        slider3.setMajorTickSpacing(10);    //устанавливает интервал для основных тиков
        slider3.setPaintTrack(true);    //логическое значение определяет, будет ли дорожка нарисована на слайдере или нет
        slider3.setSnapToTicks(true);   //если true передано, то положение ползунка устанавливается на ближайший тик.
        slider3.setPaintLabels(true);   // возвращает, нарисованы ли метки или нет
        add(slider3);

        slider4.setBounds(110,240,250,50);
        slider4.setPaintTicks(true);    //логическое значение определяет, будут ли помечены метки на ползунке или нет.
        slider4.setMajorTickSpacing(10);    //устанавливает интервал для основных тиков
        slider4.setPaintTrack(true);    //логическое значение определяет, будет ли дорожка нарисована на слайдере или нет
        slider4.setSnapToTicks(true);   //если true передано, то положение ползунка устанавливается на ближайший тик.
        slider4.setPaintLabels(true);   // возвращает, нарисованы ли метки или нет
        add(slider4);

    }

    private void Button()
    {
        b1.setBounds(400,15,70,50);
        add(b1);

        b2.setBounds(400,90,70,50);
        add(b2);

        b3.setBounds(400,165,70,50);
        add(b3);

        b4.setBounds(400,240,70,50);
        add(b4);


    }
    private void Event()
    {
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        yes1.addActionListener(this);
        no1.addActionListener(this);

        yes2.addActionListener(this);
        no2.addActionListener(this);

        yes3.addActionListener(this);
        no3.addActionListener(this);

        yes4.addActionListener(this);
        no4.addActionListener(this);

        yes5.addActionListener(this);
        no5.addActionListener(this);

        yes6.addActionListener(this);
        no6.addActionListener(this);

        yes7.addActionListener(this);
        no7.addActionListener(this);

        yes8.addActionListener(this);
        no8.addActionListener(this);

        yes9.addActionListener(this);
        no9.addActionListener(this);

        yes10.addActionListener(this);
        no10.addActionListener(this);
    }


    private void Field()
    {
        field1.setBounds(10,320,320,20);
        add(field1);
        field2.setBounds(10,350,320,20);
        add(field2);
        field3.setBounds(10,380,320,20);
        add(field3);
        field4.setBounds(10,410,320,20);
        add(field4);
        field5.setBounds(10,440,320,20);
        add(field5);
        field6.setBounds(10,470,320,20);
        add(field6);
        field7.setBounds(10,500,320,20);
        add(field7);
        field8.setBounds(10,530,320,20);
        add(field8);
        field9.setBounds(10,560,320,20);
        add(field9);
        field10.setBounds(10,590,320,20);
        add(field10);


    }



    private String f1="";
    private String f2="";
    private String f3="";
    private String f4="";
    private String f5="";
    private String f6="";
    private String f7="";
    private String f8="";
    private String f9="";
    private String f10="";



    private void Button_4()
    {

        f1="Веселы и жизнерадостны";
        f2="Энергичны и деловиты ";
        f3="Часто не доводите начатое дело до конца";
        f4="Склонны переоценивать себя";
        f5="Способны быстро схватить новое";
        f6="Неустойчивы в интересах и склонностях";
        f7="Легко переживаете неудачи и неприятности";
        f8="Легко приспосабливаетесь к разным обстоятельствам";
        f9="Выносливы и работоспособны";
        f10="Быстро засыпаете и пробуждаетесь. ";

        field1.setText(f1);
        field2.setText(f2);
        field3.setText(f3);
        field4.setText(f4);
        field5.setText(f5);
        field6.setText(f6);
        field7.setText(f7);
        field8.setText(f8);
        field9.setText(f9);
        field10.setText(f10);

    }



    private void Button_3()
    {

        b1.isDefaultButton();

        f1="Неустойчивы, суетливы. ";
        f2="Невыдержанны, вспыльчивы";
        f3="Нетерпеливы. ";
        f4="Резки и прямолинейны в отношениях с людьми. ";
        f5="Решительны и инициативны";
        f6="Упрямы.";
        f7="Находчивы в споре";
        f8="Работаете рывками";
        f9="Работаете рывками";
        f10="Незлопамятны и необидчивы";

        field1.setText(f1);
        field2.setText(f2);
        field3.setText(f3);
        field4.setText(f4);
        field5.setText(f5);
        field6.setText(f6);
        field7.setText(f7);
        field8.setText(f8);
        field9.setText(f9);
        field10.setText(f10);

    }


    private void Button_2()
    {
        f1="Стеснительны, застенчивы";
        f2="Теряетесь в новой обстановке";
        f3="Не верите в свои силы";
        f4="Затрудняетесь установить контакт с чужими людьми ";
        f5="Легко переносите одиночество.";
        f6="Чувствуете подавленность и растерянность при неудачах.";
        f7="Склонны уходить в себя.";
        f8="Быстро утомляетесь. ";
        f9="Обладаете слабой тихой речью, иногда до шепота.";
        f10="Впечатлительны до слезливости. ";

        field1.setText(f1);
        field2.setText(f2);
        field3.setText(f3);
        field4.setText(f4);
        field5.setText(f5);
        field6.setText(f6);
        field7.setText(f7);
        field8.setText(f8);
        field9.setText(f9);
        field10.setText(f10);

    }



    private void Button_1()
    {
        f1="Спокойны и хладнокровны?";
        f2="Последовательны, обстоятельны в делах?";
        f3="Осторожны и рассудительны. ";
        f4="Умеете ждать.";
        f5="Молчаливы и не любите попусту болтать.";
        f6="Сдержанны и терпеливы.";
        f7="Не растрачиваете попусту сил.";
        f8="Инертны, малоподвижны, вялы.";
        f9="Легко сдерживаете порывы.";
        f10="Маловосприимчивы к одобрению и порицанию";

        field1.setText(f1);
        field2.setText(f2);
        field3.setText(f3);
        field4.setText(f4);
        field5.setText(f5);
        field6.setText(f6);
        field7.setText(f7);
        field8.setText(f8);
        field9.setText(f9);
        field10.setText(f10);

    }
    private void Radio_Button()
    {
        yes1.setBounds(340,310,50,30);
        add(yes1);
        no1.setBounds(400,310,50,30);
        add(no1);
        group1.add(no1);
        group1.add(yes1);

        yes2.setBounds(340,340,50,30);
        add(yes2);
        no2.setBounds(400,340,50,30);
        add(no2);
        group2.add(no2);
        group2.add(yes2);

        yes3.setBounds(340,370,50,30);
        add(yes3);
        no3.setBounds(400,370,50,30);
        add(no3);
        group3.add(no3);
        group3.add(yes3);

        yes4.setBounds(340,400,50,30);
        add(yes4);
        no4.setBounds(400,400,50,30);
        add(no4);
        group4.add(no4);
        group4.add(yes4);

        yes5.setBounds(340,430,50,30);
        add(yes5);
        no5.setBounds(400,430,50,30);
        add(no5);
        group5.add(no5);
        group5.add(yes5);

        yes6.setBounds(340,460,50,30);
        add(yes6);
        no6.setBounds(400,460,50,30);
        add(no6);
        group6.add(no6);
        group6.add(yes6);

        yes7.setBounds(340,490,50,30);
        add(yes7);
        no7.setBounds(400,490,50,30);
        add(no7);
        group7.add(no7);
        group7.add(yes7);

        yes8.setBounds(340,520,50,30);
        add(yes8);
        no8.setBounds(400,520,50,30);
        add(no8);
        group8.add(no8);
        group8.add(yes8);

        yes9.setBounds(340,550,50,30);
        add(yes9);
        no9.setBounds(400,550,50,30);
        add(no9);
        group9.add(no9);
        group9.add(yes9);

        yes10.setBounds(340,580,50,30);
        add(yes10);
        no10.setBounds(400,580,50,30);
        add(no10);
        group10.add(no10);
        group10.add(yes10);

    }


    private int n = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b4) {
            count=0;
            Button_4();
            n=4;
        }
        if(e.getSource()==b3) {
            count=0;
            Button_3();
            n=3;
        }
        if(e.getSource()==b2) {
            count=0;
            Button_2();
            n=2;
        }
        if(e.getSource()==b1) {
            count=0;
            Button_1();
            n=1;
        }

        switch (n)
        {
            case 1:
                if(e.getSource()==yes1) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==no1) {

                    count--;
                    System.out.println("Yes + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==yes2) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==yes3) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==yes4) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==yes5) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==yes6) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==yes7) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==yes8) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==yes9) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                if(e.getSource()==yes10) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider1);
                }
                break;
            case 2:
                if(e.getSource()==yes1) {

                    count++;
                    System.out.println("Yes + "+count);
                    qwe(slider2);
                }
                if(e.getSource()==yes2) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider2);
                }
                if(e.getSource()==yes3) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider2);
                }
                if(e.getSource()==yes4) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider2);
                }
                if(e.getSource()==yes5) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider2);
                }
                if(e.getSource()==yes6) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider2);
                }
                if(e.getSource()==yes7) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider2);
                }
                if(e.getSource()==yes8) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider2);
                }
                if(e.getSource()==yes9) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider2);
                }
                if(e.getSource()==yes10) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider2);
                }
                break;
            case 3:
                if(e.getSource()==yes1) {

                    count++;
                    System.out.println("Yes + "+count);
                    qwe(slider3);
                }
                if(e.getSource()==yes2) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider3);
                }
                if(e.getSource()==yes3) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider3);
                }
                if(e.getSource()==yes4) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider3);
                }
                if(e.getSource()==yes5) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider3);
                }
                if(e.getSource()==yes6) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider3);
                }
                if(e.getSource()==yes7) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider3);
                }
                if(e.getSource()==yes8) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider3);
                }
                if(e.getSource()==yes9) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider3);
                }
                if(e.getSource()==yes10) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider3);
                }
                break;
            case 4:
                if(e.getSource()==yes1) {

                    count++;
                    System.out.println("Yes + "+count);
                    qwe(slider4);
                }
                if(e.getSource()==yes2) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider4);
                }
                if(e.getSource()==yes3) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider4);
                }
                if(e.getSource()==yes4) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider4);
                }
                if(e.getSource()==yes5) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider4);
                }
                if(e.getSource()==yes6) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider4);
                }
                if(e.getSource()==yes7) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider4);
                }
                if(e.getSource()==yes8) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider4);
                }
                if(e.getSource()==yes9) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider4);
                }
                if(e.getSource()==yes10) {

                    count++;
                    System.out.println("Yes1 + "+count);
                    qwe(slider4);
                }
                break;
        }
    }


    public void qwe(JSlider s)
    {

        s.setValue(count*100/10);
    }


}