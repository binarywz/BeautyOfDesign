package design.behavior.observer.eventbusexample;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import design.behavior.observer.example.service.UserService;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * @Author 喻可
 * @Date 2021/7/16 16:27
 */

public class UserController {

    private UserService userService; // 依赖注入

    private EventBus eventBus;

    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        //eventBus = new EventBus(); // 同步阻塞模式

        // 异步非阻塞模式
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            //这里需要注册的观察者是RegPromotionObserver、RegNotificationObserver
            eventBus.register(observer);
        }
    }

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        eventBus.post(userId);

        return userId;
    }
}




