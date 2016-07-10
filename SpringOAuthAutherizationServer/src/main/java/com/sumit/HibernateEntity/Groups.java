// default package
// Generated Jul 10, 2016 7:22:32 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Groups generated by hbm2java
 */
@Entity
@Table(name = "groups", catalog = "OAuth")
public class Groups implements java.io.Serializable {

	private Long id;
	private String groupName;

	public Groups() {
	}

	public Groups(String groupName) {
		this.groupName = groupName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "group_name", nullable = false, length = 50)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
