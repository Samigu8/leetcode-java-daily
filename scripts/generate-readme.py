from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
SOLUTIONS = ROOT / "src" / "main" / "java" / "com" / "samigu8" / "leetcode"


def problem_name(directory: Path) -> str:
    return directory.name.replace("-", " ").title()


rows: list[str] = []
counts = {"easy": 0, "medium": 0, "hard": 0}
notes = {
    note.stem.split("-", 1)[0]: note.stem.split("-", 1)[1]
    for note in (ROOT / "notes").glob("*.md")
}

for difficulty in ("easy", "medium", "hard"):
    difficulty_dir = SOLUTIONS / difficulty
    if not difficulty_dir.exists():
        continue

    for package in sorted(difficulty_dir.iterdir()):
        if not package.is_dir():
            continue
        java_files = list(package.glob("*.java"))
        if not java_files:
            continue

        number = next(
            (number for number, slug in notes.items()
             if slug.replace("-", "") == package.name),
            "?",
        )
        name = notes.get(number, problem_name(package)).replace("-", " ").title()
        counts[difficulty] += 1
        rows.append((int(number), f"| {number} | {name} | {difficulty.title()} | ✅ |"))

rows.sort(key=lambda row: row[0])
solution_rows = "\n".join(row[1] for row in rows)

total = sum(counts.values())
solutions = solution_rows or "| — | No solutions yet | — | — |"

readme = f"""# LeetCode Daily - Java

Daily LeetCode practice using Java 21.

## Stats

- Total Solved: {total}
- Easy: {counts["easy"]}
- Medium: {counts["medium"]}
- Hard: {counts["hard"]}

## Quality

- JUnit 5 tests
- Complexity analysis in problem notes
- Automated README updates
- GitHub Actions

## Solutions

| # | Problem | Difficulty | Solution |
|---|---------|------------|----------|
{solutions}
"""

(ROOT / "README.md").write_text(readme, encoding="utf-8")
