package hello.itemservice.web.item.basic;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/basic/items")
@RequiredArgsConstructor
public class BasicItemController {
	private final ItemRepository itemRepository;
	// /basic/items
	@GetMapping
	public String items(Model model) {
		List<Item> items = itemRepository.findAll();
		model.addAttribute("items", items);
		return "basic/items";
	}
	
	// /basic/items/2
	// PathVariable 로 넘어온 상품 Id로 상품객체를 조회하고 Model객체에 담아둠
	// 뷰 템플릿 호출 하고 뷰에서 Model객체에 담긴 값을 내가 지정한 이름("item")으로 사용
	@GetMapping("/{itemId}")
	public String item(@PathVariable Long itemId, Model model) {
		Item item = itemRepository.findById(itemId);
		model.addAttribute("item", item);
		return "basic/item";
	}
	
	// /basic/items/add
	@GetMapping("/add")
	public String addForm() {
		return "basic/addForm";
	}
	
//	@PostMapping("/add")
	public String addItemV1(@RequestParam String itemName,
							@RequestParam int price,
							@RequestParam Integer quantity,
							Model model) {
		Item item = new Item();
		item.setItemName(itemName);
		item.setPrice(price);
		item.setQuantity(quantity);
		
		itemRepository.save(item);
		model.addAttribute("item", item);
		
		return "basic/item";
	}
	
//	@PostMapping("/add")
	public String addItemV2(@ModelAttribute Item item, Model model) {
		itemRepository.save(item);
//		model.addAttribute("item", item);
		
		return "basic/item";
	}
	
	@PostMapping
	public String addItemV3(@ModelAttribute Item item, RedirectAttributes redirectAttributes) {
		Item itemSaved = itemRepository.save(item);
		redirectAttributes.addAttribute("itemId",itemSaved.getId());
		redirectAttributes.addAttribute("status", true);
//		redirectAttributes.addAttribute("testParam", "1111");
		return "redirect:/basic/items/{itemId}";
	}
	
	@GetMapping("/{itemId}/edit")
	public String editForm(@PathVariable Long itemId, Model model) {
		Item item = itemRepository.findById(itemId);
		model.addAttribute("item", item);
		return "basic/editForm";
	}
	
	@PostMapping("/{itemId}/edit")
	public String edit(@PathVariable Long itemId, @ModelAttribute Item item,RedirectAttributes redirectAttributes) {
		itemRepository.update(itemId, item);
		redirectAttributes.addAttribute("flag", true);
//		return "redirect:/basic/items";
		return "redirect:/basic/items/{itemId}";
	}
	
	// 테스트용 데이터
	@PostConstruct
	public void init() {
		itemRepository.save(new Item("testA", 10000, 10));
		itemRepository.save(new Item("testB", 20000, 20));
		itemRepository.save(new Item("testc", 20000, 20));
	}
	
}
