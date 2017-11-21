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
import com.tools20022.repository.choice.LiquidityPoolMembers1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details from participant profile account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmAccountTypeName
 * ParticipantAccount1.mmAccountTypeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmAccountTypeShortName
 * ParticipantAccount1.mmAccountTypeShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmOpeningDate
 * ParticipantAccount1.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmClosingDate
 * ParticipantAccount1.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmDeletionDate
 * ParticipantAccount1.mmDeletionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmLicenseWithdrawalDocument
 * ParticipantAccount1.mmLicenseWithdrawalDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmAccountRestrictions
 * ParticipantAccount1.mmAccountRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmDesignatedAccount
 * ParticipantAccount1.mmDesignatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmLiquidityPoolParticipantDetails
 * ParticipantAccount1.mmLiquidityPoolParticipantDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmLimits
 * ParticipantAccount1.mmLimits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmArrests
 * ParticipantAccount1.mmArrests}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1#mmMigration
 * ParticipantAccount1.mmMigration}</li>
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
 * "ParticipantAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details from participant profile account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ParticipantAccount1", propOrder = {"accountTypeName", "accountTypeShortName", "openingDate", "closingDate", "deletionDate", "licenseWithdrawalDocument", "accountRestrictions", "designatedAccount",
		"liquidityPoolParticipantDetails", "limits", "arrests", "migration"})
