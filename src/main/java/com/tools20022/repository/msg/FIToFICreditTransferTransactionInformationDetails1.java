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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements providing information specific to the individual credit
 * transfer(s).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FIToFICreditTransferTransactionInformationDetails1#mmGroupHeader
 * FIToFICreditTransferTransactionInformationDetails1.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FIToFICreditTransferTransactionInformationDetails1#mmCreditTransferTransactionInformation
 * FIToFICreditTransferTransactionInformationDetails1.
 * mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FIToFICreditTransferTransactionInformationDetails1#mmSupplementaryData
 * FIToFICreditTransferTransactionInformationDetails1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFICreditTransferTransactionInformationDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements providing information specific to the individual credit transfer(s)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FIToFICreditTransferTransactionInformationDetails1", propOrder = {"groupHeader", "creditTransferTransactionInformation", "supplementaryData"})
public class FIToFICreditTransferTransactionInformationDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader70 groupHeader;
	/**
	 * Common characteristics for all individual transactions included in the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GroupHeader70
	 * GroupHeader70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FIToFICreditTransferTransactionInformationDetails1
	 * FIToFICreditTransferTransactionInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common characteristics for all individual transactions included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGroupHeader = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FIToFICreditTransferTransactionInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Common characteristics for all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GroupHeader70.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CreditTransferTransaction23> creditTransferTransactionInformation;
	/**
	 * Provide further details specific to the individual transaction(s)
	 * included in the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23
	 * CreditTransferTransaction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FIToFICreditTransferTransactionInformationDetails1
	 * FIToFICreditTransferTransactionInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide further details specific to the individual transaction(s) included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditTransferTransactionInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FIToFICreditTransferTransactionInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Provide further details specific to the individual transaction(s) included in the message.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction23.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FIToFICreditTransferTransactionInformationDetails1
	 * FIToFICreditTransferTransactionInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FIToFICreditTransferTransactionInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FIToFICreditTransferTransactionInformationDetails1.mmGroupHeader, FIToFICreditTransferTransactionInformationDetails1.mmCreditTransferTransactionInformation,
						FIToFICreditTransferTransactionInformationDetails1.mmSupplementaryData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FIToFICreditTransferTransactionInformationDetails1";
				definition = "Set of elements providing information specific to the individual credit transfer(s).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public GroupHeader70 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(com.tools20022.repository.msg.GroupHeader70 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "CdtTrfTxInf", required = true)
	public List<CreditTransferTransaction23> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation;
	}

	public void setCreditTransferTransactionInformation(List<com.tools20022.repository.msg.CreditTransferTransaction23> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = creditTransferTransactionInformation;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}