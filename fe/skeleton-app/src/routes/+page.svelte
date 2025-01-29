<script lang="ts">
    import {focusTrap} from '@skeletonlabs/skeleton';
    import {countWords} from "../features/counter/functions/word-counter.svelte";

    let isFocused: boolean = true;

    let words: string;
    let count: number;

    function apply() {
        count = countWords(words);
    }

</script>

<div class="card p-4" id="form-counter">
    <div use:focusTrap={isFocused} class="label">
        <input bind:value={words} class="textarea" placeholder="Please insert your words here" id="input-counter"/>
        <button on:click={apply} class="btn variant-filled-primary" id="button-counter">Let's count</button>
    </div>

</div>
<div class="card p-4" id="show-count">
    {#if count > 0}
        <p>There are {count || '0'} words in your text!</p>
    {/if}
</div>

