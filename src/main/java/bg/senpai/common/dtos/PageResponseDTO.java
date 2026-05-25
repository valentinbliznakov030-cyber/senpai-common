package bg.senpai.common.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

@NoArgsConstructor
@Getter
@Setter
public abstract class PageResponseDTO {
    private long totalElements;
    private long totalPages;
    private long pageNumber;
    private long pageSize;
    private boolean hasNext;
    private boolean hasPrevious;

    public <T> PageResponseDTO(Page<T> page) {
        this.totalPages = page.getTotalPages();
        this.pageNumber = page.getNumber();
        this.pageSize = page.getSize();
        this.hasNext = page.hasNext();
        this.hasPrevious = page.hasPrevious();
        this.totalElements = page.getTotalElements();
    }
}
