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
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.CashAccount24;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ShortPositionsReportDetails1", propOrder = {"participantIdentification", "participantAccount", "shortPositionAmount"})
public class ShortPositionsReportDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtcptId", required = true)
	protected BranchAndFinancialInstitutionIdentification5 participantIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ShortPositionsReportDetails1, BranchAndFinancialInstitutionIdentification5> mmParticipantIdentification = new MMMessageAssociationEnd<ShortPositionsReportDetails1, BranchAndFinancialInstitutionIdentification5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ShortPositionsReportDetails1.mmObject();
			isDerived = false;
			xmlTag = "PtcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantIdentification";
			definition = "Identification of participant account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification5 getValue(ShortPositionsReportDetails1 obj) {
			return obj.getParticipantIdentification();
		}

		@Override
		public void setValue(ShortPositionsReportDetails1 obj, BranchAndFinancialInstitutionIdentification5 value) {
			obj.setParticipantIdentification(value);
		}
	};
	@XmlElement(name = "PtcptAcct", required = true)
	protected CashAccount24 participantAccount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ShortPositionsReportDetails1, CashAccount24> mmParticipantAccount = new MMMessageAssociationEnd<ShortPositionsReportDetails1, CashAccount24>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ShortPositionsReportDetails1.mmObject();
			isDerived = false;
			xmlTag = "PtcptAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantAccount";
			definition = "Information about participant account number.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public CashAccount24 getValue(ShortPositionsReportDetails1 obj) {
			return obj.getParticipantAccount();
		}

		@Override
		public void setValue(ShortPositionsReportDetails1 obj, CashAccount24 value) {
			obj.setParticipantAccount(value);
		}
	};
	@XmlElement(name = "ShrtPosAmt", required = true)
	protected ActiveCurrencyAndAmount shortPositionAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ShortPositionsReportDetails1, ActiveCurrencyAndAmount> mmShortPositionAmount = new MMMessageAttribute<ShortPositionsReportDetails1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ShortPositionsReportDetails1.mmObject();
			isDerived = false;
			xmlTag = "ShrtPosAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortPositionAmount";
			definition = "Information about participant account balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(ShortPositionsReportDetails1 obj) {
			return obj.getShortPositionAmount();
		}

		@Override
		public void setValue(ShortPositionsReportDetails1 obj, ActiveCurrencyAndAmount value) {
			obj.setShortPositionAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ShortPositionsReportDetails1.mmParticipantIdentification, com.tools20022.repository.msg.ShortPositionsReportDetails1.mmParticipantAccount,
						com.tools20022.repository.msg.ShortPositionsReportDetails1.mmShortPositionAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ShortPositionsReportDetails1";
				definition = "Information about short positions.";
			}
		});
		return mmObject_lazy.get();
	}

	public BranchAndFinancialInstitutionIdentification5 getParticipantIdentification() {
		return participantIdentification;
	}

	public ShortPositionsReportDetails1 setParticipantIdentification(BranchAndFinancialInstitutionIdentification5 participantIdentification) {
		this.participantIdentification = Objects.requireNonNull(participantIdentification);
		return this;
	}

	public CashAccount24 getParticipantAccount() {
		return participantAccount;
	}

	public ShortPositionsReportDetails1 setParticipantAccount(CashAccount24 participantAccount) {
		this.participantAccount = Objects.requireNonNull(participantAccount);
		return this;
	}

	public ActiveCurrencyAndAmount getShortPositionAmount() {
		return shortPositionAmount;
	}

	public ShortPositionsReportDetails1 setShortPositionAmount(ActiveCurrencyAndAmount shortPositionAmount) {
		this.shortPositionAmount = Objects.requireNonNull(shortPositionAmount);
		return this;
	}
}