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
import com.tools20022.repository.entity.DirectDebit;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements providing specific information on the direct debit
 * transaction and the related mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction4#mmMandateRelatedInformation
 * DirectDebitTransaction4.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction4#mmCreditorSchemeIdentification
 * DirectDebitTransaction4.mmCreditorSchemeIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebit
 * DirectDebit}</li>
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
 * "DirectDebitTransaction4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements providing specific information on the direct debit transaction and the related mandate."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DirectDebitTransaction4", propOrder = {"mandateRelatedInformation", "creditorSchemeIdentification"})
public class DirectDebitTransaction4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MndtRltdInf", required = true)
	protected MandateRelatedInformation4 mandateRelatedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation4
	 * MandateRelatedInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
	 * DirectDebit.mmDirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction4
	 * DirectDebitTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtRltdInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateRelatedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide further details related to a direct debit mandate signed between the creditor and the debtor.\n\nUsage: Mandate related information is to be used only when the direct debit relates to a mandate signed between the debtor and the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMandateRelatedInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> DirectDebit.mmDirectDebitMandate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransaction4.mmObject();
			isDerived = false;
			xmlTag = "MndtRltdInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateRelatedInformation";
			definition = "Set of elements used to provide further details related to a direct debit mandate signed between the creditor and the debtor.\n\nUsage: Mandate related information is to be used only when the direct debit relates to a mandate signed between the debtor and the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation4.mmObject();
		}
	};
	@XmlElement(name = "CdtrSchmeId", required = true)
	protected PartyIdentification11 creditorSchemeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification11
	 * PartyIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction4
	 * DirectDebitTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrSchmeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit party that signs the direct debit mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransaction4.mmObject();
			isDerived = false;
			xmlTag = "CdtrSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSchemeIdentification";
			definition = "Credit party that signs the direct debit mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification11.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction4.mmMandateRelatedInformation, com.tools20022.repository.msg.DirectDebitTransaction4.mmCreditorSchemeIdentification);
				trace_lazy = () -> DirectDebit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DirectDebitTransaction4";
				definition = "Set of elements providing specific information on the direct debit transaction and the related mandate.";
			}
		});
		return mmObject_lazy.get();
	}

	public MandateRelatedInformation4 getMandateRelatedInformation() {
		return mandateRelatedInformation;
	}

	public DirectDebitTransaction4 setMandateRelatedInformation(com.tools20022.repository.msg.MandateRelatedInformation4 mandateRelatedInformation) {
		this.mandateRelatedInformation = Objects.requireNonNull(mandateRelatedInformation);
		return this;
	}

	public PartyIdentification11 getCreditorSchemeIdentification() {
		return creditorSchemeIdentification;
	}

	public DirectDebitTransaction4 setCreditorSchemeIdentification(com.tools20022.repository.msg.PartyIdentification11 creditorSchemeIdentification) {
		this.creditorSchemeIdentification = Objects.requireNonNull(creditorSchemeIdentification);
		return this;
	}
}