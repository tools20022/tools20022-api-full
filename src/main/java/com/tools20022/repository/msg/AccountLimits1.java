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
import com.tools20022.repository.choice.ClearingScheme1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics and values set for account limits.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLimits1#mmLimitType
 * AccountLimits1.mmLimitType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLimits1#mmLimitAmount
 * AccountLimits1.mmLimitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLimits1#mmLimitUtilisationAmount
 * AccountLimits1.mmLimitUtilisationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLimits1#mmBilateralLimitCounterpartyIdentification
 * AccountLimits1.mmBilateralLimitCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLimits1#mmClearingCircuitScheme
 * AccountLimits1.mmClearingCircuitScheme}</li>
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
 * "AccountLimits1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics and values set for account limits."</li>
 * </ul>
 */
public class AccountLimits1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text limitType;
	/**
	 * Defines type of funds limits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLimits1 AccountLimits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines type of funds limits."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountLimits1.mmObject();
			isDerived = false;
			xmlTag = "LmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitType";
			definition = "Defines type of funds limits.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount limitAmount;
	/**
	 * Amount of money of the limit.
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
	 * {@linkplain com.tools20022.repository.msg.AccountLimits1 AccountLimits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money of the limit. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountLimits1.mmObject();
			isDerived = false;
			xmlTag = "LmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitAmount";
			definition = "Amount of money of the limit. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount limitUtilisationAmount;
	/**
	 * Amount of used funds out of defined limit.
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
	 * {@linkplain com.tools20022.repository.msg.AccountLimits1 AccountLimits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtUtlstnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitUtilisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of used funds out of defined limit. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitUtilisationAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountLimits1.mmObject();
			isDerived = false;
			xmlTag = "LmtUtlstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitUtilisationAmount";
			definition = "Amount of used funds out of defined limit. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 bilateralLimitCounterpartyIdentification;
	/**
	 * Identification of the system member for which the limit is established.
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
	 * {@linkplain com.tools20022.repository.msg.AccountLimits1 AccountLimits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BilLmtCtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the system member for which the limit is established."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBilateralLimitCounterpartyIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLimits1.mmObject();
			isDerived = false;
			xmlTag = "BilLmtCtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterpartyIdentification";
			definition = "Identification of the system member for which the limit is established.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected ClearingScheme1Choice clearingCircuitScheme;
	/**
	 * Clearing scheme related to Registry of the Clearing Positions (RCP).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingScheme1Choice
	 * ClearingScheme1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLimits1 AccountLimits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrCrctSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingCircuitScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing scheme related to Registry of the Clearing Positions (RCP)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingCircuitScheme = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLimits1.mmObject();
			isDerived = false;
			xmlTag = "ClrCrctSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingCircuitScheme";
			definition = "Clearing scheme related to Registry of the Clearing Positions (RCP).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingScheme1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountLimits1.mmLimitType, AccountLimits1.mmLimitAmount, AccountLimits1.mmLimitUtilisationAmount, AccountLimits1.mmBilateralLimitCounterpartyIdentification,
						AccountLimits1.mmClearingCircuitScheme);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountLimits1";
				definition = "Characteristics and values set for account limits.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getLimitType() {
		return limitType;
	}

	public void setLimitType(Max35Text limitType) {
		this.limitType = limitType;
	}

	public ActiveCurrencyAndAmount getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(ActiveCurrencyAndAmount limitAmount) {
		this.limitAmount = limitAmount;
	}

	public ActiveCurrencyAndAmount getLimitUtilisationAmount() {
		return limitUtilisationAmount;
	}

	public void setLimitUtilisationAmount(ActiveCurrencyAndAmount limitUtilisationAmount) {
		this.limitUtilisationAmount = limitUtilisationAmount;
	}

	public BranchAndFinancialInstitutionIdentification5 getBilateralLimitCounterpartyIdentification() {
		return bilateralLimitCounterpartyIdentification;
	}

	public void setBilateralLimitCounterpartyIdentification(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 bilateralLimitCounterpartyIdentification) {
		this.bilateralLimitCounterpartyIdentification = bilateralLimitCounterpartyIdentification;
	}

	public ClearingScheme1Choice getClearingCircuitScheme() {
		return clearingCircuitScheme;
	}

	public void setClearingCircuitScheme(ClearingScheme1Choice clearingCircuitScheme) {
		this.clearingCircuitScheme = clearingCircuitScheme;
	}
}