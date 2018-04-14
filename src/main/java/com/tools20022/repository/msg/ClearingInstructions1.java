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
import com.tools20022.repository.msg.FIToFICreditTransferTransactionInformationDetails1;
import com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1;
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
 * Clearing instructions transactions list.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingInstructions1#mmFIToFICreditTransferTransactionInformation
 * ClearingInstructions1.mmFIToFICreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingInstructions1#mmFIToFIDirectDebitTransactionInformation
 * ClearingInstructions1.mmFIToFIDirectDebitTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingInstructions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Clearing instructions transactions list."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClearingInstructions1", propOrder = {"fIToFICreditTransferTransactionInformation", "fIToFIDirectDebitTransactionInformation"})
public class ClearingInstructions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FIToFICdtTrfTxInf", required = true)
	protected List<FIToFICreditTransferTransactionInformationDetails1> fIToFICreditTransferTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FIToFICreditTransferTransactionInformationDetails1
	 * FIToFICreditTransferTransactionInformationDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingInstructions1
	 * ClearingInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FIToFICdtTrfTxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FIToFICreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual credit transfer(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingInstructions1, List<FIToFICreditTransferTransactionInformationDetails1>> mmFIToFICreditTransferTransactionInformation = new MMMessageAssociationEnd<ClearingInstructions1, List<FIToFICreditTransferTransactionInformationDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingInstructions1.mmObject();
			isDerived = false;
			xmlTag = "FIToFICdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FIToFICreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual credit transfer(s).";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FIToFICreditTransferTransactionInformationDetails1.mmObject();
		}

		@Override
		public List<FIToFICreditTransferTransactionInformationDetails1> getValue(ClearingInstructions1 obj) {
			return obj.getFIToFICreditTransferTransactionInformation();
		}

		@Override
		public void setValue(ClearingInstructions1 obj, List<FIToFICreditTransferTransactionInformationDetails1> value) {
			obj.setFIToFICreditTransferTransactionInformation(value);
		}
	};
	@XmlElement(name = "FIToFIDrctDbtTxInf", required = true)
	protected List<FIToFIDirectDebitTransactionInformationDetails1> fIToFIDirectDebitTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FIToFIDirectDebitTransactionInformationDetails1
	 * FIToFIDirectDebitTransactionInformationDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingInstructions1
	 * ClearingInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FIToFIDrctDbtTxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FIToFIDirectDebitTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual direct debit(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingInstructions1, List<FIToFIDirectDebitTransactionInformationDetails1>> mmFIToFIDirectDebitTransactionInformation = new MMMessageAssociationEnd<ClearingInstructions1, List<FIToFIDirectDebitTransactionInformationDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingInstructions1.mmObject();
			isDerived = false;
			xmlTag = "FIToFIDrctDbtTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FIToFIDirectDebitTransactionInformation";
			definition = "Set of elements providing information specific to the individual direct debit(s).";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FIToFIDirectDebitTransactionInformationDetails1.mmObject();
		}

		@Override
		public List<FIToFIDirectDebitTransactionInformationDetails1> getValue(ClearingInstructions1 obj) {
			return obj.getFIToFIDirectDebitTransactionInformation();
		}

		@Override
		public void setValue(ClearingInstructions1 obj, List<FIToFIDirectDebitTransactionInformationDetails1> value) {
			obj.setFIToFIDirectDebitTransactionInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingInstructions1.mmFIToFICreditTransferTransactionInformation,
						com.tools20022.repository.msg.ClearingInstructions1.mmFIToFIDirectDebitTransactionInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingInstructions1";
				definition = "Clearing instructions transactions list.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<FIToFICreditTransferTransactionInformationDetails1> getFIToFICreditTransferTransactionInformation() {
		return fIToFICreditTransferTransactionInformation == null ? fIToFICreditTransferTransactionInformation = new ArrayList<>() : fIToFICreditTransferTransactionInformation;
	}

	public ClearingInstructions1 setFIToFICreditTransferTransactionInformation(List<FIToFICreditTransferTransactionInformationDetails1> fIToFICreditTransferTransactionInformation) {
		this.fIToFICreditTransferTransactionInformation = Objects.requireNonNull(fIToFICreditTransferTransactionInformation);
		return this;
	}

	public List<FIToFIDirectDebitTransactionInformationDetails1> getFIToFIDirectDebitTransactionInformation() {
		return fIToFIDirectDebitTransactionInformation == null ? fIToFIDirectDebitTransactionInformation = new ArrayList<>() : fIToFIDirectDebitTransactionInformation;
	}

	public ClearingInstructions1 setFIToFIDirectDebitTransactionInformation(List<FIToFIDirectDebitTransactionInformationDetails1> fIToFIDirectDebitTransactionInformation) {
		this.fIToFIDirectDebitTransactionInformation = Objects.requireNonNull(fIToFIDirectDebitTransactionInformation);
		return this;
	}
}