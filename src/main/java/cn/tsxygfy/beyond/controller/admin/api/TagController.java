package cn.tsxygfy.beyond.controller.admin.api;

import cn.tsxygfy.beyond.model.po.Tag;
import cn.tsxygfy.beyond.model.vo.TagsVO;
import cn.tsxygfy.beyond.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author ruby woo
 * @version v1.0.0
 * @see cn.tsxygfy.beyond.controller.admin.api
 * @since 2020-03-08 19:38:14
 */
@RestController
@RequestMapping("/api/admin/tags")
public class TagController {

    @Autowired
    private TagsService tagsService;

    @GetMapping
    public List<TagsVO> getAll() {
        return tagsService.findAllWithArticleCount();
    }

    @PostMapping
    public Tag createTag(@RequestBody Tag tag) {
        return tagsService.createOrUpdateTag(tag);
    }

    @PutMapping("{id:\\d+}")
    public Tag updateTag(@PathVariable Long id, @RequestBody Tag tag) {
        tag.setId(id);
        return tagsService.createOrUpdateTag(tag);
    }

    @DeleteMapping("{id:\\d+}")
    public void deleteById(@PathVariable Long id) {
        tagsService.deleteById(id);
    }

}
