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
import com.tools20022.repository.choice.SecuritiesTransactionType17Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Jurisdiction1;
import com.tools20022.repository.msg.Organisation2;
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
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmIssuePlace
 * Issuance2.mmIssuePlace}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmCountryOfIssue
 * Issuance2.mmCountryOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmIssueDate
 * Issuance2.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmAnnouncementDate
 * Issuance2.mmAnnouncementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmIssuerOrganisation
 * Issuance2.mmIssuerOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmIssueNominalAmount
 * Issuance2.mmIssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmFullIssuedAmount
 * Issuance2.mmFullIssuedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmIssueSize
 * Issuance2.mmIssueSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmIssuePrice
 * Issuance2.mmIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Issuance2#mmIssuanceDistribution
 * Issuance2.mmIssuanceDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance2#mmGoverningLaw
 * Issuance2.mmGoverningLaw}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Issuance2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance4 Issuance4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Issuance2", propOrder = {"issuePlace", "countryOfIssue", "issueDate", "announcementDate", "issuerOrganisation", "issueNominalAmount", "fullIssuedAmount", "issueSize", "issuePrice", "issuanceDistribution", "governingLaw"})
public class Issuance2 {

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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePlc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates where the financial instrument was issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 471, FIXSynonym: 472</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssuePlace
	 * Issuance4.mmIssuePlace}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance2, Optional<MICIdentifier>> mmIssuePlace = new MMMessageAttribute<Issuance2, Optional<MICIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "IssePlc";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "471"), new FIXSynonym(this, "472"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePlace";
			definition = "Indicates where the financial instrument was issued.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmIssuePlace);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public Optional<MICIdentifier> getValue(Issuance2 obj) {
			return obj.getIssuePlace();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<MICIdentifier> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIsse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country where a security is issued by the issuer or its agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 470</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmCountryOfIssue
	 * Issuance4.mmCountryOfIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance2, Optional<CountryCode>> mmCountryOfIssue = new MMMessageAttribute<Issuance2, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Country where a security is issued by the issuer or its agent.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmCountryOfIssue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(Issuance2 obj) {
			return obj.getCountryOfIssue();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<CountryCode> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the security was made available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 225</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssueDate
	 * Issuance4.mmIssueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance2, Optional<ISODate>> mmIssueDate = new MMMessageAttribute<Issuance2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "225"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmIssueDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Issuance2 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncmntDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time, as announced by the issuer, at which the securities will be issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance4#mmAnnouncementDate
	 * Issuance4.mmAnnouncementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance2, Optional<ISODateTime>> mmAnnouncementDate = new MMMessageAttribute<Issuance2, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time, as announced by the issuer, at which the securities will be issued.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmAnnouncementDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Issuance2 obj) {
			return obj.getAnnouncementDate();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<ISODateTime> value) {
			obj.setAnnouncementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrOrg")
	protected Organisation2 issuerOrganisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation2
	 * Organisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrOrg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal entity that has the right to issue securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance4#mmIssuerOrganisation
	 * Issuance4.mmIssuerOrganisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Issuance2, Optional<Organisation2>> mmIssuerOrganisation = new MMMessageAssociationEnd<Issuance2, Optional<Organisation2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "IssrOrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOrganisation";
			definition = "Legal entity that has the right to issue securities.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmIssuerOrganisation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation2.mmObject();
		}

		@Override
		public Optional<Organisation2> getValue(Issuance2 obj) {
			return obj.getIssuerOrganisation();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<Organisation2> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseNmnlAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNominalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total original amount or quantity published."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance4#mmIssueNominalAmount
	 * Issuance4.mmIssueNominalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance2, Optional<FinancialInstrumentQuantity1Choice>> mmIssueNominalAmount = new MMMessageAttribute<Issuance2, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "IsseNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNominalAmount";
			definition = "Total original amount or quantity published.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmIssueNominalAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(Issuance2 obj) {
			return obj.getIssueNominalAmount();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullIssdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullIssuedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Figure used as a control to verify whether the information provided is correct. It represents the issue size multiplied by the issue price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance4#mmFullIssuedAmount
	 * Issuance4.mmFullIssuedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance2, Optional<ActiveCurrencyAndAmount>> mmFullIssuedAmount = new MMMessageAttribute<Issuance2, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "FullIssdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullIssuedAmount";
			definition = "Figure used as a control to verify whether the information provided is correct. It represents the issue size multiplied by the issue price.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmFullIssuedAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Issuance2 obj) {
			return obj.getFullIssuedAmount();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<ActiveCurrencyAndAmount> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseSz"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the total amount/quantity of the proceeds from the sale of all securities in the initial offering. This amount/quantity is known after the new issue is priced."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssueSize
	 * Issuance4.mmIssueSize}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance2, Optional<Number>> mmIssueSize = new MMMessageAttribute<Issuance2, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "IsseSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueSize";
			definition = "Represents the total amount/quantity of the proceeds from the sale of all securities in the initial offering. This amount/quantity is known after the new issue is priced.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmIssueSize);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Issuance2 obj) {
			return obj.getIssueSize();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<Number> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial issue price of the asset."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmIssuePrice
	 * Issuance4.mmIssuePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance2, Optional<PriceValue1>> mmIssuePrice = new MMMessageAttribute<Issuance2, Optional<PriceValue1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of the asset.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmIssuePrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public Optional<PriceValue1> getValue(Issuance2 obj) {
			return obj.getIssuePrice();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<PriceValue1> value) {
			obj.setIssuePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "IssncDstrbtn")
	protected SecuritiesTransactionType17Choice issuanceDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType17Choice
	 * SecuritiesTransactionType17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssncDstrbtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Way in which the issue will be marketed to the primary market, via individual dealers (so called non syndicated distribution) or via a syndicate of managers, underwriters and selling group members (so called syndicated distribution)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance4#mmIssuanceDistribution
	 * Issuance4.mmIssuanceDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Issuance2, Optional<SecuritiesTransactionType17Choice>> mmIssuanceDistribution = new MMMessageAttribute<Issuance2, Optional<SecuritiesTransactionType17Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "IssncDstrbtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceDistribution";
			definition = "Way in which the issue will be marketed to the primary market, via individual dealers (so called non syndicated distribution) or via a syndicate of managers, underwriters and selling group members (so called syndicated distribution).";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmIssuanceDistribution);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionType17Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesTransactionType17Choice> getValue(Issuance2 obj) {
			return obj.getIssuanceDistribution();
		}

		@Override
		public void setValue(Issuance2 obj, Optional<SecuritiesTransactionType17Choice> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Issuance2
	 * Issuance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GovngLaw"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Jurisdiction (country, county, state, province, city) of the issue."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance4#mmGoverningLaw
	 * Issuance4.mmGoverningLaw}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Issuance2, List<Jurisdiction1>> mmGoverningLaw = new MMMessageAssociationEnd<Issuance2, List<Jurisdiction1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Issuance2.mmObject();
			isDerived = false;
			xmlTag = "GovngLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoverningLaw";
			definition = "Jurisdiction (country, county, state, province, city) of the issue.";
			nextVersions_lazy = () -> Arrays.asList(Issuance4.mmGoverningLaw);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Jurisdiction1.mmObject();
		}

		@Override
		public List<Jurisdiction1> getValue(Issuance2 obj) {
			return obj.getGoverningLaw();
		}

		@Override
		public void setValue(Issuance2 obj, List<Jurisdiction1> value) {
			obj.setGoverningLaw(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Issuance2.mmIssuePlace, com.tools20022.repository.msg.Issuance2.mmCountryOfIssue, com.tools20022.repository.msg.Issuance2.mmIssueDate,
						com.tools20022.repository.msg.Issuance2.mmAnnouncementDate, com.tools20022.repository.msg.Issuance2.mmIssuerOrganisation, com.tools20022.repository.msg.Issuance2.mmIssueNominalAmount,
						com.tools20022.repository.msg.Issuance2.mmFullIssuedAmount, com.tools20022.repository.msg.Issuance2.mmIssueSize, com.tools20022.repository.msg.Issuance2.mmIssuePrice,
						com.tools20022.repository.msg.Issuance2.mmIssuanceDistribution, com.tools20022.repository.msg.Issuance2.mmGoverningLaw);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Issuance2";
				definition = "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).";
				nextVersions_lazy = () -> Arrays.asList(Issuance4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MICIdentifier> getIssuePlace() {
		return issuePlace == null ? Optional.empty() : Optional.of(issuePlace);
	}

	public Issuance2 setIssuePlace(MICIdentifier issuePlace) {
		this.issuePlace = issuePlace;
		return this;
	}

	public Optional<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? Optional.empty() : Optional.of(countryOfIssue);
	}

	public Issuance2 setCountryOfIssue(CountryCode countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
		return this;
	}

	public Optional<ISODate> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public Issuance2 setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<ISODateTime> getAnnouncementDate() {
		return announcementDate == null ? Optional.empty() : Optional.of(announcementDate);
	}

	public Issuance2 setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = announcementDate;
		return this;
	}

	public Optional<Organisation2> getIssuerOrganisation() {
		return issuerOrganisation == null ? Optional.empty() : Optional.of(issuerOrganisation);
	}

	public Issuance2 setIssuerOrganisation(Organisation2 issuerOrganisation) {
		this.issuerOrganisation = issuerOrganisation;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getIssueNominalAmount() {
		return issueNominalAmount == null ? Optional.empty() : Optional.of(issueNominalAmount);
	}

	public Issuance2 setIssueNominalAmount(FinancialInstrumentQuantity1Choice issueNominalAmount) {
		this.issueNominalAmount = issueNominalAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFullIssuedAmount() {
		return fullIssuedAmount == null ? Optional.empty() : Optional.of(fullIssuedAmount);
	}

	public Issuance2 setFullIssuedAmount(ActiveCurrencyAndAmount fullIssuedAmount) {
		this.fullIssuedAmount = fullIssuedAmount;
		return this;
	}

	public Optional<Number> getIssueSize() {
		return issueSize == null ? Optional.empty() : Optional.of(issueSize);
	}

	public Issuance2 setIssueSize(Number issueSize) {
		this.issueSize = issueSize;
		return this;
	}

	public Optional<PriceValue1> getIssuePrice() {
		return issuePrice == null ? Optional.empty() : Optional.of(issuePrice);
	}

	public Issuance2 setIssuePrice(PriceValue1 issuePrice) {
		this.issuePrice = issuePrice;
		return this;
	}

	public Optional<SecuritiesTransactionType17Choice> getIssuanceDistribution() {
		return issuanceDistribution == null ? Optional.empty() : Optional.of(issuanceDistribution);
	}

	public Issuance2 setIssuanceDistribution(SecuritiesTransactionType17Choice issuanceDistribution) {
		this.issuanceDistribution = issuanceDistribution;
		return this;
	}

	public List<Jurisdiction1> getGoverningLaw() {
		return governingLaw == null ? governingLaw = new ArrayList<>() : governingLaw;
	}

	public Issuance2 setGoverningLaw(List<Jurisdiction1> governingLaw) {
		this.governingLaw = Objects.requireNonNull(governingLaw);
		return this;
	}
}