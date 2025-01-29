import { expect, test } from 'vitest';
// @ts-ignore
import { countWords } from './word-counter.svelte.ts';

test('Count one word', () => {
    let howMany = countWords("one");

    expect(howMany).toEqual(1);
});