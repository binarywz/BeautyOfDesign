package design.behavior.pipeline.handler;

import design.behavior.pipeline.pipeline.InstanceBuildContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author 喻可
 * @Date 2021/10/27 18:48
 */
@Component
public class BizSideCustomProcessor implements ContextHandler<InstanceBuildContext> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(InstanceBuildContext context) {
        logger.info("--业务方自定义数据处理--");

        // 先判断是否存在自定义数据处理，如果没有，直接返回 true

        // 调用业务方的自定义的表单数据处理

        return true;
    }
}
