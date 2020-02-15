package xyz.erupt.annotation.sub_field;

import xyz.erupt.annotation.config.JavaTypeEnum;
import xyz.erupt.annotation.sub_field.sub_edit.*;

/**
 * @author liyuepeng
 * @date 2018-09-28.
 */
public enum EditType {
    @EditTypeMapping(desc = "框架自动检测类型", allowType = {JavaTypeEnum.any})
    AUTO,
    @EditTypeMapping(mapping = InputType.class, desc = "输入框 String:vague the like|number:vague the range", allowType = {JavaTypeEnum.String, JavaTypeEnum.number})
    INPUT,
    @EditTypeMapping(mapping = NumberType.class, desc = "数字输入", allowType = {JavaTypeEnum.number})
    NUMBER,
    @EditTypeMapping(mapping = SliderType.class, desc = "数字滑块 vague the range", allowType = {JavaTypeEnum.number})
    SLIDER,
    @EditTypeMapping(mapping = DateType.class, desc = "日期 vague the range", allowType = {JavaTypeEnum.String, JavaTypeEnum.date})
    DATE,
    @EditTypeMapping(mapping = BoolType.class, desc = "布尔", searchVague = false, allowType = {JavaTypeEnum.bool})
    BOOLEAN,
    @EditTypeMapping(mapping = ChoiceType.class, desc = "选择框 vague the in", allowType = {JavaTypeEnum.String, JavaTypeEnum.number})
    CHOICE,
    @EditTypeMapping(mapping = AttachmentType.class, desc = "附件", search = false, allowType = {JavaTypeEnum.String}, excelOperator = false)
    ATTACHMENT,
    @EditTypeMapping(mapping = DependSwitchType.class, desc = "表单依赖开关", searchVague = false, allowType = {JavaTypeEnum.number})
    DEPEND_SWITCH,
    @EditTypeMapping(desc = "横向分割线与描述", search = false, allowType = {JavaTypeEnum.not_know}, excelOperator = false)
    DIVIDE,
    @EditTypeMapping(desc = "隐藏", search = false, allowType = {JavaTypeEnum.not_know}, excelOperator = false)
    HIDDEN,
    @EditTypeMapping(desc = "富文本编辑器", allowType = {JavaTypeEnum.String})
    HTML_EDIT,
    @EditTypeMapping(desc = "大文本域", allowType = {JavaTypeEnum.String}, nameInfer = {"desc", "remark"})
    TEXTAREA,
    @EditTypeMapping(desc = "表格合并", searchVague = false, allowType = {JavaTypeEnum.object})
    COMBINE,
    @EditTypeMapping(mapping = ReferenceTreeType.class, desc = "树引用", searchVague = false, allowType = {JavaTypeEnum.object})
    REFERENCE_TREE,
    @EditTypeMapping(mapping = ReferenceTableType.class, desc = "表格引用", searchVague = false, allowType = {JavaTypeEnum.bool})
    REFERENCE_TABLE,
    @EditTypeMapping(desc = "树引用（仅支持多对多）", allowType = {JavaTypeEnum.object}, search = false, excelOperator = false)
    TAB_TREE,
    @EditTypeMapping(desc = "表格引用（仅支持多对多）", allowType = {JavaTypeEnum.object}, search = false, excelOperator = false)
    TAB_TABLE_REFER,
    @EditTypeMapping(desc = "表格引用（仅支持一对多)", allowType = {JavaTypeEnum.object}, search = false, excelOperator = false)
    TAB_TABLE_ADD,
    @EditTypeMapping(desc = "自定义HTML", allowType = {JavaTypeEnum.String}, search = false, excelOperator = false)
    HTML,
    @EditTypeMapping(desc = "代码编辑器", allowType = {JavaTypeEnum.String})
    CODE_EDITOR,
    /**
     * not support
     */
    //JSON编辑器
    JSON_EDIT,
    //地图
    MAP,

    //步骤条
    EMPTY,
    STEPS,
    //自定义引用类型
    CUSTOM_REFER,
}
