import os
import re
from behave import given, then

@given('a {string} file exists')
def step_readme_exists(context, string):
    with open(string, "r", encoding="utf-8") as file:
        context.lines = file.readlines()

@then('the first line should be a title starting with #')
def step_first_line_title(context):
    assert len(context.lines) > 0, "This file is empty"
    assert context.lines[0].startswith("#"), "First line does not start with #"

@then('it should contain sections')
def step_check_sections(context):
    sections = [row[0] for row in context.table]
    content = "".join(context.lines)
    for section in sections:
        assert section in content, f"Section not found: {section}"