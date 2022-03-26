package com.just.repository.models;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName rainbow
 */
@Data
public class Rainbow implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String mayday;

    /**
     * 
     */
    private Integer hitCnt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMayday() {
        return mayday;
    }

    public void setMayday(String mayday) {
        this.mayday = mayday;
    }

    public Integer getHitCnt() {
        return hitCnt;
    }

    public void setHitCnt(Integer hitCnt) {
        this.hitCnt = hitCnt;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Rainbow other = (Rainbow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMayday() == null ? other.getMayday() == null : this.getMayday().equals(other.getMayday()))
            && (this.getHitCnt() == null ? other.getHitCnt() == null : this.getHitCnt().equals(other.getHitCnt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMayday() == null) ? 0 : getMayday().hashCode());
        result = prime * result + ((getHitCnt() == null) ? 0 : getHitCnt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mayday=").append(mayday);
        sb.append(", hitCnt=").append(hitCnt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}