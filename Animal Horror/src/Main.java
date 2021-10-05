public class Main
{
    public static void main(String[] args)
    {
        Rabbit rabbit = new Rabbit(8,10);
        Snake snake = new Snake(5,5);
        System.out.println("I am the rabbit I am now standing on " + rabbit.getX() + " " + rabbit.getY());
        System.out.println("I am the snake I am now standing on " + snake.getX() + " " + snake.getY());
        //Loop goes until snake has reached rabbit
        while (snake.getX() != rabbit.getX() ||  snake.getY() != rabbit.getY())
        {
            //Checks whether the snake is one square away from the rabbit
            if((snake.getX() == rabbit.getX() && snake.getY() == rabbit.getY() + 1)
                    || (snake.getX() == rabbit.getX() && snake.getY() == rabbit.getY() - 1)
                    || (snake.getX() == rabbit.getX() + 1 && snake.getY() == rabbit.getY())
                    || (snake.getX() == rabbit.getX() - 1 && snake.getY() == rabbit.getY())
                    || (snake.getX() == rabbit.getX() + 1 && snake.getY() == rabbit.getY() + 1)
                    || (snake.getX() == rabbit.getX() + 1 && snake.getY() == rabbit.getY() - 1)
                    || (snake.getX() == rabbit.getX() - 1 && snake.getY() == rabbit.getY() + 1)
                    || (snake.getX() == rabbit.getX() - 1 && snake.getY() == rabbit.getY() - 1))
            {
                System.out.println("Rabbit: Oh no, please do not eat me!");
            }
            else
            {
                if(snake.getX() > rabbit.getX() || snake.getY() > rabbit.getY()) //Checks if snake's position is higher than rabbit
                {
                    rabbit.setDirection(false); //Direction change if necessary
                }
                if (snake.getX() <= rabbit.getX() || snake.getY() <= rabbit.getY()) //Checks if snake's position is lower than rabbit
                {
                    rabbit.setDirection(true); //Direction change if necessary
                }
                if (rabbit.getX() == 10 && rabbit.getY() == 10) //Checks if the rabbit starts at 10 10
                {
                    rabbit.setDirection(false); //Direction change if necessary
                }
                if(rabbit.getX() == 0 && rabbit.getY() == 0) //Checks if rabbit starts at 0 0
                {
                    rabbit.setDirection(true); //Direction change if necessary
                }
                if (rabbit.getX() <= rabbit.getY() && rabbit.getX() < 10 && rabbit.getDirection() == true) //Checks direction and boundaries
                {
                    rabbit.setX(rabbit.getX()+1);
                }
                else if (rabbit.getX() > rabbit.getY() && rabbit.getY() < 10 && rabbit.getDirection() == true) //Checks direction and boundaries
                {
                    rabbit.setY(rabbit.getY()+1);
                }
                if(rabbit.getX()>= rabbit.getY() && rabbit.getX() > 0 && rabbit.getDirection() == false) //Checks direction and boundaries
                {
                    rabbit.setX(rabbit.getX()-1);
                }
                else if(rabbit.getX() < rabbit.getY() && rabbit.getY() > 0 && rabbit.getDirection() == false) //Checks direction and boundaries
                {
                    rabbit.setY(rabbit.getY()-1);
                }
                System.out.println("Rabbit: I am the rabbit I am now standing on " + rabbit.getX() + " " + rabbit.getY());
                //Checks if rabbit has moved to its death
                if((snake.getX() == rabbit.getX() && snake.getY() == rabbit.getY() + 1)
                        || (snake.getX() == rabbit.getX() && snake.getY() == rabbit.getY() - 1)
                        || (snake.getX() == rabbit.getX() + 1 && snake.getY() == rabbit.getY())
                        || (snake.getX() == rabbit.getX() - 1 && snake.getY() == rabbit.getY())
                        || (snake.getX() == rabbit.getX() + 1 && snake.getY() == rabbit.getY() + 1)
                        || (snake.getX() == rabbit.getX() + 1 && snake.getY() == rabbit.getY() - 1)
                        || (snake.getX() == rabbit.getX() - 1 && snake.getY() == rabbit.getY() + 1)
                        || (snake.getX() == rabbit.getX() - 1 && snake.getY() == rabbit.getY() - 1))
                {
                    System.out.println("Rabbit: Oh no, please do not eat me!");
                }
            }
            if (snake.getX() < rabbit.getX()) //Checks if the snake is behind the rabbit
            {
                snake.setX(snake.getX()+1); //If it is snake moves forward
            }
            if (snake.getY() < rabbit.getY()) //Checks if the snake is beneath the rabbit
            {
                snake.setY(snake.getY()+1); //If it is snake moves up
            }
            if (snake.getX() > rabbit.getX()) //Checks if the snake is in front of the rabbit
            {
                snake.setX(snake.getX()-1); //If it is snake moves backward
            }
            if (snake.getY() > rabbit.getY()) //Checks if the snake is above the rabbit
            {
                snake.setY(snake.getY()-1); //If it is snake moves down
            }
            System.out.println("Snake: I am the snake I am now standing on " + snake.getX() + " " + snake.getY());
        }
        //After exiting the loop snake eats the rabbit
        System.out.println("Snake: Haha, I am eating you, rabbit!");
    }
}
