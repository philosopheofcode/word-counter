<script lang="ts">
    import {focusTrap} from '@skeletonlabs/skeleton';
    import {countWords} from "../features/counter/functions/word-counter.svelte";

    let isFocused: boolean = true;

    let words: string;
    let count: number;
    let errorMessage: string = "Warning: some text input is required";
    let errorMessageEnabled: boolean = false;

    function apply() {
        if (words != null && words.length > 0) {
            errorMessageEnabled = false;
            count = countWords(words);
        } else {
            errorMessageEnabled = true;
        }
    }

</script>
<div class="container mx-auto p-8 space-y-8">
    <div class="card p-4" id="form-counter">
        {#if errorMessageEnabled}
            <p class="alert alert-error" id="error-message">{errorMessage}</p>
        {/if}
        <div use:focusTrap={isFocused} class="label">
            <textarea bind:value={words} class="textarea" placeholder="Please insert your text here"
                      id="input-counter"/>
            <button on:click={apply} class="btn variant-filled-primary" id="button-counter">Let's count</button>
        </div>
    </div>
    <div class="card p-4" id="show-count">
        {#if count > 0}
            <p>There are {count || '0'} words in your text!</p>
        {/if}
    </div>
</div>

