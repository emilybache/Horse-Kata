from dataclasses import dataclass


@dataclass
class PaginationMetadataDto:
    page_size: int
    current_page: int

