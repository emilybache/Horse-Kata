from dataclasses import dataclass


@dataclass
class SortMetadataDto:
    column: str
    order: str

