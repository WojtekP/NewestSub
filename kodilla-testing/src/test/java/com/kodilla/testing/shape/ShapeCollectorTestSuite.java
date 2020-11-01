package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape collector Test Suite")
public class ShapeCollectorTestSuite {
    static int counter = 0;
    @BeforeEach
    public void beforeEach(){
        counter++;
        System.out.println("Starting test No." + counter);
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("starting tests");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Tests finished");
    }
    @Nested
    @DisplayName("Square Tests")
    class SquareTests{
        @DisplayName("trying to get square name")
        @Test
        void nameTest(){
            Square squre = new Square("First square",4);
            String shapename = squre.getShapeName();
            Assertions.assertEquals("First square",shapename);
        }
        @DisplayName("trying to get square field")
        @Test
        void fieldTest(){
            Square square = new Square("First square",4);
            double field = square.getField();
            Assertions.assertEquals(16,field);
        }
    }
    @Nested
    @DisplayName("Triangle Tests")
    class TriangleTests{
        @DisplayName("trying to get triangle name")
        @Test
        void nameTest(){
            Triagnle triangle = new Triagnle("First triangle",4,5);
            String shapename = triangle.getShapeName();
            Assertions.assertEquals("First triangle",shapename);
        }
        @DisplayName("trying to get square field")
        @Test
        void fieldTest(){
            Triagnle triangle = new Triagnle("First triangle",4,5);
            double field1 =  triangle.getField();
            Assertions.assertEquals(10,field1);
        }

    }
    @Nested
    @DisplayName("Circle Tests")
    class CircleTests{
        @DisplayName("trying to get square name")
        @Test
        void nameTest(){
            Circle circle = new Circle("First Circle",4);
            String shapename = circle.getShapeName();
            Assertions.assertEquals("First Circle",shapename);
        }
        @DisplayName("trying to get square field")
        @Test
        void fieldTest(){
            Circle circle = new Circle("First Circle",4);
            double field = circle.getField();
            Assertions.assertEquals((3.14*(4*4)),field);
        }

    }
    @Nested
    @DisplayName("Shape Collector Tests")
    class ShapeCollectorTests{
        @DisplayName("trying to add shape")
        @Test
        void addFigureTest(){
            Square square = new Square("first square", 4);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigures(square);
            Assertions.assertEquals(1,shapeCollector.getFiguresQuantity());
        }
        @DisplayName("trying to remove shape")
        @Test
        void removeFigureTest(){
            Square square = new Square("First square",4);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigures(square);
            boolean result = shapeCollector.removeFigures(square);
            Assertions.assertTrue(result);

        }
        @DisplayName("trying to get figure")
        @Test
        void getFiguteTest(){
            Square square = new Square("First Square", 4);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigures(square);
            Shape res = shapeCollector.getFigure(0);
            Assertions.assertEquals(square,res);

        }
        @DisplayName("trying to display figures")
        @Test
        void displayFiguresTest(){
            Square square = new Square("First Square", 4);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigures(square);
            List<Square> squares = new ArrayList<>();
            squares.add(square);
            Assertions.assertEquals(squares,shapeCollector.showFigures());

        }

    }
}
