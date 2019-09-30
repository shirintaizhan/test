class Student extends Person
{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
        public Student(String firstName, String lastName,
                    int identification , int[] testScores)
        {
            super(firstName,lastName,identification);
            this.testScores = testScores;
        }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
        public char calculate()
        {
            int sumGrades = 0;
            for(int i = 0; i < this.testScores.length; i++)
            {
                sumGrades += this.testScores[i];
            }
            int aveRes = sumGrades / this.testScores.length;

            if(aveRes >= 90 && aveRes <= 100)
            {
                return 'O';
            } 
            if(aveRes >= 80 && aveRes < 90)
            {
                return 'E';
            }
            if(aveRes >= 70 && aveRes < 80)
            {
                return 'A';
            }
            if(aveRes >= 55 && aveRes < 70)
            {
                return 'P';
            }
            if(aveRes >= 40 && aveRes < 55)
            {
                return 'D';
            }
            return 'T';
        }
}