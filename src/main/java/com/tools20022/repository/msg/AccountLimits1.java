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
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountLimits1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics and values set for account limits."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountLimits1", propOrder = {"limitType", "limitAmount", "limitUtilisationAmount", "bilateralLimitCounterpartyIdentification", "clearingCircuitScheme"})
public class AccountLimits1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LmtTp", required = true)
	protected Max35Text limitType;
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
	 * {@linkplain com.tools20022.repository.msg.AccountLimits1 AccountLimits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines type of funds limits."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountLimits1, Max35Text> mmLimitType = new MMMessageAttribute<AccountLimits1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLimits1.mmObject();
			isDerived = false;
			xmlTag = "LmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitType";
			definition = "Defines type of funds limits.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountLimits1 obj) {
			return obj.getLimitType();
		}

		@Override
		public void setValue(AccountLimits1 obj, Max35Text value) {
			obj.setLimitType(value);
		}
	};
	@XmlElement(name = "LmtAmt", required = true)
	protected ActiveCurrencyAndAmount limitAmount;
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
	 * {@linkplain com.tools20022.repository.msg.AccountLimits1 AccountLimits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money of the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountLimits1, ActiveCurrencyAndAmount> mmLimitAmount = new MMMessageAttribute<AccountLimits1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLimits1.mmObject();
			isDerived = false;
			xmlTag = "LmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitAmount";
			definition = "Amount of money of the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AccountLimits1 obj) {
			return obj.getLimitAmount();
		}

		@Override
		public void setValue(AccountLimits1 obj, ActiveCurrencyAndAmount value) {
			obj.setLimitAmount(value);
		}
	};
	@XmlElement(name = "LmtUtlstnAmt")
	protected ActiveCurrencyAndAmount limitUtilisationAmount;
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
	 * {@linkplain com.tools20022.repository.msg.AccountLimits1 AccountLimits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtUtlstnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitUtilisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of used funds out of defined limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountLimits1, Optional<ActiveCurrencyAndAmount>> mmLimitUtilisationAmount = new MMMessageAttribute<AccountLimits1, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLimits1.mmObject();
			isDerived = false;
			xmlTag = "LmtUtlstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitUtilisationAmount";
			definition = "Amount of used funds out of defined limit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(AccountLimits1 obj) {
			return obj.getLimitUtilisationAmount();
		}

		@Override
		public void setValue(AccountLimits1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setLimitUtilisationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "BilLmtCtrPtyId")
	protected BranchAndFinancialInstitutionIdentification5 bilateralLimitCounterpartyIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.AccountLimits1 AccountLimits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BilLmtCtrPtyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the system member for which the limit is established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLimits1, Optional<BranchAndFinancialInstitutionIdentification5>> mmBilateralLimitCounterpartyIdentification = new MMMessageAssociationEnd<AccountLimits1, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLimits1.mmObject();
			isDerived = false;
			xmlTag = "BilLmtCtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterpartyIdentification";
			definition = "Identification of the system member for which the limit is established.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(AccountLimits1 obj) {
			return obj.getBilateralLimitCounterpartyIdentification();
		}

		@Override
		public void setValue(AccountLimits1 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setBilateralLimitCounterpartyIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrCrctSchme")
	protected ClearingScheme1Choice clearingCircuitScheme;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingCircuitScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing scheme related to Registry of the Clearing Positions (RCP)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLimits1, Optional<ClearingScheme1Choice>> mmClearingCircuitScheme = new MMMessageAssociationEnd<AccountLimits1, Optional<ClearingScheme1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLimits1.mmObject();
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

		@Override
		public Optional<ClearingScheme1Choice> getValue(AccountLimits1 obj) {
			return obj.getClearingCircuitScheme();
		}

		@Override
		public void setValue(AccountLimits1 obj, Optional<ClearingScheme1Choice> value) {
			obj.setClearingCircuitScheme(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountLimits1.mmLimitType, com.tools20022.repository.msg.AccountLimits1.mmLimitAmount,
						com.tools20022.repository.msg.AccountLimits1.mmLimitUtilisationAmount, com.tools20022.repository.msg.AccountLimits1.mmBilateralLimitCounterpartyIdentification,
						com.tools20022.repository.msg.AccountLimits1.mmClearingCircuitScheme);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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

	public AccountLimits1 setLimitType(Max35Text limitType) {
		this.limitType = Objects.requireNonNull(limitType);
		return this;
	}

	public ActiveCurrencyAndAmount getLimitAmount() {
		return limitAmount;
	}

	public AccountLimits1 setLimitAmount(ActiveCurrencyAndAmount limitAmount) {
		this.limitAmount = Objects.requireNonNull(limitAmount);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getLimitUtilisationAmount() {
		return limitUtilisationAmount == null ? Optional.empty() : Optional.of(limitUtilisationAmount);
	}

	public AccountLimits1 setLimitUtilisationAmount(ActiveCurrencyAndAmount limitUtilisationAmount) {
		this.limitUtilisationAmount = limitUtilisationAmount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getBilateralLimitCounterpartyIdentification() {
		return bilateralLimitCounterpartyIdentification == null ? Optional.empty() : Optional.of(bilateralLimitCounterpartyIdentification);
	}

	public AccountLimits1 setBilateralLimitCounterpartyIdentification(BranchAndFinancialInstitutionIdentification5 bilateralLimitCounterpartyIdentification) {
		this.bilateralLimitCounterpartyIdentification = bilateralLimitCounterpartyIdentification;
		return this;
	}

	public Optional<ClearingScheme1Choice> getClearingCircuitScheme() {
		return clearingCircuitScheme == null ? Optional.empty() : Optional.of(clearingCircuitScheme);
	}

	public AccountLimits1 setClearingCircuitScheme(ClearingScheme1Choice clearingCircuitScheme) {
		this.clearingCircuitScheme = clearingCircuitScheme;
		return this;
	}
}