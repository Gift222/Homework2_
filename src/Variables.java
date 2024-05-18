public class Variables {

    //Task 1 You need to display the area of a rectangle. Your proposed actions are:
    //(a) declare two variables - length and width
    //(b) initialize them with an integer value from 2 to 5
    //(c) declare a third variable to calculate the area
    //(d) initialize the area variable as (length * width)
    //(e) display the area value
    public static void main(String[] args) {

        int length = 2;
        int Width = 5;

        int area;

        area = length * Width;

        System.out.println("Rectangle Area");
        System.out.println("length: " + length);
        System.out.println("width: " + Width);
        System.out.println("Area: " + area);



        // Task 2 You need to implement the calculation of body mass index (BMI) using the
        //formula bodyMassIndex = weight / (height * height).
        //Weight must be substituted in kilograms
        //Height - in meters
        //In this assignment, we are using the double data type.

        class BMICalculator  {
            public void main(String[] args) {

            double weight = 73.5;
            double height = 1.63;
            double bmi = weight / (height * height);
            System.out.println("Body Mass Index (BMI) calculator");
            System.out.println ("weight + weight");
            System.out.println ("BMI: " + bmi );


            // Task 3 Create a variable of double to store the temperature in degrees Celsius. Set it to any
                //temperature in degrees Celsius. Create a second double variable to keep the
                //temperature in degrees Fahrenheit. Calculate the temperature in Fahrenheit using the
                //formula (9/5) * C + 32, where C is the temperature in Celsius.

                public class TemperatureConverter

                double celsius =20.5;
                double fahrenheit = (9.0/5.0) * celsius + 32;

                System.out.println("TemperatureConverter");
                System.out.println("Celsius: " + celsius) ;
                System.out.println("Fahrenheit:" + fahrenheit + "°F");

                // Task 4-Create a variable of type int and assign it the largest possible value for type int.
                //Increment the value of a variable by 1 and display the contents of the variable on the
                //screen.

                int Apples= 2147483647;
                System.out.println("Apples is" +Apples);
                Apples = Apples + 1;
                System.out.println("Apples is" + Apples);

                //Task 5 “Rounding a number”: Create a variable of type double and assign any fractional
                //value to it. Create a new variable of type int and explicitly convert the value of the
                //variable of type double to int. Print the original fractional value and the rounded integer
                //value to the screen.

                double fractionalValue = 5.5;
                int table = 5;
                int roundedInValue = (int) fractionalValue;
                System.out.println("Original Fractional Value: " + fractionalValue);
                System.out.println("Rounded Integer Value: " + roundedIntValue);

                // Task 6)  Create an int variable and assign the ‘age’ value to it. Check if
                //age is greater than or equal to 18 and assign the test result (true or false) to a boolean
                //variable. Print the value of the boolean variable to the console.


                int Age;
                Age = 20;
                int age;
                boolean isAdult = age >= 18;
                System.out.println("is the person an adult?");









            }


        }

    }




