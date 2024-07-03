data class Page(val number: Int, val pageBlocks: List<PageBlock>)

data class PageBlock(val content: String, val type: String)