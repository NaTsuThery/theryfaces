/**
 * Sticky Header JS.
 */
(function($) {
	$.fn.stickyHeader = function(targetId) {
		// Sticker component
		var sticker = $(this);

		// The target can be a div, or the window
		var target = null;
		var isWindow = (targetId === "window");
		if (isWindow) {
			target = $(window);
		} else {
			target = $("#" + targetId);
		}

		// Retrieve sticker position
		var position = sticker.position();
		target.scroll(function() {
			var targetPos = target.scrollTop();

			// Add stick class (gives position : fixed) if needed
			if (targetPos >= position.top) {
				// Remove others sticky div in case of multiple components in
				// the page
				$(".tf-stick-div").removeClass("tf-stick-div");

				if (isWindow) {
					sticker.addClass("tf-stick-window");
				} else {
					sticker.addClass("tf-stick-div");
				}
			} else {
				if (isWindow) {
					sticker.removeClass("tf-stick-window");
				} else {
					sticker.removeClass("tf-stick-div");
				}
			}
		});
	};
})(jQuery);