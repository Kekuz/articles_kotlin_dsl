@ArticleDSL
class PageBlockBuilder {
    var content = ""
    var type = "UNDEFINED"

    fun build() = PageBlock(content = content, type = type)
}