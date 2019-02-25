import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

public class WeekEnumTest {
    public static void main(String[] args) {
        for (WeekEnum e : WeekEnum.values()) {
            System.out.println(e.toString());
        }

          WeekEnum weekEnum = WeekEnum.MON;
        switch (weekEnum){
            case MON:
                System.out.printf("星期一");
                break;
            case TUE:
                System.out.println("星期二");
                break;
            // ... ...
            default:
                System.out.println(weekEnum);
                break;
        }

        switch (weekEnum.compareTo(weekEnum.MON)) {
            case -1:
                System.out.println("TUE 在 MON 之前");
                break;
            case 1:
                System.out.println("TUE 在 MON 之后");
                break;
            default:
                System.out.println("TUE 与 MON 在同一位置");
                break;
        }

        //getDeclaringClass()
        System.out.println("getDeclaringClass(): " + weekEnum.getDeclaringClass().getName());

        //name() 和  toString()
        System.out.println("name(): " + weekEnum.name());
        System.out.println("toString(): " + weekEnum.toString());

        //ordinal()， 返回值是从 0 开始
        System.out.println("ordinal(): " + weekEnum.ordinal());

        System.out.println("EnumTest.FRI 的 value = " + WeekEnum.FRI.getValue());

        EnumSet<WeekEnum> weekSet = EnumSet.allOf(WeekEnum.class);
        for (WeekEnum day : weekSet) {
            System.out.println(day);
        }

        // EnumMap的使用
        EnumMap<WeekEnum, String> weekMap = new EnumMap<>(WeekEnum.class);
        weekMap.put(WeekEnum.MON, "星期一");
        weekMap.put(WeekEnum.TUE, "星期二");
        // ... ...
        for (Iterator<Map.Entry<WeekEnum, String>> iter = weekMap.entrySet().iterator(); iter.hasNext();) {
            Map.Entry<WeekEnum, String> entry = iter.next();
            System.out.println(entry.getKey().name() + ":" + entry.getValue());
        }

    }

}