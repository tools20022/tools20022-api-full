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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmSystemIdentification
 * LimitSearchCriteria5.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmBilateralLimitCounterpartyIdentification
 * LimitSearchCriteria5.mmBilateralLimitCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmDefaultLimitType
 * LimitSearchCriteria5.mmDefaultLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmCurrentLimitType
 * LimitSearchCriteria5.mmCurrentLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmAccountOwner
 * LimitSearchCriteria5.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmAccountIdentification
 * LimitSearchCriteria5.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmUsedAmount
 * LimitSearchCriteria5.mmUsedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmUsedPercentage
 * LimitSearchCriteria5.mmUsedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmLimitCurrency
 * LimitSearchCriteria5.mmLimitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmLimitAmount
 * LimitSearchCriteria5.mmLimitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmLimitValidAsOfDate
 * LimitSearchCriteria5.mmLimitValidAsOfDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty3Rule#forLimitSearchCriteria5
 * ConstraintBilateralLimitCounterparty3Rule.forLimitSearchCriteria5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty4Rule#forLimitSearchCriteria5
 * ConstraintBilateralLimitCounterparty4Rule.forLimitSearchCriteria5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitSearchCriteria5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a limit."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4
 * LimitSearchCriteria4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitSearchCriteria5", propOrder = {"systemIdentification", "bilateralLimitCounterpartyIdentification", "defaultLimitType", "currentLimitType", "accountOwner", "accountIdentification", "usedAmount", "usedPercentage",
		"limitCurrency", "limitAmount", "limitValidAsOfDate"})
