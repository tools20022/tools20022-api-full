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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ElectronicMessageDetails1;
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
 * Report entry details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CBRFReportEntry1#mmMessageName
 * CBRFReportEntry1.mmMessageName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CBRFReportEntry1#mmTotalNumberOfEntries
 * CBRFReportEntry1.mmTotalNumberOfEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CBRFReportEntry1#mmMessageDetails
 * CBRFReportEntry1.mmMessageDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CBRFReportEntry1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Report entry details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CBRFReportEntry1", propOrder = {"messageName", "totalNumberOfEntries", "messageDetails"})
public class CBRFReportEntry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgNm", required = true)
	protected Max35Text messageName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CBRFReportEntry1
	 * CBRFReportEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CBRFReportEntry1, Max35Text> mmMessageName = new MMMessageAttribute<CBRFReportEntry1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CBRFReportEntry1.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CBRFReportEntry1 obj) {
			return obj.getMessageName();
		}

		@Override
		public void setValue(CBRFReportEntry1 obj, Max35Text value) {
			obj.setMessageName(value);
		}
	};
	@XmlElement(name = "TtlNbOfNtries", required = true)
	protected Max9NumericText totalNumberOfEntries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CBRFReportEntry1
	 * CBRFReportEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of entries in the group."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CBRFReportEntry1, Max9NumericText> mmTotalNumberOfEntries = new MMMessageAttribute<CBRFReportEntry1, Max9NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CBRFReportEntry1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfEntries";
			definition = "Total number of entries in the group.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Max9NumericText getValue(CBRFReportEntry1 obj) {
			return obj.getTotalNumberOfEntries();
		}

		@Override
		public void setValue(CBRFReportEntry1 obj, Max9NumericText value) {
			obj.setTotalNumberOfEntries(value);
		}
	};
	@XmlElement(name = "MsgDtls", required = true)
	protected List<ElectronicMessageDetails1> messageDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ElectronicMessageDetails1
	 * ElectronicMessageDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CBRFReportEntry1
	 * CBRFReportEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information identifying electronic messages."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CBRFReportEntry1, List<ElectronicMessageDetails1>> mmMessageDetails = new MMMessageAssociationEnd<CBRFReportEntry1, List<ElectronicMessageDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CBRFReportEntry1.mmObject();
			isDerived = false;
			xmlTag = "MsgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDetails";
			definition = "Information identifying electronic messages.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ElectronicMessageDetails1.mmObject();
		}

		@Override
		public List<ElectronicMessageDetails1> getValue(CBRFReportEntry1 obj) {
			return obj.getMessageDetails();
		}

		@Override
		public void setValue(CBRFReportEntry1 obj, List<ElectronicMessageDetails1> value) {
			obj.setMessageDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CBRFReportEntry1.mmMessageName, com.tools20022.repository.msg.CBRFReportEntry1.mmTotalNumberOfEntries,
						com.tools20022.repository.msg.CBRFReportEntry1.mmMessageDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CBRFReportEntry1";
				definition = "Report entry details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageName() {
		return messageName;
	}

	public CBRFReportEntry1 setMessageName(Max35Text messageName) {
		this.messageName = Objects.requireNonNull(messageName);
		return this;
	}

	public Max9NumericText getTotalNumberOfEntries() {
		return totalNumberOfEntries;
	}

	public CBRFReportEntry1 setTotalNumberOfEntries(Max9NumericText totalNumberOfEntries) {
		this.totalNumberOfEntries = Objects.requireNonNull(totalNumberOfEntries);
		return this;
	}

	public List<ElectronicMessageDetails1> getMessageDetails() {
		return messageDetails == null ? messageDetails = new ArrayList<>() : messageDetails;
	}

	public CBRFReportEntry1 setMessageDetails(List<ElectronicMessageDetails1> messageDetails) {
		this.messageDetails = Objects.requireNonNull(messageDetails);
		return this;
	}
}