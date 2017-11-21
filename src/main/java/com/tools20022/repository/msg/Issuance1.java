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
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.SecuritiesTransactionType17Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssuePlace
 * Issuance1.mmIssuePlace}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmCountryOfIssue
 * Issuance1.mmCountryOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssueDate
 * Issuance1.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmAnnouncementDate
 * Issuance1.mmAnnouncementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmISINValidFrom
 * Issuance1.mmISINValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssuerOrganisation
 * Issuance1.mmIssuerOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssueNominalAmount
 * Issuance1.mmIssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmFullIssuedAmount
 * Issuance1.mmFullIssuedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssueSize
 * Issuance1.mmIssueSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssuePrice
 * Issuance1.mmIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Issuance1#mmIssuanceDistribution
 * Issuance1.mmIssuanceDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmGoverningLaw
 * Issuance1.mmGoverningLaw}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
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
 * "Issuance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Issuance1", propOrder = {"issuePlace", "countryOfIssue", "issueDate", "announcementDate", "ISINValidFrom", "issuerOrganisation", "issueNominalAmount", "fullIssuedAmount", "issueSize", "issuePrice", "issuanceDistribution",
		"governingLaw"})
public class Issuance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MICIdentifier issuePlace;
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
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
	public static final MMMessageAttribute mmIssuePlace = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "IssePlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePlace";
			definition = "Indicates where the financial instrument was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected CountryCode countryOfIssue;
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
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
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
	public static final MMMessageAttribute mmCountryOfIssue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Country where a security is issued by the issuer or its agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected ISODate issueDate;
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
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
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODateTime announcementDate;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
	 * CorporateActionEvent.mmAnnouncementDate}</li>
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
	public static final MMMessageAttribute mmAnnouncementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time, as announced by the issuer, at which the securities will be issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODate iSINValidFrom;
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
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
	public static final MMMessageAttribute mmISINValidFrom = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "ISINVldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISINValidFrom";
			definition = "Defines the date from which the instrument code is valid. This date can be before the actual issue date of an instrument for 'when-issued' securities, but may not be a date in the future for a new security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Organisation2 issuerOrganisation;
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
	public static final MMMessageAssociationEnd mmIssuerOrganisation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "IssrOrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOrganisation";
			definition = "Legal entity that has the right to issue securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation2.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice issueNominalAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueNominalAmount
	 * Issuance.mmIssueNominalAmount}</li>
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
	public static final MMMessageAttribute mmIssueNominalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueNominalAmount;
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "IsseNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNominalAmount";
			definition = "Total original amount or quantity published.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount fullIssuedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueNominalAmount
	 * Issuance.mmIssueNominalAmount}</li>
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
	public static final MMMessageAttribute mmFullIssuedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueNominalAmount;
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "FullIssdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullIssuedAmount";
			definition = "Figure used as a control to verify whether the information provided is correct.  It represents the issue size multiplied by the issue price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Number issueSize;
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueSize
	 * Issuance.mmIssueSize}</li>
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
	public static final MMMessageAttribute mmIssueSize = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueSize;
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "IsseSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueSize";
			definition = "Represents the total amount/quantity of the proceeds from the sale of all securities in the initial offering. This amount/quantity is known after the new issue is priced.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected PriceValue1 issuePrice;
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuePrice
	 * Issuance.mmIssuePrice}</li>
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
	public static final MMMessageAttribute mmIssuePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssuePrice;
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of the asset.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue1.mmObject();
		}
	};
	protected SecuritiesTransactionType17Choice issuanceDistribution;
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
	public static final MMMessageAttribute mmIssuanceDistribution = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "IssncDstrbtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceDistribution";
			definition = "Way in which the issue will be marketed to the primary market, via individual dealers (so called non syndicated distribution) or via a syndicate of managers, underwriters and selling group members (so called syndicated distribution).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionType17Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Jurisdiction1> governingLaw;
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
	public static final MMMessageAssociationEnd mmGoverningLaw = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Issuance1.mmObject();
			isDerived = false;
			xmlTag = "GovngLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoverningLaw";
			definition = "Jurisdiction (country, county, state, province, city) of the issue.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Jurisdiction1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Issuance1.mmIssuePlace, Issuance1.mmCountryOfIssue, Issuance1.mmIssueDate, Issuance1.mmAnnouncementDate, Issuance1.mmISINValidFrom, Issuance1.mmIssuerOrganisation,
						Issuance1.mmIssueNominalAmount, Issuance1.mmFullIssuedAmount, Issuance1.mmIssueSize, Issuance1.mmIssuePrice, Issuance1.mmIssuanceDistribution, Issuance1.mmGoverningLaw);
				trace_lazy = () -> Issuance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Issuance1";
				definition = "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IssePlc")
	public MICIdentifier getIssuePlace() {
		return issuePlace;
	}

	public void setIssuePlace(MICIdentifier issuePlace) {
		this.issuePlace = issuePlace;
	}

	@XmlElement(name = "CtryOfIsse")
	public CountryCode getCountryOfIssue() {
		return countryOfIssue;
	}

	public void setCountryOfIssue(CountryCode countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
	}

	@XmlElement(name = "IsseDt")
	public ISODate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
	}

	@XmlElement(name = "AnncmntDt")
	public ISODateTime getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = announcementDate;
	}

	@XmlElement(name = "ISINVldFr")
	public ISODate getISINValidFrom() {
		return iSINValidFrom;
	}

	public void setISINValidFrom(ISODate iSINValidFrom) {
		this.iSINValidFrom = iSINValidFrom;
	}

	@XmlElement(name = "IssrOrg")
	public Organisation2 getIssuerOrganisation() {
		return issuerOrganisation;
	}

	public void setIssuerOrganisation(com.tools20022.repository.msg.Organisation2 issuerOrganisation) {
		this.issuerOrganisation = issuerOrganisation;
	}

	@XmlElement(name = "IsseNmnlAmt")
	public FinancialInstrumentQuantity1Choice getIssueNominalAmount() {
		return issueNominalAmount;
	}

	public void setIssueNominalAmount(FinancialInstrumentQuantity1Choice issueNominalAmount) {
		this.issueNominalAmount = issueNominalAmount;
	}

	@XmlElement(name = "FullIssdAmt")
	public ActiveCurrencyAndAmount getFullIssuedAmount() {
		return fullIssuedAmount;
	}

	public void setFullIssuedAmount(ActiveCurrencyAndAmount fullIssuedAmount) {
		this.fullIssuedAmount = fullIssuedAmount;
	}

	@XmlElement(name = "IsseSz")
	public Number getIssueSize() {
		return issueSize;
	}

	public void setIssueSize(Number issueSize) {
		this.issueSize = issueSize;
	}

	@XmlElement(name = "IssePric")
	public PriceValue1 getIssuePrice() {
		return issuePrice;
	}

	public void setIssuePrice(com.tools20022.repository.msg.PriceValue1 issuePrice) {
		this.issuePrice = issuePrice;
	}

	@XmlElement(name = "IssncDstrbtn")
	public SecuritiesTransactionType17Choice getIssuanceDistribution() {
		return issuanceDistribution;
	}

	public void setIssuanceDistribution(SecuritiesTransactionType17Choice issuanceDistribution) {
		this.issuanceDistribution = issuanceDistribution;
	}

	@XmlElement(name = "GovngLaw")
	public List<Jurisdiction1> getGoverningLaw() {
		return governingLaw;
	}

	public void setGoverningLaw(List<com.tools20022.repository.msg.Jurisdiction1> governingLaw) {
		this.governingLaw = governingLaw;
	}
}