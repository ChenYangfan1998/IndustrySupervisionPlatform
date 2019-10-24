package dachuang.industry.supervision.backend.platform.controller;

import dachuang.industry.supervision.backend.platform.bl.parameter.admin.InsertAdminParameter;
import dachuang.industry.supervision.backend.platform.bl.parameter.user.InsertUserParameter;
import dachuang.industry.supervision.backend.platform.bl.parameter.user.UpdateUserByIdParameter;
import dachuang.industry.supervision.backend.platform.bl.response.user.GetUserByIdResponse;
import dachuang.industry.supervision.backend.platform.bl.response.user.InsertUserResponse;
import dachuang.industry.supervision.backend.platform.bl.response.user.UpdateUserByIdResponse;
import dachuang.industry.supervision.backend.platform.bl.serviceinterface.UserBlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserBlService userBlService;

    @Autowired
    public UserController(UserBlService userBlService){
        this.userBlService = userBlService;
    }

    @RequestMapping(value = "GetUserById", method = RequestMethod.GET)
    public GetUserByIdResponse getUserById(@RequestParam(name = "id", defaultValue = "0") int id){
        return userBlService.getUserById(id);
    }

    @RequestMapping(value = "InsertUser", method = RequestMethod.POST)
    public InsertUserResponse insertUser(@RequestBody InsertUserParameter parameter){
        return userBlService.insertUser(parameter);
    }

    @RequestMapping(value = "UpdateUserById", method = RequestMethod.POST)
    public UpdateUserByIdResponse updateUserById(@RequestBody UpdateUserByIdParameter parameter){
        return userBlService.updateUserById(parameter);
    }
}
