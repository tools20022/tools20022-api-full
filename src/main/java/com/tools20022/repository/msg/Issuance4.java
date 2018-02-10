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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.SecuritiesTransactionType31Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssuePlace
 * Issuance4.mmIssuePlace}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmCountryOfIssue
 * Issuance4.mmCountryOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssueDate
 * Issuance4.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmAnnouncementDate
 * Issuance4.mmAnnouncementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssuerOrganisation
 * Issuance4.mmIssuerOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssueNominalAmount
 * Issuance4.mmIssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmFullIssuedAmount
 * Issuance4.mmFullIssuedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssueSize
 * Issuance4.mmIssueSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssuePrice
 * Issuance4.mmIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Issuance4#mmIssuanceDistribution
 * Issuance4.mmIssuanceDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmGoverningLaw
 * Issuance4.mmGoverningLaw}</li>
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
 * "Issuance4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Issuance2
 * Issuance2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Issuance4", propOrder = {"issuePlace", "countryOfIssue", "issueDate", "announcementDate", "issuerOrganisation", "issueNominalAmount", "fullIssuedAmount", "issueSize", "issuePrice", "issuanceDistribution", "governingLaw"})
public class Issuance4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IssePlc")
	protected MICIdentifier issuePlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 471, FIXSynonym: 472</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates where the financial instrument was issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmIssuePlace
	 * Issuance2.mmIssuePlace}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuePlace = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "IssePlc";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "471"), new FIXSynonym(this, "472"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePlace";
			definition = "Indicates where the financial instrument was issued.";
			previousVersion_lazy = () -> Issuance2.mmIssuePlace;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "CtryOfIsse")
	protected CountryCode countryOfIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIsse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 470</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmCountryOfIssue
	 * Issuance2.mmCountryOfIssue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfIssue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Country where a security is issued by the issuer or its agent.";
			previousVersion_lazy = () -> Issuance2.mmCountryOfIssue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "IsseDt")
	protected ISODate issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 225</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the security was made available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmIssueDate
	 * Issuance2.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "225"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			previousVersion_lazy = () -> Issuance2.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "AnncmntDt")
	protected ISODateTime announcementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmAnnouncementDate
	 * Issuance2.mmAnnouncementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time, as announced by the issuer, at which the securities will be issued.";
			previousVersion_lazy = () -> Issuance2.mmAnnouncementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "IssrOrg")
	protected Organisation27 issuerOrganisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmIssuerOrganisation
	 * Issuance2.mmIssuerOrganisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuerOrganisation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "IssrOrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOrganisation";
			definition = "Legal entity that has the right to issue securities.";
			previousVersion_lazy = () -> Issuance2.mmIssuerOrganisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation27.mmObject();
		}
	};
	@XmlElement(name = "IsseNmnlAmt")
	protected FinancialInstrumentQuantity1Choice issueNominalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmIssueNominalAmount
	 * Issuance2.mmIssueNominalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueNominalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "IsseNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNominalAmount";
			definition = "Total original amount or quantity published.";
			previousVersion_lazy = () -> Issuance2.mmIssueNominalAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "FullIssdAmt")
	protected ActiveCurrencyAndAmount fullIssuedAmount;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
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
	 * "Figure used as a control to verify whether the information provided is correct. It represents the issue size multiplied by the issue price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmFullIssuedAmount
	 * Issuance2.mmFullIssuedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullIssuedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "FullIssdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullIssuedAmount";
			definition = "Figure used as a control to verify whether the information provided is correct. It represents the issue size multiplied by the issue price.";
			previousVersion_lazy = () -> Issuance2.mmFullIssuedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "IsseSz")
	protected Number issueSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmIssueSize
	 * Issuance2.mmIssueSize}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueSize = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "IsseSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueSize";
			definition = "Represents the total amount/quantity of the proceeds from the sale of all securities in the initial offering. This amount/quantity is known after the new issue is priced.";
			previousVersion_lazy = () -> Issuance2.mmIssueSize;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "IssePric")
	protected PriceValue1 issuePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue1
	 * PriceValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmIssuePrice
	 * Issuance2.mmIssuePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of the asset.";
			previousVersion_lazy = () -> Issuance2.mmIssuePrice;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue1.mmObject();
		}
	};
	@XmlElement(name = "IssncDstrbtn")
	protected SecuritiesTransactionType31Choice issuanceDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType31Choice
	 * SecuritiesTransactionType31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmIssuanceDistribution
	 * Issuance2.mmIssuanceDistribution}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuanceDistribution = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "IssncDstrbtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceDistribution";
			definition = "Way in which the issue will be marketed to the primary market, via individual dealers (so called non syndicated distribution) or via a syndicate of managers, underwriters and selling group members (so called syndicated distribution).";
			previousVersion_lazy = () -> Issuance2.mmIssuanceDistribution;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionType31Choice.mmObject();
		}
	};
	@XmlElement(name = "GovngLaw")
	protected List<com.tools20022.repository.msg.Jurisdiction1> governingLaw;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Jurisdiction1
	 * Jurisdiction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance4
	 * Issuance4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance2#mmGoverningLaw
	 * Issuance2.mmGoverningLaw}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGoverningLaw = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
			isDerived = false;
			xmlTag = "GovngLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoverningLaw";
			definition = "Jurisdiction (country, county, state, province, city) of the issue.";
			previousVersion_lazy = () -> Issuance2.mmGoverningLaw;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Jurisdiction1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Issuance4.mmIssuePlace, com.tools20022.repository.msg.Issuance4.mmCountryOfIssue, com.tools20022.repository.msg.Issuance4.mmIssueDate,
						com.tools20022.repository.msg.Issuance4.mmAnnouncementDate, com.tools20022.repository.msg.Issuance4.mmIssuerOrganisation, com.tools20022.repository.msg.Issuance4.mmIssueNominalAmount,
						com.tools20022.repository.msg.Issuance4.mmFullIssuedAmount, com.tools20022.repository.msg.Issuance4.mmIssueSize, com.tools20022.repository.msg.Issuance4.mmIssuePrice,
						com.tools20022.repository.msg.Issuance4.mmIssuanceDistribution, com.tools20022.repository.msg.Issuance4.mmGoverningLaw);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Issuance4";
				definition = "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).";
				previousVersion_lazy = () -> Issuance2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MICIdentifier> getIssuePlace() {
		return issuePlace == null ? Optional.empty() : Optional.of(issuePlace);
	}

	public Issuance4 setIssuePlace(MICIdentifier issuePlace) {
		this.issuePlace = issuePlace;
		return this;
	}

	public Optional<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? Optional.empty() : Optional.of(countryOfIssue);
	}

	public Issuance4 setCountryOfIssue(CountryCode countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
		return this;
	}

	public Optional<ISODate> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public Issuance4 setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<ISODateTime> getAnnouncementDate() {
		return announcementDate == null ? Optional.empty() : Optional.of(announcementDate);
	}

	public Issuance4 setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = announcementDate;
		return this;
	}

	public Optional<Organisation27> getIssuerOrganisation() {
		return issuerOrganisation == null ? Optional.empty() : Optional.of(issuerOrganisation);
	}

	public Issuance4 setIssuerOrganisation(com.tools20022.repository.msg.Organisation27 issuerOrganisation) {
		this.issuerOrganisation = issuerOrganisation;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getIssueNominalAmount() {
		return issueNominalAmount == null ? Optional.empty() : Optional.of(issueNominalAmount);
	}

	public Issuance4 setIssueNominalAmount(FinancialInstrumentQuantity1Choice issueNominalAmount) {
		this.issueNominalAmount = issueNominalAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFullIssuedAmount() {
		return fullIssuedAmount == null ? Optional.empty() : Optional.of(fullIssuedAmount);
	}

	public Issuance4 setFullIssuedAmount(ActiveCurrencyAndAmount fullIssuedAmount) {
		this.fullIssuedAmount = fullIssuedAmount;
		return this;
	}

	public Optional<Number> getIssueSize() {
		return issueSize == null ? Optional.empty() : Optional.of(issueSize);
	}

	public Issuance4 setIssueSize(Number issueSize) {
		this.issueSize = issueSize;
		return this;
	}

	public Optional<PriceValue1> getIssuePrice() {
		return issuePrice == null ? Optional.empty() : Optional.of(issuePrice);
	}

	public Issuance4 setIssuePrice(com.tools20022.repository.msg.PriceValue1 issuePrice) {
		this.issuePrice = issuePrice;
		return this;
	}

	public Optional<SecuritiesTransactionType31Choice> getIssuanceDistribution() {
		return issuanceDistribution == null ? Optional.empty() : Optional.of(issuanceDistribution);
	}

	public Issuance4 setIssuanceDistribution(SecuritiesTransactionType31Choice issuanceDistribution) {
		this.issuanceDistribution = issuanceDistribution;
		return this;
	}

	public List<Jurisdiction1> getGoverningLaw() {
		return governingLaw == null ? governingLaw = new ArrayList<>() : governingLaw;
	}

	public Issuance4 setGoverningLaw(List<com.tools20022.repository.msg.Jurisdiction1> governingLaw) {
		this.governingLaw = Objects.requireNonNull(governingLaw);
		return this;
	}
}