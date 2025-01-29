import {expect, test} from 'vitest';
// @ts-ignore
import {countWords} from './word-counter.svelte.ts';

test('Count one word', () => {
    let howMany = countWords("one");

    expect(howMany).toEqual(1);
});

test('Count 2 words', () => {
    let howMany = countWords("one two");

    expect(howMany).toEqual(2);
});

test('Count 3 words', () => {
    let howMany = countWords("one two three");

    expect(howMany).toEqual(3);
});

test('Count 2 words with spaces', () => {
    let howMany = countWords("one     two");

    expect(howMany).toEqual(2);
});

test('Count 2 words with spaces before and after', () => {
    let howMany = countWords("     one     two     ");

    expect(howMany).toEqual(2);
});