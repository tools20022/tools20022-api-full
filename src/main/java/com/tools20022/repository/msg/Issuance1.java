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
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.SecuritiesTransactionType17Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Issuance;
import com.tools20022.repository.entity.Organisation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Preparation/bringing to market of a security (also known as primary market or
 * Initial Public Offering (IPO) issuance).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssuePlace
 * Issuance1.IssuePlace}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#CountryOfIssue
 * Issuance1.CountryOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssueDate
 * Issuance1.IssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#AnnouncementDate
 * Issuance1.AnnouncementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#ISINValidFrom
 * Issuance1.ISINValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssuerOrganisation
 * Issuance1.IssuerOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssueNominalAmount
 * Issuance1.IssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#FullIssuedAmount
 * Issuance1.FullIssuedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssueSize
 * Issuance1.IssueSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssuePrice
 * Issuance1.IssuePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssuanceDistribution
 * Issuance1.IssuanceDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#GoverningLaw
 * Issuance1.GoverningLaw}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
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
 * "Issuance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance)."
 * </li>
 * </ul>
 */
public class Issuance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates where the financial instrument was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#MIC
	 * OrganisationIdentification.MIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates where the financial instrument was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssuePlace = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.MIC;
			isDerived = false;
			xmlTag = "IssePlc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePlace";
			definition = "Indicates where the financial instrument was issued.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	/**
	 * Country where a security is issued by the issuer or its agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#Code Country.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIsse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country where a security is issued by the issuer or its agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CountryOfIssue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.Code;
			isDerived = false;
			xmlTag = "CtryOfIsse";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Country where a security is issued by the issuer or its agent.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Date/time at which the security was made available.
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssueDate
	 * Issuance.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the security was made available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Issuance.IssueDate;
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date/time, as announced by the issuer, at which the securities will be
	 * issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#AnnouncementDate
	 * CorporateActionEvent.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time, as announced by the issuer, at which the securities will be issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.AnnouncementDate;
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time, as announced by the issuer, at which the securities will be issued.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Defines the date from which the instrument code is valid. This date can
	 * be before the actual issue date of an instrument for 'when-issued'
	 * securities, but may not be a date in the future for a new security.
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#FromDateTime
	 * DateTimePeriod.FromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISINVldFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISINValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date from which the instrument code is valid. This date can be before the actual issue date of an instrument for 'when-issued' securities, but may not be a date in the future for a new security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ISINValidFrom = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.FromDateTime;
			isDerived = false;
			xmlTag = "ISINVldFr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISINValidFrom";
			definition = "Defines the date from which the instrument code is valid. This date can be before the actual issue date of an instrument for 'when-issued' securities, but may not be a date in the future for a new security.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Legal entity that has the right to issue securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation2
	 * Organisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrOrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal entity that has the right to issue securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd IssuerOrganisation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			isDerived = false;
			xmlTag = "IssrOrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOrganisation";
			definition = "Legal entity that has the right to issue securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Organisation2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Total original amount or quantity published.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssueNominalAmount
	 * Issuance.IssueNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseNmnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNominalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total original amount or quantity published."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssueNominalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Issuance.IssueNominalAmount;
			isDerived = false;
			xmlTag = "IsseNmnlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNominalAmount";
			definition = "Total original amount or quantity published.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	/**
	 * Figure used as a control to verify whether the information provided is
	 * correct. It represents the issue size multiplied by the issue price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssueNominalAmount
	 * Issuance.IssueNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullIssdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullIssuedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Figure used as a control to verify whether the information provided is correct.  It represents the issue size multiplied by the issue price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute FullIssuedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Issuance.IssueNominalAmount;
			isDerived = false;
			xmlTag = "FullIssdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullIssuedAmount";
			definition = "Figure used as a control to verify whether the information provided is correct.  It represents the issue size multiplied by the issue price.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Represents the total amount/quantity of the proceeds from the sale of all
	 * securities in the initial offering. This amount/quantity is known after
	 * the new issue is priced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssueSize
	 * Issuance.IssueSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the total amount/quantity of the proceeds from the sale of all securities in the initial offering. This amount/quantity is known after the new issue is priced."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssueSize = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Issuance.IssueSize;
			isDerived = false;
			xmlTag = "IsseSz";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueSize";
			definition = "Represents the total amount/quantity of the proceeds from the sale of all securities in the initial offering. This amount/quantity is known after the new issue is priced.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Initial issue price of the asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue1
	 * PriceValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssuePrice
	 * Issuance.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial issue price of the asset."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssuePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Issuance.IssuePrice;
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of the asset.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PriceValue1.mmObject();
		}
	};
	/**
	 * Way in which the issue will be marketed to the primary market, via
	 * individual dealers (so called non syndicated distribution) or via a
	 * syndicate of managers, underwriters and selling group members (so called
	 * syndicated distribution).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType17Choice
	 * SecuritiesTransactionType17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssncDstrbtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Way in which the issue will be marketed to the primary market, via individual dealers (so called non syndicated distribution) or via a syndicate of managers, underwriters and selling group members (so called syndicated distribution)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssuanceDistribution = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "IssncDstrbtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceDistribution";
			definition = "Way in which the issue will be marketed to the primary market, via individual dealers (so called non syndicated distribution) or via a syndicate of managers, underwriters and selling group members (so called syndicated distribution).";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> SecuritiesTransactionType17Choice.mmObject();
		}
	};
	/**
	 * Jurisdiction (country, county, state, province, city) of the issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Jurisdiction1
	 * Jurisdiction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance1
	 * Issuance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GovngLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Jurisdiction (country, county, state, province, city) of the issue."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd GoverningLaw = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "GovngLaw";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoverningLaw";
			definition = "Jurisdiction (country, county, state, province, city) of the issue.";
			minOccurs = 0;
			type_lazy = () -> Jurisdiction1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Issuance1.IssuePlace, com.tools20022.repository.msg.Issuance1.CountryOfIssue, com.tools20022.repository.msg.Issuance1.IssueDate,
						com.tools20022.repository.msg.Issuance1.AnnouncementDate, com.tools20022.repository.msg.Issuance1.ISINValidFrom, com.tools20022.repository.msg.Issuance1.IssuerOrganisation,
						com.tools20022.repository.msg.Issuance1.IssueNominalAmount, com.tools20022.repository.msg.Issuance1.FullIssuedAmount, com.tools20022.repository.msg.Issuance1.IssueSize,
						com.tools20022.repository.msg.Issuance1.IssuePrice, com.tools20022.repository.msg.Issuance1.IssuanceDistribution, com.tools20022.repository.msg.Issuance1.GoverningLaw);
				trace_lazy = () -> Issuance.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Issuance1";
				definition = "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).";
			}
		});
		return mmObject_lazy.get();
	}
}