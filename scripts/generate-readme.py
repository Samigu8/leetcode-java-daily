from pathlib import Path

base = Path("solutions")

rows = []

for difficulty in ["easy", "medium", "hard"]:
    difficulty_dir = base / difficulty

    if not difficulty_dir.exists():
        continue

    for problem in sorted(difficulty_dir.iterdir()):
        number = problem.name.split("-")[0]
        name = " ".join(problem.name.split("-")[1:]).title()

        rows.append(
            f"| {number} | {name} | {difficulty.title()} | ✅ |"
        )

readme = f"""# LeetCode Daily - Java

## Solutions

| # | Problem | Difficulty | Solution |
|---|----------|------------|----------|
{chr(10).join(rows)}
"""

Path("README.md").write_text(readme)