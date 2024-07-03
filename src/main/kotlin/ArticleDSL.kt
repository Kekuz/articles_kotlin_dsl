@ArticleDSL
fun page(block: PageBuilder.() -> Unit) = PageBuilder().apply(block).build()
//fun pageBlock(block: PageBlockBuilder.() -> Unit) = PageBlockBuilder().apply(block).build()

fun PageBlockContainer.headerBlock(text: String) = pageBlock {
    type = "Header"
    content = text
}

fun PageBlockContainer.textBlock(text: String) = pageBlock {
    type = "plain"
    content = text
}
