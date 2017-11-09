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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Defines the criteria used to search for a limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmSystemIdentification
 * LimitSearchCriteria3.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmBilateralLimitCounterpartyIdentification
 * LimitSearchCriteria3.mmBilateralLimitCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmDefaultLimitType
 * LimitSearchCriteria3.mmDefaultLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmCurrentLimitType
 * LimitSearchCriteria3.mmCurrentLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmAccountOwner
 * LimitSearchCriteria3.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmAccountIdentification
 * LimitSearchCriteria3.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmUsedAmount
 * LimitSearchCriteria3.mmUsedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmUsedPercentage
 * LimitSearchCriteria3.mmUsedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmLimitCurrency
 * LimitSearchCriteria3.mmLimitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmLimitAmount
 * LimitSearchCriteria3.mmLimitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmLimitValidAsOfDate
 * LimitSearchCriteria3.mmLimitValidAsOfDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
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
 * "LimitSearchCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a limit."</li>
 * </ul>
 */
public class LimitSearchCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemIdentification2Choice systemIdentification;
	/**
	 * Identification of a particular cash clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentification2Choice
	 * SystemIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCashClearingSystem
	 * TransactionAdministrator.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a particular cash clearing system. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSystemIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TransactionAdministrator.mmCashClearingSystem;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of a particular cash clearing system. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemIdentification2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5> bilateralLimitCounterpartyIdentification;
	/**
	 * Unique and unambiguous identification of a member within a system,
	 * assigned using the member identification scheme of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
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
	 * "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBilateralLimitCounterpartyIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "BilLmtCtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterpartyIdentification";
			definition = "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected List<LimitType1Choice> defaultLimitType;
	/**
	 * Type of limit as set by default in the system. The default limit is
	 * applicable by the system unless otherwise instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LimitType1Choice
	 * LimitType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmType Limit.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltLmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultLimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of limit as set by default in the system. The default limit is applicable by the system unless otherwise instructed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDefaultLimitType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmType;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "DfltLmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultLimitType";
			definition = "Type of limit as set by default in the system. The default limit is applicable by the system unless otherwise instructed.";
			minOccurs = 0;
			complexType_lazy = () -> LimitType1Choice.mmObject();
		}
	};
	protected List<LimitType1Choice> currentLimitType;
	/**
	 * Type of limit applied by the system at the present time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LimitType1Choice
	 * LimitType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmType Limit.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurLmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentLimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of limit applied by the system at the present time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentLimitType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmType;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "CurLmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentLimitType";
			definition = "Type of limit applied by the system at the present time.";
			minOccurs = 0;
			complexType_lazy = () -> LimitType1Choice.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 accountOwner;
	/**
	 * Owner of the account which is being queried.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the account which is being queried."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account which is being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected AccountIdentification4Choice accountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	protected AmountRange2Choice usedAmount;
	/**
	 * Actual usage of the limit expressed as an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AmountRange2Choice
	 * AmountRange2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmUsedAmount
	 * Limit.mmUsedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as an amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUsedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Limit.mmUsedAmount;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "UsdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountRange2Choice.mmObject();
		}
	};
	protected PercentageRange1Choice usedPercentage;
	/**
	 * Actual usage of the limit expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PercentageRange1Choice
	 * PercentageRange1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmUsedPercentage
	 * Limit.mmUsedPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsdPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUsedPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmUsedPercentage;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "UsdPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentage";
			definition = "Actual usage of the limit expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PercentageRange1Choice.mmObject();
		}
	};
	protected ActiveCurrencyCode limitCurrency;
	/**
	 * Currency unit used to specify the limit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmCurrency
	 * Limit.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency unit used to specify the limit amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmCurrency;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "LmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitCurrency";
			definition = "Currency unit used to specify the limit amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected AmountRange2Choice limitAmount;
	/**
	 * Amount of money of the limit, expressed in an eligible currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AmountRange2Choice
	 * AmountRange2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
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
	 * definition} =
	 * "Amount of money of the limit, expressed in an eligible currency."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimitAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "LmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitAmount";
			definition = "Amount of money of the limit, expressed in an eligible currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountRange2Choice.mmObject();
		}
	};
	protected DateAndPeriod2Choice limitValidAsOfDate;
	/**
	 * Range of dates when the limit becomes valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndPeriod2Choice
	 * DateAndPeriod2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtVldAsOfDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitValidAsOfDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of dates when the limit becomes valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitValidAsOfDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> LimitSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "LmtVldAsOfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitValidAsOfDate";
			definition = "Range of dates when the limit becomes valid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndPeriod2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LimitSearchCriteria3.mmSystemIdentification, LimitSearchCriteria3.mmBilateralLimitCounterpartyIdentification, LimitSearchCriteria3.mmDefaultLimitType,
						LimitSearchCriteria3.mmCurrentLimitType, LimitSearchCriteria3.mmAccountOwner, LimitSearchCriteria3.mmAccountIdentification, LimitSearchCriteria3.mmUsedAmount, LimitSearchCriteria3.mmUsedPercentage,
						LimitSearchCriteria3.mmLimitCurrency, LimitSearchCriteria3.mmLimitAmount, LimitSearchCriteria3.mmLimitValidAsOfDate);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitSearchCriteria3";
				definition = "Defines the criteria used to search for a limit.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemIdentification2Choice getSystemIdentification() {
		return systemIdentification;
	}

	public void setSystemIdentification(SystemIdentification2Choice systemIdentification) {
		this.systemIdentification = systemIdentification;
	}

	public List<BranchAndFinancialInstitutionIdentification5> getBilateralLimitCounterpartyIdentification() {
		return bilateralLimitCounterpartyIdentification;
	}

	public void setBilateralLimitCounterpartyIdentification(List<com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5> bilateralLimitCounterpartyIdentification) {
		this.bilateralLimitCounterpartyIdentification = bilateralLimitCounterpartyIdentification;
	}

	public List<LimitType1Choice> getDefaultLimitType() {
		return defaultLimitType;
	}

	public void setDefaultLimitType(List<LimitType1Choice> defaultLimitType) {
		this.defaultLimitType = defaultLimitType;
	}

	public List<LimitType1Choice> getCurrentLimitType() {
		return currentLimitType;
	}

	public void setCurrentLimitType(List<LimitType1Choice> currentLimitType) {
		this.currentLimitType = currentLimitType;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 accountOwner) {
		this.accountOwner = accountOwner;
	}

	public AccountIdentification4Choice getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(AccountIdentification4Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	public AmountRange2Choice getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(AmountRange2Choice usedAmount) {
		this.usedAmount = usedAmount;
	}

	public PercentageRange1Choice getUsedPercentage() {
		return usedPercentage;
	}

	public void setUsedPercentage(PercentageRange1Choice usedPercentage) {
		this.usedPercentage = usedPercentage;
	}

	public ActiveCurrencyCode getLimitCurrency() {
		return limitCurrency;
	}

	public void setLimitCurrency(ActiveCurrencyCode limitCurrency) {
		this.limitCurrency = limitCurrency;
	}

	public AmountRange2Choice getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(AmountRange2Choice limitAmount) {
		this.limitAmount = limitAmount;
	}

	public DateAndPeriod2Choice getLimitValidAsOfDate() {
		return limitValidAsOfDate;
	}

	public void setLimitValidAsOfDate(DateAndPeriod2Choice limitValidAsOfDate) {
		this.limitValidAsOfDate = limitValidAsOfDate;
	}
}