public class ParticipantAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max40Text accountTypeName;
	/**
	 * Type of the account
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTpNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTypeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the account"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountTypeName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctTpNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTypeName";
			definition = "Type of the account";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	protected Max140Text accountTypeShortName;
	/**
	 * Short name for the account type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTpShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTypeShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name for the account type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountTypeShortName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctTpShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTypeShortName";
			definition = "Short name for the account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected ISODateTime openingDate;
	/**
	 * Date the account was open.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the account was open."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Date the account was open.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime closingDate;
	/**
	 * Date the account was closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the account was closed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date the account was closed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime deletionDate;
	/**
	 * Date the information about the account was deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeletionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the information about the account was deleted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeletionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "DeltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeletionDate";
			definition = "Date the information about the account was deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DocumentIdentification11 licenseWithdrawalDocument;
	/**
	 * Details related to license withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LicWdrwlDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LicenseWithdrawalDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to license withdrawal."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLicenseWithdrawalDocument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "LicWdrwlDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LicenseWithdrawalDocument";
			definition = "Details related to license withdrawal.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification11.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountRestrictions1> accountRestrictions;
	/**
	 * Details regarding intraday account restrictions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details regarding intraday account restrictions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountRestrictions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountRestrictions";
			definition = "Details regarding intraday account restrictions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountRestrictions1.mmObject();
		}
	};
	protected DefaultAccountDetails1 designatedAccount;
	/**
	 * Balance sweeping account used for automated funds transfer when the
	 * receiver account is not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DefaultAccountDetails1
	 * DefaultAccountDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsgntdAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance sweeping account used for automated funds transfer when the receiver account is not available."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDesignatedAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "DsgntdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignatedAccount";
			definition = "Balance sweeping account used for automated funds transfer when the receiver account is not available.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DefaultAccountDetails1.mmObject();
		}
	};
	protected LiquidityPoolMembers1Choice liquidityPoolParticipantDetails;
	/**
	 * Information about account and account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LiquidityPoolMembers1Choice
	 * LiquidityPoolMembers1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyPoolPtcptDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityPoolParticipantDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about account and account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLiquidityPoolParticipantDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyPoolPtcptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityPoolParticipantDetails";
			definition = "Information about account and account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LiquidityPoolMembers1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountLimits1> limits;
	/**
	 * Values and types of limits set on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountLimits1
	 * AccountLimits1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Values and types of limits set on the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimits = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "Lmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limits";
			definition = "Values and types of limits set on the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountLimits1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ArrestedFunds1> arrests;
	/**
	 * Information related to the arrest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ArrestedFunds1
	 * ArrestedFunds1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Arrsts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Arrests"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the arrest."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmArrests = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "Arrsts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Arrests";
			definition = "Information related to the arrest.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ArrestedFunds1.mmObject();
		}
	};
	protected SystemMigration1 migration;
	/**
	 * Information related for participant migration process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemMigration1
	 * SystemMigration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mgrtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Migration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related for participant migration process. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMigration = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ParticipantAccount1.mmObject();
			isDerived = false;
			xmlTag = "Mgrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Migration";
			definition = "Information related for participant migration process. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemMigration1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ParticipantAccount1.mmAccountTypeName, ParticipantAccount1.mmAccountTypeShortName, ParticipantAccount1.mmOpeningDate, ParticipantAccount1.mmClosingDate,
						ParticipantAccount1.mmDeletionDate, ParticipantAccount1.mmLicenseWithdrawalDocument, ParticipantAccount1.mmAccountRestrictions, ParticipantAccount1.mmDesignatedAccount,
						ParticipantAccount1.mmLiquidityPoolParticipantDetails, ParticipantAccount1.mmLimits, ParticipantAccount1.mmArrests, ParticipantAccount1.mmMigration);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ParticipantAccount1";
				definition = "Details from participant profile account.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctTpNm", required = true)
	public Max40Text getAccountTypeName() {
		return accountTypeName;
	}

	public void setAccountTypeName(Max40Text accountTypeName) {
		this.accountTypeName = accountTypeName;
	}

	@XmlElement(name = "AcctTpShrtNm", required = true)
	public Max140Text getAccountTypeShortName() {
		return accountTypeShortName;
	}

	public void setAccountTypeShortName(Max140Text accountTypeShortName) {
		this.accountTypeShortName = accountTypeShortName;
	}

	@XmlElement(name = "OpngDt", required = true)
	public ISODateTime getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(ISODateTime openingDate) {
		this.openingDate = openingDate;
	}

	@XmlElement(name = "ClsgDt")
	public ISODateTime getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(ISODateTime closingDate) {
		this.closingDate = closingDate;
	}

	@XmlElement(name = "DeltnDt")
	public ISODateTime getDeletionDate() {
		return deletionDate;
	}

	public void setDeletionDate(ISODateTime deletionDate) {
		this.deletionDate = deletionDate;
	}

	@XmlElement(name = "LicWdrwlDoc")
	public DocumentIdentification11 getLicenseWithdrawalDocument() {
		return licenseWithdrawalDocument;
	}

	public void setLicenseWithdrawalDocument(com.tools20022.repository.msg.DocumentIdentification11 licenseWithdrawalDocument) {
		this.licenseWithdrawalDocument = licenseWithdrawalDocument;
	}

	@XmlElement(name = "AcctRstrctns")
	public List<AccountRestrictions1> getAccountRestrictions() {
		return accountRestrictions;
	}

	public void setAccountRestrictions(List<com.tools20022.repository.msg.AccountRestrictions1> accountRestrictions) {
		this.accountRestrictions = accountRestrictions;
	}

	@XmlElement(name = "DsgntdAcct")
	public DefaultAccountDetails1 getDesignatedAccount() {
		return designatedAccount;
	}

	public void setDesignatedAccount(com.tools20022.repository.msg.DefaultAccountDetails1 designatedAccount) {
		this.designatedAccount = designatedAccount;
	}

	@XmlElement(name = "LqdtyPoolPtcptDtls")
	public LiquidityPoolMembers1Choice getLiquidityPoolParticipantDetails() {
		return liquidityPoolParticipantDetails;
	}

	public void setLiquidityPoolParticipantDetails(LiquidityPoolMembers1Choice liquidityPoolParticipantDetails) {
		this.liquidityPoolParticipantDetails = liquidityPoolParticipantDetails;
	}

	@XmlElement(name = "Lmts")
	public List<AccountLimits1> getLimits() {
		return limits;
	}

	public void setLimits(List<com.tools20022.repository.msg.AccountLimits1> limits) {
		this.limits = limits;
	}

	@XmlElement(name = "Arrsts")
	public List<ArrestedFunds1> getArrests() {
		return arrests;
	}

	public void setArrests(List<com.tools20022.repository.msg.ArrestedFunds1> arrests) {
		this.arrests = arrests;
	}

	@XmlElement(name = "Mgrtn")
	public SystemMigration1 getMigration() {
		return migration;
	}

	public void setMigration(com.tools20022.repository.msg.SystemMigration1 migration) {
		this.migration = migration;
	}
}