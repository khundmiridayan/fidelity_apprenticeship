const carousel = document.querySelector('.carousel-container');
const carouselInner = document.querySelector('.carousel-inner');
const carouselItems = document.querySelectorAll('.carousel-item');
const carouselPrev = document.querySelector('.carousel-prev');
const carouselNext = document.querySelector('.carousel-next');
const carouselIndicators = document.querySelectorAll('.carousel-indicators li');

// Set the active item
let activeItem = 0;

// Set the carousel interval
let interval = setInterval(() => {
  activeItem++;
  if (activeItem >= carouselItems.length) {
    activeItem = 0;
  }
  updateCarousel();
}, 5000);

// Update the carousel
function updateCarousel() {
  // Remove the active class from all items
  carouselItems.forEach((item) => {
    item.classList.remove('active');
  });
  // Add the active class to the current item
  carouselItems[activeItem].classList.add('active');
  // Update the indicators
  carouselIndicators.forEach((indicator, index) => {
    if (index === activeItem) {
      indicator.classList.add('active');
    } else {
      indicator.classList.remove('active');
    }
  });
}

// Add event listeners to the navigation buttons
carouselPrev.addEventListener('click', () => {
  activeItem--;
  if (activeItem < 0) {
    activeItem = carouselItems.length - 1;
  }
  updateCarousel();
});

carouselNext.addEventListener('click', () => {
  activeItem++;
  if (activeItem >= carouselItems.length) {
    activeItem = 0;
  }
  updateCarousel();
});

// Add event listeners to the indicators
carouselIndicators.forEach((indicator, index) => {
  indicator.addEventListener('click', () => {
    activeItem = index;
    updateCarousel();
  });
});
