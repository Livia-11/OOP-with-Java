package app.oop.enums;

public enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public void information(){
        switch(this){
            case Monday:
                System.out.println("Checking out the week");
                break;
                case Tuesday:
                    System.out.println("Viewing the week");
                    break;
                    case Wednesday:
                        System.out.println("Dive into work");
                        break;
                        case Thursday:
                            System.out.println("More hardwork to finish the week safe");
                            break;
                            case Friday:
                                System.out.println("Wrapping up to go party for the weekend");
                                break;
                                case Saturday:
                                    System.out.println("Spend the whole day resting and partying during the night");
                                    break;
                                    case Sunday:
                                        System.out.println("Going to church and planning for the next week");
            default:
        }
    }
}
