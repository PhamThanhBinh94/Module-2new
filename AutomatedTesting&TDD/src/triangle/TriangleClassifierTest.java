package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
        void testFindTriangle(){
            int firstEdge=2;
            int secondEdge=2;
            int thirdEdge=2;
            String excepted="Đây là tam giác đều";
            String result=TriangleClassifier.findTriangle(firstEdge,secondEdge,thirdEdge);
            assertEquals(excepted,result);
        }
    @Test
    void testFindTriangle1(){
        int firstEdge=2;
        int secondEdge=2;
        int thirdEdge=3;
        String excepted="Đây là tam giác cân";
        String result=TriangleClassifier.findTriangle(firstEdge,secondEdge,thirdEdge);
        assertEquals(excepted,result);
    }
    @Test
    void testFindTriangle2(){
        int firstEdge=3;
        int secondEdge=4;
        int thirdEdge=5;
        String excepted="Đây là tam giác vuông";
        String result=TriangleClassifier.findTriangle(firstEdge,secondEdge,thirdEdge);
        assertEquals(excepted,result);
    }
    @Test
    void testFindTriangle3(){
        int firstEdge=8;
        int secondEdge=2;
        int thirdEdge=3;
        String excepted="Không phải là tam giác";
        String result=TriangleClassifier.findTriangle(firstEdge,secondEdge,thirdEdge);
        assertEquals(excepted,result);
    }
    @Test
    void testFindTriangle4(){
        int firstEdge=-1;
        int secondEdge=2;
        int thirdEdge=1;
        String excepted="Không phải là tam giác";
        String result=TriangleClassifier.findTriangle(firstEdge,secondEdge,thirdEdge);
        assertEquals(excepted,result);
    }
    @Test
    void testFindTriangle5(){
        int firstEdge=0;
        int secondEdge=1;
        int thirdEdge=1;
        String excepted="Không phải là tam giác";
        String result=TriangleClassifier.findTriangle(firstEdge,secondEdge,thirdEdge);
        assertEquals(excepted,result);
    }
    }
