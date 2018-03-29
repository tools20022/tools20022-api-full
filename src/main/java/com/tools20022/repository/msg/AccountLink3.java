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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountLink;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.SecuritiesAccount19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines how the securities account is linked to the cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLink3#mmSecuritiesAccount
 * AccountLink3.mmSecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLink3#mmCashAccount
 * AccountLink3.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLink3#mmValidFrom
 * AccountLink3.mmValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLink3#mmValidTo
 * AccountLink3.mmValidTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLink3#mmDefaultIndicator
 * AccountLink3.mmDefaultIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLink3#mmCollateralisationIndicator
 * AccountLink3.mmCollateralisationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLink3#mmCashSettlementIndicator
 * AccountLink3.mmCashSettlementIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountLink
 * AccountLink}</li>
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
 * "AccountLink3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines how the securities account is linked to the cash account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.AccountLink1
 * AccountLink1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountLink3", propOrder = {"securitiesAccount", "cashAccount", "validFrom", "validTo", "defaultIndicator", "collateralisationIndicator", "cashSettlementIndicator"})
public class AccountLink3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesAcct", required = true)
	protected SecuritiesAccount19 securitiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmSecuritiesAccount
	 * AccountLink.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink3 AccountLink3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmSecuritiesAccount
	 * AccountLink1.mmSecuritiesAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLink3, SecuritiesAccount19> mmSecuritiesAccount = new MMMessageAssociationEnd<AccountLink3, SecuritiesAccount19>() {
		{
			businessElementTrace_lazy = () -> AccountLink.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLink3.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> AccountLink1.mmSecuritiesAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public SecuritiesAccount19 getValue(AccountLink3 obj) {
			return obj.getSecuritiesAccount();
		}

		@Override
		public void setValue(AccountLink3 obj, SecuritiesAccount19 value) {
			obj.setSecuritiesAccount(value);
		}
	};
	@XmlElement(name = "CshAcct", required = true)
	protected CashAccount24 cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmCashAccount
	 * AccountLink.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink3 AccountLink3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmCashAccount
	 * AccountLink1.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLink3, CashAccount24> mmCashAccount = new MMMessageAssociationEnd<AccountLink3, CashAccount24>() {
		{
			businessElementTrace_lazy = () -> AccountLink.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLink3.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			previousVersion_lazy = () -> AccountLink1.mmCashAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public CashAccount24 getValue(AccountLink3 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(AccountLink3 obj, CashAccount24 value) {
			obj.setCashAccount(value);
		}
	};
	@XmlElement(name = "VldFr", required = true)
	protected DateAndDateTimeChoice validFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink3 AccountLink3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date since when the securities account is linked to the cash account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmValidFrom
	 * AccountLink1.mmValidFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountLink3, DateAndDateTimeChoice> mmValidFrom = new MMMessageAttribute<AccountLink3, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLink3.mmObject();
			isDerived = false;
			xmlTag = "VldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidFrom";
			definition = "Defines the date since when the securities account is linked to the cash account.";
			previousVersion_lazy = () -> AccountLink1.mmValidFrom;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(AccountLink3 obj) {
			return obj.getValidFrom();
		}

		@Override
		public void setValue(AccountLink3 obj, DateAndDateTimeChoice value) {
			obj.setValidFrom(value);
		}
	};
	@XmlElement(name = "VldTo")
	protected DateAndDateTimeChoice validTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmToDateTime
	 * DateTimePeriod.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink3 AccountLink3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date until when the securities account is linked to the cash account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmValidTo
	 * AccountLink1.mmValidTo}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountLink3, Optional<DateAndDateTimeChoice>> mmValidTo = new MMMessageAttribute<AccountLink3, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLink3.mmObject();
			isDerived = false;
			xmlTag = "VldTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidTo";
			definition = "Defines the date until when the securities account is linked to the cash account.";
			previousVersion_lazy = () -> AccountLink1.mmValidTo;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(AccountLink3 obj) {
			return obj.getValidTo();
		}

		@Override
		public void setValue(AccountLink3 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setValidTo(value.orElse(null));
		}
	};
	@XmlElement(name = "DfltInd", required = true)
	protected YesNoIndicator defaultIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmDefaultIndicator
	 * AccountLink.mmDefaultIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink3 AccountLink3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether created account link is set as default for settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmDefaultIndicator
	 * AccountLink1.mmDefaultIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountLink3, YesNoIndicator> mmDefaultIndicator = new MMMessageAttribute<AccountLink3, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> AccountLink.mmDefaultIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLink3.mmObject();
			isDerived = false;
			xmlTag = "DfltInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultIndicator";
			definition = "Specifies whether created account link is set as default for settlement.";
			previousVersion_lazy = () -> AccountLink1.mmDefaultIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AccountLink3 obj) {
			return obj.getDefaultIndicator();
		}

		@Override
		public void setValue(AccountLink3 obj, YesNoIndicator value) {
			obj.setDefaultIndicator(value);
		}
	};
	@XmlElement(name = "CollstnInd", required = true)
	protected YesNoIndicator collateralisationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmCollateralisationIndicator
	 * AccountLink.mmCollateralisationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink3 AccountLink3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollstnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether market infrastructure can use the securities, earmarked as collateral and held on the securities account, for auto-collateralisation operations on the linked market infrastructure dedicated cash account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmCollateralisationIndicator
	 * AccountLink1.mmCollateralisationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountLink3, YesNoIndicator> mmCollateralisationIndicator = new MMMessageAttribute<AccountLink3, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> AccountLink.mmCollateralisationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLink3.mmObject();
			isDerived = false;
			xmlTag = "CollstnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether market infrastructure can use the securities, earmarked as collateral and held on the securities account, for auto-collateralisation operations on the linked market infrastructure dedicated cash account.";
			previousVersion_lazy = () -> AccountLink1.mmCollateralisationIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AccountLink3 obj) {
			return obj.getCollateralisationIndicator();
		}

		@Override
		public void setValue(AccountLink3 obj, YesNoIndicator value) {
			obj.setCollateralisationIndicator(value);
		}
	};
	@XmlElement(name = "CshSttlmInd", required = true)
	protected YesNoIndicator cashSettlementIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmCashSettlementIndicator
	 * AccountLink.mmCashSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink3 AccountLink3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether market infrastructure can use the link between the securities account and the market infrastructure dedicated cash account for the settlement of the cash leg of a settlement instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountLink1#mmCashSettlementIndicator
	 * AccountLink1.mmCashSettlementIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountLink3, YesNoIndicator> mmCashSettlementIndicator = new MMMessageAttribute<AccountLink3, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> AccountLink.mmCashSettlementIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLink3.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementIndicator";
			definition = "Specifies whether market infrastructure can use the link between the securities account and the market infrastructure dedicated cash account for the settlement of the cash leg of a settlement instruction.";
			previousVersion_lazy = () -> AccountLink1.mmCashSettlementIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AccountLink3 obj) {
			return obj.getCashSettlementIndicator();
		}

		@Override
		public void setValue(AccountLink3 obj, YesNoIndicator value) {
			obj.setCashSettlementIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountLink3.mmSecuritiesAccount, com.tools20022.repository.msg.AccountLink3.mmCashAccount, com.tools20022.repository.msg.AccountLink3.mmValidFrom,
						com.tools20022.repository.msg.AccountLink3.mmValidTo, com.tools20022.repository.msg.AccountLink3.mmDefaultIndicator, com.tools20022.repository.msg.AccountLink3.mmCollateralisationIndicator,
						com.tools20022.repository.msg.AccountLink3.mmCashSettlementIndicator);
				trace_lazy = () -> AccountLink.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountLink3";
				definition = "Defines how the securities account is linked to the cash account.";
				previousVersion_lazy = () -> AccountLink1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount19 getSecuritiesAccount() {
		return securitiesAccount;
	}

	public AccountLink3 setSecuritiesAccount(SecuritiesAccount19 securitiesAccount) {
		this.securitiesAccount = Objects.requireNonNull(securitiesAccount);
		return this;
	}

	public CashAccount24 getCashAccount() {
		return cashAccount;
	}

	public AccountLink3 setCashAccount(CashAccount24 cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public DateAndDateTimeChoice getValidFrom() {
		return validFrom;
	}

	public AccountLink3 setValidFrom(DateAndDateTimeChoice validFrom) {
		this.validFrom = Objects.requireNonNull(validFrom);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getValidTo() {
		return validTo == null ? Optional.empty() : Optional.of(validTo);
	}

	public AccountLink3 setValidTo(DateAndDateTimeChoice validTo) {
		this.validTo = validTo;
		return this;
	}

	public YesNoIndicator getDefaultIndicator() {
		return defaultIndicator;
	}

	public AccountLink3 setDefaultIndicator(YesNoIndicator defaultIndicator) {
		this.defaultIndicator = Objects.requireNonNull(defaultIndicator);
		return this;
	}

	public YesNoIndicator getCollateralisationIndicator() {
		return collateralisationIndicator;
	}

	public AccountLink3 setCollateralisationIndicator(YesNoIndicator collateralisationIndicator) {
		this.collateralisationIndicator = Objects.requireNonNull(collateralisationIndicator);
		return this;
	}

	public YesNoIndicator getCashSettlementIndicator() {
		return cashSettlementIndicator;
	}

	public AccountLink3 setCashSettlementIndicator(YesNoIndicator cashSettlementIndicator) {
		this.cashSettlementIndicator = Objects.requireNonNull(cashSettlementIndicator);
		return this;
	}
}