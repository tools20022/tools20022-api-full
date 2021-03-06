/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.MemberIdentification2Choice;
import com.tools20022.repository.codeset.MemberStatus1Code;
import com.tools20022.repository.codeset.MemberType1Code;
import com.tools20022.repository.entity.SystemMemberRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for a member.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria2#mmIdentification
 * MemberSearchCriteria2.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberSearchCriteria2#mmType
 * MemberSearchCriteria2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberSearchCriteria2#mmStatus
 * MemberSearchCriteria2.mmStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
 * SystemMemberRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemberSearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a member."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MemberSearchCriteria2", propOrder = {"identification", "type", "status"})
public class MemberSearchCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected List<MemberIdentification2Choice> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice
	 * MemberIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria2
	 * MemberSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberSearchCriteria2, List<MemberIdentification2Choice>> mmIdentification = new MMMessageAttribute<MemberSearchCriteria2, List<MemberIdentification2Choice>>() {
		{
			businessComponentTrace_lazy = () -> SystemMemberRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system.";
			minOccurs = 0;
			complexType_lazy = () -> MemberIdentification2Choice.mmObject();
		}

		@Override
		public List<MemberIdentification2Choice> getValue(MemberSearchCriteria2 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(MemberSearchCriteria2 obj, List<MemberIdentification2Choice> value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Tp")
	protected List<MemberType1Code> type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MemberType1Code
	 * MemberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmType
	 * SystemMemberRole.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria2
	 * MemberSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the relationship a member has with a system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberSearchCriteria2, List<MemberType1Code>> mmType = new MMMessageAttribute<MemberSearchCriteria2, List<MemberType1Code>>() {
		{
			businessElementTrace_lazy = () -> SystemMemberRole.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Nature of the relationship a member has with a system.";
			minOccurs = 0;
			simpleType_lazy = () -> MemberType1Code.mmObject();
		}

		@Override
		public List<MemberType1Code> getValue(MemberSearchCriteria2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(MemberSearchCriteria2 obj, List<MemberType1Code> value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Sts")
	protected List<MemberStatus1Code> status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MemberStatus1Code
	 * MemberStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmMemberStatus
	 * SystemMemberRole.mmMemberStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria2
	 * MemberSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a member in a system, such as enabled or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberSearchCriteria2, List<MemberStatus1Code>> mmStatus = new MMMessageAttribute<MemberSearchCriteria2, List<MemberStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> SystemMemberRole.mmMemberStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of a member in a system, such as enabled or deleted.";
			minOccurs = 0;
			simpleType_lazy = () -> MemberStatus1Code.mmObject();
		}

		@Override
		public List<MemberStatus1Code> getValue(MemberSearchCriteria2 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(MemberSearchCriteria2 obj, List<MemberStatus1Code> value) {
			obj.setStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberSearchCriteria2.mmIdentification, com.tools20022.repository.msg.MemberSearchCriteria2.mmType,
						com.tools20022.repository.msg.MemberSearchCriteria2.mmStatus);
				trace_lazy = () -> SystemMemberRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MemberSearchCriteria2";
				definition = "Defines the criteria used to search for a member.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<MemberIdentification2Choice> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public MemberSearchCriteria2 setIdentification(List<MemberIdentification2Choice> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<MemberType1Code> getType() {
		return type == null ? type = new ArrayList<>() : type;
	}

	public MemberSearchCriteria2 setType(List<MemberType1Code> type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public List<MemberStatus1Code> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public MemberSearchCriteria2 setStatus(List<MemberStatus1Code> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}
}