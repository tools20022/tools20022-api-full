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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about short positions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShortPositionsReportDetails1#mmParticipantIdentification
 * ShortPositionsReportDetails1.mmParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShortPositionsReportDetails1#mmParticipantAccount
 * ShortPositionsReportDetails1.mmParticipantAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShortPositionsReportDetails1#mmShortPositionAmount
 * ShortPositionsReportDetails1.mmShortPositionAmount}</li>
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
 * "ShortPositionsReportDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about short positions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ShortPositionsReportDetails1", propOrder = {"participantIdentification", "participantAccount", "shortPositionAmount"})
public class ShortPositionsReportDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BranchAndFinancialInstitutionIdentification5 participantIdentification;
	/**
	 * Identification of participant account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShortPositionsReportDetails1
	 * ShortPositionsReportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of participant account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipantIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ShortPositionsReportDetails1.mmObject();
			isDerived = false;
			xmlTag = "PtcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantIdentification";
			definition = "Identification of participant account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected CashAccount24 participantAccount;
	/**
	 * Information about participant account number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShortPositionsReportDetails1
	 * ShortPositionsReportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about participant account number."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipantAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ShortPositionsReportDetails1.mmObject();
			isDerived = false;
			xmlTag = "PtcptAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantAccount";
			definition = "Information about participant account number.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount shortPositionAmount;
	/**
	 * Information about participant account balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShortPositionsReportDetails1
	 * ShortPositionsReportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtPosAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortPositionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about participant account balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortPositionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ShortPositionsReportDetails1.mmObject();
			isDerived = false;
			xmlTag = "ShrtPosAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortPositionAmount";
			definition = "Information about participant account balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ShortPositionsReportDetails1.mmParticipantIdentification, ShortPositionsReportDetails1.mmParticipantAccount, ShortPositionsReportDetails1.mmShortPositionAmount);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ShortPositionsReportDetails1";
				definition = "Information about short positions.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PtcptId", required = true)
	public BranchAndFinancialInstitutionIdentification5 getParticipantIdentification() {
		return participantIdentification;
	}

	public void setParticipantIdentification(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 participantIdentification) {
		this.participantIdentification = participantIdentification;
	}

	@XmlElement(name = "PtcptAcct", required = true)
	public CashAccount24 getParticipantAccount() {
		return participantAccount;
	}

	public void setParticipantAccount(com.tools20022.repository.msg.CashAccount24 participantAccount) {
		this.participantAccount = participantAccount;
	}

	@XmlElement(name = "ShrtPosAmt", required = true)
	public ActiveCurrencyAndAmount getShortPositionAmount() {
		return shortPositionAmount;
	}

	public void setShortPositionAmount(ActiveCurrencyAndAmount shortPositionAmount) {
		this.shortPositionAmount = shortPositionAmount;
	}
}