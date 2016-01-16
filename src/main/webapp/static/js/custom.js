$(document).ready(function() { 

	// 菜单
	$('ul.sf-menu').superfish({ 
		delay:       500,
		animation:   {opacity:'fast',height:'show'},
		speed:       'fast',
		autoArrows:  false,
		dropShadows: true 
	}); 
	
	//table
	$(".table tbody>tr:odd").addClass("odd-row");
	$(".table tbody>tr:even").addClass("even-row");
	$(".table tbody>tr").hover( 
			function () { $(this).addClass("trhover");}, 
			function () { $(this).removeClass("trhover");
			});
	
	
	// accordion 初始化
	$(".accordion").tabs(".accordion .accordion-pane", {tabs: '.accordion-tit', effect: 'slide',initialIndex: null});
	$.tools.tabs.addEffect("slide", function(tabIndex, done) {
		this.getPanes().slideUp("fast").eq(tabIndex).slideDown("fast");
		done.call();
	});
		
	

	
}); 