public class LimitSearchCriteria5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysId")
	protected SystemIdentification2Choice systemIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * definition} = "Identification of a particular cash clearing system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmSystemIdentification
	 * LimitSearchCriteria4.mmSystemIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSystemIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TransactionAdministrator.mmCashClearingSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of a particular cash clearing system.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmSystemIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemIdentification2Choice.mmObject();
		}
	};
	@XmlElement(name = "BilLmtCtrPtyId")
	protected List<com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5> bilateralLimitCounterpartyIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmBilateralLimitCounterpartyIdentification
	 * LimitSearchCriteria4.mmBilateralLimitCounterpartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBilateralLimitCounterpartyIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "BilLmtCtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterpartyIdentification";
			definition = "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmBilateralLimitCounterpartyIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "DfltLmtTp")
	protected List<LimitType1Choice> defaultLimitType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmDefaultLimitType
	 * LimitSearchCriteria4.mmDefaultLimitType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDefaultLimitType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "DfltLmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultLimitType";
			definition = "Type of limit as set by default in the system. The default limit is applicable by the system unless otherwise instructed.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmDefaultLimitType;
			minOccurs = 0;
			complexType_lazy = () -> LimitType1Choice.mmObject();
		}
	};
	@XmlElement(name = "CurLmtTp")
	protected List<LimitType1Choice> currentLimitType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmCurrentLimitType
	 * LimitSearchCriteria4.mmCurrentLimitType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentLimitType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "CurLmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentLimitType";
			definition = "Type of limit applied by the system at the present time.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmCurrentLimitType;
			minOccurs = 0;
			complexType_lazy = () -> LimitType1Choice.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected BranchAndFinancialInstitutionIdentification5 accountOwner;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmAccountOwner
	 * LimitSearchCriteria4.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account which is being queried.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "AcctId")
	protected AccountIdentification4Choice accountIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmAccountIdentification
	 * LimitSearchCriteria4.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	@XmlElement(name = "UsdAmt")
	protected ActiveAmountRange3Choice usedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange3Choice
	 * ActiveAmountRange3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmUsedAmount
	 * Limit.mmUsedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmUsedAmount
	 * LimitSearchCriteria4.mmUsedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUsedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Limit.mmUsedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "UsdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmUsedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ActiveAmountRange3Choice.mmObject();
		}
	};
	@XmlElement(name = "UsdPctg")
	protected PercentageRange1Choice usedPercentage;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmUsedPercentage
	 * LimitSearchCriteria4.mmUsedPercentage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUsedPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmUsedPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "UsdPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentage";
			definition = "Actual usage of the limit expressed as a percentage.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmUsedPercentage;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PercentageRange1Choice.mmObject();
		}
	};
	@XmlElement(name = "LmtCcy")
	protected ActiveCurrencyCode limitCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmLimitCurrency
	 * LimitSearchCriteria4.mmLimitCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "LmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitCurrency";
			definition = "Currency unit used to specify the limit amount.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmLimitCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "LmtAmt")
	protected ActiveAmountRange3Choice limitAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange3Choice
	 * ActiveAmountRange3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmLimitAmount
	 * LimitSearchCriteria4.mmLimitAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimitAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "LmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitAmount";
			definition = "Amount of money of the limit, expressed in an eligible currency.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmLimitAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ActiveAmountRange3Choice.mmObject();
		}
	};
	@XmlElement(name = "LmtVldAsOfDt")
	protected DateAndPeriod2Choice limitValidAsOfDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
	 * LimitSearchCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmLimitValidAsOfDate
	 * LimitSearchCriteria4.mmLimitValidAsOfDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitValidAsOfDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "LmtVldAsOfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitValidAsOfDate";
			definition = "Range of dates when the limit becomes valid.";
			previousVersion_lazy = () -> LimitSearchCriteria4.mmLimitValidAsOfDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndPeriod2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitSearchCriteria5.mmSystemIdentification, com.tools20022.repository.msg.LimitSearchCriteria5.mmBilateralLimitCounterpartyIdentification,
						com.tools20022.repository.msg.LimitSearchCriteria5.mmDefaultLimitType, com.tools20022.repository.msg.LimitSearchCriteria5.mmCurrentLimitType, com.tools20022.repository.msg.LimitSearchCriteria5.mmAccountOwner,
						com.tools20022.repository.msg.LimitSearchCriteria5.mmAccountIdentification, com.tools20022.repository.msg.LimitSearchCriteria5.mmUsedAmount, com.tools20022.repository.msg.LimitSearchCriteria5.mmUsedPercentage,
						com.tools20022.repository.msg.LimitSearchCriteria5.mmLimitCurrency, com.tools20022.repository.msg.LimitSearchCriteria5.mmLimitAmount, com.tools20022.repository.msg.LimitSearchCriteria5.mmLimitValidAsOfDate);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty3Rule.forLimitSearchCriteria5,
						com.tools20022.repository.constraints.ConstraintBilateralLimitCounterparty4Rule.forLimitSearchCriteria5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LimitSearchCriteria5";
				definition = "Defines the criteria used to search for a limit.";
				previousVersion_lazy = () -> LimitSearchCriteria4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemIdentification2Choice> getSystemIdentification() {
		return systemIdentification == null ? Optional.empty() : Optional.of(systemIdentification);
	}

	public LimitSearchCriteria5 setSystemIdentification(SystemIdentification2Choice systemIdentification) {
		this.systemIdentification = systemIdentification;
		return this;
	}

	public List<BranchAndFinancialInstitutionIdentification5> getBilateralLimitCounterpartyIdentification() {
		return bilateralLimitCounterpartyIdentification == null ? bilateralLimitCounterpartyIdentification = new ArrayList<>() : bilateralLimitCounterpartyIdentification;
	}

	public LimitSearchCriteria5 setBilateralLimitCounterpartyIdentification(List<com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5> bilateralLimitCounterpartyIdentification) {
		this.bilateralLimitCounterpartyIdentification = Objects.requireNonNull(bilateralLimitCounterpartyIdentification);
		return this;
	}

	public List<LimitType1Choice> getDefaultLimitType() {
		return defaultLimitType == null ? defaultLimitType = new ArrayList<>() : defaultLimitType;
	}

	public LimitSearchCriteria5 setDefaultLimitType(List<LimitType1Choice> defaultLimitType) {
		this.defaultLimitType = Objects.requireNonNull(defaultLimitType);
		return this;
	}

	public List<LimitType1Choice> getCurrentLimitType() {
		return currentLimitType == null ? currentLimitType = new ArrayList<>() : currentLimitType;
	}

	public LimitSearchCriteria5 setCurrentLimitType(List<LimitType1Choice> currentLimitType) {
		this.currentLimitType = Objects.requireNonNull(currentLimitType);
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public LimitSearchCriteria5 setAccountOwner(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<AccountIdentification4Choice> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public LimitSearchCriteria5 setAccountIdentification(AccountIdentification4Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<ActiveAmountRange3Choice> getUsedAmount() {
		return usedAmount == null ? Optional.empty() : Optional.of(usedAmount);
	}

	public LimitSearchCriteria5 setUsedAmount(ActiveAmountRange3Choice usedAmount) {
		this.usedAmount = usedAmount;
		return this;
	}

	public Optional<PercentageRange1Choice> getUsedPercentage() {
		return usedPercentage == null ? Optional.empty() : Optional.of(usedPercentage);
	}

	public LimitSearchCriteria5 setUsedPercentage(PercentageRange1Choice usedPercentage) {
		this.usedPercentage = usedPercentage;
		return this;
	}

	public Optional<ActiveCurrencyCode> getLimitCurrency() {
		return limitCurrency == null ? Optional.empty() : Optional.of(limitCurrency);
	}

	public LimitSearchCriteria5 setLimitCurrency(ActiveCurrencyCode limitCurrency) {
		this.limitCurrency = limitCurrency;
		return this;
	}

	public Optional<ActiveAmountRange3Choice> getLimitAmount() {
		return limitAmount == null ? Optional.empty() : Optional.of(limitAmount);
	}

	public LimitSearchCriteria5 setLimitAmount(ActiveAmountRange3Choice limitAmount) {
		this.limitAmount = limitAmount;
		return this;
	}

	public Optional<DateAndPeriod2Choice> getLimitValidAsOfDate() {
		return limitValidAsOfDate == null ? Optional.empty() : Optional.of(limitValidAsOfDate);
	}

	public LimitSearchCriteria5 setLimitValidAsOfDate(DateAndPeriod2Choice limitValidAsOfDate) {
		this.limitValidAsOfDate = limitValidAsOfDate;
		return this;
	}
}