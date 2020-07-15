package triangle;

public class TriangleClassifier {
    public static String findTriangle(int firstEdge, int secondEdge, int thirdEdge) {
        boolean isTriangle = firstEdge + secondEdge > thirdEdge && secondEdge + thirdEdge > firstEdge && firstEdge + thirdEdge > secondEdge;
        if (isTriangle){
            boolean isEquilateralTriangle = firstEdge == secondEdge && firstEdge == thirdEdge;
            if (isEquilateralTriangle){
                return "Đây là tam giác đều";
            }
            boolean isIsoscelesTriangle = firstEdge == secondEdge || firstEdge == thirdEdge || secondEdge == thirdEdge;
            if (isIsoscelesTriangle){
                return "Đây là tam giác cân";
            }
            boolean isRightTriangle = Math.pow(firstEdge, 2) == Math.pow(secondEdge, 2) + Math.pow(thirdEdge, 2);
            boolean isRightTriangle1 = Math.pow(secondEdge, 2) == Math.pow(firstEdge, 2) + Math.pow(thirdEdge, 2);
            boolean isRightTriangle2 = Math.pow(thirdEdge, 2) == Math.pow(secondEdge, 2) + Math.pow(firstEdge, 2);
            if (isRightTriangle ||
                    isRightTriangle1 ||
                            isRightTriangle2
            )
            {
                        return "Đây là tam giác vuông";
            }
            return "Đây là tam giác thường";
        }
        return "Không phải là tam giác";
    }
}
