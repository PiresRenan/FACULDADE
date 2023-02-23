<script setup>
import { ref } from 'vue';
export default {
  setup(){
    const display = ref('');
    const buttons = [
      { value: 'AC', type: 'clear' },
      { value: 'DEL', type: 'delete' },
      { value: '.', type: 'operator' },
      { value: '/', type: 'operator' },

      { value: '7' },
      { value: '8' },
      { value: '9' },
      { value: '*', type: 'operator' },

      { value: '4' },
      { value: '5' },
      { value: '6' },
      { value: '-', type: 'operator' },

      { value: '1' },
      { value: '2' },
      { value: '3' },
      { value: '+', type: 'operator' },

      { value: '000' },
      { value: '00' },
      { value: '0' },
      { value: '=', type: 'equals' },
    ];

    function updateDisplay(value) {

      if (value === 'AC'){
        return display.value = '';
      }

      if (value === 'DEL'){
        return display.value = display.value.slice(0, -1);
      }

      if (value === '='){
        return display.value = eval(display.value);
      }
      display.value += value;
    }
    return {
      display,buttons,
      updateDisplay,
    };
  },
};
</script>

<template>
  <div class="calculator">
    <input type="text" v-model="display" class="display" disabled>

    <div class="buttons">
      <button v-for="btn in buttons" :key="btn.value" @click="updateDisplay(btn.value)" :class="button button_$(btn.type || 'default')">{{ btn.value }}</button>
    </div>
  </div>
</template>



<style scoped>
body{
  height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
  background: #bf4d5d;
}

.calculator {
  max-width: 360px;
  background-color: #264653;
  border-radius: 10px;
  padding: 20px;
  box-shadow: 0 10px 20px rgba(0, 0, 0, 0.19), 0 6px 6px rgba(0, 0, 0, 0.23);
}

.display {
  width: 100%;
  height: 56px;
  font-size: 20px;
  text-align: right;
  margin-bottom: 10px;
  padding: 20;
  border-radius: 5px;
  color: #e0e1dd;
  background-color: rgba(13, 27, 42, 0.3);
  border: none;
  box-sizing: border-box;
}

.buttons {
  display: flex;
  flex-wrap: wrap;
  width: 100%;
  justify-content: space-between;
}

.button {
  width: calc(100% / 5);
  height: 60px;
  margin: 10px 5px;
  border-radius: 10px;
  background-color: #264653;
  color: #e0e1dd;
  font-size: 21px;
  cursor: pointer;
  border: none;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: all 0.3s ease-in-out;
  box-shadow: 0px 1px 3px rgba(0, 0, 0, 0.1);
}

.button:hover{
  transform: translateY(-4px);
  box-shadow: 0px 2px 4px 2px rgba(0, 0, 0, 0.1);
}

.button:focus {
  outline: none;
}

.button_operator,
.button_delete,
.button_equals {
  color: #2a9d8f;
}

.button_clear {
  color: #e76f51;
}

@media only screen and (max-width: 426px) {
  button {
    font-size: 18px !important;
  }

  .calculator {
    max-width: 260px !important;
  }
}

</style>
