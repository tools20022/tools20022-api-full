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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Jurisdiction1;
import com.tools20022.repository.msg.Organisation27;
import com.tools20022.repository.msg.PriceValue1;
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
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssuePlace
 * Issuance3.mmIssuePlace}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmCountryOfIssue
 * Issuance3.mmCountryOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssueDate
 * Issuance3.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmAnnouncementDate
 * Issuance3.mmAnnouncementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmISINValidFrom
 * Issuance3.mmISINValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssuerOrganisation
 * Issuance3.mmIssuerOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssueNominalAmount
 * Issuance3.mmIssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmFullIssuedAmount
 * Issuance3.mmFullIssuedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssueSize
 * Issuance3.mmIssueSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssuePrice
 * Issuance3.mmIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Issuance3#mmIssuanceDistribution
 * Issuance3.mmIssuanceDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmGoverningLaw
 * Issuance3.mmGoverningLaw}</li>
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
 * "Issuance3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Issuance1
 * Issuance1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Issuance3", propOrder = {"issuePlace", "countryOfIssue", "issueDate", "announcementDate", "iSINValidFrom", "issuerOrganisation", "issueNominalAmount", "fullIssuedAmount", "issueSize", "issuePrice", "issuanceDistribution",
		"governingLaw"})
