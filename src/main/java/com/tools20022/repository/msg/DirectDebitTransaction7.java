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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DirectDebit;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further specific details on the direct debit transaction and the
 * related mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#mmMandateRelatedInformation
 * DirectDebitTransaction7.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#mmCreditorSchemeIdentification
 * DirectDebitTransaction7.mmCreditorSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#mmPreNotificationIdentification
 * DirectDebitTransaction7.mmPreNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7#mmPreNotificationDate
 * DirectDebitTransaction7.mmPreNotificationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebit
 * DirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DirectDebitTransaction7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further specific details on the direct debit transaction and the related mandate."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitTransaction8
 * DirectDebitTransaction8}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class DirectDebitTransaction7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MandateRelatedInformation8 mandateRelatedInformation;
	/**
	 * Provides further details of the direct debit mandate signed between the
	 * creditor and the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8
	 * MandateRelatedInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
	 * DirectDebit.mmDirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7
	 * DirectDebitTransaction7}</li>
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
	 * "Provides further details of the direct debit mandate signed between the creditor and the debtor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#mmMandateRelatedInformation
	 * DirectDebitTransaction8.mmMandateRelatedInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMandateRelatedInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> DirectDebit.mmDirectDebitMandate;
			componentContext_lazy = () -> DirectDebitTransaction7.mmObject();
			isDerived = false;
			xmlTag = "MndtRltdInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateRelatedInformation";
			definition = "Provides further details of the direct debit mandate signed between the creditor and the debtor.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitTransaction8.mmMandateRelatedInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation8.mmObject();
		}
	};
	protected PartyIdentification43 creditorSchemeIdentification;
	/**
	 * Credit party that signs the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7
	 * DirectDebitTransaction7}</li>
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
	 * definition} = "Credit party that signs the mandate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#mmCreditorSchemeIdentification
	 * DirectDebitTransaction8.mmCreditorSchemeIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DirectDebitTransaction7.mmObject();
			isDerived = false;
			xmlTag = "CdtrSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSchemeIdentification";
			definition = "Credit party that signs the mandate.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitTransaction8.mmCreditorSchemeIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected Max35Text preNotificationIdentification;
	/**
	 * Unique and unambiguous identification of the pre-notification which is
	 * sent separately from the direct debit instruction.
	 * 
	 * Usage: The direct debit pre-notification is used to reconcile separately
	 * sent collection information with the direct debit transaction
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmPreNotificationIdentification
	 * DirectDebit.mmPreNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7
	 * DirectDebitTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\n\nUsage: The direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#mmPreNotificationIdentification
	 * DirectDebitTransaction8.mmPreNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreNotificationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DirectDebit.mmPreNotificationIdentification;
			componentContext_lazy = () -> DirectDebitTransaction7.mmObject();
			isDerived = false;
			xmlTag = "PreNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreNotificationIdentification";
			definition = "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\n\nUsage: The direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitTransaction8.mmPreNotificationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate preNotificationDate;
	/**
	 * Date on which the creditor notifies the debtor about the amount and date
	 * on which the direct debit instruction will be presented to the debtor's
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmPreNotificationDate
	 * DirectDebit.mmPreNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction7
	 * DirectDebitTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreNtfctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction8#mmPreNotificationDate
	 * DirectDebitTransaction8.mmPreNotificationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreNotificationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DirectDebit.mmPreNotificationDate;
			componentContext_lazy = () -> DirectDebitTransaction7.mmObject();
			isDerived = false;
			xmlTag = "PreNtfctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreNotificationDate";
			definition = "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitTransaction8.mmPreNotificationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DirectDebitTransaction7.mmMandateRelatedInformation, DirectDebitTransaction7.mmCreditorSchemeIdentification, DirectDebitTransaction7.mmPreNotificationIdentification,
						DirectDebitTransaction7.mmPreNotificationDate);
				trace_lazy = () -> DirectDebit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DirectDebitTransaction7";
				definition = "Provides further specific details on the direct debit transaction and the related mandate.";
				nextVersions_lazy = () -> Arrays.asList(DirectDebitTransaction8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public MandateRelatedInformation8 getMandateRelatedInformation() {
		return mandateRelatedInformation;
	}

	public void setMandateRelatedInformation(com.tools20022.repository.msg.MandateRelatedInformation8 mandateRelatedInformation) {
		this.mandateRelatedInformation = mandateRelatedInformation;
	}

	public PartyIdentification43 getCreditorSchemeIdentification() {
		return creditorSchemeIdentification;
	}

	public void setCreditorSchemeIdentification(com.tools20022.repository.msg.PartyIdentification43 creditorSchemeIdentification) {
		this.creditorSchemeIdentification = creditorSchemeIdentification;
	}

	public Max35Text getPreNotificationIdentification() {
		return preNotificationIdentification;
	}

	public void setPreNotificationIdentification(Max35Text preNotificationIdentification) {
		this.preNotificationIdentification = preNotificationIdentification;
	}

	public ISODate getPreNotificationDate() {
		return preNotificationDate;
	}

	public void setPreNotificationDate(ISODate preNotificationDate) {
		this.preNotificationDate = preNotificationDate;
	}
}