var maxHeight = 400;

$(function(){

    $(".x_down > li").hover(function() {
    
         var $container = $(this),
             $list = $container.find("ul"),
             $anchor = $container.find("a"),
             height = $list.height() * 1.1,  
             multiplier = height / maxHeight;     // needs to move faster if list is taller       
        $container.data("origHeight", $container.height());
        $anchor.addClass("hover");  
        $list
            .show()
            .css({
                paddingTop: $container.data("origHeight")
            });
        if (multiplier > 1) {
            $container
                .css({
                    height: maxHeight,
                    overflow: "hidden"
                })
                .mousemove(function(e) {
                    var offset = $container.offset();
                    var relativeY = ((e.pageY - offset.top) * multiplier) - ($container.data("origHeight") * multiplier);
                    if (relativeY > $container.data("origHeight")) {
                        $list.css("top", -relativeY + $container.data("origHeight"));
                    };
                });
        }
        
    }, function() {
    
        var $el = $(this);
        
        // put things back to normal
        $el
            .height($(this).data("origHeight"))
            .find("ul")
            .css({ top: 0 })
            .hide()
            .end()
            .find("a")
            .removeClass("hover");
    
    });
    
    // Add down arrow only to menu items with submenus
    $(".x_down > li:has('ul')").each(function() {
        $(this).find("a:first").append("");
    });
    
    
});



// JavaScript Document/* CSS Document */

