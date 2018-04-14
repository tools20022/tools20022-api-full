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
import com.tools20022.repository.msg.CreditTransferTransaction9;
import com.tools20022.repository.msg.GroupHeader63;
import com.tools20022.repository.msg.SupplementaryData1;
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
 * Set of elements providing information specific to the individual direct
 * debit(s).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1#mmGroupHeader
 * FIToFIDirectDebitTransactionInformationDetails1.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1#mmCreditInstruction
 * FIToFIDirectDebitTransactionInformationDetails1.mmCreditInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1#mmSupplementaryData
 * FIToFIDirectDebitTransactionInformationDetails1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIDirectDebitTransactionInformationDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements providing information specific to the individual direct debit(s)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFIDirectDebitTransactionInformationDetails1", propOrder = {"groupHeader", "creditInstruction", "supplementaryData"})
public class FIToFIDirectDebitTransactionInformationDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader63 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GroupHeader63
	 * GroupHeader63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1
	 * FIToFIDirectDebitTransactionInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common characteristics for all individual transactions included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FIToFIDirectDebitTransactionInformationDetails1, GroupHeader63> mmGroupHeader = new MMMessageAssociationEnd<FIToFIDirectDebitTransactionInformationDetails1, GroupHeader63>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Common characteristics for all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GroupHeader63.mmObject();
		}

		@Override
		public GroupHeader63 getValue(FIToFIDirectDebitTransactionInformationDetails1 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FIToFIDirectDebitTransactionInformationDetails1 obj, GroupHeader63 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "CdtInstr", required = true)
	protected List<CreditTransferTransaction9> creditInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9
	 * CreditTransferTransaction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1
	 * FIToFIDirectDebitTransactionInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtInstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics that apply to the credit side of the payment transaction(s) included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FIToFIDirectDebitTransactionInformationDetails1, List<CreditTransferTransaction9>> mmCreditInstruction = new MMMessageAssociationEnd<FIToFIDirectDebitTransactionInformationDetails1, List<CreditTransferTransaction9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "CdtInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditInstruction";
			definition = "Characteristics that apply to the credit side of the payment transaction(s) included in the message.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransferTransaction9.mmObject();
		}

		@Override
		public List<CreditTransferTransaction9> getValue(FIToFIDirectDebitTransactionInformationDetails1 obj) {
			return obj.getCreditInstruction();
		}

		@Override
		public void setValue(FIToFIDirectDebitTransactionInformationDetails1 obj, List<CreditTransferTransaction9> value) {
			obj.setCreditInstruction(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1
	 * FIToFIDirectDebitTransactionInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FIToFIDirectDebitTransactionInformationDetails1, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<FIToFIDirectDebitTransactionInformationDetails1, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FIToFIDirectDebitTransactionInformationDetails1 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FIToFIDirectDebitTransactionInformationDetails1 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1.mmGroupHeader,
						com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1.mmCreditInstruction, com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1.mmSupplementaryData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FIToFIDirectDebitTransactionInformationDetails1";
				definition = "Set of elements providing information specific to the individual direct debit(s).";
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader63 getGroupHeader() {
		return groupHeader;
	}

	public FIToFIDirectDebitTransactionInformationDetails1 setGroupHeader(GroupHeader63 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<CreditTransferTransaction9> getCreditInstruction() {
		return creditInstruction == null ? creditInstruction = new ArrayList<>() : creditInstruction;
	}

	public FIToFIDirectDebitTransactionInformationDetails1 setCreditInstruction(List<CreditTransferTransaction9> creditInstruction) {
		this.creditInstruction = Objects.requireNonNull(creditInstruction);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FIToFIDirectDebitTransactionInformationDetails1 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}