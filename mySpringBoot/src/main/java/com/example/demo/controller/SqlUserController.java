package com.example.demo.controller;

import com.example.demo.model.JsonResult;
import com.example.demo.model.SqlUser;
import com.example.demo.service.SqlUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shijy
 * @Date 2018/11/21 11 : 28
 * @Descriprion
 */
@RestController
@RequestMapping("/sqlUser")
public class SqlUserController {

    @Autowired
    private SqlUserService sqlUserService;

    /**
     * 根据ID查找用户
     * @param id
     * @return
     */
    @RequestMapping("/user/{id}")
    public ResponseEntity<JsonResult> getUserById(@PathVariable("id") Integer id){
        JsonResult result = new JsonResult();
        try {
            SqlUser user = sqlUserService.getUserById(id);
            result.setResult(user);
            result.setStatus("ok");
        }catch (Exception e){
            result.setResult(e.getClass().getName() + "" + e.getMessage());
            result.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);

    }

    /**
     * 获取用户列表
     * @return
     */
    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserList(){
        JsonResult result = new JsonResult();
        try {
            List<SqlUser> user = sqlUserService.getUserList();
            result.setResult(user);
            result.setStatus("ok");
        }catch (Exception e){
            result.setResult(e.getClass().getName() + "" + e.getMessage());
            result.setStatus("error");
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
    public ResponseEntity<JsonResult> addUser(@RequestBody SqlUser user){
        JsonResult result = new JsonResult();
        try {
            int userId = sqlUserService.add(user);
            if(userId<0){
                result.setResult(userId);
                result.setStatus("add fail");
            }else{
                result.setResult(userId);
                result.setStatus("ok");
            }
        }catch (Exception e){
            result.setResult(e.getClass().getName() + "" + e.getMessage());
            result.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 更新用户
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value = "/updateUser/{id}",method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> updateUser(@PathVariable("id") Integer id,@RequestBody SqlUser user){
        JsonResult result = new JsonResult();
        try {
            int userId = sqlUserService.update(id,user);
            if(userId<0){
                result.setResult(userId);
                result.setStatus("update fail");
            }else {
                result.setResult(userId);
                result.setStatus("ok");
            }
        }catch (Exception e){
            result.setResult(e.getClass().getName() + "" + e.getMessage());
            result.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<JsonResult> deleteUser(@PathVariable("id") Integer id){
        JsonResult result = new JsonResult();
        try {
            int userId = sqlUserService.delete(id);
            if(userId<0){
                result.setResult(userId);
                result.setStatus("delete fail");
            }else {
                result.setResult(userId);
                result.setStatus("ok");
            }
        }catch (Exception e){
            result.setResult(e.getClass().getName() + "" + e.getMessage());
            result.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

}
