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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Corporate action option information for the custodian record.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianOptionDateDetailsSD1#mmPlaceAndName
 * CustodianOptionDateDetailsSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianOptionDateDetailsSD1#mmAgentDeadlineDate
 * CustodianOptionDateDetailsSD1.mmAgentDeadlineDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianOptionDateDetailsSD1#mmAgentDeadlineTime
 * CustodianOptionDateDetailsSD1.mmAgentDeadlineTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodianOptionDateDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Corporate action option information for the custodian record."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustodianOptionDateDetailsSD1", propOrder = {"placeAndName", "agentDeadlineDate", "agentDeadlineTime"})
public class CustodianOptionDateDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianOptionDateDetailsSD1
	 * CustodianOptionDateDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustodianOptionDateDetailsSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<CustodianOptionDateDetailsSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianOptionDateDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CustodianOptionDateDetailsSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CustodianOptionDateDetailsSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "AgtDdlnDt")
	protected ISODate agentDeadlineDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianOptionDateDetailsSD1
	 * CustodianOptionDateDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtDdlnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentDeadlineDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Custodian deadline date for the option instructions. Applicable to custodian service only."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent Deadline Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustodianOptionDateDetailsSD1, Optional<ISODate>> mmAgentDeadlineDate = new MMMessageAttribute<CustodianOptionDateDetailsSD1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianOptionDateDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "AgtDdlnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent Deadline Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentDeadlineDate";
			definition = "Custodian deadline date for the option instructions. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CustodianOptionDateDetailsSD1 obj) {
			return obj.getAgentDeadlineDate();
		}

		@Override
		public void setValue(CustodianOptionDateDetailsSD1 obj, Optional<ISODate> value) {
			obj.setAgentDeadlineDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtDdlnTm")
	protected ISOTime agentDeadlineTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianOptionDateDetailsSD1
	 * CustodianOptionDateDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtDdlnTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentDeadlineTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Custodian deadline time for the option instructions. Applicable to custodian service only."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent Deadline Time</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustodianOptionDateDetailsSD1, Optional<ISOTime>> mmAgentDeadlineTime = new MMMessageAttribute<CustodianOptionDateDetailsSD1, Optional<ISOTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianOptionDateDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "AgtDdlnTm";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent Deadline Time"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentDeadlineTime";
			definition = "Custodian deadline time for the option instructions. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public Optional<ISOTime> getValue(CustodianOptionDateDetailsSD1 obj) {
			return obj.getAgentDeadlineTime();
		}

		@Override
		public void setValue(CustodianOptionDateDetailsSD1 obj, Optional<ISOTime> value) {
			obj.setAgentDeadlineTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustodianOptionDateDetailsSD1.mmPlaceAndName, com.tools20022.repository.msg.CustodianOptionDateDetailsSD1.mmAgentDeadlineDate,
						com.tools20022.repository.msg.CustodianOptionDateDetailsSD1.mmAgentDeadlineTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustodianOptionDateDetailsSD1";
				definition = "Corporate action option information for the custodian record.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CustodianOptionDateDetailsSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<ISODate> getAgentDeadlineDate() {
		return agentDeadlineDate == null ? Optional.empty() : Optional.of(agentDeadlineDate);
	}

	public CustodianOptionDateDetailsSD1 setAgentDeadlineDate(ISODate agentDeadlineDate) {
		this.agentDeadlineDate = agentDeadlineDate;
		return this;
	}

	public Optional<ISOTime> getAgentDeadlineTime() {
		return agentDeadlineTime == null ? Optional.empty() : Optional.of(agentDeadlineTime);
	}

	public CustodianOptionDateDetailsSD1 setAgentDeadlineTime(ISOTime agentDeadlineTime) {
		this.agentDeadlineTime = agentDeadlineTime;
		return this;
	}
}