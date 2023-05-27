package com.example.demo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class tpc8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Cria um novo painel raiz
        Pane root = new Pane();

        // Cria uma cena com largura de 800 e altura de 600
        Scene scene = new Scene(root, 800, 600);

        // Define a cena no palco principal
        primaryStage.setScene(scene);

        // Define o título da janela
        primaryStage.setTitle("TPC-8 Trabalhar com scene");

        // Mostra a janela
        primaryStage.show();

        // Define a cor de fundo da cena como ciano
        scene.setFill(Color.CYAN);

        // Cria um texto com o conteúdo "TPC 8"
        Text text = new Text("TPC 8");

        // Define a fonte do texto como Arial, negrito e tamanho 42
        text.setFont(Font.font("Arial", FontWeight.BOLD, 42));

        // Define a cor do texto como verde
        text.setFill(Color.GREEN);

        // Define a posição do texto no eixo X e Y
        text.setLayoutX(50);
        text.setLayoutY(50);

        // Cria uma linha com coordenadas de (200, 200) a (600, 200)
        Line linhaVerm = new Line(200, 200, 600, 200);

        // Define a cor da linha como vermelha
        linhaVerm.setStroke(Color.RED);

        // Define a posição da linha no eixo Y
        linhaVerm.setLayoutY(60);

        // Define o ponto inicial da linha no eixo X
        linhaVerm.setStartX(300);

        // Rotaciona a linha em 50 graus
        linhaVerm.setRotate(50);

        // Define a largura da linha como 10 pixels
        linhaVerm.setStrokeWidth(10);

        // Cria um polígono que representa um triângulo
        Polygon triangulo = new Polygon(400, 150, 500, 250, 300, 250);

        // Define a cor de preenchimento do triângulo como amarelo
        triangulo.setFill(Color.YELLOW);

        // Define a cor da borda do triângulo como amarelo
        triangulo.setStroke(Color.YELLOW);

        // Rotaciona o triângulo em 225 graus
        triangulo.setRotate(225);

        // Define a posição do triângulo no eixo Y
        triangulo.setLayoutY(125);

        // Define a posição do triângulo no eixo X
        triangulo.setLayoutX(-140);

        // Cria um retângulo com coordenadas (100, 100), largura 125 e altura 125
        Rectangle quadrado = new Rectangle(100, 100, 125, 125);

        // Define a cor de preenchimento do retângulo como azul
        quadrado.setFill(Color.BLUE);

        // Define a cor da borda do retângulo como preto
        quadrado.setStroke(Color.BLACK);

        // Define a largura da borda do retângulo como 10 pixels
        quadrado.setStrokeWidth(10);

        // Cria um círculo com centro em (200, 500) e raio de 50
        Circle circulo = new Circle(200, 500, 50);

        // Define a cor de preenchimento do círculo como laranja
        circulo.setFill(Color.ORANGE);

        // Define a posição do círculo no eixo X
        circulo.setLayoutX(170);

        // Define a posição do círculo no eixo Y
        circulo.setLayoutY(-70);

        // Cria uma imagem usando o caminho fornecido
        Image imagem = new Image("C:\\Users\\DELL\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\uta-logo.png");

        // Cria uma exibição de imagem usando a imagem fornecida
        ImageView imageView = new ImageView(imagem);

        // Define a posição da exibição da imagem no eixo X
        imageView.setLayoutX(100);

        // Define a posição da exibição da imagem no eixo Y
        imageView.setLayoutY(480);

        // Adiciona todos os elementos (texto, linha, triângulo, retângulo, círculo, imagem) ao painel raiz
        root.getChildren().addAll(text, linhaVerm, triangulo, quadrado, circulo, imageView);
    }
}
