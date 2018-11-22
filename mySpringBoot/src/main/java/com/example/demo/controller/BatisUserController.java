package com.example.demo.controller;

import com.example.demo.model.JsonResult;
import com.example.demo.model.MyBatisUser;
import com.example.demo.service.BatisUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author shijy
 * @Date 2018/11/22 11 : 33
 * @Descriprion
 */
@RestController
@RequestMapping("/batis")
public class BatisUserController {

    private static final Logger logger = LoggerFactory.getLogger(BatisUserController.class);

    @Autowired
    private BatisUserService batisUserService;

    /**
     * 查找用户根据ID
     * @param id
     * @return
     */
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserById(@PathVariable("id") Integer id){
        JsonResult result = new JsonResult();
        try {
            MyBatisUser myBatisUser = batisUserService.getUserById(id);
            result.setResult(myBatisUser);
            result.setStatus("search success");
        }catch (Exception e){
            result.setResult(e.getClass().getName() + ":" + e.getMessage());
            result.setStatus("search failed");
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

    /**
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserList(){
        JsonResult result = new JsonResult();
        try {
            List<MyBatisUser> list = batisUserService.getUserList();
            result.setResult(list);
            result.setStatus("search success");


        }catch (Exception e){
            result.setResult(e.getClass().getName() + ":" + e.getMessage());
            result.setStatus("search failed");
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public ResponseEntity<JsonResult> addUser(@RequestBody MyBatisUser user){
        JsonResult result = new JsonResult();
        try {
            int addId = batisUserService.add(user);
            if(addId>0) {
                result.setResult(addId);
                result.setStatus("add success");
            }else{
                result.setResult(addId);
                result.setStatus("add failed");
            }

        }catch (Exception e){
            result.setResult(e.getClass().getName() + ":" + e.getMessage());
            result.setStatus("add failed");
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 更新用户信息
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value = "/updateUser/{id}",method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> updateUser(@PathVariable("id") Integer id,@RequestBody MyBatisUser user){
        JsonResult result = new JsonResult();
        try {
            int updateId = batisUserService.update(id, user);
            if(updateId>0){
                result.setResult(updateId);
                result.setStatus("update success");
            }else{
                result.setResult(updateId);
                result.setStatus("update failed");
            }
        }catch (Exception e){
            result.setResult(e.getClass().getName() + ":" + e.getMessage());
            result.setStatus("update failed");
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<JsonResult> deleteUser(@PathVariable("id") Integer id){
        JsonResult result = new JsonResult();
        try {
            int deleteId = batisUserService.delete(id);
            if(deleteId>0){
                result.setResult(deleteId);
                result.setStatus("delete success");
            }else{
                result.setResult(deleteId);
                result.setStatus("delete failed");
            }
        }catch (Exception e){
            result.setResult(e.getClass().getName() + ":" + e.getMessage());
            result.setStatus("delete failed");
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

}
