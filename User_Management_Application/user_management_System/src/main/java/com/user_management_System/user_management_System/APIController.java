package com.user_management_System.user_management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIController {
    @Autowired
    List<UserManagement> UserManagement;
    @PostMapping("P_Management")
    public String addUserManagement(@RequestBody UserManagement UManagement){
        UserManagement.add(UManagement);
        return "User Management Addedd";
    }
//    @GetMapping("user/id/userid/{Id}")
//    public String getId(@PathVariable Integer Id) {
//        for (UserManagement user1 :UserManagement) {
//            if (user1.getUserId().equals(Id)) {
//                return "user id exist is" + user1;
//            }
//
//        }
//        return "invalid Id";
// }

    @GetMapping("get_userId/id/{id}")         //    getUser/{userid}
    public String getUserId(@PathVariable Integer id){
        for(UserManagement userId : UserManagement) {
            if (userId.getUserId().equals(id)) {
                return UserManagement.toString();
            }
        }
        return "Invalid userId";
  }

    @GetMapping("getAllUsers")
    public  List<UserManagement> getAllUsers(){
        return UserManagement;
    }
    //update userinfo
    @PutMapping("updateId/id/{id}/updateId")
    public String setTodoStatusById(@PathVariable Integer id,@RequestParam Integer updateId)
    {
        for(UserManagement todo : UserManagement)
        {
            if(todo.getUserId().equals(id))
            {
                todo.setUserId(updateId);
                return "userId : "   + id  + " updated to " +  updateId;
            }
        }

        return "Invalid id";
}

    //delete user
    @DeleteMapping("user/id/{id}")
    public String removeUserUserById(@PathVariable Integer id) {
        for (UserManagement user :UserManagement) {
            if (user.getUserId().equals(id)) {
                UserManagement.remove(user);
                return "userId :" + id + "removed";
            }
        }
        return "Invalid userId";
}


}
