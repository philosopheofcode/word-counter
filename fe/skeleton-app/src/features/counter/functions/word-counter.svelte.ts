export function countWords(words: string): number {
    return words.split(" ").filter((word) => word.trim().length > 0).length;
}