public class Issuance3 {

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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmIssuePlace
	 * Issuance1.mmIssuePlace}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<MICIdentifier>> mmIssuePlace = new MMMessageAttribute<Issuance3, Optional<MICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "IssePlc";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "471"), new FIXSynonym(this, "472"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePlace";
			definition = "Indicates where the financial instrument was issued.";
			previousVersion_lazy = () -> Issuance1.mmIssuePlace;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public Optional<MICIdentifier> getValue(Issuance3 obj) {
			return obj.getIssuePlace();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<MICIdentifier> value) {
			obj.setIssuePlace(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmCountryOfIssue
	 * Issuance1.mmCountryOfIssue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<CountryCode>> mmCountryOfIssue = new MMMessageAttribute<Issuance3, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Country where a security is issued by the issuer or its agent.";
			previousVersion_lazy = () -> Issuance1.mmCountryOfIssue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(Issuance3 obj) {
			return obj.getCountryOfIssue();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<CountryCode> value) {
			obj.setCountryOfIssue(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmIssueDate
	 * Issuance1.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<ISODate>> mmIssueDate = new MMMessageAttribute<Issuance3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "225"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			previousVersion_lazy = () -> Issuance1.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Issuance3 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<ISODate> value) {
			obj.setIssueDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
	 * CorporateActionEvent.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmAnnouncementDate
	 * Issuance1.mmAnnouncementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<ISODateTime>> mmAnnouncementDate = new MMMessageAttribute<Issuance3, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time, as announced by the issuer, at which the securities will be issued.";
			previousVersion_lazy = () -> Issuance1.mmAnnouncementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Issuance3 obj) {
			return obj.getAnnouncementDate();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<ISODateTime> value) {
			obj.setAnnouncementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ISINVldFr")
	protected ISODate iSINValidFrom;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmISINValidFrom
	 * Issuance1.mmISINValidFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<ISODate>> mmISINValidFrom = new MMMessageAttribute<Issuance3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "ISINVldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISINValidFrom";
			definition = "Defines the date from which the instrument code is valid. This date can be before the actual issue date of an instrument for 'when-issued' securities, but may not be a date in the future for a new security.";
			previousVersion_lazy = () -> Issuance1.mmISINValidFrom;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Issuance3 obj) {
			return obj.getISINValidFrom();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<ISODate> value) {
			obj.setISINValidFrom(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmIssuerOrganisation
	 * Issuance1.mmIssuerOrganisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Issuance3, Optional<Organisation27>> mmIssuerOrganisation = new MMMessageAssociationEnd<Issuance3, Optional<Organisation27>>() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "IssrOrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOrganisation";
			definition = "Legal entity that has the right to issue securities.";
			previousVersion_lazy = () -> Issuance1.mmIssuerOrganisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation27.mmObject();
		}

		@Override
		public Optional<Organisation27> getValue(Issuance3 obj) {
			return obj.getIssuerOrganisation();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<Organisation27> value) {
			obj.setIssuerOrganisation(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueNominalAmount
	 * Issuance.mmIssueNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmIssueNominalAmount
	 * Issuance1.mmIssueNominalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<FinancialInstrumentQuantity1Choice>> mmIssueNominalAmount = new MMMessageAttribute<Issuance3, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueNominalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "IsseNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNominalAmount";
			definition = "Total original amount or quantity published.";
			previousVersion_lazy = () -> Issuance1.mmIssueNominalAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(Issuance3 obj) {
			return obj.getIssueNominalAmount();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setIssueNominalAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueNominalAmount
	 * Issuance.mmIssueNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmFullIssuedAmount
	 * Issuance1.mmFullIssuedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<ActiveCurrencyAndAmount>> mmFullIssuedAmount = new MMMessageAttribute<Issuance3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueNominalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "FullIssdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullIssuedAmount";
			definition = "Figure used as a control to verify whether the information provided is correct. It represents the issue size multiplied by the issue price.";
			previousVersion_lazy = () -> Issuance1.mmFullIssuedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Issuance3 obj) {
			return obj.getFullIssuedAmount();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setFullIssuedAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueSize
	 * Issuance.mmIssueSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmIssueSize
	 * Issuance1.mmIssueSize}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<Number>> mmIssueSize = new MMMessageAttribute<Issuance3, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "IsseSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueSize";
			definition = "Represents the total amount/quantity of the proceeds from the sale of all securities in the initial offering. This amount/quantity is known after the new issue is priced.";
			previousVersion_lazy = () -> Issuance1.mmIssueSize;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Issuance3 obj) {
			return obj.getIssueSize();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<Number> value) {
			obj.setIssueSize(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuePrice
	 * Issuance.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmIssuePrice
	 * Issuance1.mmIssuePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<PriceValue1>> mmIssuePrice = new MMMessageAttribute<Issuance3, Optional<PriceValue1>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssuePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of the asset.";
			previousVersion_lazy = () -> Issuance1.mmIssuePrice;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public Optional<PriceValue1> getValue(Issuance3 obj) {
			return obj.getIssuePrice();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<PriceValue1> value) {
			obj.setIssuePrice(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmIssuanceDistribution
	 * Issuance1.mmIssuanceDistribution}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance3, Optional<SecuritiesTransactionType31Choice>> mmIssuanceDistribution = new MMMessageAttribute<Issuance3, Optional<SecuritiesTransactionType31Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "IssncDstrbtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceDistribution";
			definition = "Way in which the issue will be marketed to the primary market, via individual dealers (so called non syndicated distribution) or via a syndicate of managers, underwriters and selling group members (so called syndicated distribution).";
			previousVersion_lazy = () -> Issuance1.mmIssuanceDistribution;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionType31Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesTransactionType31Choice> getValue(Issuance3 obj) {
			return obj.getIssuanceDistribution();
		}

		@Override
		public void setValue(Issuance3 obj, Optional<SecuritiesTransactionType31Choice> value) {
			obj.setIssuanceDistribution(value.orElse(null));
		}
	};
	@XmlElement(name = "GovngLaw")
	protected List<Jurisdiction1> governingLaw;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance3
	 * Issuance3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmGoverningLaw
	 * Issuance1.mmGoverningLaw}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Issuance3, List<Jurisdiction1>> mmGoverningLaw = new MMMessageAssociationEnd<Issuance3, List<Jurisdiction1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
			isDerived = false;
			xmlTag = "GovngLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoverningLaw";
			definition = "Jurisdiction (country, county, state, province, city) of the issue.";
			previousVersion_lazy = () -> Issuance1.mmGoverningLaw;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Jurisdiction1.mmObject();
		}

		@Override
		public List<Jurisdiction1> getValue(Issuance3 obj) {
			return obj.getGoverningLaw();
		}

		@Override
		public void setValue(Issuance3 obj, List<Jurisdiction1> value) {
			obj.setGoverningLaw(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Issuance3.mmIssuePlace, com.tools20022.repository.msg.Issuance3.mmCountryOfIssue, com.tools20022.repository.msg.Issuance3.mmIssueDate,
						com.tools20022.repository.msg.Issuance3.mmAnnouncementDate, com.tools20022.repository.msg.Issuance3.mmISINValidFrom, com.tools20022.repository.msg.Issuance3.mmIssuerOrganisation,
						com.tools20022.repository.msg.Issuance3.mmIssueNominalAmount, com.tools20022.repository.msg.Issuance3.mmFullIssuedAmount, com.tools20022.repository.msg.Issuance3.mmIssueSize,
						com.tools20022.repository.msg.Issuance3.mmIssuePrice, com.tools20022.repository.msg.Issuance3.mmIssuanceDistribution, com.tools20022.repository.msg.Issuance3.mmGoverningLaw);
				trace_lazy = () -> Issuance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Issuance3";
				definition = "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).";
				previousVersion_lazy = () -> Issuance1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MICIdentifier> getIssuePlace() {
		return issuePlace == null ? Optional.empty() : Optional.of(issuePlace);
	}

	public Issuance3 setIssuePlace(MICIdentifier issuePlace) {
		this.issuePlace = issuePlace;
		return this;
	}

	public Optional<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? Optional.empty() : Optional.of(countryOfIssue);
	}

	public Issuance3 setCountryOfIssue(CountryCode countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
		return this;
	}

	public Optional<ISODate> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public Issuance3 setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<ISODateTime> getAnnouncementDate() {
		return announcementDate == null ? Optional.empty() : Optional.of(announcementDate);
	}

	public Issuance3 setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = announcementDate;
		return this;
	}

	public Optional<ISODate> getISINValidFrom() {
		return iSINValidFrom == null ? Optional.empty() : Optional.of(iSINValidFrom);
	}

	public Issuance3 setISINValidFrom(ISODate iSINValidFrom) {
		this.iSINValidFrom = iSINValidFrom;
		return this;
	}

	public Optional<Organisation27> getIssuerOrganisation() {
		return issuerOrganisation == null ? Optional.empty() : Optional.of(issuerOrganisation);
	}

	public Issuance3 setIssuerOrganisation(Organisation27 issuerOrganisation) {
		this.issuerOrganisation = issuerOrganisation;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getIssueNominalAmount() {
		return issueNominalAmount == null ? Optional.empty() : Optional.of(issueNominalAmount);
	}

	public Issuance3 setIssueNominalAmount(FinancialInstrumentQuantity1Choice issueNominalAmount) {
		this.issueNominalAmount = issueNominalAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFullIssuedAmount() {
		return fullIssuedAmount == null ? Optional.empty() : Optional.of(fullIssuedAmount);
	}

	public Issuance3 setFullIssuedAmount(ActiveCurrencyAndAmount fullIssuedAmount) {
		this.fullIssuedAmount = fullIssuedAmount;
		return this;
	}

	public Optional<Number> getIssueSize() {
		return issueSize == null ? Optional.empty() : Optional.of(issueSize);
	}

	public Issuance3 setIssueSize(Number issueSize) {
		this.issueSize = issueSize;
		return this;
	}

	public Optional<PriceValue1> getIssuePrice() {
		return issuePrice == null ? Optional.empty() : Optional.of(issuePrice);
	}

	public Issuance3 setIssuePrice(PriceValue1 issuePrice) {
		this.issuePrice = issuePrice;
		return this;
	}

	public Optional<SecuritiesTransactionType31Choice> getIssuanceDistribution() {
		return issuanceDistribution == null ? Optional.empty() : Optional.of(issuanceDistribution);
	}

	public Issuance3 setIssuanceDistribution(SecuritiesTransactionType31Choice issuanceDistribution) {
		this.issuanceDistribution = issuanceDistribution;
		return this;
	}

	public List<Jurisdiction1> getGoverningLaw() {
		return governingLaw == null ? governingLaw = new ArrayList<>() : governingLaw;
	}

	public Issuance3 setGoverningLaw(List<Jurisdiction1> governingLaw) {
		this.governingLaw = Objects.requireNonNull(governingLaw);
		return this;
	}
}