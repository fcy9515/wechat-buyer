package com.fcy.controller;

import com.fcy.VO.ResultVO;
import com.fcy.converter.OrderForm2OrderDTOConverter;
import com.fcy.dto.OrderDTO;
import com.fcy.enums.ResultEnum;
import com.fcy.exception.SellException;
import com.fcy.form.OrderForm;
import com.fcy.service.BuyerService;
import com.fcy.service.OrderService;
import com.fcy.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-12
 * Time: 21:18
 */
@RestController
@Slf4j
@RequestMapping("/buyer/order")
public class BuyerOrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private BuyerService buyerService;

    // 创建订单
    @PostMapping("/create")
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("【创建订单】参数不正确, orderForm={}", orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("【创建订单】购物车不能为空");
            throw new SellException(ResultEnum.CART_EMPTY);
        }
        OrderDTO createResult = orderService.create(orderDTO);
        Map<String, String> map = new HashMap<>();
        map.put("orderId", createResult.getOrderId());
        return ResultVOUtil.success(map);
    }

    // 订单列表
    @GetMapping("/list")
    public ResultVO<List<OrderDTO>> list(@RequestParam(value = "openId") String openId,
                                         @RequestParam(value = "page", defaultValue = "0") Integer page,
                                         @RequestParam(value = "size", defaultValue = "10") Integer size) {
        if (StringUtils.isEmpty(openId)) {
            log.error("【查询订单列表】，openID为空", new SellException(ResultEnum.PARAM_ERROR));
        }
        Page<OrderDTO> orderDTOPage = orderService.findList(openId, new PageRequest(page, size));
        return ResultVOUtil.success(orderDTOPage.getContent());
    }

    // 查询订单详情
    @GetMapping("/detail")
    public ResultVO<OrderDTO> detail(@RequestParam(value = "openId") String openId,
                                     @RequestParam(value = "orderId") String orderId) {
        OrderDTO orderDTO = buyerService.findOrderOne(openId, orderId);
        return ResultVOUtil.success(orderDTO);
    }

    // 取消订单
    @GetMapping("/cancel")
    public ResultVO cancel(@RequestParam(value = "openId") String openId,
                           @RequestParam(value = "orderId") String orderId) {
        buyerService.cancelOrder(openId, orderId);
        return ResultVOUtil.success();
    }
}
